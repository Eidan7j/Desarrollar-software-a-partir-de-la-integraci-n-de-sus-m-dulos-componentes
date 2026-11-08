package edu.sena.Controller;

import edu.sena.service.CajaService;

/**
 * Controlador de caja.
 */
public class CajaController {

    private CajaService cajaService = new CajaService();

    public void cerrarCaja() {

        cajaService.cerrarCaja();

    }

}