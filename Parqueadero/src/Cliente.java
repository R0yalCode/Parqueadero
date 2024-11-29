class Cliente extends Persona {
    private String tipoCliente;

    public Cliente(String cedula, short fechaNacimiento, String tipoCliente) {
        super(cedula, fechaNacimiento);
        this.tipoCliente = tipoCliente;
    }

    // Getters y Setters
}
