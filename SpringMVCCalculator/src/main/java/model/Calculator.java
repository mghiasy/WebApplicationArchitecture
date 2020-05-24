package model;

import org.springframework.stereotype.Component;

@Component
public class Calculator {
    private Float num1;
    private Float num2;
    private Float mult2;
    private Float mult1;
    private Float sum;
    private Float product;

    public Calculator(Float num1, Float num2, Float mult1, Float mult2) {
        this.num1 = num1;
        this.num2 = num2;
        this.mult1=mult1;
        this.mult2=mult2;
    }

    public void calculate() {
        Float s= num1+num2;
        Float p= mult1*mult2;
        setSum(s);
        setProduct(p);
    }
    public void setSum(Float sum) {
        this.sum=sum;
    }
    public void setProduct(Float product) {
        this.product=product;
    }
}
