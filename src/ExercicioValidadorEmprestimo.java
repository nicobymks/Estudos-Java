import java.util.Scanner;
public class ExercicioValidadorEmprestimo {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Salário Mensal: ");
        double salarioMensal = entrada.nextDouble();
        System.out.print("Valor da Parcela Desejada: ");
        double valorParcelaDesejada = entrada.nextDouble();

        double limiteMaximoComprometido = salarioMensal * 0.30;
        System.out.printf("Limite do salário: %.2fR$%n", limiteMaximoComprometido);

        String resultadoEmprestimo = valorParcelaDesejada < limiteMaximoComprometido ? "Crédito Aprovado" : "Credito Negado";
        System.out.println(resultadoEmprestimo);
    }
}
