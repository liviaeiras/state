public class Semaforo {
    private EstadoSemaforo estado;

    public Semaforo() {
        estado = new EstadoVermelho();
    }

    public void setEstado(EstadoSemaforo estado) {
        this.estado = estado;
    }

    public void mostrarEstado() {
        estado.mostrarEstado();
    }

    public void mudarEstado() {
        estado.mudarEstado(this);
    }
}
