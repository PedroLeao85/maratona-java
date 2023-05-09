package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // aritmeticos + - / *
        int numero01 = 10;
        int numero02 = 20;
        double resultado = numero01 / (double) numero02;
        System.out.println(numero02 - numero01);
        System.out.println(numero02 + numero01 + " Valor " + numero02 + numero01);
        System.out.println(resultado);

        // % resto
        int resto = 20 % 2;
        int resto1 = 21 % 2;
        System.out.println(resto);
        System.out.println(resto1);

        // < > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10;

        System.out.println("isDezMaiorQueVinte " +isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte " +isDezMenorQueVinte);
        System.out.println("isDezIgualVinte " +isDezIgualVinte);
        System.out.println("isDezIgualDez " +isDezIgualDez);
        System.out.println("isDezDiferenteDez " +isDezDiferenteDez);

    }
}