package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {

    public static void main(String[] args) {

        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Argo";
        carro1.ano = 2022;
        carro1.modelo = "Fiat";

        carro2.nome = "Gol";
        carro2.ano = 2022;
        carro2.modelo = "VW";

        //carro = carro2;
        //carro2 = carro1;

        System.out.println("Carro");
        System.out.println("Nome: " + carro1.nome);
        System.out.println("Ano: " + carro1.ano);
        System.out.println("Modelo: " + carro1.modelo);
        System.out.println("________________________");
        System.out.println("Carro 2");
        System.out.println("Nome: " + carro2.nome);
        System.out.println("Ano: " + carro2.ano);
        System.out.println("Modelo: " + carro2.modelo);

    }

}
