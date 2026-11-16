import java.util.Scanner;

public class ExercicioConsumoCombustivel {
    public static void main (String[] args){
        Scanner entrada = new Scanner (System.in);

        System.out.print("Distância percorrida: ");
        double KmRodados = entrada.nextDouble();
        System.out.print("Combustível gasto em Litros: ");
        double combustivelGasto = entrada.nextDouble();

        double consumoMedio = KmRodados/combustivelGasto;
        System.out.printf("Consumo Médio: %.2f Km/L%n", consumoMedio);

        String consumo = consumoMedio >= 12 ? "Veículo Econômico" : "Veículo de Alto Consumo";
        System.out.printf(consumo);
    }
}
