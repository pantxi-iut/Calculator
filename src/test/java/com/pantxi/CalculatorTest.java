package com.pantxi;

import org.junit.jupiter.api.*;
/*
L'instruction : import org.junit.jupiter.api.*     inclut (pour notre code) :
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
 */

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add_devrait_calculer_la_somme_de_deux_int() {
        // GIVEN

        // WHEN
        int somme = Calculator.add(1,2);

        //THEN
        assertThat(somme).isEqualTo(3);
    }

    @Test
    void divide_devrait_retourner_quotient_nul_quand_diviseur_plus_grand_que_dividende()
    {
        // GIVEN

        // WHEN
        int quotient = Calculator.divide(1,2);

        //THEN
        assertThat(quotient).isEqualTo(0);
    }

    @Test
    void divide_devrait_retourner_quotient_non_nul_quand_diviseur_plus_petit_que_dividende()
    {
        // GIVEN

        // WHEN
        int quotient = Calculator.divide(7,2);

        //THEN
        assertThat(quotient).isEqualTo(3);
    }
}