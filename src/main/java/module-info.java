module ru.guu.lab19 {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.google.guice;
    requires java.xml;

    opens ru.guu.lab19 to com.google.guice, javafx.fxml;
    exports ru.guu.lab19;
}