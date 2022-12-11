package ec.edu.epn.git.calculator;
import java.lang.Math;
public class Calculator {

    private int answer;

    public int addition(int a, int b){
        return a+b;
    }

    public int subtraction (int a, int b){
        return a-b;
    }

    public double division(int a, int b){
        return a/b;
    }


    public double multiplicacion(int a, int b){
        return a*b;
    }

    public double squareRoot(double a){
        return Math.sqrt(a);
    }

    public void timeout(int time){
        try {
            Thread.sleep(time);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }


    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer){
        this.answer=answer;

    }

}
