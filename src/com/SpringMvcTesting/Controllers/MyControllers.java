package com.SpringMvcTesting.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/*
 * Here we are declaring this class as Controller.
 * The front controller will be responsible for sending the request to this controller.Thus its the front controller's headache to do so
 * YOU CAN HAVE AS MANY CONTROLLER CLASSES AS YOU WANT. FORNT CONTROLLER WILL MAP IT AT RIGHT LOCATION PROVIDED THAT THERE IS NO NAMING CONFLICT.*/
@Controller
public class MyControllers {

	/*Now this is our method that we want to execute when an request is made by the controller.
	 * This is how we do it.By mentioning the @RequestMapping annotation and then providing the URL for it.
	 * Now this url with only '/' will run automatically and the page which you want to show first you can return it.
	 * You can consider this as a default running page
	 * Also there should be atleast be one default mapping like this so that it runs whenever we run our application.*/ 
	@RequestMapping("/fdf")
	public String laodHome() {
		return "home";
	}
	/*Here we have created a method to handle a add request.
	 * Here the most important thing to notice is that we are using something called as Model object
	 * Now what is Model object. It is used for sending a data to the view.
	 * You just have to add your data to this and it will send it to front end
	 * You can as many number of data as possible*/
    @RequestMapping("/add")
	public String addNumbers( /*Here we are accepting the values sent from the front end*/@RequestParam("num1") int num1,@RequestParam("num2")int num2 ,/*This is our model object.We can put our result into this and send as an response.*/Model model) {
         	
    	//Adding the addition data.
    	model.addAttribute("addition",(num1+num2));
		
    	//Adding the multiplication data.
    	model.addAttribute("multiplication",(num1*num2));
    	
    	//Adding the subtration data
    	model.addAttribute("subtraction",(num1-num2));
    	//Here we are returning the result.jsp.Though if you see here we are not adding '.jsp'. The reason is being that this will be added by the view resolver which we have configured in spring configuration file. 
    	return "result";
	}
	
}
