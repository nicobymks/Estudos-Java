import java.util.Scanner;

public class ExercicioClimaEtemperatura {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Temperatura atual em Celsius: ");
        double temperaturaCelsius = entrada.nextDouble();

        if (temperaturaCelsius < 18.0){
            System.out.println("Clima Frio: Agasalhe-se bem!");
        }else if (temperaturaCelsius < 30.0){
            System.out.println("Clima Agradável!");
        }else{
            System.out.println("Clima Quente: Hidrate-se!");
        }

        System.out.printf("Temperatura: %.1fCº%n", temperaturaCelsius);

    }
}
