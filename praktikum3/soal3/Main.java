package soal3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa berdasarkan NIM");
            System.out.println("3. Cari Mahasiswa berdasarkan NIM");
            System.out.println("4. Tampilkan Daftar Mahasiswa");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            int pilihan = input.nextInt();
            input.nextLine(); 

            switch (pilihan) {
                case 1 -> {
                    System.out.print("Masukkan Nama Mahasiswa: ");
                    String nama = input.nextLine();
                    System.out.print("Masukkan NIM Mahasiswa (harus unik): ");
                    String nim = input.nextLine();

                    if (isNimUnique(daftarMahasiswa, nim)) {
                        daftarMahasiswa.add(new Mahasiswa(nama, nim));
                        System.out.println("Mahasiswa " + nama + " ditambahkan.");
                    } else {
                        System.out.println("NIM sudah terdaftar. Mahasiswa tidak ditambahkan.");
                    }
                }

                case 2 -> {
                    System.out.print("Masukkan NIM Mahasiswa yang akan dihapus: ");
                    String nimHapus = input.nextLine();

                    if (hapusMahasiswa(daftarMahasiswa, nimHapus)) {
                        System.out.println("Mahasiswa dengan NIM " + nimHapus + " berhasil dihapus.");
                    } else {
                        System.out.println("Mahasiswa dengan NIM " + nimHapus + " tidak ditemukan.");
                    }
                }

                case 3 -> {
                    System.out.print("Masukkan NIM Mahasiswa yang akan dicari: ");
                    String nimCari = input.nextLine();

                    Mahasiswa hasil = cariMahasiswa(daftarMahasiswa, nimCari);
                    if (hasil != null) {
                        System.out.println("Mahasiswa ditemukan:");
                        System.out.println(hasil);
                    } else {
                        System.out.println("Mahasiswa dengan NIM " + nimCari + " tidak ditemukan.");
                    }
                }

                case 4 -> {
                    System.out.println("\nDaftar Mahasiswa:");
                    if (daftarMahasiswa.isEmpty()) {
                        System.out.println("Belum ada data mahasiswa.");
                    } else {
                        for (Mahasiswa mhs : daftarMahasiswa) {
                            System.out.println(mhs);
                        }
                    }
                }

                case 0 -> {
                    System.out.println("Terima kasih! Program selesai.");
                    input.close();
                    System.exit(0);
                }

                default -> System.out.println("Pilihan tidak valid. Silakan pilih menu yang tersedia.");
            }
        }
    }

    // Mengecek apakah NIM belum digunakan oleh mahasiswa lain
    private static boolean isNimUnique(ArrayList<Mahasiswa> daftarMahasiswa, String nim) {
        for (Mahasiswa mahasiswa : daftarMahasiswa) {
            if (mahasiswa.getNim().equalsIgnoreCase(nim)) {
                return false;
            }
        }
        return true;
    }

    // Menghapus mahasiswa berdasarkan NIM
    private static boolean hapusMahasiswa(ArrayList<Mahasiswa> daftarMahasiswa, String nim) {
        return daftarMahasiswa.removeIf(mahasiswa -> mahasiswa.getNim().equalsIgnoreCase(nim));
    }

    // Mencari mahasiswa berdasarkan NIM
    private static Mahasiswa cariMahasiswa(ArrayList<Mahasiswa> daftarMahasiswa, String nim) {
        for (Mahasiswa mahasiswa : daftarMahasiswa) {
            if (mahasiswa.getNim().equalsIgnoreCase(nim)) {
                return mahasiswa;
            }
        }
        return null;
    }
}
