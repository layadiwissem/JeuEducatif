
/**************************************Controleur********************************/
/*****************Le controluer entre la vu (interface ) et le modele ( fenetreJeu) **************************/
package Jeu_educatif;

import Jeu_educatif.Relation;
public class Relation {
	
	private FenetreJeu model;
	private Interface view;
	
	
	public Relation() {
     this.view=new Interface();
     this.model=new FenetreJeu(view.showNameJDialog());
     this.updateNamePlayer(this.model.getUser());
     this.updateQuestionView ();
     this.addListener();
     
    }
	
	
	public void updateNamePlayer (String name){
		this.view.showNamePlayer(name);
		
	}
	
	public void updateNumQst (int num){
		this.view.showNumQst(num);
		
	}
	public void updatePoints (int num){
		this.view.showPoints(num);
		
	}
	public void updateQst (String statement,String[] choices){
		this.view.showQuestion(statement,choices);
		
	}
	public void updateQuestionView () {
		this.updateNumQst(this.model.getNumQuestion());
		this.updatePoints(this.model.getPoints());
		this.updateQst(this.model.getQstStatement(this.model.getNumQuestion()),this.model.getQstChoices(this.model.getNumQuestion()));
		 
	 }
	
	public void addListener() {
		this.view.getChoice1().addActionListener(e -> test(e.getActionCommand()));
		this.view.getChoice2().addActionListener(e -> test(e.getActionCommand()));
		
		
	}
	
	public void test(String choice) {
		if(this.model.isCorrect(choice, this.model.getNumQuestion()))
			this.view.showCorrectAnswerJDialog(this.model.getUser());
			else
				this.view.showInCorrectAnswerJDialog(this.model.getUser());
		String player = null;
		if(!this.model.isFinish(this.model.incrementNumQuestion()))
			 
			this.updateQuestionView();
		else
			if(this.view.showPointsJDialog(this.model.getPoints())==0)
				new Relation2();
			else
				System.exit(0);
				
		
		
		
	}
}

