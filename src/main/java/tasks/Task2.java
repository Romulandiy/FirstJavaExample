package tasks;

import java.io.*;

/**
 * Created by Roman on 18.01.2017.
 * 2) Дана строка со скобками, проверить одинаковое ли количество левых скобок и правых,
 * если неправильное количество левых скобок, то вывести их количество, если больше правых скобок,
 * вывести индекс первой правой скобки
 */
public class Task2 {

    int field = 1;

    public static void main(String[] args) throws IOException {
        alexTask2();
        romanTask2();
    }

    void method(int arg){
        // job
    }

    private static void romanTask2() throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int parenthesisLeft = 0, parenthesisRigth = 0;
        System.out.println("Enter the string with the presence in it of parentheses: ");
        String str = in.readLine();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(')
                parenthesisLeft++;
            if (str.charAt(i) == ')')
                parenthesisRigth++;
        }
        if (parenthesisLeft != 0 && parenthesisLeft < parenthesisRigth) {
            System.out.println("Amount left parentheses in the string = " + parenthesisLeft);
            System.out.println("Number of the first right parenthesis index = " + str.indexOf(')'));
        } else if (parenthesisLeft == parenthesisRigth)
            System.out.println("Amount left parentheses with rigth parentheses are equals or absents");

        else if (parenthesisLeft > parenthesisRigth)
            System.out.println("Amount left parentheses in the string = " + parenthesisLeft);
        else if (parenthesisLeft < parenthesisRigth)
            System.out.println("Number of the first right parenthesis index = " + str.indexOf(')'));
    }

    public static void alexTask2() throws IOException {
        String s;
        int rightBrIndex = 0;
        int countBr = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter arithmetic expression:");
        s = br.readLine();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') countBr++;
            else if (s.charAt(i) == ')') countBr--;
            if (countBr < 0) {
                rightBrIndex = i;
                break;
            }
        }
        System.out.println("Are brackets placed correctly?");
        if (countBr == 0) System.out.println("Yes");
        else {
            System.out.println("No");
            if (countBr > 0) System.out.println("Number of the wrong left brackets is " + countBr);
            else System.out.println("The index of the first wrong right bracket is " + rightBrIndex);
        }
    }
}



