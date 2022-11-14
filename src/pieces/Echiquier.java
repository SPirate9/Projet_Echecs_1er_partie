package pieces;

import java.util.Scanner;
//J'importe les classes que je vais utiliser ici le scanner
public class Echiquier {
  // Je déclare les variables privées de mon plateau
  private Pieces[][] tableau = new Pieces[nbDeLigneEtCol][nbDeLigneEtCol];
  // Je commence par lui donner la taille du tableau 
  public static int nbDeLigneEtCol = 8;
  private Boolean jeuxEnCours; // un boolean pour la partie en cours
  private static int departL, departC, arriveL, arriveC;// ligne et colonne pour mon déplacement
  String mouvement; // corresponds à mon scanner instruction de déplacement
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
	// Je crée le tableau
    // Je commence par lui donner la taille du tableau
    char[][] tab = new char[8][8];
    for (int i = 0; i < tab.length; ++i) {

      for (int j = 0; j < tab[0].length; ++j) {
    	// ici I correspond à la colonne et J'à la ligne
        if (j == 7) {
          tableau[i][j] = new Case0();
          for (j = 0; j < 7; j++) {
            tableau[i][j] = new Case0();
            // je fais une boucle fort puis je fais appel à la case0 pour remplir les cases vides
            if (i == 0 && j == 3) {
              tableau[i][j] = new Dame();
            }
            // Puis je lui donne 2 pièces en vérifiant que les coordonnées ici le Roi et la Dame
            else if (i == 7 && j == 4) {
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
      trait += " ---"; // pour chaque ligne du tableau
      ++x;
    }

    for (int i = 0; i < tableau.length; ++i) {
      lettres += (char)(i + 65) + "   "; // j'utilise ASCII table 65 pour afficher le A 
      // ensuite le reste avec une boucle
    }
    System.out.println(lettres);

    for (int i = 0; i != tableau.length; i++) {
      System.out.println(trait);
      ligne += 8 - i + " | "; // pour chaque colonne du tableau
      // je commence à 8 jusqu'à 1 avec une boucle

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
    // je divise ma chaine de caractère avec split avec un caractère prédéfini ici un espace
    String[] composants = uppercase.split(" ");
    departC = composants[0].charAt(0) - 'a';
    // je décompose ma chaine de caractère le premier caractère
    // corresponds a la lettre par exemple A1 a A3 components[0].chartAt(0) = 'A'
    // la méthode charAt renvoie le caractère a l'index spécifié
    departL = 7 - (composants[0].charAt(1) - '1');
    // Idem ici avec les chiffres components [0].charAt (1) = '1'
    arriveC = composants[2].charAt(0) - 'a';
    arriveL = 7 - (composants[2].charAt(1) - '1');

    if (mouvValide()) {
      // Si je peux jouer ma pièce
      // Je place ma pièce dans sa nouvelle case
      tableau[arriveL][arriveC] = tableau[departL][departC];
      // Je supprime ma pièce de son ancienne case en plaçant la case vide Case0()
      tableau[departL][departC] = new Case0();
    }

  }

  private boolean mouvValide() {

    if (departL < 0 || departL > 7 || departC < 0 || departC > 7 || arriveL < 0 ||
      arriveL > 7 || arriveC < 0 || arriveC > 7) {
      // Si les coordonnées rentrées n'existent pas, j'affiche un message ERREUR.
      System.out.println("Le mouvement est en dehors de l'échiquier ! ");
      mouvement();
      return false;
    }

    if (!tableau[departL][departC].deplacementOK(departL, departC, arriveL,
        arriveC)) {
    	// si les coordonnées rentrées ne correspondent pas a la façon
        // d'on se déplace la pièce déclarer dans deplacementok alors ERREUR.
      System.out.println("Cette pièce ne bouge pas de cette façon ! ");
      mouvement();
      return false;
    }

    return true;
  }
}

//tableau[departL][departC] = tableau[departL][departC];
//System.out.println("Aucune de pièce sélectioné");
//return false;