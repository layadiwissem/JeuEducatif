
/***********************a Propos **********************/

package Jeu_educatif;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class Fenetrepropos extends JFrame {
	public Fenetrepropos(){
		getContentPane().setBackground(Color.WHITE);
		setIconImage(Toolkit.getDefaultToolkit().getImage("images/manette.png"));
	JPanel pan = new JPanel(); 
    this.setTitle("A propos "); 
    this.setSize(711,462);
    this.setLocationRelativeTo(null); 
    this.setBackground(Color.LIGHT_GRAY);
    getContentPane().setLayout(null);
    
    JLabel LabelPropos = new JLabel();
    LabelPropos.setIcon(null);
    LabelPropos.setForeground(Color.DARK_GRAY);
    
    LabelPropos.setText("<html><h2>Projet Interface Homme Machine </h2>\r\n R\u00E9alis\u00E9 par LAYADI wissem et HELALI romaissa     \r\n<br><br><br><br>\r\n <h2>Presenatation et objectif</h2>\r\n\r\n<p> \r\nCe jeu  a pour objectif d'aider les \u00E9l\u00E8ves dans leurs apprentissages scolaires .\r\n Vous y trouverez de operation d'addition, de soustraction , multiplication et la division ,voil\u00E0 de quoi am\u00E9liorer ses comp\u00E9tences dans ce domaine, tout en s'amusant !  </p></html>");
    
    LabelPropos.setFont(new Font("Century Gothic", Font.PLAIN, 20));
    LabelPropos.setBounds(20, 11, 645, 348);
    getContentPane().add(LabelPropos);
    
    JLabel lblNewLabel = new JLabel("");
    lblNewLabel.setIcon(new ImageIcon("images/WissRomai.jpg"));
    lblNewLabel.setBounds(427, 28, 164, 101);
    getContentPane().add(lblNewLabel);
  
    this.setVisible(true);
	}
}
