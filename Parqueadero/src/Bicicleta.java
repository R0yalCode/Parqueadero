class Bicicleta extends Vehiculo {
    private boolean tieneLuzReflectante;

    public Bicicleta(String matricula, String modelo, String color, boolean tieneLuzReflectante) {
        super(matricula, modelo, color, TipoVehiculo.BICICLETA);
        this.tieneLuzReflectante = tieneLuzReflectante;
    }

    // Getters y Setters
}
