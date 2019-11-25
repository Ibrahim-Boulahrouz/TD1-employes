
package fr.univ_amu.iut.exo1;

import java.time.LocalDate;
import java.time.Month;

public class GestionEntreprises {
    public static void main(String[] args) {
        Entreprise e1 = new Entreprise("MaBoiteInfo");
        Employes m1 = new Employes(
                1,
                269054,
                "BOULAHROUZ",
                "Ibrahim",
                12,
                LocalDate.of(2000, Month.JANUARY, 03),
                LocalDate.of(2019, Month.NOVEMBER, 13),
                10,
                40);
        e1.hire(m1);
        System.out.println(e1.ToString());
    }
}