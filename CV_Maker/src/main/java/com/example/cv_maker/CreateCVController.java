package com.example.cv_maker;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateCVController {
    @FXML
    private Button saveButton;
    @FXML
    private TextField nameText;
    @FXML
    private TextField idText;
    @FXML
    private TextField departmentText;
    @FXML
    private TextField educationText;
    @FXML
    private TextField birthText;
    @FXML
    private TextField langueText;
    @FXML
    private TextField personalAText;
    @FXML
    private TextField addressText;
    @FXML
    private TextField telnumText;
    @FXML
    private TextField tagText;

    @FXML
    private void addCV(){
        saveButton.setOnAction(actionEvent -> {
            try {
                saveTextField();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }

    public void saveTextField()throws IOException {
        String name = nameText.getText();
        String id = idText.getText();
        String department = departmentText.getText();
        String education = educationText.getText();
        String birthday = birthText.getText();
        String languages = langueText.getText();
        String personalab = personalAText.getText();
        String address = addressText.getText();
        String telnum = telnumText.getText();
        String tag = tagText.getText();

        CV tempCv = new CV(name,id,department,education,birthday,languages,personalab,address,telnum,tag);

        File cv = new File("saved_cv.txt");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(cv, true))) {

            writer.write(name + "|" +id+ "|" +department+ "|" +education+ "|" +birthday+ "|" +languages+ "|" +personalab+ "|"
                    +address+ "|" +telnum+ "|" +tag+ "\n");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

