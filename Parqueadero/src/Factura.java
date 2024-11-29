class Factura {
    private Date fechaEmision;
    private float montoTotal;
    private String descripcion;
    private Cliente cliente;
    private List<Pago> pagos;

    public Factura(Date fechaEmision, String descripcion, Cliente cliente) {
        this.fechaEmision = fechaEmision;
        this.descripcion = descripcion;
        this.cliente = cliente;
        this.pagos = new ArrayList<>();
    }

    public void emitirFactura() {
        System.out.println("Factura emitida: " + descripcion);
    }

    public void calcularTotal() {
        montoTotal = 0;
        for (Pago pago : pagos) {
            montoTotal += pago.getMonto();
        }
    }

    // Getters y Setters
}
