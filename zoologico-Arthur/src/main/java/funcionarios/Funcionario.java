package funcionarios;


import java.util.Scanner;

public class Funcionario {
    private String nome;
    private String funcao;
    private String setor;


    public void escreverNomeFuncaoESetor() {System.out.println(nome + ", função: " + funcao + ", setor: " + setor);}



    public static Funcionario criar(){
        Funcionario funcionario = new Funcionario();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do funcionario:");
        funcionario.nome = scanner.nextLine();

        System.out.println("Digite a função:");
        funcionario.funcao = scanner.nextLine();

        System.out.println("Digite o setor:");
        funcionario.setor = scanner.nextLine();

        return funcionario;
    }
}
