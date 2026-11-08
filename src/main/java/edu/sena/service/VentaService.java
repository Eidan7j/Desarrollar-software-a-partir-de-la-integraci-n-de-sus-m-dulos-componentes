package edu.sena.service;

import edu.sena.repository.VentasRepository;

public class VentaService {

    /**
     * Gestiona la lógica de ventas.
     */

    private VentasRepository ventasRepository =
            new VentasRepository();

    public void procesarVenta() {

        ventasRepository.guardarVenta();

    }

    public void generarFactura() {

        System.out.println(
                "Factura generada."
        );

    }

    }
