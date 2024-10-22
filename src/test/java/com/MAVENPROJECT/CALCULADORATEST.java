package com.MAVENPROJECT;

import com.beginsecure.maventest.MAVENPROYECT.CALCULADORA;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CALCULADORATEST {
    private CALCULADORA calculadora;

    @BeforeEach
    void setUp() {
        calculadora = new CALCULADORA();
    }

    @Test
    void suma() {
        assertEquals(400,calculadora.suma(300,100));
    }

    @Test
    void resta() {
        assertEquals(1,calculadora.resta(2,1));
    }
}