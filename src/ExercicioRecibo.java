public class ExercicioRecibo {
    public static void main(String [] args){

        String nomeCliente = "Ana Paula";
        char sexo = 'F';
        byte qtIntensComprados = 2;
        long codigoRastreio = 554433221100L;
        double precoTeclado = 349.90;
        double precoMouse = 150.10;
        float valorFrete = 20.00f;

        double valorCompra = precoTeclado + precoMouse;
        double valorTotal = valorCompra + valorFrete;
        double valorMedioItens = valorCompra / 2;

        System.out.println("Nome Cliente: " + nomeCliente);
        System.out.println("Sexo: " + sexo);
        System.out.println("Código de rastreio: " + codigoRastreio);
        System.out.println("Valor da Compra: " + valorCompra);
        System.out.println("Valor total: " + valorTotal);
        System.out.println("Media por produto: " + valorMedioItens);



    }
}
