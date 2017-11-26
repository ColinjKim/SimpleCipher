import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CipherMain extends Application{
	
	Stage window;
	Scene scene;
	Button button;
	ComboBox<String> comboBox;
	TextField userInput, output;
	
	public static void main(String[] args) {
		/* pre gui main
		Scanner sc = new Scanner(System.in);
		System.out.print("Encode or decode (0/1):");
		String input = sc.nextLine();
		if (input.equals("0")) {
			System.out.println(CipherFunction.encode()); 
		}
		else {
			System.out.println(CipherFunction.decode());
		}
		sc.close();
		*/
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		window = primaryStage;
		window.setTitle("Simple Cipher");
		button = new Button("Run");
		
		comboBox = new ComboBox<>();
		comboBox.getItems().addAll("Encode", "Decode");
		comboBox.setValue("Encode");
		
		userInput = new TextField();
		userInput.setPromptText("Enter String");
		
		output = new TextField();
		output.setPromptText("output");
		
		button.setOnAction(e -> {
			output.setText(CipherFunction.choice(comboBox.getValue(),userInput.getText()));
			});
		
		VBox layout = new VBox(10);
		layout.setPadding(new Insets(20,20,20,20));
		layout.getChildren().addAll(comboBox, userInput, button, output);
		
		scene = new Scene(layout,300,250);
		window.setScene(scene);
		window.show();
	}
	
	
}
