import java.util.Scanner;

public class ExercicioAprovado {
    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);

        System.out.print("Digite aqui a primeira nota: ");
        double nota1 = entrada.nextDouble();
        System.out.print("Digite aqui a segunda nota: ");
        double nota2 = entrada.nextDouble();
        System.out.print("Digite aqui a terceira nota: ");
        double nota3 = entrada.nextDouble();
        double notaMedia = (nota1 + nota2 + nota3) / 3;
        System.out.println();
        System.out.println("Média: " + notaMedia);

        String resultado = notaMedia > 6 ? "Aprovado" : "Reprovado";
        System.out.println(resultado);

    }
}
