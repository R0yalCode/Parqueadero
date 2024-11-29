class Boleto {
    private int codigo;
    private boolean suscripcionActiva;

    public Boleto(int codigo, boolean suscripcionActiva) {
        this.codigo = codigo;
        this.suscripcionActiva = suscripcionActiva;
    }

    public void consultarSuscripcion() {
        System.out.println("Suscripción activa: " + suscripcionActiva);
    }

    // Getters y Setters
}
