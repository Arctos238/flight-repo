package sait.frms.application;

import sait.frms.exception.InvalidFlightCodeException;
import sait.frms.gui.MainWindow;

import java.io.FileNotFoundException;

/**
 * Application driver.
 * 
 */
public class AppDriver {

	/**
	 * Entry point to Java application.
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) {
		try {
		MainWindow mainWindow = new MainWindow();
		mainWindow.display();
		} catch(FileNotFoundException e) {
			System.out.println("Cannot find the flight information file");
		} 
	}

}
