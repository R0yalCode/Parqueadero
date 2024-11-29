class Supervisor extends Empleado {
    private boolean autorizaciones;

    public Supervisor(String cedula, short fechaNacimiento, int identificacion, float salario, boolean autorizaciones) {
        super(cedula, fechaNacimiento, identificacion, salario);
        this.autorizaciones = autorizaciones;
    }

    public void asignarPlaza() {
        System.out.println("Asignando plaza...");
    }

    // Getters y Setters
}
