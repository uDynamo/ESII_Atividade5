package org.juros;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class CalculadoraJurosTest {
    private CalculadoraJuros calculadora;

    @BeforeEach
    void setUp(){
        calculadora = new CalculadoraJuros();
    }

    @Test
    void testCalcularJurosSimplesComValorIncialZero(){
        assertThrows(IllegalArgumentException.class, () -> {
            calculadora.jurosSimples(0, 10, 2);
        });
    }

    @Test
    void testCalcularJurosSimplesComValorInicialNegativo(){
        assertThrows(IllegalArgumentException.class, () -> {
            calculadora.jurosSimples(-100, 10, 2);
        });
    }

    @Test
    void testCalcularJurosSimplesComValorInicialPositivo(){
        double montante = calculadora.jurosSimples(100, 10, 2);

        assertEquals(120.0, montante, 0.001);
    }

    @Test
    void testCalcularJurosCompostosComValorIncialZero(){
        assertThrows(IllegalArgumentException.class, () -> {
            calculadora.jurosCompostos(0, 10, 2);
        });
    }

    @Test
    void testCalcularJurosCompostosComValorInicialNegativo(){
        assertThrows(IllegalArgumentException.class, () -> {
            calculadora.jurosCompostos(-100, 10, 2);
        });
    }

    @Test
    void testCalcularJurosCompostosComValorInicialPositivo(){
        double montante = calculadora.jurosCompostos(100, 10, 2);

        assertEquals(121.0, montante, 0.001);
    }
}