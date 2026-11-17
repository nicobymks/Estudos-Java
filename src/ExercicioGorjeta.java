import java.util.Scanner;
public class ExercicioGorjeta {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Valor total do consumo: ");
        double valorConsumo = entrada.nextDouble();
        System.out.print("Deseja incluir os 10% ao garçom: (true ou false) ");
        boolean incluirGorjeta = entrada.nextBoolean();

        if (incluirGorjeta){
            double valorGorjeta = valorConsumo * 0.10;
            double valorAPagar = valorConsumo + valorGorjeta;
            System.out.printf("Acrescimo de: %.2fR$%n", valorGorjeta);
            System.out.printf("Valor a Pagar: %.2fR$%n", valorAPagar);
        }else {
            System.out.printf("Valor a Pagar: %.2f R$%n", valorConsumo);
        }

        String agradecimentoGorjeta = incluirGorjeta ? "Obrigado pela generosidade!" : "Volte Sempre!";
        System.out.println(agradecimentoGorjeta);

    }
}
