import java.time.DayOfWeek;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import javax.security.auth.kerberos.KerberosCredMessage;

public class App {
    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        // Formas de imprimir un HashMap

        // for (String key : map.keySet()) {
        // System.out.println(key+"="+map.get(key));
        // }
        // System.out.println(Arrays.asList(map));
        // System.out.println(Collections.sin0gletonList(map));
        // System.out.println(map.values());
        // System.out.println(map.keySet());

        String entrada = "MCMXCIV";

        char[] datoEntrada = entrada.toCharArray();// guarada el String en un Array de tipo char(caracteres)
        int[] n = new int[entrada.length()];

        for (int i = 0; i < n.length; i++) {

            System.out.println(n[i] = map.get(datoEntrada[i]));
        }
        int sum = 0;
        for (int i = 0; i < n.length; i++) {
            // sum = i == datoEntrada.length - 1 || n[i] >= n[i + 1] ? sum + n[i] : sum -
            // n[i];
            sum += n[i];
        }
        System.out.println(sum);

    }

    // esta funcion imprime el arreglo solo
    public static char imprimirArray(char[] datoEntrada) {
        int i = 0;
        while (i < datoEntrada.length) {
            System.out.println(datoEntrada[i]);
            i++;

        }
        return 't';

    }

}
