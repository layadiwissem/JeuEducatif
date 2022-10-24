

/**********************************La vue****************************/
/** ce fichier Interface (de niveau1) c'est la fentere  qui est visible à l'écran***/

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
import javax.swing.ImageIcon;

public class Interface {
	private JLabel pointsLabel , questionLabel,numQuestionLabel,namePlayerLabel;
	private JButton choix1,choix2;
	private JPanel panelPied;
	private JFrame quizFrame;

	public Interface() {
		
		quizFrame= new JFrame("Niveau 1 ");
		quizFrame.setBackground(Color.DARK_GRAY);
		quizFrame.setSize(656, 485);
		quizFrame.setLocationRelativeTo(null);
		quizFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		quizFrame.setIconImage(Toolkit.getDefaultToolkit().getImage("images/manette.png"));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
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
		choix1.setBounds(369, 178, 185, 52);
		panelChoix.add(choix1);
		choix1.setBackground(new Color(204, 255, 255));
		choix2= new JButton();
		choix2.setFont(new Font("Century Gothic", Font.BOLD, 30));
		choix2.setBounds(54, 178, 185, 52);
		panelChoix.add(choix2);
		choix2.setBackground(new Color(204, 255, 255));
		
		questionLabel = new JLabel();
		questionLabel.setBounds(130, 30, 332, 111);
		panelChoix.add(questionLabel);
		questionLabel.setBackground(new Color(255, 204, 255));
		questionLabel.setFont(new Font("Century Gothic", Font.PLAIN, 24));
		panel.add(panelQst, BorderLayout.CENTER);  
		
		JPanel panelEnTete = new JPanel();
		panelEnTete.setBackground(Color.WHITE);
		panelEnTete.setBounds(0, 0, 640, 72);
		panelQst.add(panelEnTete);
		panelEnTete.setLayout(null);
		
		numQuestionLabel= new JLabel();
		numQuestionLabel.setBackground(Color.WHITE);
		numQuestionLabel.setBounds(0, 0, 320, 72);
		panelEnTete.add(numQuestionLabel);
		numQuestionLabel.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		
		namePlayerLabel= new JLabel();
		namePlayerLabel.setBounds(439, 0, 156, 72);
		panelEnTete.add(namePlayerLabel);
		namePlayerLabel.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		
		panelPied = new JPanel();
		panelPied.setBackground(Color.WHITE);
		panelPied.setBounds(10, 374, 620, 72);
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

	public void setChoice1(JButton choice1) {
		this.choix1 = choice1;
	}

	public JButton getChoice2() {
		return choix2;
	}

	public void setChoice2(JButton choice2) {
		this.choix2 = choice2;
	}

	

	public String showNameJDialog() {
		return JOptionPane.showInputDialog(this.quizFrame,"Garcon ou Fille?");
		
	}
	
	
	
	
	
	
	
	public void showNamePlayer(String name) {
			this.namePlayerLabel.setText(name);
		switch( name) { 
		  case "fille":
			  this.namePlayerLabel.setIcon(new ImageIcon("images/downloadf (3).jpg"));
		    break;
		  case "Fille":
			  this.namePlayerLabel.setIcon(new ImageIcon("images/downloadf (3).jpg"));
		    break;
		  case "Garcon":
			  this.namePlayerLabel.setIcon(new ImageIcon("images/downloadv (3).jpg"));
		    break;
		  case "Garçon":
			  this.namePlayerLabel.setIcon(new ImageIcon("images/downloadv (3).jpg"));
		    break; 
		    case "garcon":
				  this.namePlayerLabel.setIcon(new ImageIcon("images/downloadv (3).jpg"));
				    break;
				 
		    case "garçon":
					  this.namePlayerLabel.setIcon(new ImageIcon("images/downloadv (3).jpg"));
				    break;
		    
		  default:
			  this.namePlayerLabel.setIcon(new ImageIcon("images/cat.jpg"));
		}
			
		}
	
	
	
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
	  
	}
	
	public void showCorrectAnswerJDialog(String player) {
		  JOptionPane.showMessageDialog(null, "Bonne réponse !", "Information", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("images/happy.png"));

		
	}
	
	public void showInCorrectAnswerJDialog(String player) {
		  JOptionPane.showMessageDialog(null, "Mauvaise réponse!", "Information", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("images/cry.png"));
		  
		
	}
	
	public int showPointsJDialog( int points) {
		  return JOptionPane.showConfirmDialog(null,"Vous avez gagné "+ points+" étoiles ! \n voulez-vous commencer niveau suivant ?", "Quiz",
		               JOptionPane.YES_NO_OPTION,
		               JOptionPane.QUESTION_MESSAGE);
		
	}}
   






            
	


	
	