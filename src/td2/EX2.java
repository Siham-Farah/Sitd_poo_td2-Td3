package td2;

import static java.lang.Math.sqrt;

public class EX2 {

}
 class point_ex2_td2 {
    private double abscisse ;
    private double ordonnee;

    public double getAbscisse() {
        return abscisse;
    }
    public double getOrdonnee() {
        return ordonnee;
    }
    double norm;


    public void setAbscisse(double abscisse) {
        this.abscisse = abscisse;
    }

    public void setOrdonnee(double ordonnee) {
        this.ordonnee = ordonnee;
    }
     public double norme(){
         norm=sqrt(abscisse*abscisse+ordonnee*ordonnee);
         return norm;
     }
    public void affich(){
        System.out.println("("+getAbscisse() + " , "+ getOrdonnee() +") "+" norm="+norme());
    }
     public static void main(String[] args) {

         point_ex2_td2 p1= new point_ex2_td2();
         p1.getAbscisse();
         p1.getOrdonnee();
         p1.affich();
         p1.setAbscisse(8) ;
         p1.setOrdonnee(9);
         p1.affich();

     }
}