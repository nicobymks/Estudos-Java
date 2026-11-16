public class ExercicioEcommerce {
    public static void main (String[] args){

        double valorTotalCompra = 250.00;
        boolean ehPrimeiraCompra = false;
        boolean cupomValido = true;
        boolean temFreteGratisVip = true;

        boolean recebeDesconto = (valorTotalCompra >= 200.00 || ehPrimeiraCompra) && cupomValido;
        boolean recebeFreteGratis = temFreteGratisVip || valorTotalCompra >= 300.00;
        boolean compraComSuperBeneficio = recebeDesconto && recebeFreteGratis;

        System.out.println("Recebe Desconto: " + recebeDesconto);
        System.out.println("Frete Gratis: " + recebeFreteGratis);
        System.out.println("Super Benefício: " + compraComSuperBeneficio);

    }
}
