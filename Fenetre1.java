/********************La premiere fenetre*************/

package Jeu_educatif;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;  
public class Fenetre1 extends JFrame {
	
    private static final long serialVersionUID = 1L;
	 JPanel pan = new JPanel(); 
	
	public Fenetre1(){
		getContentPane().setForeground(Color.BLACK);
		setIconImage(Toolkit.getDefaultToolkit().getImage("images/manette.png"));
		getContentPane().setBackground(Color.WHITE);
		setResizable(false); 
	    this.setTitle("EduCalcule "); 
	    this.setSize(581,516); 
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	    this.setLocationRelativeTo(null); 
	    this.setBackground(Color.BLACK);
	    this.initMenu(); 
	    this.setVisible(true);
					} 
    private void initMenu(){
	      getContentPane().setLayout(null);
	      
	      JButton ButtonJouer = new JButton("Jouer");
	      ButtonJouer.setSelectedIcon(null);
	      ButtonJouer.addActionListener(new ActionListener() {
	      	public void actionPerformed(ActionEvent e) {
	    	    Relation relationInterfaceQuestion =new Relation();
	      	}
	      });
	      ButtonJouer.setBackground(new Color(153, 255, 255));
	      ButtonJouer.setForeground(Color.BLACK);
	      ButtonJouer.setFont(new Font("Century Gothic", Font.BOLD, 20));
	      ButtonJouer.setBounds(41, 363, 143, 35);
	      getContentPane().add(ButtonJouer);
	      
	      JButton ButtonPropos = new JButton("A propos");
	      ButtonPropos.addActionListener(new ActionListener() {
	      	public void actionPerformed(ActionEvent e) {
	      		Fenetrepropos propos =  new Fenetrepropos();
	      	}
	      });
	      ButtonPropos.setBackground(new Color(153, 255, 255));
	      ButtonPropos.setForeground(Color.BLACK);
	      ButtonPropos.setFont(new Font("Century Gothic", Font.BOLD, 20));
	      ButtonPropos.setBounds(381, 363, 143, 35);
	      getContentPane().add(ButtonPropos);
	      
	      JLabel LabelTitre = new JLabel("Aimer les calcules !...");
	      LabelTitre.setFont(new Font("Century Gothic", Font.PLAIN, 24));
	      LabelTitre.setBounds(160, 11, 304, 54);
	      getContentPane().add(LabelTitre);
	      
	      JLabel imageLabel = new JLabel("");
	      imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
	      imageLabel.setIcon(new ImageIcon("images/images (1).png"));
	      imageLabel.setBounds(137, 93, 290, 236);
	      getContentPane().add(imageLabel);
	   
	    } 
	public static void main(String[] args){ 
	    Fenetre1 fef= new Fenetre1(); 
	    fef.setIconImage(new ImageIcon("images/manette.png").getImage());
	    
	    
	}
	      }   

	      
