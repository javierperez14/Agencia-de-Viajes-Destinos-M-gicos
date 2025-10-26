public class TravelPackage {
 
    private String nombrePaquete;
    private String destino;
    private int dias;
    private double valor;

    public TravelPackage(String nombrePaquete, String destino, int dias, double valor) {
        this.nombrePaquete = nombrePaquete;
        this.destino = destino;
        this.dias = dias;
        this.valor = valor;
    }

    public void mostrarDetalles() {
        System.out.println("Paquete: " + nombrePaquete);
        System.out.println("Destino: " + destino);
        System.out.println("Duración: " + dias + " días");
        System.out.println("Valor total: $" + valor);
        System.out.println("--------------------------------");
    }
}
