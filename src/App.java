public class App {
    public static void main(String[] args) throws Exception {
        Prato p1 = new Prato("Pizza", 100, 60);
        Prato p2 = new Prato("Lazanha", 60, 20);
        Prato p3 = new Prato("Big Izumo de Picanha", 185, 100);

        System.out.println(p1.calcularLucro());
        System.out.println(p1.calcularMargem());
        p1.apresentarDadosPrato();
        System.out.println();

        System.out.println(p2.calcularLucro());
        System.out.println(p2.calcularMargem());
        p2.apresentarDadosPrato();
        System.out.println();

        System.out.println(p3.calcularLucro());
        System.out.println(p3.calcularMargem());
        p3.apresentarDadosPrato();


    }
}
