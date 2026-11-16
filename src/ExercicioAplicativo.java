import java.util.Scanner;
public class ExercicioAplicativo {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        double xburguer = 20.0;
        double xsalada = 25.0;
        double valorBruto = 0;
        byte quantidadeLanche = 0;

        System.out.print("Nome: ");
        String nomeCliente = entrada.next();
        System.out.print("Idade: ");
        byte idade = entrada.nextByte();
        System.out.println("-----------------------");
        System.out.println("CARDÁPIO");
        System.out.println("""
                1. X-Burguer
                2. X-Salada""");
        System.out.println("-----------------------");
        System.out.print("Selecione: ");
        byte escolhaLanche = entrada.nextByte();

        if (escolhaLanche == 1){
            System.out.println("X-Burguer");
            System.out.print("Quantidade: ");
            quantidadeLanche = entrada.nextByte();
            valorBruto = quantidadeLanche * xburguer;
            System.out.printf("Valor total: R$%.2f%n", valorBruto);
        } else if (escolhaLanche == 2) {
            System.out.println("X-Salada");
            System.out.print("Quantidade: ");
            quantidadeLanche = entrada.nextByte();
            valorBruto = quantidadeLanche * xsalada;
            System.out.printf("Valor total: R$%.2f%n", valorBruto);
        }

        System.out.print("Membro Fidelidade: (true ou false) ");
        boolean membroFidelidade = entrada.nextBoolean();

        System.out.println("------------------------");

        System.out.println("Nome: " + nomeCliente);
        System.out.println("Idade: " + idade);

        if(membroFidelidade == true || valorBruto >= 50.0){
            double desconto = valorBruto * 0.10;
            double valorTotalComDesconto = valorBruto - desconto;
            System.out.printf("Desconto: R$%.2f%n", desconto);
            System.out.printf("Valor total com desconto: R$%.2f%n", valorTotalComDesconto);
        }else {
            System.out.printf("Valor total: R$%.2f%n", valorBruto);
        }

        String brinde = quantidadeLanche > 3 ? "Copo Colecionável Grátis" : "Nenhum Brinde";
        System.out.println(brinde);


    }
}
