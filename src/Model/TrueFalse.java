/**
 * File Name: TrueFalse.java
 * Short Description: Specific answer type that holds two options: True, or false
 * @author Frank Smith
 * Version date: 6/12/20
 */

package Model;

public class TrueFalse extends MultipleChoice{
        public TrueFalse(){
                super(true);
                addAnswerChoice("True");
                addAnswerChoice("False");
        }
        
        @Override
        public void addAnswerChoice(String answer){
                System.out.println("This method cannot be used directly, only addCorrectChoice");
                return;
        }
        
        @Override
        public void addCorrectChoice(String answerChoice){
                if(getCorrectAnswers().size() == 1){
                        System.out.println("The question can only be true or false");
                        return;
                }
                Boolean trueFalse = Boolean.valueOf(answerChoice);
                if(trueFalse){
                        getCorrectAnswers().add("True");
                }
                else{
                        //Any string other than "true" is considered false
                        getCorrectAnswers().add("False");
                }
        }
        
        @Override
        public String toString(){
                String string = "<True False Question>\n";
                for(int i = 0; i<getAnswerChoices().size(); i++){
                        string += "\nAnswer choice" + (i+1) + ": " + this.getAnswerChoices().get(i);
                }
                for(int i = 0; i<getCorrectAnswers().size(); i++){
                        string += "\nCorrect choice" + (i+1) + ": " + this.getCorrectAnswers().get(i);
                }
                string += "\n===============================";
                return string;
        }
}
