/**
 * Created by Roman on 18.01.2017.
 *     // 3) Дано число, псочитать количество не повторяющихся цифр.
         long y = 1234561234520349L;
 */
public class CountNumbersTask3 {
    public static void main(String[] args) {
        long k = 123454561234520349L;
        int i=0 ,j=0, z=0, x=0 ;
        String str = Long.toString(k);
        StringBuffer m = new StringBuffer(str);
        char[] s = new char[20];
        for ( i = 0; i < m.length(); i++) {
            for (j = i+1; j < m.length(); j++) {
                if (m.charAt(i) == m.charAt(j))
                   s[i] = m.charAt(i);

            }
        }
        String f = new String(s);

        String str2 = new String(m);
        for ( z = 0; z < f.length(); z++) {
            for (x = 0; x < str.length(); x++) {
                if (f.charAt(z) == str.charAt(x))
                    str2 = str2.replace(str.charAt(x),' ');

            }
        }
        String str3 = str2.replaceAll(" ","");
        System.out.println("КОЛИЧЕСТВО НЕ ПОВТОРЯЮЩИХСЯ ЦИФР В ЧИСЛЕ "+str+" = " + str3.length());
    }

}
