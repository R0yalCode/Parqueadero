class ClienteRegular extends Cliente {
    private float descuento;

    public ClienteRegular(String cedula, short fechaNacimiento, String tipoCliente, float descuento) {
        super(cedula, fechaNacimiento, tipoCliente);
        this.descuento = descuento;
    }

    public void consultarDescuento() {
        System.out.println("Descuento disponible: " + descuento);
    }

    // Getters y Setters
}