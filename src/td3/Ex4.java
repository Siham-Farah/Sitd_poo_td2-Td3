package td3;

public class Ex4 {
    private   String adress;
    public Ex4(){}
    public Ex4(String adress){
        setAdress(adress);
    }
    public String getAdress() {
        return adress;
    }
    public void setAdress(String adress) {
        this.adress = adress;
    }
    @Override
    public String toString() {
        return "l adresse de votre btiment est "+getAdress();
    }
    //main
    public static void main(String[]args){
        Ex4 b=new Ex4();
        b.setAdress("casa");
        Immeuble i=new Immeuble("casa",8);
        Maison m=new Maison("casa",3);
        System.out.println(b);
        System.out.println(i);
        System.out.println(m);
    }
}

class Maison extends Ex4 {
    private int nbchambre;
    public Maison(){}
    public Maison(String adress,int nbchambre){
        super(adress);
        setNbchambre(nbchambre);
    }

    public int getNbchambre() {
        return nbchambre;
    }
    public void setNbchambre(int nbchambre) {
        this.nbchambre = nbchambre;
    }

    @Override
    public String toString() {
        return "votre maison trouve dans "+getAdress()+" a "+getNbchambre()+" chambres";
    }
}

 class Immeuble extends Ex4 {
    private int nbappart;
    public Immeuble(){}
    public Immeuble(String adress,int nbappart){
        super(adress);
        setNbappart(nbappart);
    }
    public int getNbappart() {
        return nbappart;
    }
    public void setNbappart(int nbappart) {
        this.nbappart = nbappart;
    }

    @Override
    public String toString() {
        return "l immeuble trouve dans "+getAdress()+" a "+getNbappart()+" aparttements";
    }

}
