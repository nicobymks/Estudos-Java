import java.util.Scanner;

public class ExercicioClassificador {
    public static void main (String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.print("Idade: ");
        byte idadePessoa = entrada.nextByte();

        String permissao = idadePessoa > 18 ? "Entrada permitida" : "Entrada proibida";
        System.out.println(permissao);
    }
}
