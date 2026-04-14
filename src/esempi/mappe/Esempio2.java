package esempi.mappe;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Esempio2
{
    static void main() {
//        List<Persona> l = new ArrayList<>();
//        l.add(new Persona(1,"Stefano","Rubinetti",30));
//        l.add(new Persona(2,"Luca","Quaranta",29));
//
//        for(Persona p : l)
//            nomeToPersona.put(p.getNome(),p);
        Persona p1 = new Persona(11,"Stefano","Rubinetti",30);
        Persona p2 = new Persona(22,"Luca","Quaranta",29);
        Persona p3 = new Persona(35,"Stefano","De Martino",36);


//        Map<String,Persona> nomeToPersona = new HashMap<>();
//        nomeToPersona.put(p1.getNome(),p1);//k -> "Stefano", v -> persona Stefano
//        nomeToPersona.put(p2.getNome(),p2);//k -> "Luca", v -> persona Luca
//        nomeToPersona.put(p3.getNome(),p3);//k -> "Stefano", v -> persona Stefano de Martino

//        System.out.println(nomeToPersona.get("Luca"));

        Map<Integer,Persona> idToPersona = new HashMap<>();
        idToPersona.put(p1.getId(),p1);
        idToPersona.put(p2.getId(),p2);
        idToPersona.put(p3.getId(),p3);

        System.out.println(idToPersona.get(98));
//
    }
}
