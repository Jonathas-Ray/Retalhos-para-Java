
import java.util.Scanner;

public class Input {

    /* Nota do autor:
        Infelizmente devida a possibilidade do usuário tentar inserir um número para ser texto,
        o que seria válido inclusive, é inviável centralizar todas as possíveis entradas num método único,
        assim devido a existência do texto "33" e o Java não ficar feliz com isso nós ficaremos com uma 
        entrada para números e outra para textos.
    */
    //Importado o arquivo: Input.Number() para números e Input.String() para textos, ambos com ou sem mensagens de saída como parâmetro.

    private static Scanner scanner = new Scanner(System.in);
    

    public static String String(String output) {
        System.out.println(output);
        String value;
        do {
            value = scanner.nextLine();
            if (value.isBlank()) {
                System.out.println("Valor inválido");
            } else {
                return value;
            }
        } while (true);
    }
    
    public static String String() {
        String value;
        do {
            value = scanner.nextLine();
            if (value.isBlank()) {
                System.out.println("Valor inválido");
            } else {
                return value;
            }
        } while (true);
    }

    //Centraliza a entrada de números
    public static void Number() {
        if (scanner.hasNextInt()) {
            setInt();
        } else if (scanner.hasNextFloat()) {
            setFloat();
        } else {
            scanner.nextLine();
            System.out.println("O valor inserido não é um número.\n");
        }
    }

    //Centraliza a entrada de números
    public static void Number(String output) {
        System.out.println(output);
        if (scanner.hasNextInt()) {
            setInt();
        } else if (scanner.hasNextFloat()) {
            setFloat();
        } else {
            scanner.nextLine();
            System.out.println("O valor inserido não é um número.\n");
        }
    }

    private static float setFloat() {
        float value = scanner.nextFloat();
        scanner.nextLine(); //Apaga a quebra de linha do Buffer
        return value;
    }

     private static Integer setInt() {
        int value = scanner.nextInt();
        scanner.nextLine(); //Apaga a quebra de linha do Buffer
        return value;
    }

}
