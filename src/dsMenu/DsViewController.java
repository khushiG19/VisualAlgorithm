package dsMenu;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class DsViewController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    void DoQueue(ActionEvent event) {

    }

    @FXML
    void DoStack(ActionEvent event) {

    }

    @FXML
    void OpenDs(ActionEvent event) {
    	Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("/dsMenu/DsView.fxml"));
		// OR
//Parent root=FXMLLoader.load(getClass().getClassLoader().getResource("marks/card/MarksCard.fxml")); 
		Scene scene = new Scene(root);
		Stage stage = new Stage();
		stage.setScene(scene);
		stage.show();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}

    }

    @FXML
    void OpenHome(ActionEvent event) {
    	Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("/home/HomeView.fxml"));
		// OR
//Parent root=FXMLLoader.load(getClass().getClassLoader().getResource("marks/card/MarksCard.fxml")); 
		Scene scene = new Scene(root);
		Stage stage = new Stage();
		stage.setScene(scene);
		stage.show();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}

    }

    @FXML
    void OpenPF(ActionEvent event) {
    	Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("/pfMenu/pathfindingView.fxml"));
		// OR
//Parent root=FXMLLoader.load(getClass().getClassLoader().getResource("marks/card/MarksCard.fxml")); 
		Scene scene = new Scene(root);
		Stage stage = new Stage();
		stage.setScene(scene);
		stage.show();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}

    }

    @FXML
    void OpenSorting(ActionEvent event) {
    	Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("/sortingMenu/SortingView.fxml"));
		// OR
//Parent root=FXMLLoader.load(getClass().getClassLoader().getResource("marks/card/MarksCard.fxml")); 
		Scene scene = new Scene(root);
		Stage stage = new Stage();
		stage.setScene(scene);
		stage.show();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}

    }

    @FXML
    void initialize() {

    }

}
