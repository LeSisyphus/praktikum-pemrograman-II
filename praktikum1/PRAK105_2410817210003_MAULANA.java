package praktikum1;
import java.util.Scanner;

public class PRAK105_2410817210003_MAULANA {

	public static void main(String[] args) {
		final double pi = 3.14;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Masukkan jari-jari: ");
		double jariJari = input.nextDouble();
		System.out.print("Masukkan tinggi: ");
		double tinggi = input.nextDouble();
		
		if(jariJari < 0 || tinggi < 0) {
			System.out.println("Input tidak valid!");
		} else {
			System.out.printf("Volume tabung dengan jari jari " + jariJari + " cm dan tinggi " + tinggi + " cm adalah %.3f m3",(pi * jariJari * jariJari * tinggi) );
		}
		
		input.close();
	}
}
