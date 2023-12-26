package td2;public class EX1 {
     static class Point_per_ex1td2 {
        char nom;
        double abscisse;
        public Point_per_ex1td2(char n, double a){ nom=n; abscisse=a;}
        public void afficher(){
            System.out.println(nom +"  "+ abscisse) ;}
        public void translate(int n){
            abscisse=abscisse+n;
        }
         public  static void main(String[]args){

             Point_per_ex1td2 p1= new Point_per_ex1td2('c',3);
             p1.afficher();
             p1.translate(5);
             p1.afficher();
         }

     }


}
