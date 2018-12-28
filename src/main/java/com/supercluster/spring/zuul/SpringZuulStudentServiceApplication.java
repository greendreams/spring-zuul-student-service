package com.supercluster.spring.zuul;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringZuulStudentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringZuulStudentServiceApplication.class, args);
	}
	
	 @RequestMapping(value = "/echoStudentName/{name}")
	    public String echoStudentName(@PathVariable(name = "name") String name)
	    {
	        return "Hello " + name + " Responsed on : " + new Date();
	    }
	 
	    @RequestMapping(value = "/getStudentDetails/{name}")
	    public Student getStudentDetails(@PathVariable(name = "name") String name)
	    {
	        return new Student(name, "Boston", "MS");
	    }
}
class Student
{
    String name;
    String address;
    String cls;
 
    public Student(String name, String address, String cls) {
        super();
        this.name = name;
        this.address = address;
        this.cls = cls;
    }
 
    public String getName() {
        return name;
    }
 
    public String getAddress() {
        return address;
    }
 
    public String getCls() {
        return cls;
    }
}


