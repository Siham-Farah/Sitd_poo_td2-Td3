package td2;

public class EX3 {

     static class livre_ex3_td2 {
        private  String titre;
        private String auteur;
        private double prix;
        private double annee;

        public double getAnnee() {
            return annee;
        }

        public double getPrix() {
            return prix;
        }

        public String getAuteur() {
            return auteur;
        }

        public void setAnnee(double annee) {
            if (annee >=0) this.annee = annee;
        }

         public void setAuteur(String auteur) {
             this.auteur = auteur;
         }

         public void setPrix(double prix) {
            if(prix>0) this.prix = prix;
         }

         public void setTitre(String titre) {
             this.titre = titre;
         }

         public String getTitre() {
            return titre;
        }

        public livre_ex3_td2(){

        };
        public livre_ex3_td2(String t){
            this.titre=t;
        };
        public livre_ex3_td2(String t ,String a){
            this.titre=t; this.auteur=a;
        };
        public livre_ex3_td2(String t ,String a,double p){
            this.titre=t; this.auteur=a; setPrix(p);
        };

        public livre_ex3_td2(String t ,String a,double p, double an){
            this.titre=t; this.auteur=a; setPrix(p); setAnnee(an);
        };
        public livre_ex3_td2(livre_ex3_td2 l){
            this.titre=l.getTitre(); this.auteur=l.getAuteur();
            setPrix(prix); setAnnee(annee);
        };

        public  String toString(){return "le titre de livre est  "
                +getTitre()+" son auteur est " +
                getAuteur()+ " son prix  "+getPrix()+" son annee  est  "+getAnnee();}


    }

        public static void main(String[]args) {
            livre_ex3_td2 l1= new livre_ex3_td2();
            livre_ex3_td2 l2= new livre_ex3_td2("anta li");
            livre_ex3_td2 l3= new livre_ex3_td2("anta li", "ahmed");
            livre_ex3_td2 l4= new livre_ex3_td2("anta li", "ahmed",77,2003);
            System.out.println(l4);

        }
     }



