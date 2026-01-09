class EXO1 {
  public static void main(String[] args) {
    IO.println("Hello World");
    String nom = IO.readln("Quel est ton nom jeune chevalier >_< : ");
    IO.println("Que zeus t'accorde son pardon " + nom + " , caca uWu");
    String age = IO.readln("Quel est ta vieillesse preux templier : ");
    int realage = Integer.valueOf(age);
    IO.println("Tu as donc " + realage + " années dans cette contrée jeune padawan.");
  }
}
