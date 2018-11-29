package com.example.demo;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="date")
public class Employees {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column(name="dateid")
    private String dateid;
	@Column(name="datename")
    private String datename;
	@Column(name="year")
	private Long year;
	@Column(name="month")
	private Long month;
	@Column(name="day")
	private Long day;
	@Column(name="formula")
    private String formula;
	

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

}
