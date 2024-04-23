module org.example.labexercise13 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.labexercise13 to javafx.fxml;
    exports org.example.labexercise13;
}