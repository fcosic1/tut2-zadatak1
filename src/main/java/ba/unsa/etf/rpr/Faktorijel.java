package ba.unsa.etf.rpr;

public class Faktorijel {
    public static int factorial(int n)  {
        if(n==0)
            return 1;
        int fact=1;
        for(int i=1;i<=n;i++)
            fact = fact * i;
        return fact;
    }
    public static double sin(int number){
        return number - Math.pow(number, 3) / factorial(3) +
                Math.pow(number, 5) / factorial(5) -
                Math.pow(number, 7) / factorial(7);
    }
}