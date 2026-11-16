public class ExercicioFolhaPagamento {
    public static void main (String[] args){

        String nomeFuncionario = "Fernanda Lima";
        char nivelCargo = 'S';
        short horasTrabalhadasMes = 160;
        double valorHora = 45.50;
        float descontoINSS = 150.00f;
        long idFuncionario = 881122334455L;

        double salarioBruto = valorHora * horasTrabalhadasMes;
        double salarioLiquido = salarioBruto - descontoINSS;
        double valorDia = salarioLiquido / 20;

        System.out.println("Funcionario: " + nomeFuncionario);
        System.out.println("Nivel: " + nivelCargo);
        System.out.println("ID: " + idFuncionario);
        System.out.println("Salário bruto: " + salarioBruto);
        System.out.println("Salário liquido: " + salarioLiquido);
        System.out.println("Média diária: " + valorDia);

    }
}
