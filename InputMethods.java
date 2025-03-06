import java.util.Scanner;

public class InputMethods {
    // https//www.gihub.com/Jonathas-Ray/
    private static Scanner scanner = new Scanner(System.in);

    public static int input_Int(String output) {
        System.out.println(output);
        int value = 0;
        while (true) {
            if (!(scanner.hasNextInt())) {
                scanner.nextLine(); //Apaga o conteúdo do Buffer
                System.out.println("O tipo do valor não está correto, insira novamente\n");
            } else {
                value = scanner.nextInt();
                scanner.nextLine(); //Apaga a quebra de linha do Buffer
                if (valueChecker(value) == 1) {
                    break;
                } else {
                    System.out.println("Nesse caso, digite novamente");
                }
            }
        }
        return value;
    }

    public static double input_Double(String output) {
        System.out.println(output);
        Double value;
        while (true) {
            if (!(scanner.hasNextDouble())) {
                scanner.nextLine(); //Apaga o conteúdo do Buffer
                System.out.println("O tipo do valor não está correto, insira novamente\n");
            } else {
                value = scanner.nextDouble();
                scanner.nextLine(); //Apaga a quebra de linha do Buffer
                if (valueChecker(value) == 1) {
                    break;
                } else {
                    System.out.println("Nesse caso, digite novamente");
                }
            }
        }
        return value;
    }

    public static String input_String(String output) {
        System.out.println(output);
        String value;
        do {
            value = scanner.nextLine();
            if (valueChecker(value) == 1) {
                break;
            } else {
                System.out.println("Nesse caso, digite novamente");
            }
        } while (true);

        return value;
    }

    public static <T> int valueChecker(T value) {
        System.out.println("O valor " + value + " é o que desejava adicionar?\n1 - Sim\t6 - Não");
        do {
            int result = scanner.nextInt();
            scanner.nextLine(); //Apaga a quebra de linha do Buffer
            switch (result) {
                case 1:
                    return 1;
                case 6:
                    return 0;
                default:
                    System.out.println("Valor não reconhecido, digite de novo");
                    break;
            }
        } while (true);
    }
}

/*
Possíveis tratamentos de erro sugeridos pelo chat:
 + Entrada de texto vazio (apenas o "\n") no input_String;
*/