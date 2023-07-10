import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double n1;
        double n2;
        String op;
        String retorno;

        do {
            System.out.println("***Bem vindo a Calculadora***\n");

            System.out.print("Digite o primeiro número:");
            n1 = entrada.nextDouble();

            System.out.print("Digite o segundo número:");
            n2 = entrada.nextDouble();

            System.out.print("Digite o operador:");
            op = entrada.next();

            if (op.equals("+")) {
                double resultado1 = n1 + n2;
                System.out.println(resultado1);
            } else if (op.equals("-")) {
                double resultado2 = n1 - n2;
                System.out.println(resultado2);
            } else if (op.equals("*")) {
                double resultado3 = n1 * n2;
                System.out.println(resultado3);
            } else if (op.equals("/")) {
                double resultado4 = n1 / n2;
                System.out.println(resultado4);
            }
            System.out.println("Para finalizar digite 'C', ou se quiser retornar aperte qualquer tecla...");
            retorno = entrada.next();
        }while(retorno.equalsIgnoreCase("c"));
        System.out.println("Obrigado!");
<<<<<<< HEAD
=======
        System.out.println("Até mais!!!");
        System.out.println("Vamos alterar tudo");
        
>>>>>>> main


    }
}


