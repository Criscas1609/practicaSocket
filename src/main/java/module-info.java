module com.example.practicasocket {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.practicasocket to javafx.fxml;
    exports com.example.practicasocket;
}