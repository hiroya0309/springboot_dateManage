package com.example.demo;




import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@ComponentScan
@Controller
@RequestMapping("/search")
public class EmployeesController {
	
	
	
	@Autowired
	public EmployeesService service;
	
	 @GetMapping
	    public String index(Model model) { 
	        List<Employees> search = service.findAll();
	        model.addAttribute("search", search); 
	        return "search"; 
	    }
	 
	 @GetMapping("new")
	    public String newdate(Model model) {
	        return "new";
	    }
	 
	 @GetMapping("{id}/edit")
	    public String edit(@PathVariable Long id, Model model) {
		 Employees date = service.findOne(id);
	        model.addAttribute("date", date);
	        return "edit";
	    }
	 
	 @PostMapping
	    public String create(@ModelAttribute Employees date) { 
	        service.save(date);
	        return "redirect:/search"; 
	    }
	 
	 @PutMapping("{id}")
	    public String update(@PathVariable Long id, @ModelAttribute Employees date) {
	        date.setId(id);
	        service.save(date);
	        return "redirect:/search";
	    }
	 
	 @DeleteMapping("{id}")
	    public String destroy(@PathVariable Long id) {
	        service.delete(id);
	        return "redirect:/search";
	    }
	
}
