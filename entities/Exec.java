package entities;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;

/**
 * Exec
 */
public class Exec {

    public static double[] array = new double[16];

    public static double sum(double[] array) {

        double sum = 0;
        for (double d : array) {
            sum += d;
        }

        return sum;
    }

    public static double fact(double x){
        double f = x;
        while (x > 1){
            f = f *(x-1); x--;
        } 

        return f;
    }

    public static double calc(double a, double b){

        if (b == 0) {
            return 0;
        }

        return a/b;

    }


    public static void Resp1() throws ParseException {
        
        int num = 100;
        int y = 0;


        System.out.println("Construa um algoritmo que calcule o somatório dos 15 primeiros termos da sequência, Numérica S. Mostre a sequência calculada e o somatório S final na tela: S = (100/0!) + (98/1!) + (96/2!) + ...");

        System.out.println(" ");
        
        for (int i = 0; i < 16; i++) {


            double s = calc(num, fact(y));

            
           NumberFormat formatter = new DecimalFormat("#0"); 



            
           
           String x = String.format("%g", s);

           double decimal = DecimalFormat.getNumberInstance().parse(x).doubleValue();

           double k = Math.round(decimal);

           array[i] = k;
            
           
         
          
        
         System.out.println("S = (" + num + " / " + y + "!) -> (" + num + " / " +formatter.format(fact(y))+") -> " +  k);

            y++;
            num--;
            num--;
            
        }

        System.out.println("Soma total = " + sum(array));
    }

    
}
