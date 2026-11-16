public class ExercicioCheckout {
    public static void main (String[]args){
        String nomePassageiro = "Lucas Silva";
        char classeAssento = 'E';
        byte quatidadePassageirosGrupo = 3;
        long codigoReserva = 987654321098L;
        short distanciaVoo = 8500;
        double precoPassagemDolar = 1200.50;
        float cotacaoDolar = 5.20f;

        double precoPassagemReal = precoPassagemDolar * cotacaoDolar;
        double custoMedioKm = precoPassagemReal / distanciaVoo;

        System.out.println("Passageiro: " + nomePassageiro);
        System.out.println("Classe: " + classeAssento);
        System.out.println("Valor passagem: " + precoPassagemReal);
        System.out.println("Custo médio KM: " + custoMedioKm);




    }
}
