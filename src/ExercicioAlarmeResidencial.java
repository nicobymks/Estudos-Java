public class ExercicioAlarmeResidencial {
    public static void main (String[] args){

        boolean portaAberta = true;
        boolean movimentoDetectado = false;
        boolean alarmeAtivado = false;

        boolean dispararAlarme = alarmeAtivado && (portaAberta || movimentoDetectado);

        if (!alarmeAtivado){
            System.out.println("ALERTA: Alarme desativado");
        }else if (dispararAlarme){
            System.out.println("Alarme DISPARADO! Intrusão detectada.");
        }else{
            System.out.println("Sistema seguro: Nenhum evento suspeito.");
        }
    }
}
