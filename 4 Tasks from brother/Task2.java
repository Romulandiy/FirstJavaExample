/**
 * Created by Roman on 18.01.2017.
  2) Дана строка со скобками, проверить одинаковое ли количество левых скобок и правых,
  если неправильное количество левых скобок, то вывести их количество, если больше правых скобок,
  вывести индекс первой правой скобки
 */
import java.io.*;

public class Task2 {
            public static void main(String[] args) throws IOException
        {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            int parenthesisLeft =0, parenthesisRigth = 0 ;
            System.out.println("Enter the string with the presence in it of parentheses: ");
            String str = in.readLine();
            for (int i=0; i<str.length(); i++)
            {
                if (str.charAt(i) == '(')
                    parenthesisLeft++;
                if (str.charAt(i) == ')')
                    parenthesisRigth++;
            }
                 if (parenthesisLeft != 0 && parenthesisLeft < parenthesisRigth) {
                    System.out.println("Amount left parentheses in the string = " + parenthesisLeft);
                    System.out.println("Number of the first right parenthesis index = " + str.indexOf(')'));
                 }
                 else if (parenthesisLeft == parenthesisRigth)
                   System.out.println("Amount left parentheses with rigth parentheses are equals or absents");

                 else if (parenthesisLeft > parenthesisRigth)
                    System.out.println("Amount left parentheses in the string = " + parenthesisLeft);
                 else if (parenthesisLeft < parenthesisRigth)
                    System.out.println("Number of the first right parenthesis index = " + str.indexOf(')'));

        }
}



