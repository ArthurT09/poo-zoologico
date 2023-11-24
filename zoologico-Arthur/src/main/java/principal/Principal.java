package principal;

import animais.Animal;
import funcionarios.Funcionario;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Animal> animais = new ArrayList<>();
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Cadastrar novo animal");
            System.out.println("2. Cadastrar novo funcionário");
            System.out.println("3. Listar animais");
            System.out.println("4. Listar funcionários");
            System.out.println("5. Sair");

            int escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha) {
                case 1:
                    System.out.println("\nCadastro de animal:");
                    Animal novoAnimal = Animal.criar();
                    animais.add(novoAnimal);
                    break;
                case 2:
                    System.out.println("\nCadastro de funcionario");
                    Funcionario novoFuncionario = Funcionario.criar();
                    funcionarios.add(novoFuncionario);
                    break;
                case 3:
                    System.out.println("\nLista de animais cadastrados");
                    for (Animal animal : animais) {
                    animal.escreverNomeEspecieEAlimentacao();
                    }
                    break;
                case 4:
                    System.out.println("\nLista de funcionarios cadastrados");
                    for (Funcionario funcionario : funcionarios) {
                    funcionario.escreverNomeFuncaoESetor();
                }
                break;
                case 5:
                    System.out.println("Saindo do programa. ");
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Tente novamente. ");
            }
        }
    }
}
