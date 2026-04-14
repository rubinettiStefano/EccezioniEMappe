package esempi.mappe;

import java.util.HashMap;
import java.util.Map;

public class Esempio1
{
    static void main()
    {
        Map<String,String> dizionario = new HashMap<>();
        dizionario.put("ciao","bye"); //k -> "ciao" , v -> "bye"
        dizionario.put("sedia","chair"); //k -> "sedia" , v -> "chair"
        dizionario.put("albero","tree"); //k -> "albero" , v -> "tree"

        System.out.println(dizionario.get("ciao"));
        System.out.println(dizionario.get("paperino"));
    }
}
