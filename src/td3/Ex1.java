package td3;

public class Ex1 {
    private int x, y;
    public void Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void deplace(int dx, int dy) {
        x += dx;
        y += dy;
    }
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
    public void affiche(){
        System.out.println("votre point est ("+getX()+","+getY()+")");
    }

    public void affCoord() {
        System.out.println("Coordonnees : " + x + " " + y);
    }

}
 class Ex1A extends Ex1 {
    public void affiche(){
        System.out.println("point A("+getX()+","+getY()+")");
    }

    public static void main(String[]args){
        Ex1A p1=new Ex1A();
        Ex1 p2=new Ex1A();

        p1.Point(5,4) ;
        p2.Point(9,4) ;
        p1.affiche();
        p2.affiche();
        p1.deplace(1,1);
        p2.deplace(2,1);
        p1.affiche();
        p2.affiche();
        //si la methode point(mere) ne contient pas de getters lappel des variable x et y
        // ne fonctionne pas mais c est on peut eviter l utilisation de getters on peut utilisee
        //protected a la place de private pour que les variables etre connu par les autre class dans le meme package


    }

}
