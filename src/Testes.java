import java.util.Scanner;

public class Testes {
    public static void main (String [] args){

        Scanner entrada = new Scanner(System.in);


        System.out.print("Nome: ");
        String nome = entrada.next();
        System.out.print("Idade: ");
        byte idade = entrada.nextByte();

        System.out.println("Olá, " + nome + " como vai? notei que você tem " + idade + " anos de idade!");
    }
}
