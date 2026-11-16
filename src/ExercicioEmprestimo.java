public class ExercicioEmprestimo {
    public static void main (String [] args){

        double salarioMensal = 4500.00;
        byte idade = 25;
        boolean possuiRestricaoCredito = true; // Nome sujo
        boolean ehClientePremium = true;

        boolean temRendaEIdadeAdequada = salarioMensal >= 3000.00 && idade >= 21;
        boolean historicoLimpo = !(possuiRestricaoCredito);
        boolean emprestimoAvancado = (temRendaEIdadeAdequada && historicoLimpo) || ehClientePremium;

        System.out.println("Renda: " + temRendaEIdadeAdequada);
        System.out.println("Nome sujo: " + historicoLimpo);
        System.out.println("Emprestimo: " + emprestimoAvancado);
    }
}
