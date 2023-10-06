package abstractfactory;

public class Carro {
    private Motor motor;
    private Roda roda;
    private Suspensao suspensao;

    public Carro (FabricaAbstrata fabrica) {
        this.motor = fabrica.construirMotor();
        this.roda = fabrica.construirRoda();
        this.suspensao = fabrica.construirSuspensao();
    }

    public String construirMotor() {
        return this.motor.construir();
    }
    public String construirRoda() {
        return this.roda.construir();
    }
    public String construirSuspensao() {
        return this.suspensao.construir();
    }
}
