package No4;
import java.text.DecimalFormat;
import java.util.Scanner;
public class empat {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("###");
		Scanner in = new Scanner (System.in);
		System.out.println("Masukkan sisa BBM dalam tangki (liter) = ");
		double sisaben = in.nextDouble();
		System.out.println("Masukkan konsumsi BBM kendaraan (km/liter) = ");
		double konsum = in.nextDouble();
		double sj = hitungSisaJarak ( sisaben,  konsum);
		System.out.println("Kendaraan anda dapat menempuh jarak "+df.format(sj)+"  kilometer dengan sisa \r\n"
				+ "BBM yang ada di tangki");
			}
			static double hitungSisaJarak(double sisa, double jarakPerLiter) {
			double sisaJarak = sisa * jarakPerLiter;
			return sisaJarak;
			}

	}


