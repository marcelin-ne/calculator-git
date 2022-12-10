package ec.edu.epn.git.calculator;

public class CalculatorExecute {

    public static void main(String[] arg) {

        System.out.println("---Practica N3 Automatizacion de Pruebas ");

        System.out.println("== Calculator Execute == ");
        Calculator c = new Calculator();
        System.out.println("\n == Suma  == ");
        int addition = c.addition(4, 7);
        System.out.println("c.addition(4,7)= " + addition);
        System.out.println("\n == Resta  == ");
        int subtraction = c.subtraction(7, 1);
        System.out.println("c.subtracction(7,1) =" + subtraction);
        System.out.println("\n == Division  == ");
        double division = c.division(20, 4);
        System.out.println("c.division(20,4)= " + division);
        System.out.println("\n == Multiplicacion  == ");
        double multiplication = c.multiplicacion(100, 2);
        System.out.println("c.multiplication(100,2)= " + multiplication);


    }

}
