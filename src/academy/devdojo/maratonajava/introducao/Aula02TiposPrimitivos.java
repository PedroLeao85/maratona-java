package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        // casting: força a entrada de um valor
        //String não é tipo primitivo, string é uma classe

        int idade = (int) 10000000000L;
        long numeroGrande = 100000L;
        double salarioDouble = 2000.0D;
        float salarioFloat = (float) 2500.0D;
        byte idadeByte = 10;
        short idadeShort = 32000;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = '\u0041';
        String nome = "Nicko";
        var nome2 = "Mcbrain";

        System.out.println(idade);
        System.out.println("A idade é: " + idade + "anos");
        System.out.println(salarioFloat);
        System.out.println(verdadeiro);
        System.out.println(falso);
        System.out.println("char " + caractere);
        System.out.println("Oi, meu nome é " + nome + "!!");

    }
}
