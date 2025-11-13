import java.util.Scanner;

public class ConversordeNotas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] notas = new double[8];
        double[] mediasBimestrais = new double[4];
        double[] mediasSemestrais = new double[2];

        System.out.println("=== Conversor de Notas ===");
        System.out.println("Digite as 8 notas do aluno:");

        // Entrada das notas
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        // Cálculo das médias bimestrais (2 notas por bimestre)
        for (int i = 0; i < 4; i++) {
            mediasBimestrais[i] = (notas[i * 2] + notas[i * 2 + 1]) / 2;
        }

        // Cálculo das médias semestrais
        mediasSemestrais[0] = (mediasBimestrais[0] + mediasBimestrais[1]) / 2;
        mediasSemestrais[1] = (mediasBimestrais[2] + mediasBimestrais[3]) / 2;

        // Cálculo da média final
        double mediaFinal = (mediasSemestrais[0] + mediasSemestrais[1]) / 2;

        // Exibição dos resultados
        System.out.println("\n===== RESULTADOS =====");
        System.out.printf("1° Bimestre: %.1f%n", mediasBimestrais[0]);
        System.out.printf("2° Bimestre: %.1f%n", mediasBimestrais[1]);
        System.out.printf("1° Semestre: %.1f%n", mediasSemestrais[0]);
        System.out.println("-----------------------");
        System.out.printf("3° Bimestre: %.1f%n", mediasBimestrais[2]);
        System.out.printf("4° Bimestre: %.1f%n", mediasBimestrais[3]);
        System.out.printf("2° Semestre: %.1f%n", mediasSemestrais[1]);
        System.out.println("-----------------------");
        System.out.printf("Média Final: %.1f%n", mediaFinal);

        scanner.close();
    }
}
