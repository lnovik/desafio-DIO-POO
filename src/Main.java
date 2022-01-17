import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("JAVA - Dominando conceitos de POO");
        curso1.setCargaHoraria(25);
        System.out.println(curso1);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Aprendendo JS na prática");
        curso2.setCargaHoraria(25);
        System.out.println(curso2);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de JAVA");
        mentoria.setDescricao("Ensinando você a melhorar suas práticas em JAVA");
        mentoria.setData(LocalDate.now());


        System.out.println(mentoria);

    }
}
