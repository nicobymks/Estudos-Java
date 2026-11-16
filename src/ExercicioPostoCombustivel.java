public class ExercicioPostoCombustivel {
    public static void main (String[] args){
        String nome = "Posto Central";
        char tipoCombustivel = 'G';
        int numeroBomba = 4;
        long codigoTransacao = 123456789012L;
        float litrosAbastecido = 35.5f;
        double precoLitro = 5.89;

        double valorAbastecimento = litrosAbastecido * precoLitro;
        double valorTotal = valorAbastecimento - 5.0;

        System.out.println("Posto: " + nome);
        System.out.println("Combustivel: " + tipoCombustivel);
        System.out.println("Numero bomba: " + numeroBomba);
        System.out.println("Valor a Pagar: R$" + valorTotal);
    }
}
