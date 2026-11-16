import java.util.Scanner;

public class ExercicioCombustivel {
    public static void main (String [] args){

        Scanner entrada = new Scanner (System.in);

        System.out.print("Distância percorrida em KM: ");
        double distanciaPercorrida = entrada.nextDouble();
        System.out.print("Quantidade de combustivel gasto em LITROS: ");
        double quantidadeGasolinaGasta = entrada.nextDouble();

        double consumoMedio = distanciaPercorrida / quantidadeGasolinaGasta;

        if (consumoMedio >= 12.0){
            System.out.printf("Consumo médio: %.2f%n", consumoMedio);
            System.out.printf("Veículo Económico");
        }else{
            System.out.printf("Consumo médio: %.2f%n", consumoMedio);
            System.out.printf("Veiculo de Alto Consumo");
        }

    }
}
