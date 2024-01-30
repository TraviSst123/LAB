
package Controller;

import Addition.Validation;
import Model.HW;



public class BMICalculator {
    Validation vl = new Validation();
    HW hw = new HW();
    public void getBMI(){
        double h = vl.getDoubleAboveZeroFromInput("Enter your height(cm) :");
        double w = vl.getDoubleAboveZeroFromInput("Enter your weight(kg) :");
        hw.setH(h);
        hw.setW(w);
    }
    public void CalculateBMI(){
        double bmi = hw.getW()/Math.pow(hw.getH()/100, 2);
        System.out.println("Your BMI: "+bmi);
        if (bmi < 18.5) {
        System.out.println("Status: Underweight");
        } else if (bmi >= 18.5 && bmi < 25) {
        System.out.print("Status: Standard");
        } else if (bmi >= 25 && bmi < 30) {
        System.out.println("Status: Overweight");
        } else {
        System.out.println("Status: Obesity");
    }
        
        
    }  
    }
