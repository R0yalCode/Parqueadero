class Piso {
    private int numero;
    private List<Plaza> plazas;

    public Piso(int numero) {
        this.numero = numero;
        this.plazas = new ArrayList<>();
    }

    public void agregarPlaza(Plaza plaza) {
        plazas.add(plaza);
    }

    // Getters y Setters
}