public class Main {
    public static void main(String[] args) {
        System.out.println("=== Agencia Destinos Mágicos ===");
        System.out.println("Lista de Paquetes Turísticos\n");

        TravelPackage nacional = new TravelPackage("Aventura en Cartagena", "Cartagena", 5, 2500000);
        TravelPackage isla = new TravelPackage("Descubre San Andrés", "San Andrés Islas", 4, 1800000);
        TravelPackage internacional = new TravelPackage("Vacaciones en Cancún", "Cancún - México", 7, 4500000);

        nacional.mostrarDetalles();
        isla.mostrarDetalles();
        internacional.mostrarDetalles();
    }
}
