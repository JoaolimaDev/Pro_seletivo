import entities.*;
import java.util.Locale;
import java.util.Scanner;
import java.text.ParseException;

/**
 * Main
 */
public class Main {
    
    public static void main(String[] args) throws ParseException {

        System.out.println("Olá! Por favor... Insira o número da atividade o qual deseja visualizar, em ordem de 1 até 3!");
        
        Locale.setDefault(Locale.US);
        
        Scanner sc = new Scanner(System.in);

        int op = sc.nextInt();


        System.out.println(" ");


        switch (op) {
            case 1:

               Exec.Resp1();
               
            break;

            case 2:

                Exec02.calc();

            break;

            case 3:

                Lista.list();

            break;
        
            default:

                System.out.println("Por gentileza insira o número da Atividade... 1, 2 ou 3");
                
            break;
        }
     
        sc.close();
    }

    
}