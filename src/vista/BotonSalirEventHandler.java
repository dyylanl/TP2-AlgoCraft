package vista;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

public class BotonSalirEventHandler implements EventHandler<ActionEvent>{
	
	private Button miBoton;
	
	public BotonSalirEventHandler(Button unBoton) {
		this.miBoton = unBoton;
	}
	
	@Override
	public void handle(ActionEvent actionEvent) {
		System.exit(0);
	}
}