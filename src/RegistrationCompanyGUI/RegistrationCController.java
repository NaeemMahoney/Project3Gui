/**
 * Ra'ees Manuel
 * 219074089
 * RegistrationCController has declaration of buttons
 */


package RegistrationCompanyGUI;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.event.ActionEvent;
import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class RegistrationCController implements Initializable
{

    @FXML
    private TextField txtName;

    @FXML
    private TextField txtNum;

    @FXML
    private TextField txtEmail;

    @FXML
    private TextField txtPass;

    @FXML
    private Button btnRegisterCompany;

    @FXML
    private ImageView RegisterImageview;

    @FXML
    void savecompany(ActionEvent event) {
        Company c = new Company(txtName.getText(), txtNum.getText(), txtEmail.getText(), txtPass.getText());
        c.save();

    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {
        File RegisterFile = new File("images/register.png");
        Image RegisterImage = new Image(RegisterFile.toURI().toString());
        RegisterImageview.setImage(RegisterImage);
    }
}

