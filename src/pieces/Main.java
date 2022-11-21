package pieces;
// POUR JOUER ENTREZ LES COORDONNEES DE CETTE FACON : E1 a D4 
import java.util.Scanner;

public class Main {
  static Scanner user_input = new Scanner(System.in);

  public static void main(String[] args) {

    Echiquier monEchiquier = new Echiquier();

    monEchiquier.afficherTableau();

    monEchiquier.mouvement();
   

    while (monEchiquier.getjeuxEnCours()) {
  
      monEchiquier.afficherTableau();
  
      monEchiquier.mouvement();
    

    }

  }

}
