package No1;

import java.util.Scanner;

public class satu {

	public static void main(String[] args) {
		 Scanner in = new Scanner (System.in);
		    System.out.println("Masukkan nilai maksimal deret = ");
		    int batas = in.nextInt();
		    cetakFibonacci(batas);
		    }
		    static void cetakFibonacci(int batas) {
		    	
		    
				int fib[] = new int[batas];
				fib[0] = 1;
		        fib[1] = 1;
		         
		        for(int i = 2; i < batas; i++) {
		            fib[i] = fib[i-1] + fib[i-2];
		        }
		         
		        for (int i = 0; i < batas; i++) {
		            System.out.print(fib[i] +  " ");
		        }
		    }
		

	}


