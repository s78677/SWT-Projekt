module com.example.swtprojekt {
    requires javafx.controls;
    requires javafx.fxml;


    opens View to javafx.fxml;
    exports View;
    opens Controller to javafx.fxml;
    exports Controller;
}