package application;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.HBox;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaPlayer.Status;

public class MediaBar extends HBox {

	Slider time; 
	Slider vol; 
	
	Button pause;
	
	Label volumeLBL;
	
	MediaPlayer player; 
	
	public MediaBar(MediaPlayer play) {
		player = play;
		
		vol = new Slider();
		time = new Slider();
		
		setAlignment(Pos.CENTER);
		setPadding(new Insets(10,10,10,10));
		setStyle("-fx-background-color:white");
		
		pause = new Button("||");
		volumeLBL = new Label("Volume : ");
		
		getChildren().add(pause);
		getChildren().add(time);
		
