package com.example.demo;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller

public class EmployeesController {
		
	@Autowired
	public EmployeesService service;
	
	@RequestMapping(path = "/search", method = RequestMethod.GET)
	public String index(DateForm dateForm) {
		return "search";
	}
	@RequestMapping(path = "/search", method = RequestMethod.POST)
	public String index(@ModelAttribute DateForm dateForm, Model model) {
        List<Employees> list = service.findAll();
        model.addAttribute("list", list);
        return "search"; 
	}
	
	@RequestMapping(path = "/search/new", method = RequestMethod.GET)
    public String newdate(Model model) {
        return "new";
    }
 
	@RequestMapping(path = "/search/{id}/edit", method = RequestMethod.GET)
    public String edit(@PathVariable Long id, Model model) {
	 Employees date = service.findOne(id);
        model.addAttribute("date", date);
        return "edit";
    }
	@RequestMapping(path = "/search/{id}", method = RequestMethod.GET)
    public String show(@PathVariable Long id, Model model) {
	 Employees date = service.findOne(id);
        model.addAttribute("date", date);
        return "dalete";
    }
 @RequestMapping(path = "/search/", method = RequestMethod.POST)
    public String create(@ModelAttribute Employees date) { 
        service.save(date);
       return "redirect:/search"; 
    }
 
 @RequestMapping(path = "/search/{id}", method = RequestMethod.PUT)
    public String update(@PathVariable Long id, @ModelAttribute Employees date) {
        date.setId(id);
        service.save(date);
        return "redirect:/search";
    }
 
 @RequestMapping(path = "/search/{id}", method = RequestMethod.DELETE)
    public String destroy(@PathVariable Long id) {
        service.delete(id);
        return "redirect:/search";
    }
	
	 
}
