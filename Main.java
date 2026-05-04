public class Main {
    public static void main(String[] args) {
        System.out.println("Sistema de Gestión de Taller FastFix v1.0");
        System.out.println("-----------------------------------------");
 
        GestorVehiculos vehiculos = new GestorVehiculos();
        vehiculos.registrarVehiculo();
 
        // ZONA DE INTEGRACION DE MODULOS
        // TODO: Alumno C debe inicializar aquí el inventario
        // TODO: Alumno B debe registrar una reparación de prueba
 
        System.out.println("Sistema detenido.");
    }
}
