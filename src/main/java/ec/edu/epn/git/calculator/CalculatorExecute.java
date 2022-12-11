package ec.edu.epn.git.calculator;

public class CalculatorExecute {

    public static void main(String[] arg) {
        Calculator c = new Calculator();

        System.out.println("---Practica N3 Automatizacion de Pruebas ");

        System.out.println("== Calculator Execute == ");

        System.out.println("\n == Suma  == ");
        int addition = c.addition(4, 7);
        System.out.println("c.addition(4,7)= " + addition);

        System.out.println("\n == Resta  == ");
        int substraction = c.subtraction(7, 1);
        System.out.println("c.subtracction(7,1) =" + substraction);

        System.out.println("\n == Division  == ");
        double division = c.division(20, 4);
        System.out.println("c.division(20,4)= " + division);

        System.out.println("\n == Multiplicacion  == ");
        double multiplicacion = c.multiplicacion(100, 2);
        System.out.println("c.multiplicacion(100,2)= " + multiplicacion);

        System.out.println("\n == Squared Root  == ");
        double squaredRoot = c.squareRoot(16);
        System.out.println("c.squeareRoot(16,4)= " + squaredRoot);


    }

}
