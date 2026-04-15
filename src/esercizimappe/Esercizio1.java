package esercizimappe;

import java.util.HashMap;
import java.util.Map;

public class Esercizio1
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
            //immaginiamo sia passato un anno,
            //voglio aumentare di 1 il valore di tutte le eta
            String etaString = mappaInterna.get("eta");
            int eta = Integer.parseInt(etaString);
            eta++;
            //la reinserisco con la stessa chiave
            mappaInterna.put("eta",eta+"");

            res.put(key,mappaInterna);
        }

        //SCRIVETE UNA QUERY PER FARE ESATTAMENTE LO STESSO LAVORO SULLA LETTURA DELLA
        //TABELLA. i campi letti devono essere sempre id,nome,eta, ma età mostrata
        //deve essere maggiore di 1 rispetto a quella salvata
        System.out.println(res);
    }
}
