package td2;

public class EX4 {

    public static class temp_ex4_td2 {

        private double heures , minutes ,secondes;

        public double getHeures() {
            return heures;
        }

        public double getMinutes() {
            return minutes;
        }

        public double getSecondes() {
            return secondes;
        }

        public void setHeures(double heures) {
            this.heures = heures;
        }

        public void setMinutes(double minutes) {
            this.minutes = minutes;
        }

        public void setSecondes(double secondes) {
            this.secondes = secondes;
        }

        public temp_ex4_td2(double h){
            heures=h;
        }
        public temp_ex4_td2(double h ,double m){
            heures=h;  minutes=m;
        }
        public temp_ex4_td2(double h ,double m ,double s){
            heures=h;  minutes=m; secondes=s;
        }
        public void ajouterH(int h){
            setHeures(getHeures() + h);
        }

        public void ajouterM(int m){
            m += getMinutes();
            ajouterH(m/60);
            setMinutes(m % 60);
        }
        public void ajouterS(int s){
            s += getSecondes();
            ajouterM(s/60);
            setSecondes(s % 60);
        }
        public String toString(){return " le temps est "+getHeures()+"heures "+getMinutes()+
                " minutes"+getSecondes()+" secondes";}




    }

    public static void main(String[] args){
        temp_ex4_td2 t1=new temp_ex4_td2(6,61,0);
        System.out.println(t1);
        t1.ajouterH(1);
        System.out.println(t1);
        t1.ajouterS(77);
        System.out.println(t1);


    }

}
