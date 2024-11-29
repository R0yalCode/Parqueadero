interface IParqueadero {
    void registrarVehiculo();
    void eliminarVehiculo();
    void registrarIngreso();
    void registrarEgreso();
    void asignarPlaza();
    void liberarPlaza();
    boolean verificarPlazaOcupada();
}

interface InteraccionCliente {
    void gestionarEntrada();
    void gestionarSalida();
    void consultarDisponibilidad();
}