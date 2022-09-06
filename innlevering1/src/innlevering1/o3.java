package innlevering1;
import static javax.swing.JOptionPane.*;
   
public class o3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
        int n = Integer.parseInt(showInputDialog("Skriv  en verdi"));
        
        int fakultet = n;
        
        System.out.println("Regn ut n fakultet");
        System.out.print(n + "! = " + n);
        
        do {
            fakultet--;
            n = n * fakultet;
            System.out.print(" * " + fakultet);
        } while (fakultet > 1);
        System.out.print(" = " + n);
	}

}
     
