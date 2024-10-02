package org.example.agenciaViajes.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ToggleGroup;

    public class destinoController {

        @FXML
        private ToggleGroup destino;

        @FXML
        private Button facturaBt;

        @FXML
        private ComboBox<String> medioTransporteCb;

        @FXML
        void onGenerarFacturaClic(ActionEvent event) {

        }
        public void initialize(){
            medioTransporteCb.getItems().addAll("Tren","Avion","Autobús");
        }
        @FXML
        void onComprarClic(ActionEvent event) {
        String medioTransporte = medioTransporteCb.getValue();
        }

    }