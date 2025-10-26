public class Main {
    public static void main(String[] args) {
        System.out.println("=== Agencia Destinos Mágicos ===");
        System.out.println("Lista de Paquetes Turísticos\n");

        TravelPackage p1 = new TravelPackage("Aventura en Cartagena", "Cartagena", 5, 2500000);
        TravelPackage p2 = new TravelPackage("Descubre San Andrés", "San Andrés Islas", 4, 1800000);
        TravelPackage p3 = new TravelPackage("Vacaciones en Cancún", "Cancún - México", 7, 4500000);
        TravelPackage p4 = new TravelPackage("Tour por Medellín", "Medellín", 3, 1500000);
        TravelPackage p5 = new TravelPackage("Experiencia en Eje Cafetero", "Armenia - Quindío", 6, 2200000);

        p1.mostrarInfo();
        p2.mostrarInfo();
        p3.mostrarInfo();
        p4.mostrarInfo();
        p5.mostrarInfo();
    }
}
