public class ExercicioParque {
    public static void main(String[] args){

        byte idade = 16;
        float altura = 1.65f;
        boolean temAcompanhante = false;
        boolean temPassaporteVip = true;
        boolean estaChovendo = false;

        boolean podeEntrarPorAlturaEIdade = idade >= 14 && altura >= 1.50f;
        System.out.println (podeEntrarPorAlturaEIdade);

        boolean temAcessoFilaRapida = temPassaporteVip == true || temAcompanhante == true;
        System.out.println(temAcessoFilaRapida);

        boolean brinquedoEmFuncionamento = !(estaChovendo);
        System.out.println(brinquedoEmFuncionamento);

        boolean acessoPermitidoFinal = podeEntrarPorAlturaEIdade && brinquedoEmFuncionamento == true;
        System.out.println(acessoPermitidoFinal);

        if (brinquedoEmFuncionamento == false){
            System.out.println("Está chovendo");
        }

        if (podeEntrarPorAlturaEIdade && brinquedoEmFuncionamento == true){
            System.out.println("Acesso Liberado. Boa diversão!");
        } else {
            System.out.println("Acesso Negado!");
        }

        if (temPassaporteVip == true){
            System.out.println("Acesso VIP a esquerda!");
        }
    }
}
