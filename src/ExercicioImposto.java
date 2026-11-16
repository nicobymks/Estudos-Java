public class ExercicioImposto {
    public static void main (String[] args){

        double salario = 4507.00;

        if (salario <= 2000.00){
            System.out.println("Insento de Imposto");
        } else if (salario <= 4000.00){
            double salarioImposto = salario - (salario * 0.075);
            System.out.println("Imposto Aplicado de 7.5%. Salário: R$" + salarioImposto);
        } else {
            double salarioImposto = salario - (salario * 0.15);
            System.out.println("Imposto Aplicado de 15%. Salário: R$" + salarioImposto);
        }


    }
}
