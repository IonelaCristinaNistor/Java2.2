/*1. Fișierul judete_in.txt, conține lista neordonată a județelor din țară. Să se încarce
datele din fișier într-un tablou de String-uri și să se ordoneze acest tablou cu ajutorul metodei
sort() din clasa Arrays. Să se returneze pe ce poziție se află în vectorul ordonat un județ
introdus de la tastatură. Se va utiliza metoda de căutare binară din clasa Arrays*/
package ex1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class ex1 {
    public static void main(String[] args) throws IOException{
        String fisier = "judete_in.txt";
        BufferedReader flux_in;
        flux_in = new BufferedReader(new InputStreamReader((new FileInputStream("src/ex1/judete_in.txt"))));
        String linie;
        String[] judete = new String[7];
        int i = 0;
        while((linie = flux_in.readLine()) != null)
        {
            judete[i] = linie;
            //System.out.println(linie);
           i++;
        }
        Arrays.sort(judete);
        System.out.println(judete);
    }
}
