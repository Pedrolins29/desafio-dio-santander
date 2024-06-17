package desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());


//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devPedro = new Dev();
        devPedro.setNome("Pedro");
        devPedro.increverBootcamp(bootcamp);
        System.out.println("Conteudos Incritos" + devPedro.getConteudosIncritos());
        devPedro.progredir();
        System.out.println("Conteudos Incritos" + devPedro.getConteudosIncritos());
        System.out.println("Conteudos Concluidos" + devPedro.getConteudosConcluidos());
        System.out.println("XP: " + devPedro.calcularTotalXp());

        System.out.println("---------------------------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.increverBootcamp(bootcamp);
        System.out.println("Conteudos Incritos" + devJoao.getConteudosIncritos());
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("Conteudos Incritos" + devJoao.getConteudosIncritos());
        System.out.println("Conteudos Concluidos" + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXp());



    }
}
