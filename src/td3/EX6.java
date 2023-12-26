package td3;

import java.awt.*;

public  class   EX6 {}
     abstract class Figure{
     String nomFigure;
           public abstract double getPerimeter();
           public abstract double getAire();

       public String toString() {
           return "le nom de la figure est "+nomFigure;
       }
   }
   class Disque extends Figure{
       private Point centre;
       private double rayon;

       public double getRayon() {return rayon;}
       public Point getCentre() {return centre;}
       public void setCentre(Point centre) {this.centre = centre;}
       public void setRayon(int rayon) {this.rayon = rayon;}
       public Disque(){}
       public Disque( Point centre,int rayon,String nom){
           this.centre=centre;
           this.rayon=rayon;
           this.nomFigure=nom;
       }

       @Override
       public double getPerimeter() {
           return getRayon()*2;
       }
       @Override
       public double getAire() {
           return 3.14*getRayon()*getRayon();
       }

       public String toString(){ return " le disque a un  rayon de "+getRayon()+" son centre est "+getCentre()+
               " son aire "+getAire()+" et perimetre "+getPerimeter();}

   }
class Rectangle extends Figure{
    private double longeur;
    private double largeur;
    public void x(){}

    public double getLargeur() {return largeur;}
    public double getLongeur() {return longeur;}
    public void setLargeur(double largeur) {this.largeur = largeur;}
    public void setLongeur(double longeur) {this.longeur = longeur;}
    public Rectangle(){}
    public Rectangle(double longeur,double largeur){
        setLargeur(largeur); setLongeur(longeur);
    }
    public Rectangle(double longeur,double largeur,String nomFigure){
        setLargeur(largeur); setLongeur(longeur);this.nomFigure=nomFigure;
    }
    @Override
    public double getPerimeter() {
        return 2*(getLongeur() + getLargeur());
    }
    @Override
    public double getAire() {
        return getLargeur()*getLongeur();
    }

    public String toString(){ return " le rectangle a une largeur de "+getLargeur()+" et longeur de "+getLongeur()+
            " son aire "+getAire()+" et perimetre "+getPerimeter();}

    public static  void main(String[]args){
       Figure rectangle=new Rectangle(4,5,"rectangle");
       System.out.println(rectangle);
       Point o =new Point(2,2);
       Figure disque=new Disque(o,6,"rectangle");
       System.out.println(disque);

    }


}
