class Cajero extends Empleado {
    public Cajero(String cedula, short fechaNacimiento, int identificacion, float salario) {
        super(cedula, fechaNacimiento, identificacion, salario);
    }

    public void realizarPago() {
        System.out.println("Realizando pago...");
    }
}
