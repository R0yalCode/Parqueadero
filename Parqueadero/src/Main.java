import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear un parqueadero
        Parqueadero parqueadero = new Parqueadero();
        parqueadero.setNombre("Royal Parking");
        parqueadero.setTelefono(981654321);

        // Crear pisos y plazas
        List<Piso> pisos = new ArrayList<>();
        Piso piso1 = new Piso();
        piso1.setNumero(1);

        List<Plaza> plazasPiso1 = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            Plaza plaza = new Plaza();
            plaza.setNumero(i);
            plaza.setDisponibilidad(true);
            plaza.setTipoPlaza(i % 2 == 0 ? "Automóvil" : "Motocicleta");
            plazasPiso1.add(plaza);
        }
        piso1.setPlazas(plazasPiso1);

        pisos.add(piso1);
        parqueadero.setPisos(pisos);

        // Crear vehículos
        Automovil automovil = new Automovil();
        automovil.setMatricula("LDC-573");
        automovil.setModelo("Toyota Corolla");
        automovil.setColor("Rojo");
        automovil.setNumeroPuertas(4);

        Bicicleta bicicleta = new Bicicleta();
        bicicleta.setMatricula("LTA-456");
        bicicleta.setModelo("Montaña");
        bicicleta.setColor("Azul");
        bicicleta.setTieneLuzReflejante(true);

        // Crear usuarios
        ClienteRegular clienteRegular = new ClienteRegular();
        clienteRegular.setTipoUsuario("Regular");
        clienteRegular.setMetodoPago("Tarjeta");

        Visitante visitante = new Visitante();
        visitante.setTipoUsuario("Visitante");
        visitante.setTiempoUso(2.5f);

        // Crear empleados
        Supervisor supervisor = new Supervisor();
        supervisor.setIdentificacion(1);
        supervisor.setSalario(1500.0f);

        Cajero cajero = new Cajero();
        cajero.setIdentificacion(8);
        cajero.setSalario(1200.0f);

        // Registrar un pago
        Pago pago = new Pago();
        pago.setMonto(10.5f);
        pago.setFecha(new Date());

        System.out.println("=== SISTEMA DE PARQUEADERO ===");
        System.out.println("Parqueadero: " + parqueadero.getNombre());
        System.out.println("Teléfono: " + parqueadero.getTelefono());
        System.out.println("\n--- Pisos y Plazas ---");
        for (Piso piso : parqueadero.getPisos()) {
            System.out.println("Piso: " + piso.getNumero());
            for (Plaza plaza : piso.getPlazas()) {
                System.out.println("Plaza #" + plaza.getNumero() + " - Tipo: " + plaza.getTipoPlaza() +
                        " - Disponible: " + plaza.isDisponibilidad());
            }
        }

        System.out.println("\n--- Vehículos ---");
        System.out.println("Automóvil: " + automovil.getModelo() + " - Matrícula: " + automovil.getMatricula());
        System.out.println("Bicicleta: " + bicicleta.getModelo() + " - Matrícula: " + bicicleta.getMatricula());

        System.out.println("\n--- Usuarios ---");
        System.out.println("Cliente Regular: " + clienteRegular.getTipoUsuario() +
                " - Método de Pago: " + clienteRegular.getMetodoPago());
        System.out.println("Visitante: " + visitante.getTipoUsuario() +
                " - Tiempo de Uso: " + visitante.getTiempoUso() + " horas");

        System.out.println("\n--- Empleados ---");
        System.out.println("Supervisor - Identificacion: " + supervisor.getIdentificacion() +
                " - Salario: $" + supervisor.getSalario());
        System.out.println("Cajero - Identificacion: " + cajero.getIdentificacion() +
                " - Salario: $" + cajero.getSalario());


        System.out.println("\n--- Pago ---");
        System.out.println("Monto: $" + pago.getMonto() + " - Fecha: " + pago.getFecha());
    }
}