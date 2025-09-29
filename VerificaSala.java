import java.util.Scanner;

public class VerificaSala {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o numero da sala da disciplina de PSC: ");
        int numeroSalaInformado = scanner.nextInt();

        if (numeroSalaInformado == 321) {
            System.out.println("Voce esta no caminho certo.");
        } else {
            System.out.println("Voce esta perdido(a), se encontre.");
        }

        scanner.close();
    }
}