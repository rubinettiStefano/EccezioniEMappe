package esempi.mappe;

import java.util.HashMap;
import java.util.Map;

public class GiocoTipi
{
    static void main()
    {
        Persona p1 = new Persona(11,"Stefano","Rubinetti",30);
        Persona p2 = new Persona(22,"Luca","Quaranta",29);
        Persona p3 = new Persona(35,"Stefano","De Martino",36);

        Map<Integer,Persona> idToPersona = new HashMap<>();
        idToPersona.put(p1.getId(),p1);
        idToPersona.put(p2.getId(),p2);
        idToPersona.put(p3.getId(),p3);

        System.out.println(idToPersona.get(11));
    }
}
