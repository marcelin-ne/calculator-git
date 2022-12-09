package ec.edu.epn.git.calculator;

public class CalculatorExecute{

    public static void main(String[] arg ){
        System.out.println("== Calculator Execute == ");
        Calculator c = new Calculator();
        int addition=c.addition(4,7);
        System.out.println("c.addition(4,7)= "+ addition);
        int substraction=c.subtraction(7,1);
        System.out.println("c.subtracction(7,1) =" + substraction);


        System.out.println("This is a Change ");

    }

}
