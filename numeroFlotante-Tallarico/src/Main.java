public class Main {
    public static void main(String[] args) {
        float numeroFlotante = 1.25F;

        int numeroEntero = (int) numeroFlotante;
        float parteDecimal = numeroFlotante - numeroEntero;

        System.out.println("La parte entera es: " + numeroEntero);
        System.out.println("La parte decimal es: " + parteDecimal);
    }
}