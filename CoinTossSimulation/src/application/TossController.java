package application;

import java.net.URL;
import java.text.NumberFormat;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;

public class TossController {

	int correctHuman, correctRobot =0;
	
	String result="";
	
	
	
	//ImageView image = new ImageView();
	
	
	@FXML
	private ImageView imageHead;
	
	@FXML
	private ImageView imageTail;
	
	//@FXML
	//private ImageView imageLand;
	
	@FXML
	private Button coinButton;
	
	@FXML
	private RadioButton headsRadio;
	
	@FXML
	private RadioButton tailsRadio;
	
	@FXML
	private Label resultLabel;
	
	@FXML
	private Label humanRight;
	
	@FXML
	private Label robotRight;
	
	//private Image headImage;
//	private Image tailsImage;
	
	public void initialize(){
		//headImage = new Image("heads.jpg");
		//tailsImage = new Image("tails.jpg");
	}
	
	public void clickCoin(ActionEvent event){
		Random rand = new Random(); 
		int value = rand.nextInt(2);
		if(value == 0){
			result = "heads";
			//imageLand.setImage(headImage);
			imageHead.setVisible(true);
			imageTail.setVisible(false);
			if(headsRadio.isSelected()){
				correctHuman++;
				humanRight.setText(""+correctHuman);
			}
			else{
				correctRobot++;
				robotRight.setText(""+correctRobot);
			}
		}
		else{
			result="tails";
			//imageLand.setImage(tailsImage);
			imageHead.setVisible(false);
			imageTail.setVisible(true);
			if(tailsRadio.isSelected()){
				correctHuman++;
				humanRight.setText(""+correctHuman);
			}
			else{
				correctRobot++;
				robotRight.setText(""+correctRobot);
			}
		}
		resultLabel.setText(result);
	}
	
}
