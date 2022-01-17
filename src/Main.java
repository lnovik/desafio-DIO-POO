import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("JAVA - Dominando conceitos de POO");
        curso1.setCargaHoraria(25);


        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Aprendendo JS na prática");
        curso2.setCargaHoraria(25);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de JAVA");
        mentoria.setDescricao("Ensinando você a melhorar suas práticas em JAVA");
        mentoria.setData(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java developed");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);

        Dev dev1 = new Dev();
        dev1.setNome("Luan Novik");
        dev1.inscreverBootcamp(bootcamp);
        dev1.progredir();



        System.out.println("--- Conteúdo Inscritos ---");
        System.out.println(dev1.getConteudosInscritos());
        System.out.println("--- Conteúdo Concluidos ---");
        System.out.println(dev1.getConteudosConcluidos());

        Dev dev2 = new Dev();
        dev2.setNome("Breno Cabral");
        dev2.inscreverBootcamp(bootcamp);
        dev2.progredir();


        System.out.println("--- Conteúdo Inscritos ---");
        System.out.println(dev2.getConteudosInscritos());
        System.out.println("--- Conteúdo Concluidos ---");
        System.out.println(dev2.getConteudosConcluidos());



    }
}
