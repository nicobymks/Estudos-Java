public class ExercicioMontanhaRussa {
    public static void main (String [] args){

        float altura = 1.50f;
        byte idade = 15;
        boolean acompanhante = true;

        if (idade >= 14 && altura >= 1.50){
            System.out.println("Acesso Liberado");
        } else if (idade >= 12 && acompanhante && altura >= 1.50){
            System.out.println("Acesso Liberado com Acompanhante");
        }else {
            System.out.println("Acesso Proibido");
        }
    }
}
