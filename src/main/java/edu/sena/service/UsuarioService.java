package edu.sena.service;

import edu.sena.repository.UsuarioRepository;

public class UsuarioService {

    /**
     * Gestiona la lógica de negocio de usuarios.
     */

    private UsuarioRepository usuarioRepository =
            new UsuarioRepository();

    public void registrarUsuario() {

        usuarioRepository.guardarUsuario();

    }

    public void consultarUsuario() {

        System.out.println(
                "Consultando usuario."
        );

    }


}
