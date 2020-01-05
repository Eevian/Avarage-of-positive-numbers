
import java.util.Scanner;

public class PositiivistenLukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // Positiivisia lkm
        double positiivisia = 0;
        // Negatiivisia lkm
        double negatiivisia = 0;
        // Positiivisten summa
        double summa = 0;

  
        while (true) {
            System.out.println("Syötä luku ");
            int luku = Integer.valueOf(lukija.nextLine());
 
            if (luku == 0) {
                break;
            }
            // Lisätään positiivisia lkm 1 lisää
            if (luku > 0){
                positiivisia = positiivisia + 1;
            // lisätään positiivisten summaan syötetty positiivinen luku
                summa = summa + luku;
            
            }
            if (luku < 0) {
                continue;
            }    
        }    
   
        if ((summa/positiivisia) > 0) {
            System.out.println( summa / positiivisia );
        } else {
            System.out.println("Keskiarvon laskeminen ei ole mahdollista");     
        }
    }
}
    


