public class EstadoVermelho implements EstadoSemaforo {

    @Override
    public void mudarEstado(Semaforo semaforo) {
        semaforo.setEstado(new EstadoVerde());
    }

    @Override
    public void mostrarEstado() {
        System.out.println("Semáforo VERMELHO: pare!");
    }
}
