/**
 * File Name: MultipleChoice.java
 * Short Description: Specific answer type that holds multiple options, with one correct choice
 * @author Frank Smith
 * Version date: 6/12/20
 */

package Model;

import java.util.ArrayList;

public class MultipleChoice implements Answer{
        private boolean autogradeable;
        private ArrayList<String> answerChoices;
        private ArrayList<String> correctAnswers;
        private String submittedResponse;

        public MultipleChoice(boolean autogradeable) {
                setAutogradeable(autogradeable);
                answerChoices = new ArrayList<String>();
                correctAnswers = new ArrayList<String>();
        }
        
        public MultipleChoice(){
                this(true);
        }

        public ArrayList<String> getAnswerChoices() {
                return answerChoices;
        }
        
        public ArrayList<String> getCorrectAnswers() {
                return correctAnswers;
        }
        
        public void addAnswerChoice(String answerChoice){
                if(answerChoice == "" || answerChoice == null){
                        this.answerChoices.add("<No text given>");
                        return;
                }
                this.answerChoices.add(answerChoice);
        }
        
        public void addCorrectChoice(String answerChoice){
                if(correctAnswers.size() == 1){
                        System.out.println("You cannot add more than 1 correct answer to a multiple choice; instead use a MultiSelect");
                        return;
                }
                if(answerChoice == "" || answerChoice == null){
                        this.correctAnswers.add("<No text given>");
                        return;
                }
                this.correctAnswers.add(answerChoice);
        }
        
        @Override
        public String toString(){
                String string = "\n<Multiple Choice Question>";
                for(int i = 0; i<getAnswerChoices().size(); i++){
                        string += "\nAnswer choice" + (i+1) + ": " + this.getAnswerChoices().get(i);
                }
                for(int i = 0; i<getCorrectAnswers().size(); i++){
                        string += "\nCorrect choice" + (i+1) + ": " + this.getCorrectAnswers().get(i);
                }
                string += "\nSubmitted Response: " + submittedResponse;               
                string += "\n===============================";
                return string;
        }

        @Override
        public boolean isAutogradeable() {
                return autogradeable;
        }

        @Override
        public void setAutogradeable(boolean autogradeable) {
                this.autogradeable = autogradeable;
        }

        @Override
        public void setSubmittedResponse(String response) {
                if (response == "" || response == null) {
                        System.out.println("This should not be possible; invalid response provided, please try again");
                        return;
                }
                for(int i=0; i < answerChoices.size(); i++){
                        if(answerChoices.get(i) == response){
                                // An answer choice was selected
                                this.submittedResponse = response;
                                return;
                        }
                }
                System.out.println("This response is not one of the provided answer choices");
        }

        @Override
        public String getSubmittedResponse() {
                return submittedResponse;
        }
}
