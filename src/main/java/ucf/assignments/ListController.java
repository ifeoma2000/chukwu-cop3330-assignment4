package ucf.assignments;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ResourceBundle;
import java.net.URL;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import javax.swing.*;

public class ListController {

    // GUI controls defined in FXML and used by the controller's code
    @FXML
    private TextField Type_Date;

    @FXML
    private Button remove;

    @FXML
    private Button add_item;

    @FXML
    private TextField Type_Description;

    @FXML
    private Button load;

    @FXML
    private Button save;

    @FXML
    private Checkbox toggle_completed_items;

    @FXML
    private Button edit;
    @FXML
    private ListView<ListModel> ToDo_List;
    final ObservableList<String> listItems = FXCollections.observableArrayList();

    // called by FXMLLoader to initialize the controller
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    private void addAction(ActionEvent action) {
        listItems.add(Type_Description.getText());
        System.out.println("Add Button Pushed");
    }

    @FXML
    private void deleteAction(ActionEvent action) {
        int selectedItem = ToDo_List.getSelectionModel().getSelectedIndex();
        listItems.remove(selectedItem);
    }

}