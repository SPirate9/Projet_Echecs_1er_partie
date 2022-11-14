package pieces;

import java.util.Scanner;
public class Echiquier {
    private Pieces[][] tableau = new Pieces[nbDeLigneEtCol][nbDeLigneEtCol];
    public static int nbDeLigneEtCol = 8;
    private Boolean jeuxEnCours;
    private static int departL, departC, arriveL, arriveC;
    String mouvement;
    Scanner saisie = new Scanner(System.in);

    public Echiquier() {
        creerTableau(tableau);

        jeuxEnCours = true;

        creerTableau(tableau);

    }
    public Boolean getjeuxEnCours() {
        return this.jeuxEnCours;
    }

    private static void creerTableau(Pieces[][] tableau) {
        char[][] tab = new char[8][8];
        for (int i = 0; i < tab.length; ++i) {
            for (int j = 0; j < tab[0].length; ++j) {
                if (j == 7) {
                    tableau[i][j] = new Case0();
                    for (j = 0; j < 7; j++) {
                        tableau[i][j] = new Case0();
                        if (i == 0 && j == 3) {
                            tableau[i][j] = new Dame();
                        } else if (i == 7 && j == 4) {
                            tableau[i][j] = new Roi();
                        }

                    }
                }
            }
        }
    }
    public void afficherTableau() {
        String lettres = "    ";
        String trait = "   ";
        String ligne = "";
        int x = 0;

        while (x < tableau.length) {
            trait += " ---";
            ++x;
        }

        for (int i = 0; i < tableau.length; ++i) {
            lettres += (char)(i + 65) + "   ";

        }
        System.out.println(lettres);

        for (int i = 0; i != tableau.length; i++) {
            System.out.println(trait);
            ligne += 8 - i + " | ";

            for (int j = 0; j != tableau.length; j++) {
                ligne += tableau[i][j] + " | ";

            }
            System.out.println(ligne + (8 - i));
            ligne = "";
            if (i == 7) {

            }

        }

        System.out.println(trait);
        System.out.println(lettres);

    }

    public void mouvement() {

        mouvement = saisie.nextLine();

        String uppercase = mouvement.toLowerCase();

        String[] composants = uppercase.split(" ");
        departC = composants[0].charAt(0) - 'a';

        departL = 7 - (composants[0].charAt(1) - '1');

        arriveC = composants[2].charAt(0) - 'a';
        arriveL = 7 - (composants[2].charAt(1) - '1');

        if (mouvValide()) {

            tableau[arriveL][arriveC] = tableau[departL][departC];

            tableau[departL][departC] = new Case0();
        }

    }

    private boolean mouvValide() {

        if (departL < 0 || departL > 7 || departC < 0 || departC > 7 || arriveL < 0 ||
            arriveL > 7 || arriveC < 0 || arriveC > 7) {

            System.out.println("Le mouvement est en dehors de l'échiquier ! ");
            mouvement();
            return false;
        }

        if (!tableau[departL][departC].deplacementOK(departL, departC, arriveL,
                arriveC)) {

            System.out.println("Cette pièce ne bouge pas de cette façon ! ");
            mouvement();
            return false;
        }

        return true;
    }
}
