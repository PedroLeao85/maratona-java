public class Main {
    public static void main(String[] args) {
        String numeros = "283436 283438 283439 283440 283441 283443 283444 283445 283446 283452 283453 283454 283455 283456";

        // Separa os números em um array
        String[] arrayNumeros = numeros.split(" ");

        // Constrói uma nova string com aspas simples e separada por vírgulas
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < arrayNumeros.length; i++) {
            resultado.append("'").append(arrayNumeros[i]).append("'");
            if (i < arrayNumeros.length - 1) {
                resultado.append(", ");
            }
        }

        // Exibe o resultado
        System.out.println(resultado.toString());
    }
}

