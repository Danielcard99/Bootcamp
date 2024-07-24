import java.time.LocalDate;

import Desafio.Bootcamp;
import Desafio.Curso;
import Desafio.Dev;
import Desafio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("Curso Java");
        curso.setDescricao("Descrição curso Java");
        curso.setCargaHoraria(8);

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Python");
        curso1.setDescricao("Descrição curso Python");
        curso1.setCargaHoraria(4);

        // System.out.println(curso);
        // System.out.println(curso1);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Mentoria Java");
        mentoria.setData(LocalDate.now());

        // System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp java developer ");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria);

        Dev devDaniel = new Dev();
        devDaniel.setNome("Daniel");
        devDaniel.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos" + devDaniel.getConteudosInscritos());
        devDaniel.progredir();
        System.out.println("Conteúdos inscritos" + devDaniel.getConteudosInscritos());
        System.out.println("Conteúdos concluidos" + devDaniel.getConteudosConcluidos());

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        System.out.println("Conteúdos inscritos" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos concluidos" + devJoao.getConteudosConcluidos());
    }
}
