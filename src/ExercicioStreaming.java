public class ExercicioStreaming {
    public static void main (String [] args){

        byte idadeUsuario = 16;
        boolean possuiAutorizacaoPais = true;
        boolean assinaturaAtiva = true;

        boolean podeAssistir = assinaturaAtiva && (possuiAutorizacaoPais || idadeUsuario >= 18);

        if (podeAssistir){
            System.out.println("Acesso Liberado: Reproduzir o filme!");
        }else System.out.println("Acesso negado: Verifique sua assinatura ou a permissão de idade");
    }
}
