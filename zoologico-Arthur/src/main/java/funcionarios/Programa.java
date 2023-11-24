package funcionarios;


import java.util.Arrays;
import java.util.List;

public class Programa {
    public static  void main(String[]args){
        List<Funcionario> Lista = Arrays.asList(Funcionario.criar(), Funcionario.criar(), Funcionario.criar(), Funcionario.criar(), Funcionario.criar());
        Lista.forEach(Funcionario ::escreverNomeFuncaoESetor);

    }
}
