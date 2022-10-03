package entities;

import java.util.Scanner;

/**
 * Exec02
 */
public class Exec02 {


    public static Scanner sc = new Scanner(System.in);

    
    public static double At;
    public static double Ah;
    public static double Ab;


    /*
    2. Codifique um algoritmo em uma das linguagens, que calcule a área de 
    uma pirâmide quadrada, 
    cuja área é calculada por A=Ab+Ah
    Problema: leia a altura da pirâmide de teclado e mostre o valor da área da pirâmide. 
    A área total das 4 faces laterais, cuja a aresta da base mede 29cm.
    */


    public static void calc() {

        System.out.println("Por favor insira a altura da pirâmide .:");

        double alturadapiramede = sc.nextDouble();

        Ab = Math.pow(29, 2);


        double apotema = Math.pow(14.5, 2) + Math.pow(alturadapiramede, 2);

        double resu = Math.sqrt(apotema);

        Ah = alturadapiramede*(29*Math.round(resu))/2;

        At = Ab + Ah;

        System.out.println("Área total.: " + Ab + " + " + Ah + " = " + At + " cm²");
       
        sc.close();
    }
}