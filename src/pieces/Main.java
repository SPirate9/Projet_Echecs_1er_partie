package pieces;
// POUR JOUER ENTREZ LES COORDONNEES DE CETTE FACON : E1 a D4 
import java.util.Scanner;

public class Main {
  static Scanner user_input = new Scanner(System.in);

  public static void main(String[] args) {
	// J'instancie un nouvel échiquier que j'appelle mon échiquier
    Echiquier monEchiquier = new Echiquier();

    monEchiquier.afficherTableau();
    // Je demande au plateau de m'afficher le plateau
    monEchiquier.mouvement();
    // Je fais appel a mon scanner

    while (monEchiquier.getjeuxEnCours()) {
      // je fais une boucle 
      monEchiquier.afficherTableau();
      //tant que le jeux est en cours de m'afficher le tableau
      monEchiquier.mouvement();
      // ainsi que le scann

    }

  }

}