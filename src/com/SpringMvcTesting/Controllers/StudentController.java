package com.SpringMvcTesting.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.SpringMvcTesting.Entities.Student;

/*
 * Creating the controller class for Student*/
@Controller
@RequestMapping(value="/student")
public class StudentController {
    
	/*
	 * This controller method will run when the home.jsp will get loaded. I repeat when the home.jsp will get loaded.
	 * Before loading this home.jsp we are creating a object of student and then we are setting that object in Model object.
	 * Now the interesting thing is Spring MVC will populate this student object in Model object when we click on submit button.*/
	 @RequestMapping(value="/showForm")
	public String loadStudentInputPage(Model model){
	    
		Student student = new Student();
		model.addAttribute("student",student);
		return "home";		
	}
	/*
	 * Now here we are loading the response page.
	 * Now if you look here closely the student object which we set in Model attribute got populated when we clicked on submit button. 
	 * We are retrieving that data here in theStudent object.*/
	@RequestMapping(value="/loadResponseForm")
	public String reponseShower(/*Getting student object inside the the*/@ModelAttribute("student") Student theStudent){
		 System.out.println(theStudent.getFirstName()+"   "+theStudent.getLastName());
	   	 return "result";
	}

}
