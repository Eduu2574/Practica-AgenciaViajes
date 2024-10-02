module org.example.agenciaViajes {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires java.sql;

    opens org.example.agenciaViajes.Controller to javafx.fxml;

    exports org.example.agenciaViajes;
}
