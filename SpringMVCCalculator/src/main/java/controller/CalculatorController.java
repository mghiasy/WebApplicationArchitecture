package controller;


import model.Calculator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value={"/calculator"})
public class CalculatorController {
    @RequestMapping(value= {""} , method = RequestMethod.GET)
    public String calc() {
        return "calculator";
    }

    @RequestMapping(value= {""}, method = RequestMethod.POST)
    public String showClaculator(Calculator calculator,Model model) {
        //    Calculator calculator = (Calculator) model.getAttribute("calculator");//trim() for remove spaces
//        String add2 = req.getParameter("add2").trim();
//        String mult1 = req.getParameter("mult1").trim();
//        String mult2 = req.getParameter("mult2").trim();

        //change string to no with validate checking
//        try {
//            Float sumNum1= Float.parseFloat(calculator.getNum1());
//            Float sumNum2= Float.parseFloat(add2);
//            Float multNum1= Float.parseFloat(mult1);
//            Float multNum2 = Float.parseFloat(mult2);
//
//            calculator= new Calculator(sumNum1,sumNum2,multNum1,multNum2);
//
//        }catch(NumberFormatException e){
//            System.out.println("Enter correct numbers") ;
//            calculator= new Calculator(0.0f,0.0f,0.0f,0.0f);//.0f for change to float
//        }
        calculator.calculate();
        model.addAttribute("calculator", calculator);

        return "/calculator.jsp";
    }
}

