package abstractfactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarroTest {

    @Test
    void deveConstruirMotorEsportivo() {
        FabricaAbstrata fabrica = new FabricaEsportivo();
        Carro carro = new Carro(fabrica);
        assertEquals("Motor Esportivo", carro.construirMotor());
    }

    @Test
    void deveConstruirMotorRua() {
        FabricaAbstrata fabrica = new FabricaRua();
        Carro carro = new Carro(fabrica);
        assertEquals("Motor Rua", carro.construirMotor());
    }

    @Test
    void deveConstruirRodaEsportivo() {
        FabricaAbstrata fabrica = new FabricaEsportivo();
        Carro carro = new Carro(fabrica);
        assertEquals("Roda Esportiva", carro.construirRoda());
    }

    @Test
    void deveConstruirRodaRua() {
        FabricaAbstrata fabrica = new FabricaRua();
        Carro carro = new Carro(fabrica);
        assertEquals("Roda Rua", carro.construirRoda());
    }

    @Test
    void deveConstruirSuspensaoEsportivo() {
        FabricaAbstrata fabrica = new FabricaEsportivo();
        Carro carro = new Carro(fabrica);
        assertEquals("Suspensão Esportiva", carro.construirSuspensao());
    }

    @Test
    void deveConstruirSuspensaoRua() {
        FabricaAbstrata fabrica = new FabricaRua();
        Carro carro = new Carro(fabrica);
        assertEquals("Suspensão Rua", carro.construirSuspensao());
    }

}