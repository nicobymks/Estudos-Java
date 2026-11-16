public class ExercicioMatriculaAcademia {
    public static void main (String[] args){
        String nomeAluno = "Carlos Eduardo";
        char planoEscolhido = 'A';
        int idadeAluno = 28;
        long numeroMatricula = 998877665544L;
        float pesoAluno = 78.5f;
        double valorMensalidade = 119.0;
        short duracaoContrato = 12;

        double valorTotalContrato = valorMensalidade * duracaoContrato;
        double custoDiario = valorMensalidade / 30;

        System.out.println("Aluno: " + nomeAluno);
        System.out.println("Plano: " + planoEscolhido);
        System.out.println("Matricula: " + numeroMatricula);
        System.out.println("Valor total do contrato: " + valorTotalContrato);
        System.out.println("Custo diario: " + custoDiario);


    }
}
