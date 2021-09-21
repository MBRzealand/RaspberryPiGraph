module com.example.raspberrypigraph {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.raspberrypigraph to javafx.fxml;
    exports com.example.raspberrypigraph;
}