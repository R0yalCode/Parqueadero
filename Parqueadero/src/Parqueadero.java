class Parqueadero implements IParqueadero {
    private String nombre;
    private long telefono;
    private List<Piso> pisos;

    public Parqueadero(String nombre, long telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.pisos = new ArrayList<>();
    }

    public void agregarPiso(Piso piso) {
        pisos.add(piso);
    }

    @Override
    public void registrarVehiculo() {
        // Implementación
    }

    @Override
    public void eliminarVehiculo() {
        // Implementación
    }

    @Override
    public void registrarIngreso() {
        // Implementación
    }

    @Override
    public void registrarEgreso() {
        // Implementación
    }

    @Override
    public void asignarPlaza() {
        // Implementación
    }

    @Override
    public void liberarPlaza() {
        // Implementación
    }

    @Override
    public boolean verificarPlazaOcupada() {
        // Implementación
        return false;
    }

    // Getters y Setters
}