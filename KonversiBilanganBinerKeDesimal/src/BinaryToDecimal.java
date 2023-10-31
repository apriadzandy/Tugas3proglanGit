
public class BinaryToDecimal {

    // Mengkonversi bilangan biner ke desimal
    public static int binaryToDecimal(String binaryString) {
        /**
         * Konversi bilangan biner ke bilangan desimal.
         *
         * @param binaryToDecimal fungsi untuk mengubah biner ke desimal.
         * @param binaryString String yang berisi bilangan biner yang akan dikonversi.
         * @param return Bilangan desimal yang dihasilkan dari konversi bilangan biner.
         *
         */
        int decimal = 0;
        int length = binaryString.length();
        for (int i = 0; i < length; i++) {
            char binaryChar = binaryString.charAt(i);
            int binaryDigit = Character.getNumericValue(binaryChar);
            int power = (length - 1) - i;
            decimal += binaryDigit * Math.pow(2, power);
        }
        return decimal; }

}
