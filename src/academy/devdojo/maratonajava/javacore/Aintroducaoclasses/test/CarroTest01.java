package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {

    public static void main(String[] args) {

        Carro carro = new Carro();
        Carro carro2 = new Carro();

        carro.nome = "Argo";
        carro.ano = 2022;
        carro.modelo = "Fiat";

        carro2.nome = "Gol";
        carro2.ano = 2022;
        carro2.modelo = "VW";

        System.out.println("Nome: " + carro.nome);
        System.out.println("Ano: " + carro.ano);
        System.out.println("Modelo: " + carro.modelo);
        System.out.println("________________________");
        System.out.println("Nome: " + carro2.nome);
        System.out.println("Ano: " + carro2.ano);
        System.out.println("Modelo: " + carro2.modelo);

    }

}
