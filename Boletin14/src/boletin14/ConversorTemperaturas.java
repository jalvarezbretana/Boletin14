/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin14;

import java.util.*;

/**
 *
 * @author jalvarezbretana
 */
public class ConversorTemperaturas {

    private final int TEMPMAX = 80;
    private float gradosC;

    public float getGradosC() {
        return gradosC;
    }

    public void pedirDatos() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce a temperatura(en graos centigrados)");
        gradosC = sc.nextFloat();
    }

    public float centigradosAFahrenheit() throws TemperaturaErradaExcepcion {
        if (gradosC > TEMPMAX) {
            throw new TemperaturaErradaExcepcion("Non pode traballar con temperaturas maiores a " + TEMPMAX + "ºC");
        }
        float gradosF = 9.0f / 5.0f * gradosC + 32.4f;
        return gradosF;
    }

    public void centigradosAReaumur() throws TemperaturaErradaExcepcion {
        if (gradosC > TEMPMAX) {
            throw new TemperaturaErradaExcepcion("Non pode traballar con temperaturas maiores a " + TEMPMAX + "ºC");
        }
        float gradosR = gradosC * 4.0f / 5.0f;
        System.out.println(gradosC + "ºC son " + gradosR + "º Reaumur");

    }

}
