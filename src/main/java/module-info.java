module com.example.sudokusolver {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.sudokusolver to javafx.fxml;
    exports com.example.sudokusolver;
}