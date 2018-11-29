package com.example.demo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
//import java.util.Arrays;
//import java.util.List;

public class DateForm {

	private Long id;

    private String dateid;

    private String datename;

	private Long year;

	private Long month;

	private Long day;

    private String formula;
	
    private LocalDate dates;
    

    
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getDateid() {
        return this.dateid;
    }
    public void setDateid(String dateid) {
        this.dateid = dateid;
    }
    public String getDatename() {
        return this.datename;
    }
    public void setDatename(String datename) {
        this.datename = datename;
    }
    public Long getYear() {
        return this.year;
    }
    public void setYear(Long year) {
        this.year = year;
    }
    public Long getMonth() {
        return this.month;
    }
    public void setMonth(Long month) {
        this.month = month;
    }
    public Long getDay() {
        return this.day;
    }
    public void setDay(Long day) {
        this.day = day;
    }
    public String getFormula() {
        return this.formula;
    }
    public void setFormula(String formula) {
        this.formula = formula;
    } 
	

    public LocalDate getDates() {
        return this.dates;
    }
    public void setDates(String dateString1) {
    	DateTimeFormatter localDate = DateTimeFormatter.ISO_DATE;
		LocalDate date = LocalDate.parse(dateString1, localDate);
		//LocalDate date1 = date.plusDays(1);
		//LocalDate date2 = date.plusDays(-1);
		//LocalDate date3 = date.plusMonths(1);
		//LocalDate date4 = date.plusMonths(-1);
		//LocalDate date5 = date.plusYears(1);
		//LocalDate date6 = date.plusYears(-1);
		//LocalDate[] array = {date1,date2,date3,date4,date5,date6};
		//List<LocalDate> dates = Arrays.asList(array);
		
			this.dates = date;		
    
		
    }
}
    
