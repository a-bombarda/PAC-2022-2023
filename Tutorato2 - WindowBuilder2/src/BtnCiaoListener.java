import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class BtnCiaoListener implements ActionListener{

	JTextField textField;
	//FinestraProva form;
	
	BtnCiaoListener(JTextField textField) {
		this.textField = textField;
	}
	
	/*BtnCiaoListener(FinestraProva form) {
		this.form = form;
	}*/
	
	@Override
	public void actionPerformed(ActionEvent e) {
		textField.setText("CIAO");		
	}
	
	/*@Override
	public void actionPerformed(ActionEvent e) {
		form.textField.setText("CIAO");		
	}*/

}
