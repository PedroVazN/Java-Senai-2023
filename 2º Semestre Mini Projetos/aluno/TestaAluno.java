package aluno;
public class TestaAluno {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("Pedro", 123456789);
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getCpf());

        Aluno aluno = new Aluno("Maria", 123456789, 123456789);
        System.out.println(aluno.getNome());
        System.out.println(aluno.getCpf());
        System.out.println(aluno.getMatricula());

        Formando formando = new Formando("Iza", 123456789, 123456789, 2024);
        System.out.println(formando.getNome());
        System.out.println(formando.getCpf());
        System.out.println(formando.getMatricula());
        System.out.println(formando.getAno());

    }
    
}
