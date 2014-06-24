// The tutorial has never done any GUI stuff before and now it's using
// GUI stuff to illustrate anonymous classes of all things.
// That escalated quickly.
import javafx.application.Application; // the tutorial omitted this very necessary line
                                       // thanks, tutorial
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HelloWorld extends Application
{
	public static void main(String[] args)
	{
		launch(args);
	}

	@Override
	public void start(Stage primaryStage)
	{
		primaryStage.setTitle("Hello World!");
		Button btn = new Button();
		btn.setText("Say 'Hello World'");
		// Have you ever seen the worst facets of javascript and said to yourself
		// "hey, I wish I could do that in regular applications too!"
		// Well now you can
		btn.setOnAction(new EventHandler<ActionEvent>() 
		{
			@Override
			public void handle(ActionEvent event)
			{
				System.out.println("Hello World!");
			}
		});

		StackPane root = new StackPane();
		root.getChildren().add(btn);
		primaryStage.setScene(new Scene(root, 300, 250));
		primaryStage.show();
	}
}