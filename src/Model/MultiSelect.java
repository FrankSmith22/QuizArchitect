/**
 * File Name: MultiSelect.java
 * Short Description: Specific answer type that holds multiple options, with the option of multiple selections
 * @author Frank Smith
 * Version date: 6/12/20
 */

package Model;

public class MultiSelect extends MultipleChoice{
        public MultiSelect(){
                super(true);
        }
        
        @Override
        public void addCorrectChoice(String answerChoice){
                if(getCorrectAnswers().size() == getAnswerChoices().size()){
                        System.out.println("You cannot add more correct answers than possible answers");
                        return;
                }
                if(answerChoice == "" || answerChoice == null){
                        this.getCorrectAnswers().add("<No text given>");
                        return;
                }
                getCorrectAnswers().add(answerChoice);
        }
        
        @Override
        public String toString(){
                String string = "<Multi Select Question>\n";
                for(int i = 0; i<getAnswerChoices().size(); i++){
                        string += "\nAnswer choice" + (i+1) + ": " + this.getAnswerChoices().get(i);
                }
                for(int i = 0; i<getCorrectAnswers().size(); i++){
                        string += "\nCorrect choice" + (i+1) + ": " + this.getCorrectAnswers().get(i);
                }
                string += "\nsubmittedResponse: " + getSubmittedResponse();
                string += "\n===============================";
                return string;
        }
}