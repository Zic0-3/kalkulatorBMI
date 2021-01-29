package sample;


import javafx.beans.property.IntegerProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import model.BodyDimensions;


public class Controller {
    @FXML
    Button calculateButton;
    @FXML
    Button resetButton;
    @FXML
    CheckBox bmrCheckbox;
    @FXML
    CheckBox bmiCheckbox;
    @FXML
    TextField heightTextField;
    @FXML
    TextField weightTextField;
    @FXML
    TextField ageTextField;
    @FXML
    Label resultLabel;
    @FXML
    RadioButton maleRadioButton;
    @FXML
    RadioButton femaleRadioButton;
    @FXML
    ToggleGroup sex;

    @FXML
    private void calculate(ActionEvent event) {
        boolean isFemale = sex.getSelectedToggle() != maleRadioButton;
        int height = Integer.parseInt(heightTextField.getText());
        int weight = Integer.parseInt(weightTextField.getText());
        int age = Integer.parseInt(ageTextField.getText());
        BodyDimensions dimensions = new BodyDimensions(height,weight,age,isFemale);
        if(bmiCheckbox.isSelected() && !bmrCheckbox.isSelected()) {
            resultLabel.setText("\n Twoje BMI wynosi: " + dimensions.calculateBMI());
        }
    }
    @FXML
    private void reset(ActionEvent event) {

    }
}
