
/**************************************Controleur********************************/
/*******************************************************************************/
/** on a creer ce fichier relation 2 pour relier entre Interafce 2 et fenetre jeu2 ( niveau 2) **/
/** quand l'enfant clique sur "oui" pour commencer le niveau suivant alors on va appeler la classe "Relation2" pour le niveau 2 **/
package Jeu_educatif;
public class Relation2 {
	
	private FenetreJeu2 model;
	private Interface2 view;
	
	
	public Relation2() {
     this.view=new Interface2();
     this.model=new FenetreJeu2();
     this.updateQuestionView ();
     this.addListener();
     
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
		this.view.getChoice3().addActionListener(e -> test(e.getActionCommand()));
		this.view.getChoice4().addActionListener(e -> test(e.getActionCommand()));
		
		
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

