package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        // byte, short, int long, float e double o valor é 0
        //char
        //boolean false
        //String null
        int [] idades = new int[3];
        System.out.println(idades[0]);
        System.out.println(idades[1]);
        System.out.println(idades[2]);

        boolean [] idades1 = new boolean[3];
        System.out.println(idades[0]);
        System.out.println(idades[1]);
        System.out.println(idades[2]);


        float [] idades2 = new float[3];
        System.out.println(idades[0]);
        System.out.println(idades[1]);
        System.out.println(idades[2]);

        String [] idades3 = new String[3];
        System.out.println(idades[0]);
        System.out.println(idades[1]);
        System.out.println(idades[2]);

        String [] nomes = new String[4];
        nomes [0] = "Pedro";
        nomes [1] = "Maria";
        nomes [2] = "Carla";
        nomes [3] = "Teste";

        //nomes = new String[3];

        for (int i = 0; i < nomes.length; i++){
            System.out.println(nomes[i]);
        }
    }
}
