package td2;

public class EX5 {
    public static class Rectangle {
        private int longueur;
        private int largeur;

        public int getLongueur() {
            return longueur;
        }

        public int getLargeur() {
            return largeur;
        }

        public void setLargeur(int largeur) {
            if(largeur >=0) {this.largeur = largeur;}
        }
        public void setLongueur(int longueur){
            if(longueur >=0) {this.longueur = longueur;}
        }
        public Rectangle(){

        }

        public Rectangle( int largeur, int longueur){
            setLargeur(largeur);
            setLargeur(longueur);
        }
        public Rectangle( Rectangle r){
            this.largeur=r.getLargeur();
            this.longueur=r.getLongueur();
        }
        public int perimetre(){
            return 2 * (longueur + largeur);}
        public int air(){
            return (longueur*largeur);}

        public boolean isCarre() {
            return this.largeur == this.longueur;
        }

        public String toString(){
            return " largeur de rectangle est "+this.largeur+"" +
                    " et son longueur est "+this.longueur+
                    " son perimetre est "+perimetre() +
                    " son air est "+air()+", et est un carre : " +isCarre();
        }
        public  static void main(String[] args){
            Rectangle r1= new Rectangle(6,-5);
            System.out.println(r1);
        }

    }

}
