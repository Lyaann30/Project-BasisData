module com.example.arayalandbasdat {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.arayalandbasdat to javafx.fxml;
    exports com.example.arayalandbasdat;
}