public class Animal {
    int age;
    String nom;
    
    public Animal(String nom, int age) {
        this.age = age;
        this.nom = nom;
    }
    
    public static void main(String[] args) {
        System.out.println("Bonjour");
    }
    
    public static int sommeTableau(int[] tableau) {
        int s = 0;
        for (int i = 0; i < tableau.length; i++) {
            s += tableau[i];
        }
        return s;
    }
    
    public static void doubleAffiche(String s) {
        System.out.println(s);
        System.out.println(s);
    }
    
    public void afficheNom() {
        System.out.println(this.nom);
    }
    
    public void changeNom(String nouveauNom) {
        this.nom = nouveauNom;
    }
}
