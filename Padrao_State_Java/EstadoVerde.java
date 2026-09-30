public class EstadoVerde implements EstadoSemaforo {

    @Override
    public void mudarEstado(Semaforo semaforo) {
        semaforo.setEstado(new EstadoAmarelo());
    }

    @Override
    public void mostrarEstado() {
        System.out.println("Semáforo VERDE: siga!");
    }
}
