package esempi.mappe;

import java.util.HashMap;
import java.util.Map;

public class EsempioMappaMappa1
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
        //FILTRO, VOGLIO OTTENERE UNA MAPPA CHIAVE INTERO DI MAPPE DI STRING
        //CON DENTRO SOLO le ""PERSONE"" con più di 25 anni
        Map<Integer, Map<String,String>> res = new HashMap<>();
        for(Integer key : t.keySet())
        {
            Map<String,String> mappaInterna = t.get(key);
            String etaComeString = mappaInterna.get("eta");
            int eta = Integer.parseInt(etaComeString);
            if(eta>25)
                res.put(key,mappaInterna);
        }

        System.out.println(res);
    }
}
