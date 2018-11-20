package com.example.demo;


import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@ComponentScan
@Controller
@RequestMapping("/search")
public class EmployeesController {
	
	private static final String VIEW = "/search";
	
	@Autowired
	public EmployeesService service;
	
	@RequestMapping(method = RequestMethod.GET)
	public String index() {
	    return VIEW;
	}
	public String input() {
        return "search";
    }
    
	@RequestMapping(method = RequestMethod.POST)
	  public ModelAndView login(ModelAndView mav, 
			  @RequestParam(value = "id", required = false) Long id,
			  @RequestParam(value = "dateid", required = false) String dateid,
			  @RequestParam(value = "datename", required = false) String datename,
			  @RequestParam(value = "formula", required = false) String formula,
			  @RequestParam("date1") String dateString1)
	{
		mav.setViewName(VIEW);
		mav.addObject("id", id);
		mav.addObject("dateid", dateid);
		mav.addObject("datename", datename);
		mav.addObject("formula", formula);
		List<Employees> result = service.search(id, dateid, datename, formula);
		mav.addObject("result", result);
	    mav.addObject("resultSize", result.size());
	    
	    LocalDate localDate = LocalDate.parse(dateString1, DateTimeFormatter.ISO_DATE); // •¶Žš—ñ‚ðLocalDate‚É
        Date date1 = Date.from(localDate.atStartOfDay(ZoneId.of("Asia/Tokyo")).toInstant()); // LocalDate‚ðDate‚É
        mav.addObject("date1", date1);
	    return mav;
	}
	
}
