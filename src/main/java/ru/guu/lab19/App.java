package ru.guu.lab19;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {
    @Inject
    MyService myService;
    @Inject
    DiscountStrategy discountStrategy;

    @Override
    public void init() {
        Injector injector = Guice.createInjector(new AppModule());
        injector.injectMembers(this);

    }

    @Override
    public void start(Stage primaryStage) {
        TextField textField = new TextField();
        TextField textField_2 = new TextField();
        Button button = new Button("Обработать");
        Button button_2 = new Button("Рассчитать скидку");

        button.setOnAction(event -> {
            String input = textField.getText();
            textField.setText(myService.process(input));
        });

        button_2.setOnAction(event -> {
            String[] input = textField_2.getText().split(" ");
            String name = input[0];
            double price = Double.parseDouble(input[1]);
            double discount = Double.parseDouble(input[2]);
            textField_2.setText(discountStrategy.process(name, price, discount));
        });
        VBox root = new VBox(10, textField, button, textField_2, button_2);
        Scene scene = new Scene(root, 1000, 800);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Guice в JavaFX");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }


}
