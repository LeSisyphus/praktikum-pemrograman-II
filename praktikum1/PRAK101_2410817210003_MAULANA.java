package praktikum1;
import java.util.Scanner;

public class PRAK101_2410817210003_MAULANA{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Masukkan Nama Lengkap: ");
		String nama = input.nextLine();		
		System.out.print("Masukkan Tempat Lahir: ");
		String tempatLahir = input.nextLine();		
		System.out.print("Masukkan Tanggal Lahir: ");
		int tanggalLahir = input.nextInt();		
		System.out.print("Masukkan Bulan Lahir: ");
		int bulanLahir = input.nextInt();		
		System.out.print("Masukkan Tahun Lahir: ");
		int tahunLahir = input.nextInt();		
		System.out.print("Masukkan Tinggi Badan: ");
		int tinggiBadan = input.nextInt();		
		System.out.print("Masukkan Berat Badan: ");
		double beratBadan = input.nextDouble();		
		
		String bulan[] = {
				"", "Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"
		};
		
		if(tanggalLahir < 0 || bulanLahir < 0 || tahunLahir < 0 || tinggiBadan < 0 || beratBadan < 0) {
			System.out.println("Input tidak valid!");
		} else {
			System.out.println("Nama Lengkap " + nama + ", Lahir di " + tempatLahir + " pada Tanggal " + tanggalLahir + " " + bulan[bulanLahir] + " " + tahunLahir + " Tinggi Badan " + tinggiBadan + " cm dan Berat Badan " + beratBadan + " kilogram"  );
		}
		
		input.close();
	}
}
