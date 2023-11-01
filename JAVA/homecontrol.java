package com.example.nahulthejoker;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class homecontrol {

    @FXML
    void hometoabout(MouseEvent event) throws IOException {
        ((Stage) ((Node) event.getSource()).getScene().getWindow()).close();

        // Load the new FXML scene
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("aboutus.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        // Create a new stage
        Stage newStage = new Stage();

        // Set the new scene on the stage and show the stage
        newStage.setScene(scene);
        newStage.show();
    }

    @FXML
    void hometologin(MouseEvent event) throws IOException {
        ((Stage) ((Node) event.getSource()).getScene().getWindow()).close();

        // Load the new FXML scene
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("login.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        // Create a new stage
        Stage newStage = new Stage();

        // Set the new scene on the stage and show the stage
        newStage.setScene(scene);
        newStage.show();
    }

    @FXML
    void hometomarketplace(MouseEvent event) throws IOException {
        ((Stage) ((Node) event.getSource()).getScene().getWindow()).close();

        // Load the new FXML scene
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("market.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        // Create a new stage
        Stage newStage = new Stage();

        // Set the new scene on the stage and show the stage
        newStage.setScene(scene);
        newStage.show();
    }

    @FXML
    void hometoplayer(MouseEvent event) throws IOException {
        ((Stage) ((Node) event.getSource()).getScene().getWindow()).close();

        // Load the new FXML scene
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("player.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        // Create a new stage
        Stage newStage = new Stage();

        // Set the new scene on the stage and show the stage
        newStage.setScene(scene);
        newStage.show();
    }

    @FXML
    void hometosearch(MouseEvent event) throws IOException {
        ((Stage) ((Node) event.getSource()).getScene().getWindow()).close();

        // Load the new FXML scene
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("search.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        // Create a new stage
        Stage newStage = new Stage();

        // Set the new scene on the stage and show the stage
        newStage.setScene(scene);
        newStage.show();
    }

    @FXML
    void hometotransaction(MouseEvent event) throws IOException {
        ((Stage) ((Node) event.getSource()).getScene().getWindow()).close();

        // Load the new FXML scene
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("transaction.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        // Create a new stage
        Stage newStage = new Stage();

        // Set the new scene on the stage and show the stage
        newStage.setScene(scene);
        newStage.show();
    }

}
