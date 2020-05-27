/**
 * Sample Skeleton for 'Scene.fxml' Controller Class
 */

package it.polito.tdp.poweroutages;

import java.net.URL;
import java.util.ResourceBundle;

import it.polito.tdp.poweroutages.model.Model;
import it.polito.tdp.poweroutages.model.Nerc;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class FXMLController {

	private Model model;
	
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ComboBox<Nerc> MenuNerc;

    @FXML
    private TextField MaxAnni;

    @FXML
    private TextField MaxOre;

    @FXML
    private Button btnPeggiorCaso;

    @FXML
    private TextArea txtResult;

    @FXML
    private ImageView image;

    @FXML
    void doWorstCaseAnalysis(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert MenuNerc != null : "fx:id=\"MenuNerc\" was not injected: check your FXML file 'Scene.fxml'.";
        assert MaxAnni != null : "fx:id=\"MaxAnni\" was not injected: check your FXML file 'Scene.fxml'.";
        assert MaxOre != null : "fx:id=\"MaxOre\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnPeggiorCaso != null : "fx:id=\"btnPeggiorCaso\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Scene.fxml'.";
        assert image != null : "fx:id=\"image\" was not injected: check your FXML file 'Scene.fxml'.";

    }
    
    public void setModel(Model model) {
    	this.model=model;
    	MenuNerc.getItems().addAll(this.model.getNercList());
    	
    }
}

