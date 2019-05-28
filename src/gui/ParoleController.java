/**
 * Sample Skeleton for 'ParoleView.fxml' Controller Class
 */

package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextField;
import model.ParoleModel;

public class ParoleController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="ListView"
    private ListView<String> ListView; // Value injected by FXMLLoader

    @FXML // fx:id="txtInput"
    private TextField txtInput; // Value injected by FXMLLoader

    @FXML // fx:id="btnInput"
    private Button btnInput; // Value injected by FXMLLoader

    @FXML // fx:id="btnDelete"
    private Button btnDelete; // Value injected by FXMLLoader

    @FXML // fx:id="btnClear"
    private Button btnClear; // Value injected by FXMLLoader

    @FXML
    void clear(ActionEvent event) {
    	elenco.clear();
    }

    @FXML
    void delete(ActionEvent event) {
    	elenco.remove(ListView.getSelectionModel().getSelectedItems());
    }

    @FXML
    void insert(ActionEvent event) {
    	elenco.add(txtInput.getText());
    	txtInput.setText("");
    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert ListView != null : "fx:id=\"ListView\" was not injected: check your FXML file 'ParoleView.fxml'.";
        assert txtInput != null : "fx:id=\"txtInput\" was not injected: check your FXML file 'ParoleView.fxml'.";
        assert btnInput != null : "fx:id=\"btnInput\" was not injected: check your FXML file 'ParoleView.fxml'.";
        assert btnDelete != null : "fx:id=\"btnDelete\" was not injected: check your FXML file 'ParoleView.fxml'.";
        assert btnClear != null : "fx:id=\"btnClear\" was not injected: check your FXML file 'ParoleView.fxml'.";
       
        ListView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
    }
    
    private ParoleModel elenco;
    
    void setModel(ParoleModel elenco) {
    	this.elenco = elenco;
    	ListView.setItems(elenco.getElenco());
    }
}
