package abstractfactory;

public class FabricaEsportivo implements FabricaAbstrata {
    @Override
    public Motor construirMotor() {
        return new MotorEsportivo();
    }

    @Override
    public Roda construirRoda() {
        return new RodaEsportiva();
    }

    @Override
    public Suspensao construirSuspensao() {
        return new SuspensaoEsportiva();
    }
}
