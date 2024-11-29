class Empleado extends Persona implements InteraccionCliente {
    protected int identificacion;
    protected float salario;

    public Empleado(String cedula, short fechaNacimiento, int identificacion, float salario) {
        super(cedula, fechaNacimiento);
        this.identificacion = identificacion;
        this.salario = salario;
    }

    @Override
    public void gestionarEntrada() {
        System.out.println("Gestionando entrada...");
    }

    @Override
    public void gestionarSalida() {
        System.out.println("Gestionando salida...");
    }

    @Override
    public void consultarDisponibilidad() {
        System.out.println("Consultando disponibilidad de plazas...");
    }

    // Getters y Setters
}
