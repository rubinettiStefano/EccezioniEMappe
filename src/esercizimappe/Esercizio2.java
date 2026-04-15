package esercizimappe;

import java.util.HashMap;
import java.util.Map;

public class Esercizio2
{
    static  Map<Integer, Map<String,String>> t = new HashMap<>();

    static void riempiMappa()
    {
        Map<String,String> riga1 = new HashMap<>();
        riga1.put("id","1");
        riga1.put("nome","Stefano");
        riga1.put("eta","30");
        Map<String,String> riga2 = new HashMap<>();
        riga2.put("id","2");
        riga2.put("nome","Eric");
        riga2.put("eta","23");
        Map<String,String> riga3 = new HashMap<>();
        riga3.put("id","3");
        riga3.put("nome","Donato");
        riga3.put("eta","29");
        t.put(1,riga1);
        t.put(2,riga2);
        t.put(3,riga3);
    }
    static void main() {
        riempiMappa();
        Map<Integer, Map<String,String>> res = new HashMap<>();
        for(Integer key : t.keySet())
        {
            Map<String,String> mappaInterna = t.get(key);

            //TODO
            //fare esattamente quello che faccio nella query
            //indizio : usare il metodo startsWith() delle string

            res.put(key,mappaInterna);
        }
        //query: SELECT * FROM persona WHERE nome like 'S%'
        System.out.println(res);
    }
}
