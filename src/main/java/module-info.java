module com.mendoza.veterinaria {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.mendoza.veterinaria to javafx.fxml;
    exports com.mendoza.veterinaria;
}