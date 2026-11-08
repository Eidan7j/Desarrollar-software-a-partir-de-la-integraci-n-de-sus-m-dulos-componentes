package edu.sena;

import edu.sena.Controller.CajaController;
import edu.sena.Controller.ProductoController;
import edu.sena.Controller.UsuarioController;
import edu.sena.Controller.VentaController;
import edu.sena.security.SessionManager;

/**
 * Punto de entrada del sistema Droguería Las Rebajas Web.
 */
public class Main {

    public static void main(String[] args) {

        System.out.println(
                "================================="
        );

        System.out.println(
                "DROGUERIA LAS REBAJAS WEB"
        );

        System.out.println(
                "Inicializando sistema..."
        );

        System.out.println(
                "================================="
        );

        // Seguridad

        SessionManager sessionManager = new SessionManager();

        sessionManager.iniciarSesion();

        // Módulo Usuarios

        UsuarioController usuarioController = new UsuarioController();

        usuarioController.registrarUsuario();

        // Módulo Productos

        ProductoController productoController = new ProductoController();

        productoController.registrarProducto();

        // Módulo Ventas

        VentaController ventaController = new VentaController();

        ventaController.procesarVenta();

        // Módulo Caja

        CajaController cajaController =
                new CajaController();

        cajaController.cerrarCaja();

        System.out.println(
                "================================="
        );

        System.out.println(
                "Sistema iniciado correctamente."
        );

        System.out.println(
                "Integración de módulos completada."
        );

        System.out.println(
                "================================="
        );

    }
}