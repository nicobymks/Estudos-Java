import java.util.Scanner;

public class ExercicioEstoque {
    public static void main (String[] args){
        Scanner entrada = new Scanner (System.in);

        System.out.print("Quantidade no estoque: ");
        byte quantidadeEstoque = entrada.nextByte();

        String estadoEstoque = quantidadeEstoque < 5 ? "Estoque Crítico" : "Estoque Normal";
        System.out.println(estadoEstoque);
    }
}
