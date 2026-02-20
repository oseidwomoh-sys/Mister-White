import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.control.Button;

public class HelloWorld extends Application {

  @Override
  public void start(Stage stage) {
    Text text = new Text(10, 40, "Hello, World!");
    text.setFont(new Font(40));

    Button button = new Button("Click Me");
    button.setOnAction(e -> text.setText("Button Clicked!"));

    Group root = new Group(text, button);

    Scene scene = new Scene(root, 400, 200);

    stage.setScene(scene);
    stage.show();
  }

  public static void main(String[] args) {
   launch(); 
  }
}

