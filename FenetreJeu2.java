

/**************************************************MODELE************************************************/
/** contient les données de l'application **/

/**c'est  le MODELE qui regroupe  l'ensemble des questions et des réponses associées au niveau 2( interface2) **/

package Jeu_educatif;

import java.util.ArrayList;

import javax.swing.JLabel;

		public class FenetreJeu2  {
			 private String player;
			 private int points;
			 private ArrayList<Question> quiz;
			 private int numQuestion;
			
			 public FenetreJeu2() {
				
				this.quiz=initQsts();
				this.numQuestion=1;
				this.points=0;
			} 
			public int getNumQuestion() {
				return numQuestion;
			}
			public void setNumQuestion(int numQuestion) {
				this.numQuestion = numQuestion;
			}
			public ArrayList<Question> getQuestions() {
				return quiz;
			}
			public void setQuestions(ArrayList<Question> questions) {
				this.quiz = questions;
			}

			public String getUser() {
				return player;
			}

			public int getPoints() {
				return points;
			}
			public void setPoints(int points) {
				this.points = points;
			}
			public void setUser(String user) {
				this.player = user;
			}

			public ArrayList<Question> initQsts() {
				String statement,answer;
				String [] choices;
				Question q;
				ArrayList<Question> quiz=new ArrayList<Question>();
				
				statement=" 1*3 ?";
				choices =new String []{"1", "3", "2","5"};
				answer="3";
				q=new Question(statement,choices,answer);
				quiz.add(q);
				
				statement="2*3 ?";
				choices =new String [] {"3","4", "6", "1"};
				answer="6";
				q=new Question(statement,choices,answer);
				quiz.add(q);
				
				statement="6*2 ?";
				choices =new String [] {"15", "12", "5", "6"};
				answer="12";
				q=new Question(statement,choices,answer);
				quiz.add(q);
				
				statement="4*6 ?";
				choices =new String [] {"24", "15", "25","19"};
				answer="24";
				q=new Question(statement,choices,answer);
				quiz.add(q);
				
				statement="20/5?";
				choices =new String [] {"12", "4","32","21"};
				answer="4";
				q=new Question(statement,choices,answer);
				quiz.add(q);
				statement="7*5 ?";
				choices =new String [] {"35", "19", "11", "6"};
				answer="35";
				q=new Question(statement,choices,answer);
				quiz.add(q);
				
				statement="64/8 ?";
				choices =new String [] {"12", "16", "4","8"};
				answer="8";
				q=new Question(statement,choices,answer);
				quiz.add(q);
				
				statement="9*5 ?";
				choices =new String [] {"12", "27","45","21"};
				answer="45";
				q=new Question(statement,choices,answer);
				quiz.add(q);
				
				statement="32/2 ?";
				choices =new String [] {"3", "8", "16","30"};
				answer="16";
				q=new Question(statement,choices,answer);
				quiz.add(q);
				
				statement="48/2 ?";
				choices =new String [] {"22", "24","46","20"};
				answer="24";
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
				return false;
			
			}
			   
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
					return false;
			}
		}

