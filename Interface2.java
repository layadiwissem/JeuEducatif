
/**********************************La vue****************************/
/** ce fichier interface2(de niveau2) c'est la fentere  qui est visible à l'écran***/

package Jeu_educatif;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.ImageIcon;

public class Interface2 {
	private JLabel pointsLabel , questionLabel,numQuestionLabel,namePlayerLabel;
	private JButton choix1,choix2, choix3,choix4;
	private JFrame quizFrame;
	
	public Interface2() {
		
		quizFrame= new JFrame("Niveau 2");
		quizFrame.setResizable(false);
		quizFrame.setBackground(Color.DARK_GRAY);
		quizFrame.setSize(656, 485);
		quizFrame.setLocationRelativeTo(null);
		quizFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		quizFrame.setIconImage(Toolkit.getDefaultToolkit().getImage("images/manette.png"));
		
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		Font police =new Font("Tahoma",Font.BOLD, 10);
		
		JPanel panelQst = new JPanel();
		panelQst.setBackground(Color.WHITE);
		police =new Font("Tahoma",Font.BOLD, 14);
		panelQst.setLayout(null);
		
		JPanel panelChoix = new JPanel();
		panelChoix.setBackground(Color.WHITE);
		panelChoix.setBounds(10, 83, 620, 289);
		
		panelQst.add(panelChoix);    
		panelChoix.setLayout(null);
		
		
		choix1= new JButton();
		choix1.setFont(new Font("Century Gothic", Font.BOLD, 30));
		choix1.setBounds(10, 0, 151, 83);
		panelChoix.add(choix1);
		choix1.setBackground(new Color(204, 255, 255));
		choix4= new JButton();
		choix4.setFont(new Font("Century Gothic", Font.BOLD, 30));
		choix4.setBounds(459, 193, 149, 83);
		panelChoix.add(choix4);
		choix4.setBackground(new Color(204, 255, 255));
		choix3= new JButton();
		choix3.setFont(new Font("Century Gothic", Font.BOLD, 30));
		choix3.setBounds(459, 0, 149, 83);
		panelChoix.add(choix3);
		choix3.setBackground(new Color(204, 255, 255));
		choix2= new JButton();
		choix2.setFont(new Font("Century Gothic", Font.BOLD, 30));
		choix2.setBounds(10, 193, 149, 83);
		panelChoix.add(choix2);
		choix2.setBackground(new Color(204, 255, 255));
		
		questionLabel = new JLabel();
		questionLabel.setBounds(139, 94, 322, 111);
		panelChoix.add(questionLabel);
		questionLabel.setBackground(new Color(255, 204, 255));
		questionLabel.setFont(new Font("Century Gothic", Font.PLAIN, 24));
		panel.add(panelQst, BorderLayout.CENTER);  
		
		JPanel panelEnTete = new JPanel();
		panelEnTete.setBackground(Color.WHITE);
		panelEnTete.setBounds(0, 0, 640, 72);
		panelQst.add(panelEnTete);
		panelEnTete.setLayout(new GridLayout(1,3));
		
		numQuestionLabel= new JLabel();
		panelEnTete.add(numQuestionLabel);
		numQuestionLabel.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		
		namePlayerLabel= new JLabel();
		panelEnTete.add(namePlayerLabel);
		namePlayerLabel.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		
		JPanel panelPied = new JPanel();
		panelPied.setBackground(Color.WHITE);
		panelPied.setBounds(20, 383, 610, 63);
		panelQst.add(panelPied);
		
		pointsLabel= new JLabel();
		panelPied.add(pointsLabel);
		pointsLabel.setBackground(Color.WHITE);
		pointsLabel.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		pointsLabel.setOpaque(true);
		quizFrame.getContentPane().add(panel);
		quizFrame.setVisible(true);
	}
	
	public JButton getChoice1() {
		return choix1;
	}

	public void setChoice4(JButton choice4) {
		this.choix4 = choice4;
	}
	public void setChoice1(JButton choice1) {
		this.choix1 = choice1;
	}
	public void setChoice2(JButton choice2) {
		this.choix2 = choice2;
	}

	public JButton getChoice3() {
		return choix3;
	}
	public JButton getChoice2() {
		return choix2;
	}

	public void setChoice3(JButton choice3) {
		this.choix3 = choice3;
	}

	public JButton getChoice4() {
		return choix4;}
	public void showNumQst(int num) {
		this.numQuestionLabel.setText("Question n°"+num);
		this.numQuestionLabel.setIcon(new ImageIcon("images/IconQuestion.png"));
		this.numQuestionLabel.setHorizontalAlignment(JLabel.CENTER);
		
	}
	
	public void showPoints(int num) {
		this.pointsLabel.setText(num+"  Etoiles");
		this.pointsLabel.setIcon(new ImageIcon("images/etoile.jpg"));
		this.pointsLabel.setHorizontalAlignment(JLabel.RIGHT);
		
	}
	
	public void showQuestion(String statement,String[] choices) {
		
		this.questionLabel.setText(statement);
		this.questionLabel.setIcon(new ImageIcon("images/question.jpg"));
	    this.questionLabel.setHorizontalAlignment(JLabel.CENTER);
	
	    choix1.setText(choices[0]);
	    choix2.setText(choices[1]);
	    choix3.setText(choices[2]);
	    choix4.setText(choices[3]);
	  
	}
	
	public void showCorrectAnswerJDialog(String player) {
		  JOptionPane.showMessageDialog(null, "Bonne réponse !", "information", 
				  JOptionPane.INFORMATION_MESSAGE, new ImageIcon("images/happy.png"));

		
	}
	
	public void showInCorrectAnswerJDialog(String player) {
		  JOptionPane.showMessageDialog(null, "Mauvaise réponse!", "information", 
				  JOptionPane.INFORMATION_MESSAGE, new ImageIcon("images/cry.png"));
		  
		
	}
	
	public int showPointsJDialog( int points) {
		  return JOptionPane.showConfirmDialog(null,"Bravo ! Vous avez gngné "+ points+
				  " vous voulez rejouer ce niveau ?? \n ?", "Quiz",
		               JOptionPane.YES_NO_OPTION,
		               JOptionPane.QUESTION_MESSAGE);
		
	}
}
