import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Crear parqueadero y pisos
        Parqueadero parqueadero = new Parqueadero("Parqueadero Central", 123456789L);
        Piso piso1 = new Piso(1);
        Piso piso2 = new Piso(2);
        parqueadero.agregarPiso(piso1);
        parqueadero.agregarPiso(piso2);

        // Crear plazas
        Plaza plaza1 = new Plaza(101, true, TipoVehiculo.AUTOMOVIL);
        Plaza plaza2 = new Plaza(102, false, TipoVehiculo.MOTOCICLETA);
        piso1.agregarPlaza(plaza1);
        piso1.agregarPlaza(plaza2);

        // Crear vehículos
        Automovil auto1 = new Automovil("ABC123", "Toyota Corolla", "Rojo", 4);
        Motocicleta moto1 = new Motocicleta("XYZ789", "Honda", "Negro");

        // Registrar vehículos en el parqueadero
        parqueadero.registrarVehiculo();
        System.out.println("Vehículo registrado: " + auto1.getModelo());
        System.out.println("Vehículo registrado: " + moto1.getModelo());

        // Crear cliente y asignar plaza
        Cliente clienteRegular = new ClienteRegular("1234567890", (short) 1995, "Regular", 10.0f);
        ((ClienteRegular) clienteRegular).consultarDescuento();
        parqueadero.asignarPlaza();
        System.out.println("Plaza asignada al cliente: " + clienteRegular.getTipoCliente());

        // Crear empleado y gestionar entrada
        Empleado supervisor = new Supervisor("9876543210", (short) 1985, 101, 1500.0f, true);
        supervisor.gestionarEntrada();

        // Crear pago y factura
        Pago pago = new Pago(15.50f, new Date(), MetodoPago.TARJETA);
        Factura factura = new Factura(new Date(), "Uso de plaza 101", clienteRegular);
        factura.calcularTotal();
        factura.emitirFactura();

        // Imprimir detalles
        System.out.println("Monto total factura: " + factura.getMontoTotal());
        System.out.println("Método de pago: " + pago.getMetodoPago());
    }
}