import br.com.dio.desafio.dominio.Curso;

public class Main {
    public static void main(String[] args) {
        Curso cursoJava = new Curso();
        cursoJava.setTitulo("Java");
        cursoJava.setDescricao("Curso Java");
        cursoJava.setCargaHoraria(20);
        double xp = cursoJava.calcularXP();
        System.out.println(cursoJava);
        System.out.println("XP: " + xp);
    }
}