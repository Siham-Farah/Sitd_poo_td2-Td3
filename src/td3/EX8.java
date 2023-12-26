package td3;

public interface EX8 {
    String getNom();
    String getPrenom();
    void setNom(String nom);
    void setPrenom(String prenom);
    double gains();
}
class Ptrn implements EX8 {
    private String nom;
    private String prenom;
    private double salaire;

    //  getters, setters)

    @Override
    public String getNom() {
        return nom;
    }

    @Override
    public String getPrenom() {
        return prenom;
    }

    @Override
    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public double gains() {
        return salaire;
    }

    @Override
    public String toString() {
        return "Le patron " + getNom() + " " + getPrenom() + " a un salaire de " + gains();
    }
}
class Travailleurcm implements EX8 {
    private String nom;
    private String prenom;
    private double salaire;
    private double commission;
    private int quantite;

    // ... (constructeurs, getters, setters)

    public double getSalaire() {return salaire;}

    public double getCommission() {return commission;}

    public int getQuantite() {return quantite;}

    public void setCommission(double commission) {this.commission = commission;}

    public void setQuantite(int quantite) {this.quantite = quantite;}

    public void setSalaire(double salaire) {this.salaire = salaire;}
    public Travailleurcm(){}
    public Travailleurcm(String nom, String prenom ,double commision,int quantite){
        setNom(nom); setPrenom(prenom );
        setCommission(commision);setQuantite(quantite);
    }
    @Override
    public String getNom() { return nom; }

    @Override
    public String getPrenom() { return prenom; }

    @Override
    public void setNom(String nom) { this.nom = nom; }

    @Override
    public void setPrenom(String prenom) { this.prenom = prenom; }

    @Override
    public double gains() { return salaire + quantite * commission; }

    @Override
    public String toString() {
        return "Le Travailleur Commission " + getNom() + " " + getPrenom() +
                " a vendu " + quantite + " article(s) et le salaire de la commission est " +
                commission + ", donc son salaire est " + gains();
    }
}

class TravailleurHr implements EX8 {
    private String nom;
    private String prenom;
    private double retribution;
    private int heures;

    public int getHeures() {return heures;}
    public double getRetribution() {return retribution;}
    public void setHeures(int heures) {this.heures = heures;}
    public void setRetribution(double retribution) {this.retribution = retribution;}

    public TravailleurHr(){}
    public TravailleurHr(String nom, String prenom, double retribution ,int heures){
        setNom(nom);
        setPrenom(prenom);
        setRetribution(retribution);  setHeures(heures);
    }

    @Override
    public String getNom() { return nom; }

    @Override
    public String getPrenom() { return prenom; }

    @Override
    public void setNom(String nom) { this.nom = nom; }

    @Override
    public void setPrenom(String prenom) { this.prenom = prenom; }

    @Override
    public double gains() { return retribution * heures; }

    @Override
    public String toString() {
        return "Le Travailleur horaire " + getNom() + " " + getPrenom() +
                " a travaillé " + heures + " heures et le salaire de chaque heure est " +
                retribution + ", donc son salaire est " + gains();
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