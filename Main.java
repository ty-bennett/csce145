import java.io.File;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Text titleLabel = new Text("Hello, World!");
		Text data = new Text(STLHelper.getFileSize("94Gengar.stl"));
		//System.out.println();
		Text listLabel = new Text("List of Models: ");
		ObservableList<String> names = FXCollections.observableArrayList();
		
		File f = new File("res/");
		for(File f1 : f.listFiles())
		{
			names.add(f1.getName());
		}
		
		ListView<String> listView = new ListView<String>(names);
		listView.getSelectionModel().select(0);
		
		GridPane gridPane = new GridPane();
		
		Button showInfo = new Button("Show Info");
		showInfo.setOnAction(new EventHandler<ActionEvent>(){
			@Override public void handle(ActionEvent e)
			{
				String name = listView.getSelectionModel().getSelectedItem();
				
				titleLabel.setText("Size of '" + name + "': ");
				data.setText(STLHelper.getFileSize(name));
			}
		});
		Scene scene = new Scene(gridPane);
		
		gridPane.add(titleLabel, 0, 0);
		gridPane.add(data, 1, 0);
		gridPane.add(listLabel, 0, 1);
		gridPane.add(listView, 0, 2);
		gridPane.add(showInfo, 0, 8);
		
		primaryStage.setTitle("Hello World!");
		primaryStage.setHeight(300);
		primaryStage.setWidth(400);
		primaryStage.setScene(scene);
		
		primaryStage.show();
	}

}
