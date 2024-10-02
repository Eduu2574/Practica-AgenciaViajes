package org.example.agenciaViajes.Util;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.example.agenciaViajes.HelloApplication;

import java.awt.*;
import java.io.IOException;

public class MostrarEscena {


    public static void mostrarScene(ActionEvent event, String archivoFxml) throws IOException {
        Stage stageActual = (Stage) ((Node) event.getSource()).getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(archivoFxml));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("AGENCIA DE VIAJES ");
        stage.setScene(scene);
        stageActual.close();
        stage.show();
    }
/*
    // Función para cambiar la escena a un nuevo FXML
    public static void cambiarEscena(Button boton, String fxmlFile) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(fxmlFile));
            // Verifica la ruta correcta de Compras.fxml
            Parent root = fxmlLoader.load(); // Carga el archivo FXML
            Scene scene = new Scene(root); // Crea una nueva escena con el archivo FXML cargado
            Stage stage = (Stage) boton.getScene().getWindow(); // Obtén la ventana (Stage) desde el botón
            stage.setScene(scene); // Establece la nueva escena en la ventana actual
        } catch (Exception e) {
            System.out.println("Error al cambiar la escena: " + e.getMessage());
        }//catch}//cambiarEscena


    }

 */
}
