package tasks;

import java.util.Scanner;

/**
 * Created by Roman on 18.01.2017.
 * 1) Given sluychaynoe three-digit number, to withdraw hundreds individually, tens, units
 * in RUS: 1) ���� ���������� ����������� �����, ������� �������� �����, �������, �������
 */
public class Probatask1 {

    public static void main(String[] args) {
        someMethod();
    }

    private static void someMethod() {
        int n;
        String k;
        int r;
        Scanner scan = new Scanner(System.in);
        System.out.print("Please write the three-digit whole positive number: ");

        if (scan.hasNextInt()) n = scan.nextInt();
        else {
            System.out.print("Is not a correct entry number: " + scan.nextLine());
            return;
        }
        if (n <= 0) {
            System.out.print("Is not a correct entry number \n It is less than zero: " + n);
            return;
        }

        k = Integer.toString(n);

        if (k.length() != 3) {
            System.out.print("Is not a correct entry number \n It is not three-digit number: " + k);
            return;
        }

        r = Integer.parseInt(k);

        System.out.println("Hundreds of number: " + r / 100);
        System.out.println("Tens of number: " + (r / 10) % 10);
        System.out.println("Units of number: " + r % 10);
    }

}
