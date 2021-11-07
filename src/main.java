import br.com.dio.desafiopoo.dominio.Bootcamp;
import br.com.dio.desafiopoo.dominio.Curso;
import br.com.dio.desafiopoo.dominio.Dev;
import br.com.dio.desafiopoo.dominio.Mentoria;

import java.time.LocalDate;

public class main {

    public static void main(String[] args){
        Curso curso= new Curso();
        curso.setTitulo("teste");
        curso.setDescricao("teste");
        curso.setCargaHoraria(1);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria teste");
        mentoria.setDescricao("mentoria descricao");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Teste Dio");
        bootcamp.setDescricao("Teste ");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(mentoria);

        Dev joao = new Dev();
        joao.setNome("Joao");
        Dev maria = new Dev();
        maria.setNome("Maria");

        joao.inscreverBootcamp(bootcamp);
        maria.inscreverBootcamp(bootcamp);
        System.out.println("Conteudo inscritosn Joao:" + joao.getConteudosInscritos());
        System.out.println("Conteudo inscritos Maria:" + maria.getConteudosInscritos());

        joao.progredir();
        maria.progredir();

        System.out.println("Conteudo inscritos Joao:" + joao.getConteudosInscritos());
        System.out.println("Conteudo concluidos Joao:" + joao.getConteudosConcluidos());
        System.out.println("Conteudo inscritos Maria :" + maria.getConteudosInscritos());
        System.out.println("Conteudo concluidos Maria:" + maria.getConteudosConcluidos());

        joao.progredir();
        maria.progredir();

        System.out.println("Conteudo inscritos Joao:" + joao.getConteudosInscritos());
        System.out.println("Conteudo concluidos Joao:" + joao.getConteudosConcluidos());
        System.out.println("Conteudo inscritos Maria :" + maria.getConteudosInscritos());
        System.out.println("Conteudo concluidos Maria:" + maria.getConteudosConcluidos());

        System.out.println("XP inscritos Joao:" + joao.calcularXp());
        System.out.println("XP concluidos Joao:" + joao.calcularXp());



    }
}
