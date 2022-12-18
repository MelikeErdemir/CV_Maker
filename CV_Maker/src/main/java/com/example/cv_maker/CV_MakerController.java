package com.example.cv_maker;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class CV_MakerController {

    @FXML
    private Button createCVButton;
    @FXML
    private Button listButton;
    @FXML
    private Button loadButton;
    @FXML
    private Button helpButton;
    @FXML
    private Button exitButton;

    @FXML
    private void initialize() {
        createCVButton.setOnAction((actionEvent -> openCreateMenu()));
        listButton.setOnAction(actionEvent -> openList());
        loadButton.setOnAction(actionEvent -> openLoad());
        helpButton.setOnAction(actionEvent -> openHelp());
        exitButton.setOnAction(actionEvent -> exitApp());
    }

   @FXML
    private void openCreateMenu(){

    }

    @FXML
    private void openLoad(){

    }
    @FXML
    private void openHelp(){

    }
    @FXML
    private void openList(){

    }
    @FXML
    private void exitApp(){
        Platform.exit();
    }

}