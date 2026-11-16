public class ExercicioClube {
    public static void main (String [] args){

        byte idade = 19;
        boolean temConviteVip = true;

        boolean acessoAutorizado = idade >= 18 || temConviteVip;

        if (acessoAutorizado){
            System.out.println("Acesso a festa permitido!");
        }
    }
}
