package animais;

import java.util.Arrays;
import java.util.List;

public class Programa {
    public static  void main(String[]args){
        List<Animal> Lista = Arrays.asList(Animal.criar(), Animal.criar(), Animal.criar(), Animal.criar(), Animal.criar());
        Lista.forEach(Animal ::escreverNomeEspecieEAlimentacao);

    }
}
