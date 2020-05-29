package mum.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mum.Model.*;
import mum.edu.framework.annotation.Controller;
import mum.edu.framework.annotation.RequestMapping;

@Controller
public class CalculatorController {
	@RequestMapping(value= {"/","/calculator"})
	public String showCalculator(HttpServletRequest request, HttpServletResponse response) {
		return "/WEB-INF/jsp/calculator.jsp";
	}
	
	@RequestMapping(value= {"/calc"} )
	public String calculate(Calculator calculator,HttpServletRequest req,
            HttpServletResponse response) {
		String add1 = req.getParameter("add1").trim();//trim() for remove spaces
		String add2 = req.getParameter("add2").trim();
		String mult1 = req.getParameter("mult1").trim();
		String mult2 = req.getParameter("mult2").trim();
		
		//change string to no with validate checking
		try {
			Float sumNum1= Float.parseFloat(add1);
			Float sumNum2= Float.parseFloat(add2);
			Float multNum1= Float.parseFloat(mult1);
			Float multNum2 = Float.parseFloat(mult2);

			calculator= new Calculator(sumNum1,sumNum2,multNum1,multNum2);
			
		}catch(NumberFormatException e){
			System.out.println("Enter correct numbers") ;
			calculator= new Calculator(0.0f,0.0f,0.0f,0.0f);//.0f for change to float
		}
		calculator.calculate();
		
		//we pass parameter called calculator of type class Calculator to view
		req.setAttribute("calculator", calculator);
		
		return "/WEB-INF/jsp/result.jsp";
	}
}
