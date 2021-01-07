package overviewfx.layoutpanefx;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class StackPaneFx extends Application {
	@Override
	public void start(Stage primaryStage) {
		StackPane stackPane = new StackPane();
		stackPane.setPadding(new Insets(10));
		
		Label lbl = new Label("Stack Pane");
		
		ListView<String> list = new ListView<>();
		ObservableList<String> months = FXCollections.observableArrayList(
			"Jan.", "Feb.", "Mar.", "Apr", "May", "June", "July", "Aug.", "Sep.", "Oct.", "Nov.", "Dec.");
		
		list.setItems(months);
		
		stackPane.getChildren().addAll(list, lbl);
		
		Scene scene = new Scene(stackPane);
		primaryStage.setTitle("Demo Stack Pane");
		primaryStage.setWidth(640);
		primaryStage.setHeight(360);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public void main(String[] args) {
		launch(args);
	}
}
