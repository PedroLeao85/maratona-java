package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultiDimensionais02 {
    public static void main(String[] args) {
       int [][] arrayInt = new int[3][]; // NullPointer
       int [] array = {1,2,3};

       arrayInt [0] = new int[2];
       arrayInt [1] = array;
       arrayInt [2] = new int[]{9,8,7,6,5,4};

       int [] [] arrayInt2 = {{0,0}, {1,2,3}, {1,2,3,4,5,6}}; //Outra maneira de inicializar

       for (int[] arrayBase: arrayInt){
           System.out.println("--------");
           for (int num: arrayBase){
               System.out.println(num + " ");
           }
       }

        for (int[] arrayBase: arrayInt2){
            System.out.println("--------");
            for (int num: arrayBase){
                System.out.println(num + " ");
            }
        }
    }
}
