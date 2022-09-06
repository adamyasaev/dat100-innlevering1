package innlevering1;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class o2 {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {

            try {
            	int poengsum = Integer.parseInt(showInputDialog("Skriv din poengsum")); //lager joption panelet, gjør input om til et tall

                if (poengsum < 0 || poengsum > 100) { //Sjekker om tallet er mellom 0 og 100, hvis ikke, nytt forsøk
                    i = i - 1;
                    showMessageDialog(null, "Ugyldig poengsum, skriv inn et gyldig tall (0-100) og prøv igjen");
                }
                if (poengsum>= 90 && poengsum <= 100) {
                    showMessageDialog(null, "Du fikk karakteren A");
                } else if (poengsum >= 80 && poengsum <= 89) {
                    showMessageDialog(null, "Du fikk karakteren B");
                } else if (poengsum >= 60 && poengsum <= 79) {
                    showMessageDialog(null, "Du fikk karakteren C");
                } else if (poengsum >= 50 && poengsum <= 59) {
                    showMessageDialog(null, "Du fikk karakteren D");
                } else if (poengsum >= 40 && poengsum <= 49) {
                    showMessageDialog(null, "Du fikk karakteren E");
                } else if (poengsum >= 0 && poengsum <= 39) {
                    showMessageDialog(null, "Du fikk karakteren F");
                } 
            } catch (NumberFormatException e) { // Hvis bruker skriver en bokstav eller annet tegn, gi feilmelding, nytt forsøk
                i = i - 1;
                showMessageDialog(null, "Vennligst skriv inn et tall " + "\n" + e.getMessage()); 
            }
        }
    }
}

/*
package uke35oppg;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class b5 {

  public static void main(String[] args) {

    try {
      for (int i = 0; i < 10; i++) { 
        int poengsum = Integer.parseInt(showInputDialog("Skriv din poengsum")); //lager joption panelet, gjør input om til et tall
        if (poengsum >= 90 && poengsum <= 100) {
          showMessageDialog(null, "Du fikk karakteren A");
        } else if (poengsum >= 80 && poengsum <= 89) {
          showMessageDialog(null, "Du fikk karakteren B");
        } else if (poengsum >= 60 && poengsum <= 79) {
          showMessageDialog(null, "Du fikk karakteren C");
        } else if (poengsum >= 50 && poengsum <= 59) {
          showMessageDialog(null, "Du fikk karakteren D");
        } else if (poengsum >= 40 && poengsum <= 49) {
          showMessageDialog(null, "Du fikk karakteren E");
        } else if (poengsum >= 0 && poengsum <= 39) {
          showMessageDialog(null, "Du fikk karakteren F");
        } else {
          showMessageDialog(null, "Skriv inn en gyldig poengsum (0-100)"); // Thrower error for alle tall under 0 og over 100
        }
      }
    } catch (NumberFormatException e) { // Hvis bruker skriver en bokstav eller annet tegn, gi feilmelding
      showMessageDialog(null, "Vennligst skriv inn et tall " + "\n" + e.getMessage());

    }
  }

}
*/
