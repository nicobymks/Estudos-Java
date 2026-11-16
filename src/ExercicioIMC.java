import java.util.Scanner;

public class ExercicioIMC {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Peso: ");
        double peso = entrada.nextDouble();
        System.out.print("Altura: ");
        double altura = entrada.nextDouble();

        double imc = peso / (altura * altura);
        System.out.printf("IMC: %.2f%n", imc);

        String estadoFisico = imc < 25.0 ? "Peso Saudável / Ideal" : "Atenção: IMC Acima do Ideal";
        System.out.println(estadoFisico);
    }
}
