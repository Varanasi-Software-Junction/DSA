package functionspackage;

public class NumToWords {

    static String[] digits = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
    static String[] teens = {"Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    static String[] tens = {"Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

    static String zeroToNine(int n) {
        return digits[n];
    }

    static String tensInWords(int n) {
        return tens[n / 10 - 1];
    }

    static String teensInWords(int n) {
        return teens[n - 11];
    }

    static String zeroToNinetyNine(int n) {
        if (n <= 9) {
            return zeroToNine(n);
        }
        if (n >= 11 && n <= 19) {
            return teensInWords(n);
        }
        if (n % 10 == 0) {
            return tensInWords(n);
        }
        int digit0 = n % 10;
        int digit1 = n / 10;
        return tensInWords(digit1 * 10) + " " + zeroToNine(digit0);
    }

    static String zeroToNineHundredNinetyNine(int n) {
        if (n <= 99) {
            return zeroToNinetyNine(n);// 100 
        }
        int hundreddigit = n / 100;
        int last2digits = n % 100;
        if (last2digits == 0) {
            return zeroToNine(hundreddigit) + " Hundred";
        }

        return zeroToNine(hundreddigit) + " Hundred " + zeroToNinetyNine(last2digits);
    }

    public static void main(String[] args) {
        for (int i = 0; i <= 999; i += 1) {
            System.out.println(zeroToNineHundredNinetyNine(i));
        }
    }

}
