package Model;

public class Model {
    private double num;
    private char x;
    private double result;

    public Model(double num, char x, double result) {
        this.num = num;
        this.x = x;
        this.result = result;
    }

    public Model() {
        result = 0;
    }

    public double getNum() {
        return num;
    }

    public void setNum(double num) {
        this.num = num;
    }

    public char getOperator() {
        return x;
    }

    public void setOperator(char x) {
        this.x = x;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
    
}