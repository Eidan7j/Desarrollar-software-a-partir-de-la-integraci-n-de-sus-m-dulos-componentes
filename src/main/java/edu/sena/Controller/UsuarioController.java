package edu.sena.Controller;

import edu.sena.service.UsuarioService;

public class UsuarioController {

    /**
     * Controlador de usuarios.
     */

    private UsuarioService usuarioService =
            new UsuarioService();

    public void registrarUsuario() {

        usuarioService.registrarUsuario();

    }

    public void consultarUsuario() {

        usuarioService.consultarUsuario();

    }

}