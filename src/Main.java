import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso cursoJavaIniciante = new Curso();
        cursoJavaIniciante.setTitulo("Curso Java Iniciante");
        cursoJavaIniciante.setDescricao("Descricao do Curso Java Iniciate");
        cursoJavaIniciante.setCargaHoraria(20);

        Curso cursoJavaIntermediario = new Curso();
        cursoJavaIntermediario.setTitulo("Curso Java Intermediário");
        cursoJavaIntermediario.setDescricao("Descricao do Curso Java Intermediário");
        cursoJavaIntermediario.setCargaHoraria(30);

        Curso cursoJavaAvancado = new Curso();
        cursoJavaAvancado.setTitulo("Curso Java Avancado");
        cursoJavaAvancado.setDescricao("Descrição do Curso Java Avançado");
        cursoJavaAvancado.setCargaHoraria(35);

        Mentoria mentoriaJava = new Mentoria();
        mentoriaJava.setTitulo("Mentoria Java");
        mentoriaJava.setDescricao("Descrição da Mentoria Java");
        mentoriaJava.setData(LocalDate.now());

        Bootcamp bootcampJava = new Bootcamp();
        bootcampJava.setNome("Bootcamp Java");
        bootcampJava.setDescricao("Descrição do Bootcamp Java");
        bootcampJava.addConteudo(cursoJavaIniciante);
        bootcampJava.addConteudo(cursoJavaIntermediario);
        bootcampJava.addConteudo(cursoJavaAvancado);
        bootcampJava.addConteudo(mentoriaJava);
        System.out.println(bootcampJava.getNome() + ": " + bootcampJava.getConteudos());

        Dev dev1 = new Dev();
        dev1.setNome("João");
        dev1.subscribeBootCamp(bootcampJava);
        System.out.println(dev1.getNome() + " Conteudos Inscritos: " + dev1.getConteudoInscritos());
        dev1.progredir();
        dev1.progredir();
        dev1.progredir();
        System.out.println(dev1.getNome() + " Conteudos Concluídos: " + dev1.getConteudoConcluidos());
        System.out.println(dev1.getNome() + " XP: " + dev1.calcularTotalXP());

        Dev dev2 = new Dev();
        dev2.setNome("Renata");
        dev2.subscribeBootCamp(bootcampJava);
        System.out.println(dev2.getNome() + " Conteudos Inscritos: " + dev2.getConteudoInscritos());
        dev2.progredir();
        dev2.progredir();
        System.out.println(dev2.getNome() + " Conteudos Concluídos: " + dev2.getConteudoConcluidos());
        System.out.println(dev2.getNome() + " XP: " + dev2.calcularTotalXP());

        System.out.println(bootcampJava.getNome() + " inscritos: " + bootcampJava.getDevsInscritos());
    }
}