package innlevering1;

import java.util.Scanner;

public class o1 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in)) {
			System.out.println("Skriv din bruttoinntekt");
			
			double trinnskatt;
			int bruttoinntekt;
			bruttoinntekt = input.nextInt();
			
			if (bruttoinntekt <= 164100) {
					System.out.println("Du har ikke trinnskatt");
			} else if (bruttoinntekt >= 164101 && bruttoinntekt <= 230950) {
				trinnskatt = bruttoinntekt * 0.93 / 100;
				System.out.println("Din trinnskatt er: " + trinnskatt);
			} else if (bruttoinntekt >= 230951 && bruttoinntekt <= 580650) {
				trinnskatt = bruttoinntekt * 2.41 / 100;
				System.out.println("Din trinnskatt er: " + trinnskatt);
			} else if (bruttoinntekt >= 580651 && bruttoinntekt <= 934050) {
				trinnskatt = bruttoinntekt * 11.52 / 100;
				System.out.println("Din trinnskatt er: " + trinnskatt);
			} else if (bruttoinntekt >= 934051) {
				trinnskatt = bruttoinntekt * 14.52 / 100;
				System.out.println("Din trinnskatt er: " + trinnskatt);
			}
		}
	}

}