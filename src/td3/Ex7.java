package td3;

public class Ex7 {
}
 abstract class  Employe{
    private  String nom;
    private  String prenom;
    public String getNom(){ return nom;}
    public String getPrenom(){return prenom;}
    public void setNom( String nom){ this.nom=nom;}
    public void setPrenom( String prenom){ this.prenom=prenom;}
     public  Employe(){}
     public  Employe(String nom,String prenom){
        setNom(nom); setPrenom(prenom);
     }
     public String toString(){ return " l employer "+getNom()+" "+getPrenom();}
     abstract double gains();
  }
  class Patron extends Employe{
    private double salaire;
      public double getSalaire() {return salaire;}

      public void setSalaire(double salaire) {this.salaire = salaire;}

      public Patron(){}
    public Patron( String nom,String prenom ,double salaire){
        super(nom,prenom); setSalaire(salaire);
    }
    public double gains(){ return salaire ;}
    public String toString(){ return" le patron "+getNom()+" "+getPrenom()+" a un salaire de "+gains();}

  }
  class  TravailleurCommission extends Employe{
    private double salaire;
    private double  commision;
    private int quantite;
    public double getSalaire(){return salaire;}
    public double getCommision() {return commision;}
    public int getQuantite() {return quantite; }

      public void setCommision(double commision) {this.commision = commision;}
      public void setQuantite(int quantite) {this.quantite = quantite;}
      public void setSalaire(double salaire) {this.salaire = salaire;}
      public TravailleurCommission(){}
      public TravailleurCommission(String nom, String prenom ,double commision,int quantite){
        super(nom, prenom); setCommision(commision);setQuantite(quantite);
    }

      @Override
      double gains() {
          return getSalaire()+getQuantite()*getCommision();
      }
      public String toString(){ return" le Travailleur Commission  "+getNom()+" "+getPrenom()+
             " a vendu " +getQuantite()+ " article "+" et le salaire de la commision est "+getCommision() +" donc son salaire est "+gains();
     }
  }
  class TravailleurHoraire extends Employe{
  private double retribution;
  private int heures;

      public int getHeures() {return heures;}
      public double getRetribution() {return retribution;}
      public void setHeures(int heures) {this.heures = heures;}
      public void setRetribution(double retribution) {this.retribution = retribution;}

      public TravailleurHoraire(){}
    public TravailleurHoraire(String nom, String prenom, double retribution ,int heures){
    super(nom, prenom); setRetribution(retribution);  setHeures(heures);
     }
      @Override
      double gains() {
          return getRetribution()*getHeures();
      }
      public String toString(){ return" le Travailleur horaire  "+getNom()+" "+getPrenom()+
              " a travaille " +getHeures()+" heures "+"  et le salaire de chaque heure  est "+getRetribution() +
              " donc son salaire est "+gains();
      }
      public static void main(String[]arg){
          Patron p=new Patron("siham","farah",10000);
          System.out.println(p);
          TravailleurCommission t1=new TravailleurCommission("ahmed","moghtani",33,3);
          System.out.println(t1);
          TravailleurHoraire t2=new TravailleurHoraire("salma","hamro",50,9);
          System.out.println(t2);
      }
  }
