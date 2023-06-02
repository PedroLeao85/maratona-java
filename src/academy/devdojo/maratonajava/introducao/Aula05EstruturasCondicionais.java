package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais {

    public static void main(String[] args) {
        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >= 18;

        //operador de negação !
        if(isAutorizadoComprarBebida){
            System.out.println("Autorizado comprar bebida alcoolica");
        }

        if(!isAutorizadoComprarBebida){
            System.out.println("Não autorizado comprar bebida alcoolica");
        }

        boolean c = true;
        if(c = false){
            System.out.println("Não vai imprimir pois c recebeu false");
        }

        boolean c1 = false;
        if(c1 = true){
            System.out.println("vai imprimir pois c1 recebeu true");
        }

        System.out.println("Fora do if");
    }
}
