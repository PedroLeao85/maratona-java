package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "João";
        professor.sexo = 'M';
        professor.idade = 30;

        System.out.println("Nome: " + professor.nome + " idade: " + professor.idade+ " " + "anos"+ " " + "Sexo: " + professor.sexo);
        //System.out.println(professor.sexo);
        //System.out.println(professor.idade);


    }

}
