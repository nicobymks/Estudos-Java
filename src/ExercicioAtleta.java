public class ExercicioAtleta {
    public static void main( String[] args){

        byte idade = 17;

        if (idade < 12){
            System.out.println("Categoria Infantil");
        } else if (idade < 18){
            System.out.println("Categoria Juvenil");
        }else {
            System.out.println("Categoria Adulto");
        }
    }
}
