module com.example.dedicnostmalovanifx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.dedicnostmalovanifx to javafx.fxml;
    exports com.example.dedicnostmalovanifx;
}