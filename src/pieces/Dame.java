package pieces;

public class Dame extends Pieces {

  char nom = 'D';

  @Override
  public String toString() {
    return String.valueOf(nom);
  }

  @Override
  public boolean deplacementOK(int departL, int departC, int arriveL, int arriveC) {
	// Méthode avec override non utilisé a complété
   // update faire les mouvements en diagonale
    return true;
  }

}