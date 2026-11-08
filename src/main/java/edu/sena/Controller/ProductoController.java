package edu.sena.Controller;

import edu.sena.service.ProductoService;

public class ProductoController {


    /**
     * Controlador de productos.
     */

        private ProductoService productoService =
                new ProductoService();

        public void registrarProducto() {

            productoService.registrarProducto();

        }

        public void actualizarStock() {

            productoService.actualizarStock();

        }

    }
