/**
 * Sample Skeleton for 'Anagrammi.fxml' Controller Class
 */

package it.polito.tdp.anagrammi.controller;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import it.polito.tdp.model.Model;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AnagrammiController {
	
	
	private Model model;

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="txtInput"
    private TextField txtInput; // Value injected by FXMLLoader

    @FXML // fx:id="btnCalcola"
    private Button btnCalcola; // Value injected by FXMLLoader

    @FXML // fx:id="txtCorretti"
    private TextArea txtCorretti; // Value injected by FXMLLoader

    @FXML // fx:id="txtErrati"
    private TextArea txtErrati; // Value injected by FXMLLoader

    @FXML // fx:id="btnReset"
    private Button btnReset; // Value injected by FXMLLoader

    @FXML
    void doCalcola(ActionEvent event) {
    	txtCorretti.clear();
    	txtErrati.clear();
    	
//    	String s=txtInput.getText();
//    	String risultato="";
//    	List <String> permutazioni=model.calcolaPermutazioni(s);
//    	for (String ss:permutazioni) {
//    		risultato+=ss+"\n";
//    		
//    	}
//
//    	risultato=risultato.trim();
//    	txtCorretti.setText(risultato);
    	
    	
    	String s=txtInput.getText();
    	String risultato="";
    	List <String> permutazioni=model.calcolaPermutazioni(s);
    	
    	for (String ss:permutazioni) {
    		if(model.isCorrect(ss))
    			txtCorretti.appendText(ss+"\n");
    		else {
    			txtErrati.appendText(ss+"\n");
    		}
    	}
    	
    }

    @FXML
    void doReset(ActionEvent event) {
    	
    	txtInput.clear();
    	txtCorretti.clear();
    	txtErrati.clear();

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert txtInput != null : "fx:id=\"txtInput\" was not injected: check your FXML file 'Anagrammi.fxml'.";
        assert btnCalcola != null : "fx:id=\"btnCalcola\" was not injected: check your FXML file 'Anagrammi.fxml'.";
        assert txtCorretti != null : "fx:id=\"txtCorretti\" was not injected: check your FXML file 'Anagrammi.fxml'.";
        assert txtErrati != null : "fx:id=\"txtErrati\" was not injected: check your FXML file 'Anagrammi.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Anagrammi.fxml'.";

    }

	public void setModel(Model model) {

		this.model=model;
	}
}
