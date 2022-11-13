public class Main {
    public static void main(String[] args) {
        double precio = 2234234;

        System.out.println("El precio con IVA es de: " + precioIva(precio));

    }
    public static double precioIva(double precio) {
        return precio * 1.19;
    }
}