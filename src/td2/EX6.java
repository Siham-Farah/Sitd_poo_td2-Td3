package td2;

public class EX6 {
    public static class Banque {
        public static void main(String[]args){
            Banque b1=new Banque( 1,5000, "WB215425") ;
            System.out.println(  b1.avoirInf());
            b1.avoirSolde();
            b1.disposer(500);
            System.out.println(  b1.avoirInf());
            b1.retirer(200);
            System.out.println(  b1.avoirInf());
            b1.avoirSolde();

        }
        private int ncompte;
        private  float solde;
        private String cin;

        public float getSolde() {
            return solde;
        }

        public int getNcompte() {
            return ncompte;
        }
        public String getCin() {
            return cin;
        }

        public void setCin(String cin) {
            this.cin = cin;
        }

        public void setNcompte(int ncompte) {
            this.ncompte = ncompte;
        }

        public void setSolde(float solde) {
            this.solde = solde;
        }

        public Banque(int ncompte, float solde, String cin){
            this.ncompte=ncompte;
            this.solde=solde;
            this.cin=cin;
        }
        public void disposer(float somme){
            somme+=this.getSolde();
            this.setSolde(somme);
        }
        public  void retirer(float somme){
            if (solde>somme) this.setSolde(this.getSolde()-somme);
        }
        public float avoirSolde(){
            return this.getSolde();
        }
        public String avoirInf(){
            return" Ncompte est : "+this.ncompte+ ", cin : "+this.cin+" votre solde est :  "+this.solde ;
        }

    }
    public static void main(String[]args){
        Banque b1=new Banque( 1,5000, "WB215425") ;
        System.out.println(b1);
        b1.avoirSolde();
        b1.disposer(500);
        System.out.println(b1);
        b1.retirer(200);
        System.out.println(b1);
        b1.avoirSolde();
        System.out.println(b1);
    }
}
