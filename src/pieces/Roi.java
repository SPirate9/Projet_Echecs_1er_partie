package pieces;

public class Roi extends Pieces {

  char nom = 'R';

  @Override
  public String toString() {
    // La fonction renvoie une représentation sous forme de String de la valeur R
    return String.valueOf(nom);
  }

  @Override
  public boolean deplacementOK(int departL, int departC, int arriveL, int arriveC) {
    return Math.abs(arriveL - departL) <= 1 && Math.abs(arriveC - departC) <= 1;
  }

  // methode avec override non utilisé a completer
  // uptadate methode fait !
  // Roi OK
}