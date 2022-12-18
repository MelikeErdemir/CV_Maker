module com.example.cv_maker {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.cv_maker to javafx.fxml;
    exports com.example.cv_maker;
}