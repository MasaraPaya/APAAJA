import java.util.Scanner;


public class KalkulatorSederhana {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double angka1, angka2, hasil;
        char operator;

        System.out.println("=== Kalkulator Sederhana ===");
        // Input angka pertama
        System.out.print("Masukkan angka pertama: ");
        angka1 = scanner.nextDouble();

        // Input operator
        System.out.print("Masukkan operator (+, -, *, /): ");
        operator = scanner.next().charAt(0);

        // Input angka kedua
        System.out.print("Masukkan angka kedua: ");
        angka2 = scanner.nextDouble();

        // Proses perhitungan
        switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                break;

            case '-':
                hasil = angka1 - angka2;
                break;

            case '*':
                hasil = angka1 * angka2;
                break;

            case '/':
                // Menghindari pembagian oleh nol
                if (angka2 != 0) {
                    hasil = angka1 / angka2;
                } else {
                    System.out.println("Error: Pembagian oleh nol tidak diizinkan.");
                    return;
                }
                break;
            default:
                System.out.println("Error: Operator tidak valid.");
                return;
        }

        // Output hasil perhitungan
        System.out.println("Hasil: " + hasil);

        // Menutup scanner
        scanner.close();
    }
}

