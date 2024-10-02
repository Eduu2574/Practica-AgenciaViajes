package org.example.agenciaViajes.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import org.example.agenciaViajes.Util.MostrarEscena;

import java.io.IOException;

public class paginaPrincipalController {

    @FXML
    private PasswordField contrasenaTf;

    @FXML
    private Button iniciar;

    @FXML
    private Button registrar;

    @FXML
    private TextField usuarioTf;

    @FXML
    void onIniciarClic(ActionEvent event) {

    }

    @FXML
    void onRegistrarClic(ActionEvent event) {

    }

    @FXML
    void onSiguienteClic(ActionEvent event) throws IOException {
        MostrarEscena.mostrarScene(event,"destino.fxml");
    }

}
