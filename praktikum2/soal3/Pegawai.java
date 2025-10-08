package praktikum2.soal3;
// Nama kelas harus sama dengan nama file (Pegawai.java)
//public class Employee;
public class Pegawai {
    public String nama;

    // Pada baris ini terjadi error karena tipe data 'char' tidak cocok untuk menyimpan kalimat/teks.
    // public char asal;
    public String asal;

    public String jabatan;
    public int umur;

    public String getNama() {
        return nama;
    }

    public String getAsal() {
        return asal;
    }

    // Pada baris ini terjadi error karena method tidak memiliki parameter sementara dipanggil dengan argumen.
    // public void setJabatan() { this.jabatan = j; }
    public void setJabatan(String j) {
        this.jabatan = j;
    }
}
