import java.util.Scanner;

public class ExercicioMediaFiap {
    public static void main (String [] args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a nota referente a Prova Simentral: ");
        float ps = entrada.nextFloat();
        System.out.println("Digite a nota referente ao Trabalho de Conclusão: ");
        float tcc = entrada.nextFloat();
        System.out.println("Digite a nota referente a Avaliação 1: ");
        float av1 = entrada.nextFloat();
        System.out.println("Digite a nota referente a Avaliação 2: ");
        float av2 = entrada.nextFloat();

        double mediaFinal = ps * 0.5 + tcc * 0.3 + ((av1 + av2) / 2) * 0.2;

        System.out.println("A média final é: " + mediaFinal);

        if (mediaFinal >= 6){
            System.out.println("Aprovado");
        }else {
            System.out.println("Reprovado");
        }
    }
}
