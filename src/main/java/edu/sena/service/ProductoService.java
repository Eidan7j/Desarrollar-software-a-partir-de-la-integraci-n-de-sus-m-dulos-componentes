package edu.sena.service;

import edu.sena.repository.ProductoRepository;

public class ProductoService {

    /**
     * Gestiona la lógica de negocio de productos.
     */

    private ProductoRepository productoRepository =
            new ProductoRepository();

    public void registrarProducto() {

        productoRepository.guardarProducto();

    }

    public void actualizarStock() {

        System.out.println(
                "Stock actualizado."
        );

    }


}