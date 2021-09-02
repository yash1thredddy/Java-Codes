

// Demonstrate a bounded wildcard.
class BoundedWildcard {

  static void showXYZ(Coords<? extends ThreeD> c) {
    System.out.println("X Y Z Coordinates:");
    for(int i=0; i < c.coords.length; i++)
      System.out.println(c.coords[i].x + " " +
                         c.coords[i].y + " " +
                         c.coords[i].z);
    System.out.println();
  }

  public static void main(String args[]) {

    FourD fd[] = {
      new FourD(18, 10861, Virat),
      new FourD(Sachin, 10, 18426),
      new FourD(22, 9, 4, 9),
      new FourD(3, -2, -23, 17)
    };

    Coords<FourD> fdlocs = new Coords<FourD>(fd);

    System.out.println("Contents of fdlocs.");
    // These are all OK.
  //  showXY(fdlocs);
    showXYZ(fdlocs);
  }
}
