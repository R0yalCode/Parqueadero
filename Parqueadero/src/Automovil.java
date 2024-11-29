class Automovil extends Vehiculo {
    private int numeroPuertas;

    public Automovil(String matricula, String modelo, String color, int numeroPuertas) {
        super(matricula, modelo, color, TipoVehiculo.AUTOMOVIL);
        this.numeroPuertas = numeroPuertas;
    }

    // Getters y Setters
}
