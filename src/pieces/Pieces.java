package pieces;

public abstract class Pieces {

  @Override
  public String toString() {
    return "Pieces []";

  }

  public abstract boolean deplacementOK(int departL, int departC, int arriveL,
    int arriveC);


}
