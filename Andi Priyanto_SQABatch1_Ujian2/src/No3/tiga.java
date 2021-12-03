package No3;

import java.util.Scanner;

public class tiga {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("Masukkan jarak (kilometer) =  ");
		double jarak = in.nextDouble();
		System.out.println("Masukkan waktu (jam) =  ");
		double waktu = in.nextDouble();
		double sj = hitungKecepatan ( jarak,  waktu);
		System.out.println("Kecepatan rata-rata anda adalah " +sj+" km/jam");
			}
			static double hitungKecepatan(double jarak2 , double waktu2) {
			
				double rata = jarak2 / waktu2;
				return rata;
			}

	}


