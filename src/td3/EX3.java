package td3;

public class EX3 {
    private int x, y;
    //getters
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    //setters
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
        public EX3(int x, int y) {
            this.x = x;
            this.y = y;
        }
        public void affCoord() {
            System.out.println("Coordonnees : " + getX() + " " + getY());
        }
        public void affiche() {
            System.out.println("Coordonnees : " + getX() + " " + getY());
        }

    }
class Centre extends EX3 {
    private char nom;
    public Centre(int x,int y,char nom){
        super(x,y);
        this.nom=nom;
    }

    public char getNom() {
        return nom;
    }
    public void  affNom(){
        System.out.println("le centre est "+nom);
    }
    public void  affiche(){
        System.out.println("le centre "+nom+"("+getX()+","+getY()+")");
    }
}
 class Cercle extends Centre{
    public Cercle(int x, int y, char nom) {
        super(x, y, nom);
    }

     @Override
     public void affiche() {
         System.out.println("cercle de  centre "+getNom()+"("+getX()+","+getY()+")");
     }
     public  static  void main(String[]arg){
       Cercle c=new Cercle(3,3,'O') ;
       Centre o=new Centre(2,2,'A');
       o.affiche();
       c.affiche();

     }
 }

