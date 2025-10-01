package praktikum1;
import java.util.Scanner;

public class PRAK104_2410817210003_MAULANA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       String[] abu = new String[3];
       String[] bagas = new String[3];
       int poinAbu = 0;
       int poinBagas = 0;
       
       System.out.print("Tangan Abu: ");
       for(int i = 0; i < 3; i++) {
    	   abu[i] = input.next();
       }
       
       System.out.print("Tangan Bagas: ");
       for(int i = 0; i < 3; i++) {
    	   bagas[i] = input.next();
       }
       
       for(int i = 0; i < 3; i++) {
    	   if(abu[i].equals("K") && bagas[i].equals("B") || abu[i].equals("B") && bagas[i].equals("G") || abu[i].equals("G") && bagas[i].equals("K")){
    		   poinAbu++;
    	   }else if(abu[i].equals(bagas[i])) {
    		   continue;
    	   } else {
    		   poinBagas++;
    	   }
       }
       
       if(poinAbu == poinBagas) {
    	   System.out.println("Seri");
       } else if(poinAbu > poinBagas) {
    	   System.out.println("Abu");
       } else {
    	   System.out.println("Bagas");
       }

        input.close();
    }
}
