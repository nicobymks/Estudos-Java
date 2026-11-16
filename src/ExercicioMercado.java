import java.util.Scanner;

public class ExercicioMercado {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        double valorLaranja = 2.50;
        double valorCompra;

        System.out.println("LARANJA");
        System.out.print("Selecione a quantidade: ");
        int quantidadeLaranjas = entrada.nextInt();
        if (quantidadeLaranjas >= 10){
            valorLaranja = 2.0;
            valorCompra = quantidadeLaranjas * valorLaranja;
            System.out.println("Valor total da compra: " + valorCompra);
        }else {
            valorCompra = quantidadeLaranjas * valorLaranja;
            System.out.println("Valor total da compra: " + valorCompra);
        }

        System.out.println("------------------");
        System.out.println("PAGAMENTO: ");
        System.out.print("A forma de pagamento é PIX? (true ou false): ");
        boolean formaDePagamento = entrada.nextBoolean();

        if (formaDePagamento){
            double valorDesconto = valorCompra * 0.10;
            double valorTotalComDesconto = valorCompra - valorDesconto;
            System.out.println("Valor da compra com 10% de desconto = R$" + valorTotalComDesconto );
        }else {
            System.out.println("Valor da compra sem desconto = R$" + valorCompra);
        }




    }
}
