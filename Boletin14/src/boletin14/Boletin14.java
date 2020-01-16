/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin14;

/**
 *
 * @author jalvarezbretana
 */
public class Boletin14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ConversorTemperaturas obx = new ConversorTemperaturas();
        obx.pedirDatos();
        try {
            System.out.println(obx.getGradosC() + "ºC son " + obx.centigradosAFahrenheit() + " F");
        } catch (TemperaturaErradaExcepcion ex) {
            System.out.println("Erro. " + ex.getMessage());
        }
        try {
            obx.centigradosAReaumur();
        } catch (TemperaturaErradaExcepcion ex) {
            System.out.println("Erro. " + ex.getMessage());
        }

    }

}
