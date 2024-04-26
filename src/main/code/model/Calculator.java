package code.model;

public class Calculator {
    /**
     * Method for calculating addition
     *
     * @param n1 numerator
     * @param n2 denominator
     * @return n1 + n2
     *
     * **/
    public static  int toAdd(int n1, int n2){
        return n1 + n2;
    }

    /**
     * Method for calculating subtract
     *
     * @param n1 numerator
     * @param n2 denominator
     * @return n1 - n2
     *
     * **/
    public static int subtract(int n1, int n2){
        return n1 - n2;
    }

    /**
     * Method for calculating multiply
     *
     * @param n1 numerator
     * @param n2 denominator
     * @return n1 X n2
     *
     * **/
    public static int multiply(int n1, int n2){
        return n1 * n2;
    }

    /**
     * Method for calculating divide
     *
     * @param n1 numerator
     * @param n2 denominator
     * @return n1 /  n2
     *
     * **/
    public static int divide(int n1, int n2){

        if(toCompare(n1) ||toCompare(n2)){
            return 0;
        }

        return n1 / n2;
    }

    /**
     * Method for comparison
     *
     * @param n number for comparison
     * @return n==0 ? return a boolean value
     *
     * **/
    private static boolean toCompare(int n){
        return n == 0 ;
    }


}
