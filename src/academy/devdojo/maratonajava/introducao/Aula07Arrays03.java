package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {

        int[] numeros = new int[3];
        int[] numeros2 = {1,2,3,4,5};
        int[] numeros3 = new int[] {6,7,8,9,10};

        for (int i = 0; i < numeros.length ; i++) {
            System.out.println(numeros[i]);
        }

        for (int i = 0; i < numeros2.length; i++) {
            System.out.println(numeros2[i]);
        }
        for (int i = 0; i < numeros3.length; i++) {
            System.out.println(numeros3[i]);
        }

        //ForEach
        for (int num : numeros) {
            System.out.println("a " + num);
        }
        for (int num1: numeros2){
            System.out.println("b " + num1);
        }
        for (int num2: numeros3){
            System.out.println("c " + num2);
        }

    }

}
