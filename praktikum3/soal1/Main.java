package soal1;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Jumlah Dadu : ");
        int jumlahDadu = input.nextInt();

        LinkedList<Dadu> daduList = new LinkedList<>();
        int totalNilai = 0;

        for (int i = 1; i <= jumlahDadu; i++) {
            Dadu dadu = new Dadu();
            daduList.add(dadu);
            System.out.println("Dadu ke-" + i + " bernilai " + dadu.getNilai());
            totalNilai += dadu.getNilai();
        }

        System.out.println("Total nilai dadu keseluruhan : " + totalNilai);
        input.close();
    }
}