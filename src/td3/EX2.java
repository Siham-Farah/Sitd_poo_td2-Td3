package td3;
public class EX2{ private int x, y;
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
        public void Point(int x, int y) {
        this.x = x;
        this.y = y;
        }
    public void deplace(int dx, int dy) {x += dx; y += dy;}

    public void affiche(){
        System.out.println("votre point est ("+getX()+","+getY()+")");
    }
    public void affCoord() {
        System.out.println("Coordonnees : " + x + " " + y);
    }
}

 class PointNom extends EX2 {
   private char nom;
    public char getNom() { return nom;}

   public void setPointNom(int x,int y,char nom ){
      setX(x); ;
       setY(y);
       this.nom=nom;
   }
    public void setNom(char nom){
        this.nom=nom;
    }
   public void affCoordNom(){
       System.out.println(" point "+nom+"("+getX()+","+getY()+")");
   }
    public static  void main(String[]arg){
        PointNom p= new PointNom();
        p.setPointNom(2,2,'A');
        p.affCoordNom();
    }
}
