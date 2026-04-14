package esempi.eccezioni;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Esempio2
{
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dammi nome file");
        while(true) {
            try {
                String nome = sc.nextLine();
                leggiFile(nome);
                break;
            } catch (FileNotFoundException e) {
                System.out.println("dammi il nome di un file vero");
            }
        }
    }

    public static void leggiFile(String nomefile) throws FileNotFoundException
    {
        File ilMioFile = new File(nomefile);//non è un operazione pericolosa
        //va passato come parametro allo Scanner
        Scanner fr = new Scanner(ilMioFile);
//        Scanner fr = new Scanner(new File(nomefile));
        while(fr.hasNextLine())
            System.out.println(fr.nextLine());
    }
}
