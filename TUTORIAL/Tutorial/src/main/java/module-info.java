
module com.example.demo {
    requires javafx.controls;
    requires javafx.base;
    requires javafx.fxml;

    opens com.example.demo.controlador to javafx.fxml;
    exports com.example.demo;
}

