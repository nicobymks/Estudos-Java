import java.util.Scanner;

public class ExercicioSuperMercado {
    public static void main (String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.print("Preço Unitário: R$");
        double precoUnitario = entrada.nextDouble();
        System.out.print("Quantidade do produto: ");
        byte quantidadeComprada = entrada.nextByte();

        double valorTotal = precoUnitario * quantidadeComprada;
        System.out.printf("Valor compra: R$ %.2f%n", valorTotal);

        if (quantidadeComprada >= 10){
            double valorDesconto = valorTotal * 0.15;
            System.out.printf("Valor do Desconto: R$ %.2f%n", valorDesconto);
            double valorTotalComDesconto = valorTotal - valorDesconto;
            System.out.printf("Valor da compra com 15%% de desconto: R$ %.2f%n", valorTotalComDesconto);
        }else {
            double valorDesconto = valorTotal * 0.05;
            System.out.printf("Valor do Desconto: R$ %.2f%n", valorDesconto);
            double valorTotalComDesconto = valorTotal - valorDesconto;
            System.out.printf("Valor da compra com 5%% de desconto: R$ %.2f%n", valorTotalComDesconto);
        }
    }
}
