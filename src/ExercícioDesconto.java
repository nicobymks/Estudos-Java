public class ExercícioDesconto {
    public static void main (String[] args){

        byte idadeCliente = 12;
        boolean ehEstudante = true;

        boolean descontoAtivado = idadeCliente >= 18 || ehEstudante;

        if (descontoAtivado){
            System.out.println("Desconto ATIVADO.");
        }else {
            System.out.println("Sem Desconto");
        }
    }
}
