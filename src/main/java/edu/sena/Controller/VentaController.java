package edu.sena.Controller;

import edu.sena.service.VentaService;

public class VentaController {


    /**
     * Controlador de ventas.
     */

        private VentaService ventaService =
                new VentaService();

        public void procesarVenta() {

            ventaService.procesarVenta();

        }

        public void generarFactura() {

            ventaService.generarFactura();

        }

}
