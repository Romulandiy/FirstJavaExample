package tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Roman on 18.01.2017.
 * // 3) Дано число, псочитать количество не повторяющихся цифр.
 * long y = 1234561234520349L;
 */
public class CountNumbersTask3 {

    public static void main(String[] args) throws IOException {

        CountNumbersTask3 countNumbersTask3 = new CountNumbersTask3();

        String inputNumberStr = getInputNumber();

        String duplicateNumbersStr = searchDuplicateNumbers(inputNumberStr);

        String withoutDuplicateNumbersStr = changeDuplicateNumbersToSpace(inputNumberStr, duplicateNumbersStr);

        String uniqueNumbers = withoutDuplicateNumbersStr.replaceAll(" ", "");

        System.out.println("КОЛИЧЕСТВО НЕ ПОВТОРЯЮЩИХСЯ ЦИФР В ЧИСЛЕ " + inputNumberStr + " = " + uniqueNumbers.length());
    }

    private static String getInputNumber() throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        return in.readLine();
    }

    private static String changeDuplicateNumbersToSpace(String inputNumberStr, String equalsNumberStr) {
        String result = null;
        for (int z = 0; z < equalsNumberStr.length(); z++) {
            for (int x = 0; x < inputNumberStr.length(); x++) {
                if (equalsNumberStr.charAt(z) == inputNumberStr.charAt(x))
                    result = inputNumberStr.replace(inputNumberStr.charAt(x), ' ');

            }
        }
        return result;
    }

    private static String searchDuplicateNumbers(String inputNumberStr) {
        char[] s = new char[inputNumberStr.length()];
        for (int i = 0; i < inputNumberStr.length(); i++) {
            for (int j = i + 1; j < inputNumberStr.length(); j++) {
                if (inputNumberStr.charAt(i) == inputNumberStr.charAt(j))
                    s[i] = inputNumberStr.charAt(i);
            }
        }
        return new String(s);
    }

}
