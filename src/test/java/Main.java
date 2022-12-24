import br.com.dio.desafio.dominio.*;

import java.sql.SQLOutput;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso js");
        curso2.setDescricao("Descricao curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria java");
        mentoria.setDescricao("Descricao mentoria java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao conteudo java developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devRoberta = new Dev();
        devRoberta.setNome("Roberta");
        devRoberta.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Roberta: " + devRoberta.getConteudosInscritos());
        devRoberta.progredir();
        devRoberta.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos Roberta: " + devRoberta.getConteudosInscritos());
        System.out.println("Conteudos concluidos Roberta: " + devRoberta.getConteudosConcluidos());
        System.out.println("XP: " + devRoberta.calcularTotalXp());


        System.out.println("----------");

        Dev devAndre = new Dev();
        devAndre.setNome("Andre");
        devAndre.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Andre: " + devAndre.getConteudosInscritos());
        devAndre.progredir();
        devAndre.progredir();
        devAndre.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos Andre: " + devAndre.getConteudosInscritos());
        System.out.println("Conteudos concluidos Andre: " + devAndre.getConteudosConcluidos());
        System.out.println("XP: " + devAndre.calcularTotalXp());
    }
}
