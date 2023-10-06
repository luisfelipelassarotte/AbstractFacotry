package abstractfactory;

public class FabricaRua implements FabricaAbstrata {
    @Override
    public Motor construirMotor() {
        return new MotorRua();
    }

    @Override
    public Roda construirRoda() {
        return new RodaRua();
    }

    @Override
    public Suspensao construirSuspensao() {
        return new SuspensaoRua();
    }
}
