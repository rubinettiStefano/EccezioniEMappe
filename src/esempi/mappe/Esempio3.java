package esempi.mappe;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Esempio3
{
    static void main() {

        Scanner sc = new Scanner(System.in);
        Persona p1 = new Persona(11,"Stefano","Rubinetti",30);
        Persona p2 = new Persona(22,"Luca","Quaranta",29);
        Persona p3 = new Persona(35,"Stefano","De Martino",36);
        Map<Integer,Persona> idToPersona = new HashMap<>();
        idToPersona.put(p1.getId(),p1);
        idToPersona.put(p2.getId(),p2);
        idToPersona.put(p3.getId(),p3);


        //scorrendo insieme solo delle chiavi
        //k->11,k->22,k->35
        System.out.println("ID DELLE PERSONE PRESENTI ");
        for(Integer k : idToPersona.keySet())
            System.out.println(k);

        System.out.println("Di quale persona vuoi vedere i dati, metti il suo id");
        int id= Integer.parseInt(sc.nextLine());

        System.out.println(idToPersona.get(id)!=null ? idToPersona.get(id) : "Persona non presente");
    }
}
