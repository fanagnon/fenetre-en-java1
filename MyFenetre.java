import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class MyFenetre extends JFrame {

	
 /**
	 * 
	 */
	private static final long serialVersionUID = -8263045935785617348L;

public MyFenetre() {
		super("Ma fenètre");
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE );
		this.setSize(600,400);
		this.setLocationRelativeTo(null);
		JPanel contentPane= (JPanel) this.getContentPane();//stock afficher les element sur la fenetre
		contentPane.setLayout(new FlowLayout(FlowLayout.LEFT));/*les element sur la ligne*/
		contentPane.add(new JButton("push me!"));
		contentPane.add(new JButton("click me !!!!!"));
		contentPane.add(new JCheckBox("check me!!"));
		contentPane.add(new JTextField("message !"));/*zone de saisi de texte */
		
		
	}

	public static void main(String[] args) throws Exception{
		
		//creer un look <<une exeption>>
		UIManager.setLookAndFeel(new NimbusLookAndFeel());
		MyFenetre fenetre= new MyFenetre();
		fenetre.setVisible(true);

	}

}
