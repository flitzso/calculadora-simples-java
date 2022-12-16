import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Informe o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.print("Informe a operação desejada (+, -, * ou /): ");
        char operation = scanner.next().charAt(0);

        double result;

        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Operação inválida");
                return;
        }

        System.out.println("O resultado é: " + result);
    }

}
