public class Teste {

    public static void main(String[] args) {
        Funcionario funcionario = new Professor();
        funcionario.setNome("Taya Smith");
        funcionario.setSalario(1200F);

        Professor professor = new Professor();
        professor.setCurso("Administração");

        System.out.println("Nome: "+ funcionario.getNome());
        System.out.println("Salário: "+ funcionario.getSalario());
        System.out.println("Curso: "+ professor.getCurso());

        funcionario.baterPonto();
        professor.baterPonto();

        professor.baterMeta();
        professor.baterMeta(5);

        if(professor.baterMeta(15)) {
            System.out.println("Meta atingida");
        }else{
            System.out.println("Meta não atingida");
        }
    }
}
