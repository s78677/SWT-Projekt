package Controller;

import View.Main;
import javafx.event.ActionEvent;

public class StartController {
    public void exit(ActionEvent actionEvent) {
        Main.startStage.close();
    }
}
