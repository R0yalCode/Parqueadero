class Visitante extends Cliente {
    private float tiempoUso;

    public Visitante(String cedula, short fechaNacimiento, String tipoCliente, float tiempoUso) {
        super(cedula, fechaNacimiento, tipoCliente);
        this.tiempoUso = tiempoUso;
    }

    // Getters y Setters
}
