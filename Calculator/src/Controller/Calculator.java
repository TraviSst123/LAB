
package Controller;
import Addition.Validation;
import Model.Model;


public class Calculator {
    Validation vl = new Validation();
    Model m = new Model();
    public void GetInput(){
      double a =  vl.getValidDouble("Enter a number: ");
      char x =  vl.getValidOperator("Enter an operator: ");
      double b = vl.getValidDouble("Enter a number: ");
      double result = 0;
      if (x=='+'){
          result = a + b;
      }
      if (x=='-'){
          result = a - b;
      }
      if (x=='*'){
          result = a * b;
      }
      if (x=='/'){
          result = a / b;
      }
      if (x=='^'){
          result = Math.pow(a, b);  
      }
        System.out.println("Result: "+result);
      m.setResult(result);
    }


    public void ContinueCaculate(){
        while (m.getOperator() != '='){
        char operator = vl.getValidOperator("Enter an operator:");
        m.setOperator(operator);
        double a,b,result=0;
        if (operator == '=') {
            return;
        }
        double number = vl.getValidDouble("Enter a number: ");
        m.setNum(number);
        if (operator=='+'){
          a = m.getResult();
          b = m.getNum();
          result =a+b;
          m.setResult(result);
      }
        if (operator=='-'){
          a = m.getResult();
          b = m.getNum();
          result =a-b;
          m.setResult(result);
      }
        if (operator=='*'){
          a = m.getResult();
          b = m.getNum();
          result =a*b;
          m.setResult(result);
      }
        if (operator=='/'){
          a = m.getResult();
          b = m.getNum();
          result =a/b;
          m.setResult(result);
      }
        if (operator=='^'){
          a = m.getResult();
          b = m.getNum();
          result =Math.pow(a, b);
          m.setResult(result);  
      }
        System.out.println("Result:"+m.getResult()); 
        }
    }
    public void ShowFinalResult(){
         System.out.println("The final result is: "+m.getResult());
    }
}
    

