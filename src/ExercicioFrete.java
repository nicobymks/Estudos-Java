public class ExercicioFrete {
    public static void main(String[] args){

        float valorCompra = 190.00f;
        boolean clienteVip = true;
        boolean cupomAtivo = true;

        if (valorCompra > 200.00 || clienteVip){
            System.out.println("Frete Grátis");
        }else {
            System.out.println("Frete 19.89");
        }

        if (valorCompra > 100.00 && cupomAtivo){
            float valorCompraDesconto = valorCompra - (valorCompra * 0.10f);
            System.out.println("Valor compra com desconto: R$" + valorCompraDesconto);
        }else {
            System.out.println("Valor compra sem desconto: R$" + valorCompra);
        }

    }
}
