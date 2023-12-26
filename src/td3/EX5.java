package td3;

import javax.management.monitor.StringMonitorMBean;

public class EX5 {
     private int nbPassager;
     public int getNbPassager(){return nbPassager;}
    public void setNbPassager(int nbPassager){ this.nbPassager=nbPassager;}
    public EX5(int nbPassager){setNbPassager(nbPassager);}
    public String toString(){return "le nombre de passager est "+getNbPassager();}
}
    class Moto extends EX5{
        private int nbRoues=2;
        public int getNbRoues() {return nbRoues ;}
        public void setNbRoues(int nbRoues) {this.nbRoues = nbRoues;}
        // le programme ne peut pas compiler car dans la class mere on a utiliser un constucteur et pour que
        // le programme compile il faut utiliser un constructeur de cette class avec super pour
        // les attribute de la class mere est apres le programme va compiler
        public Moto(int nbPassager,int nbRoues ){
        super(nbPassager);
        setNbRoues(nbRoues);
    }
    }
         class Avion extends EX5{
             private int nbMoteur;

             public int getNbMoteur() {return nbMoteur;}

             public void setNbMoteur(int nbMoteur) {this.nbMoteur = nbMoteur;}
             public  Avion(int nbPassager){
                 super(nbPassager);
             }
             public  Avion(int nbPassager, int nbMoteur){
             super(nbPassager);
             setNbMoteur(nbMoteur);
         }
         }
     class Triporteur extends Moto{
         public Triporteur(int nbPassager, int nbRoues) {
             super(nbPassager, nbRoues);

         }
         public static void main(String[]arg){

         }
     }
