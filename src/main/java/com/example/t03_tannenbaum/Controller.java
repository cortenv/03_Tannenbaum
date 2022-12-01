package com.example.t03_tannenbaum;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.text.Text;

public class Controller {
    @FXML
    private TextField Stammbreite;

    @FXML
    private TextField Stammhöhe;

    @FXML
    private TextField Kronenhöhe;

    @FXML
    private Button buttonMath;

    @FXML
    private TextArea areaZeichung;

    @FXML
    private void onButtonDrawClick() {

        if (Kronenhöhe.getText().trim().equals("")
                || Stammhöhe.getText().equals("")
                || Stammbreite.getText().equals("")) {
            return;
        }

// Aus den Lösungen kopiert
        Tanne t = new Tanne(
                Integer.valueOf(Stammbreite.getText()) ,
                Integer.valueOf(Stammhöhe.getText()) ,
                Integer.valueOf(Kronenhöhe.getText()));

        t.Zeichne();

        areaZeichung.setText(t.getZeichnung());
    }

    @FXML
    private void initialize() {
        Stammbreite.addEventFilter(KeyEvent.ANY, keyEventFilter);
        Stammhöhe.addEventFilter(KeyEvent.ANY, keyEventFilter);
        Kronenhöhe.addEventFilter(KeyEvent.ANY, keyEventFilter);
    }

}