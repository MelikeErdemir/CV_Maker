package com.example.cv_maker;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

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
    private Button exitButton; //buton burada fxml dosyasına bağlanıyor, scenebuilder da butonun üstüne tıklayıp sağ taraftan
    //code kısmına geldiğinizde butonların id si ve eventlerinin bağdaştırılacağı yeri görüceksiniz, oraya yazarsanız scenebuilder
    //otomatik olarak fxml dosyasına bağlıyor.

    @FXML
    private void initialize() {
        createCVButton.setOnAction((actionEvent -> CreateCV())); //Butonları ilgilendiren action bu şekilde ekleniyor
        listButton.setOnAction(actionEvent -> listCV());
        loadButton.setOnAction(actionEvent -> openLoad());
        helpButton.setOnAction(actionEvent -> getHelp());
        exitButton.setOnAction(actionEvent -> exitApp());
    }

   @FXML
   private void CreateCV() {
       try {
           Parent parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("CreateCV.fxml")));
           Stage stage = new Stage();
           stage.initModality(Modality.APPLICATION_MODAL);
           stage.setTitle("Create CV");
           stage.setScene(new Scene(parent, 600, 400));
           stage.setMinWidth(605);
           stage.setMinHeight(405);
           stage.setResizable(false);


           stage.show();

       } catch (IOException e) {
           Alert alert = new Alert(Alert.AlertType.ERROR);
           alert.setHeaderText("help fail");
           System.out.println("**********************"+e);
           alert.show();
       }
   }

    @FXML
    private void openLoad(){

    }
    @FXML
    private void getHelp(){

    }
    @FXML
    private void listCV(){

    }
    @FXML
    private void exitApp(){
        Platform.exit();
    }

}