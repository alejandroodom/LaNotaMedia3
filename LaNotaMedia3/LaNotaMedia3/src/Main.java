import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double suma = 0;
        int num_valores = 0;
        int notasSuperioresA10 = 0;
        double porcentaje = 0;

        System.out.println("¿Nota (-1 para terminar)?");

        double valor = 0;
        while (valor != -1) {
            valor = teclado.nextDouble();
            System.out.println("¿Nota (-1 para terminar)?");
            suma += valor;
            num_valores++;
            if (valor >= 10) {
                notasSuperioresA10++;
                porcentaje = (int) (((double) notasSuperioresA10 / (double) num_valores) * 100.0);
            }
        }


        double media = suma / num_valores;
        System.out.println("La nota media es " + media + " (" + porcentaje + " % ≥10)");
    }
}
//...............................................................................
        /*Scanner input = new Scanner(System.in);
        int suma = 0;
        int cantidadNotas = 0;
        int notasSuperioresA10 = 0;

        System.out.println("¿Nota (-1 para terminar)?");

        double nota = input.nextDouble();
        while (nota != -1) {
            if (nota != -1) {
                suma += nota;
                cantidadNotas++;
                if (nota >= 10) {
                    notasSuperioresA10++;
                }
            }
        }

        if (cantidadNotas > 0) {
            double media = (double) suma / cantidadNotas;
            double porcentajeSuperioresA10 = (double) notasSuperioresA10 / cantidadNotas * 100;

            System.out.println("Media = " + media + " (" + porcentajeSuperioresA10 + "% ≥10)");
        } else {
            System.out.println("No se han introducido notas");
        }*/
