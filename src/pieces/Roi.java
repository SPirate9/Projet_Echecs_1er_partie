package pieces;

public class Roi extends Pieces {

  char nom = 'R';

  @Override
  public String toString() {
  
    return String.valueOf(nom);
  }

  @Override
  public boolean deplacementOK(int departL, int departC, int arriveL, int arriveC) {
    return Math.abs(arriveL - departL) <= 1 && Math.abs(arriveC - departC) <= 1;
  }

 
}
