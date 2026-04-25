module beauty.salon {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;

    exports salon;

    opens salon.controller to javafx.fxml;
}