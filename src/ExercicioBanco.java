public class ExercicioBanco {
    public static void main (String [] args){

        double salarioMensal = 2500.00;
        byte idade = 24;
        boolean possuiRestricao = false;

        boolean creditoAprovado = idade >= 21 && salarioMensal >= 1500.00 && possuiRestricao == false;

        if (creditoAprovado){
            System.out.println("Credito: APROVADO.");
        }else{
            System.out.println("Credito REPROVADO.");
        }

        if(idade < 21){
            System.out.println("Idade inferior ao requisito");
        }

        if (salarioMensal < 1500.00){
            System.out.println("Salario inferior ao requisito");
        }

        if (possuiRestricao == true){
            System.out.println("No momento seu nome está com restrições para receber creditos. Regularize!");
        }
    }
}
