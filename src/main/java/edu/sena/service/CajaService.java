package edu.sena.service;

import edu.sena.repository.CajaRepository;

/**
 * Gestiona operaciones de caja.
 */
public class CajaService {

    private CajaRepository cajaRepository =
            new CajaRepository();

    public void cerrarCaja() {

        cajaRepository.cerrarCaja();

    }

}