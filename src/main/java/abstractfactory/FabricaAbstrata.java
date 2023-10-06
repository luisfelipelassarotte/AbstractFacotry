package abstractfactory;

public interface FabricaAbstrata {
    Motor construirMotor();
    Roda construirRoda();
    Suspensao construirSuspensao();
}
