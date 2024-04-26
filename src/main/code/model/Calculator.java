package code.model;

public class Calculator {

    public static  int toAdd(int n1, int n2){
        return n1 + n2;
    }

    public static int subtract(int n1, int n2){
        return n1 - n2;
    }

    public static int multiply(int n1, int n2){
        return n1 * n2;
    }

    public static int divide(int n1, int n2){

        if(n1==0 || n2==0){
            return 0;
        }

        return n1 / n2;
    }
}
