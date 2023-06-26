module com.example.swtprojekt {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.swtprojekt to javafx.fxml;
    exports com.example.swtprojekt;
}