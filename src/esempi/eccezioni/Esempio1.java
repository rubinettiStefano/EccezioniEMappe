package esempi.eccezioni;

import java.util.Scanner;

public class Esempio1 {
    static Scanner sc = new Scanner(System.in);

    static void main() {
        System.out.println("inizio");
        System.out.println("Il numero inserito è " + metodoCheChiedeNumero());
        System.out.println("fine");
    }

    /**
     *
     * @return
     */
    static int metodoCheChiedeNumero() {
        System.out.println("Dammi un numero intero tra 0 e 1000");
        int res;
        while (true) {
            try {
                res = Integer.parseInt(sc.nextLine());
                metodoCheControllaNumero(res);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Buffone, metti numero non parola");
            } catch (RuntimeException e) {
                System.out.println("Buffone, ho detto tra 0 e 1000");
            }
        }
        return res;
    }

    /**
     *
     * @param res
     * @throws RuntimeException quando res non compreso tra 0 e 1000
     */
    private static void metodoCheControllaNumero(int res) throws RuntimeException {
        if (res < 0 || res > 1000)
            throw new RuntimeException("Numero troppo piccolo o grande");
    }

}
