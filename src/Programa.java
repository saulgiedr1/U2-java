public class Programa {
    public static void main(String[] args) {

        double pirmaKrastine = 23.5;
        double antraKrastine = 15;
        double treciaKrastine = 34;

        double perimetras = perimetroIlgis(pirmaKrastine, antraKrastine, treciaKrastine);
        double plotas = trikampioPlotas(perimetras, pirmaKrastine, antraKrastine, treciaKrastine );

        System.out.println("Trikampio perimetras = " + perimetras);
        System.out.println("Trikampio plotas = " + plotas);

    }

    public static double perimetroIlgis(double a, double b, double c){

        return a+b+c;
    }
    public static double trikampioPlotas(double d, double a, double b, double c){
        return Math.sqrt(d*(d-a)*(d-b)*(d-c));
    }

}
