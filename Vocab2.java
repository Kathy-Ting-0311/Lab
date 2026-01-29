/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author s235065
 */
public class Vocab2 {
    public static void main(String[] args) {
		VocabView view = new VocabView();
		VocabModel model = new VocabModel();
		VocabController control = new VocabController();

		view.setController(control);
		control.setModel(model);
		control.setView(view);
		model.setController(control);			
	 
		view.processCommand();
		   
	}
}

