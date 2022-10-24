




/**************************************************MODELE************************************************/
/** contient les données de l'application c'est  le MODELE
   qui regroupe  l'ensemble des questions et des réponses associées au niveau interface 1 **/

package Jeu_educatif;
import java.util.ArrayList;
public class FenetreJeu  {
	
	 private String player;
	 private ArrayList<Question> quiz;
	 private int numQuestion;
	 private int points;
	
	 public FenetreJeu(String player) {
		
		this.player = player;
		this.quiz=initQsts();
		this.numQuestion=1;
		this.points=0;
	}
	

	public ArrayList<Question> getQuestions() {
		return quiz;
	}
	public void setQuestions(ArrayList<Question> questions) {
		this.quiz = questions;
	}

	public int getNumQuestion() {
		return numQuestion;
	}

	public void setNumQuestion(int numQuestion) {
		this.numQuestion = numQuestion;
	}
	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public String getUser() {
		return player;
	}

	public void setUser(String user) {
		this.player = user;
	}

	public ArrayList<Question> initQsts() {
		String statement,answer;
		String [] choices;
		Question q;
		ArrayList<Question> quiz=new ArrayList<Question>();
		
		statement=" 4+1 ?";
		choices =new String []{"4","5"};
		answer="5";
		q=new Question(statement,choices,answer);
		quiz.add(q);
		
		statement="2+4 ?";
		choices =new String [] { "6" ,"4"};
		answer="6";
		q=new Question(statement,choices,answer);
		quiz.add(q);
		
		statement="10-5 ?";
		choices =new String [] {"15","5"};
		answer="5";
		q=new Question(statement,choices,answer);
		quiz.add(q);
		
		statement="17-2 ?";
		choices =new String [] {"15","19"};
		answer="15";
		q=new Question(statement,choices,answer);
		quiz.add(q);
		
		statement="20+32 ?";
		choices =new String [] {"23", "52"};
		answer="52";
		q=new Question(statement,choices,answer);
		quiz.add(q);
		statement="26-15 ?";
		choices =new String [] { "11","6"};
		answer="11";
		q=new Question(statement,choices,answer);
		quiz.add(q);
		
		statement="56-6 ?";
		choices =new String [] {"5", "50"};
		answer="50";
		q=new Question(statement,choices,answer);
		quiz.add(q);
		
		statement="60-36 ?";
		choices =new String [] {"34", "24"};
		answer="24";
		q=new Question(statement,choices,answer);
		quiz.add(q);
		
		statement="80-12 ?";
		choices =new String [] {"68", "92"};
		answer="68";
		q=new Question(statement,choices,answer);
		quiz.add(q);
		
		statement="99-9 ?";
		choices =new String [] {"09","90"};
		answer="90";
		q=new Question(statement,choices,answer);
		quiz.add(q);
		return quiz;
	}
	 
	
	public String getQstStatement(int numQuestion ) {
		return this.getQuestions().get(numQuestion-1).getStatement();
		
	}
	
	public String[] getQstChoices(int numQuestion ) {
		return this.getQuestions().get(numQuestion-1).getChoices();
		
	}
	
	public boolean isCorrect(String answer, int numQuestion ) {
		if(answer.equals(this.getQuestions().get(numQuestion-1).getAnswer()))
			
			  {addPoints();
			    return true;
			  }
		return false;}
	
	public int incrementNumQuestion() {
		 this.numQuestion++;
		 return numQuestion;
	}
	public void addPoints() {
		this.points+=2;
	}
	public boolean isFinish(int numQuestion) {
		if(numQuestion-1>=this.getQuestions().size())
			return true;
		else
			return false;}
	}