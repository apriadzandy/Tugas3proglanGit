import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan biner: ");
        String binaryString = input.nextLine();
        System.out.println("Hasil konversi: " + BinaryToDecimal.binaryToDecimal(binaryString));
    }
}
