public class EstadoAmarelo implements EstadoSemaforo {

    @Override
    public void mudarEstado(Semaforo semaforo) {
        semaforo.setEstado(new EstadoVermelho());
    }

    @Override
    public void mostrarEstado() {
        System.out.println("Semáforo AMARELO: atenção!");
    }
}
