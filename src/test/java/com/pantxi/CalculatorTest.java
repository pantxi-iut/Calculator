package com.pantxi;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    void add_devrait_calculer_la_somme_de_deux_int() {
        // GIVEN
        Calculator calculator = new Calculator();

        // WHEN
        int somme = calculator.add(1,2);

        //THEN
        assertThat(somme).isEqualTo(3);
    }
}