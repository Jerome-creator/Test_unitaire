package fr.epsi.demo;

public class Calculator {

    public static  int calculate(int a, int b, String operator)
    throws UnknownOperatorException {
       int ret = 0;
       switch(operator){
           case "+":
               ret = a+b;
               break;
           case "-":
               ret = a-b;
               break;
           case "*":
               ret = a*b;
               break;
           case "/":
               ret = a/b;
               break;
               default:
            	   	throw new UnknowOperatorException("Operateur non supporté")
       }
       
       return ret;
    }
}
