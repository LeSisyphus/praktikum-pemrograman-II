package praktikum2.soal1;

public class Buah {
    String nama;
    double berat;
    double harga;
    double jumlahBeli;

    public Buah(String nama, double berat, double harga, double jumlahBeli) {
        this.nama = nama;
        this.berat = berat;
        this.harga = harga;
        this.jumlahBeli = jumlahBeli;
    }

    public void tampilkan() {
        double hargaPerKg = harga / berat;
        double hargaSebelumDiskon = jumlahBeli * hargaPerKg;
        int kelipatanDiskon = (int) (jumlahBeli / 4);
        
        double totalDiskon = kelipatanDiskon * (4 * harga) * 0.02;
        double hargaSetelahDiskon = hargaSebelumDiskon - totalDiskon;

        System.out.println("Nama Buah: " + nama);
        System.out.println("Berat: " + berat);
        System.out.println("Harga: " + harga);
        System.out.println("Jumlah Beli: " + jumlahBeli + "kg");
        System.out.println("Harga Sebelum Diskon: Rp" + hargaSebelumDiskon);
        System.out.println("Total Diskon: Rp" + totalDiskon);
        System.out.println("Harga Setelah Diskon: Rp" + hargaSetelahDiskon);
        System.out.println();
    }
}
