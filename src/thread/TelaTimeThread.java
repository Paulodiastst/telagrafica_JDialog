package thread;

import java.awt.Dimension;

import javax.swing.JDialog;

public class TelaTimeThread extends JDialog {
	
	public TelaTimeThread() {/*Executa o que tiver dentro no momento da abertura ou execução*/
		setTitle("Minha tela time com Thread");
		setSize(new Dimension(240, 240));
		setLocationRelativeTo(null);
		setResizable(false);
		/*Primeira parte concluida a tela*/		
		
		
		
		
		/*Sempre será o ultimo comando*/
		setVisible(true); /*Torna a tela visivel para o usuário*/
	}

}
