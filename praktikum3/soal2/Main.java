package soal2;

import java.util.*;

public class Main {
	private static String getNamaBulan(int bulan) {
        String[] namaBulan = {
            "Januari", "Februari", "Maret", "April", "Mei", "Juni",
            "Juli", "Agustus", "September", "Oktober", "November", "Desember"
        };
        return (bulan >= 1 && bulan <= 12) ? namaBulan[bulan - 1] : "Bulan yang anda masukkan tidak valid!";
    }
	
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jumlahNegara = input.nextInt();
        input.nextLine();

        LinkedList<Negara> negaraList = new LinkedList<>();

        for (int i = 0; i < jumlahNegara; i++) {
            String nama = input.nextLine();
            String jenisKepemimpinan = input.nextLine();
            String namaPemimpin = input.nextLine();

            int tanggalKemerdekaan = 0;
            int bulanKemerdekaan = 0;
            int tahunKemerdekaan = 0;

            if (!jenisKepemimpinan.equals("monarki")) {
                tanggalKemerdekaan = input.nextInt();
                bulanKemerdekaan = input.nextInt();
                tahunKemerdekaan = input.nextInt();
                input.nextLine();
            }

            Negara negara = new Negara(nama, jenisKepemimpinan, namaPemimpin, tanggalKemerdekaan, bulanKemerdekaan, tahunKemerdekaan);
            negaraList.add(negara);
        }

        for (Negara negara : negaraList) {
            System.out.println("Negara " + negara.getNama() + " mempunyai " + 
                (negara.getJenisKepemimpinan().equals("monarki") ? "Raja" :
                (negara.getJenisKepemimpinan().equals("presiden") ? "Presiden" : "Perdana Menteri"))
                + " bernama " + negara.getNamaPemimpin());

            if (!negara.getJenisKepemimpinan().equals("monarki")) {
                System.out.println("Deklarasi Kemerdekaan pada Tanggal " + 
                    negara.getTanggalKemerdekaan() + " " + 
                    getNamaBulan(negara.getBulanKemerdekaan()) + " " + 
                    negara.getTahunKemerdekaan());
            }
            System.out.println();
        }
        input.close();
    }

    
    
}