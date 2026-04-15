package esempi.mappe;

import java.util.HashMap;
import java.util.Map;

public class EsempioMappaMappa2
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
        //DI aggiungere ad ogni mappa un campo "nome_maiuscolo" con dentro il nome tutto in maiuscolo
        //SELECT id,nome,eta,UPPER(nome) nome_maiuscolo FROM persona
        Map<Integer, Map<String,String>> res = new HashMap<>();

        for(Integer key : t.keySet())//t.keySet() -> [1,3,2]
        {
            //Prendiamo mappa interna (una delle righe) in base al valore
            //della chiave che stiamo scorrendo (un id)
            Map<String,String> mappaInterna = t.get(key);
            //Kiavi    Valori
            //id    -> 1
            //nome  -> Stefano
            //eta   -> 30

            //Estraiamo dalla mappa il valore collegato al nome
            String nome = mappaInterna.get("nome");
            //lo reinseriamo nella stessa mappa, con chiave
            //nome_maiuscolo e valore messo in maiuscolo
            mappaInterna.put("nome_maiuscolo",nome.toUpperCase());
            //inseriamo questa mappa che ora ha 4 chiavi
            //id    -> 1
            //nome  -> Stefano
            //eta   -> 30
            //nome_maiuscolo - > STEFANO

            //la inseriamo dentro res, mettendo come chiave la stessa
            //che aveva in t, vale a dire il suo ID
            res.put(key,mappaInterna);
        }

        System.out.println(res);
    }
}
