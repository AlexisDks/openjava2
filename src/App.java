public class App {
    public static void main(String[] args) throws Exception {
        App app = new App();

        var resultado = app.precio(100);
        System.out.println("Precio a pagar es : " + resultado);
    }

    public double precio(double precio) {
        return precio - (precio * .18);
    }
}
