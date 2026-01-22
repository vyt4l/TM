public class Animal {
 int age ;
 String nom ;

 public Animal ( String nom , int age ) {
 // Constructeur
 this . age = age ;
 this . nom = nom ;
 }

 public static void main ( String [] args ) {
 System . out . println ( " Bonjour " );
 }

 public static int sommeTableau ( int [] tab ) {
 // Calcule la somme des elements d ’ un tableau
 int s = 0;
 for ( int i = 0; i < tab . length - 1; i ++) {
 s += tab [ i ];
 }
 return s ;
 }

 public static void doubleAffiche ( String s ) {
 // Affiche s en double
 System . out . println ( s + s );
 }

 public void afficheNom () {
 // Affiche le champ nom
 System . out . println ( " Mon nom est " + this . nom );
 }

 public void changeNom ( String s ) {
 // Change le champ nom par s
 this . nom = s ;
 }
}
