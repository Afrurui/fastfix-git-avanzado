public class Main {
    public static void main(String[] args) {
        System.out.println("Sistema de Gestión de Taller FastFix v1.0");
        System.out.println("-----------------------------------------");
 
        GestorVehiculos vehiculos = new GestorVehiculos();
        vehiculos.registrarVehiculo();
 
        // ZONA DE INTEGRACION DE MODULOS
        Inventario inv = new Inventario();
        inv.comprobarStock();
 
        GestorReparaciones reparaciones = new GestorReparaciones();
        reparaciones.procesarReparacion();
 
        System.out.println("Sistema detenido.");
    }
}