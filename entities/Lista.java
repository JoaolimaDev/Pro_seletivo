package entities;

import java.util.Scanner;

/**
 * Lista
 */
public class Lista {

    public static Scanner sc = new Scanner(System.in);

    public static int[] lista01 = new int[30];
    public static int[] lista02 = new int[30];
    public static int[] lista03 = new int[60];


    public static int[] incrementa(int[] lista) {

        for (int i = 0; i < lista.length; i++) {
            
            lista[i] = sc.nextInt();
        }

        return lista;
        
    }
   
    
    public static void list() {

        int j = 0;

        System.out.println("Por favor comece a adicionar os valores da Primeira lista!");
       
        incrementa(lista01);

        System.out.println("Por favor comece a adicionar os valores da Segunda lista!");

        incrementa(lista02);

        System.out.println("Preparando o intercalamento entre listas!");

        for (int i = 0; i < 30; i++) {

            lista03[j] = lista01[i];
            j++;

            lista03[j] = lista02[i];
            j++;
            
        }

        System.out.println("Intercalamento concluído ....");
        
        for (int i = 0; i < lista03.length; i++) {
            
            
            System.out.println("|      " + lista03[i] + "      |");
            
        }
        
        sc.close();
        
    }
    
}
