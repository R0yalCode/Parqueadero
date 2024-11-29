class Suscripcion {
    private boolean estado;
    private Date fechaInicio;
    private Date fechaFin;
    private float precio;

    public Suscripcion(boolean estado, Date fechaInicio, Date fechaFin, float precio) {
        this.estado = estado;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.precio = precio;
    }

    public void activarSuscripcion() {
        this.estado = true;
        System.out.println("Suscripción activada.");
    }

    public void cancelarSuscripcion() {
        this.estado = false;
        System.out.println("Suscripción cancelada.");
    }

    // Getters y Setters
}
