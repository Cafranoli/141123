package atts;
                                                       //se (if) verdadeiro, mostrar nome(var) e idade(var)
import java.util.Scanner;

public class Att3boolean {
        public static void main(String[] args) { 
            String name = "Carol ";
            int age = 21;

        Scanner inputText = new Scanner(System.in);

        System.out.println("Diga se é verdadeiro ou falso!");
        String trueornot = inputText.nextLine();

        if (trueornot.equals("verdadeiro")) {
            System.out.println("Nome: " + name + "e idade " + age);
        } else {
             System.out.println("Operação inválida!");
        }
    }
}