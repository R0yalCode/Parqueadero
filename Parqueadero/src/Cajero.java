import java.util.List;

public class Cajero extends Empleado {
    private List<Float> registroPagos;

    // Getters y setters
    public List<Float> getRegistroPagos() {
        return registroPagos;
    }

    public void setRegistroPagos(List<Float> registroPagos) {
        this.registroPagos = registroPagos;
    }

    public void realizarPago() {
        // Implementación
    }
}