package animais;

import java.util.Scanner;

public class Animal {
    private String nome;
    private String especie;
    private String alimentacao;


    public void escreverNomeEspecieEAlimentacao() {System.out.println(nome + ", especie: " + especie + ", alimentacao: " + alimentacao);}



    public static Animal criar(){
        Animal animal = new Animal();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do animal:");
        animal.nome = scanner.nextLine();

        System.out.println("Digite a espécie:");
        animal.especie = scanner.nextLine();

        System.out.println("Digite a alimentaçâo:");
        animal.alimentacao = scanner.nextLine();

        return animal;
    }
}
