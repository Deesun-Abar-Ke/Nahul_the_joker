package com.example.nahulthejoker;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class marketplacecontrol {

    @FXML
    void markettohome(MouseEvent event) throws IOException {
        ((Stage) ((Node) event.getSource()).getScene().getWindow()).close();

        // Load the new FXML scene
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("home.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        // Create a new stage
        Stage newStage = new Stage();

        // Set the new scene on the stage and show the stage
        newStage.setScene(scene);
        newStage.show();
    }

}
