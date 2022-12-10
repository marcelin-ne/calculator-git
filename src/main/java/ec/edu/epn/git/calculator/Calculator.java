package ec.edu.epn.git.calculator;

public class Calculator {

    private int answer;

    public int addition(int a, int b){
        return a+b;
    }

    public int subtraction (int a, int b){
        return a-b;
    }

    public double divide(int a, int b){
        return a/b;
    }

    public double multiplicate(int a, int b){
        return a*b;
    }

    public void timeout(int time){
        try {
            Thread.sleep(time);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public void setAnswer(int answer){
        this.answer=answer;
    }

}
