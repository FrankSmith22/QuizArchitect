/**
 * File Name: Question.java
 * Short Description: Class responsible for holding data about an individual question
 * @author Frank Smith
 * Version date: 5/28/20
 */

package Model;

public class Question {
        private String questionTitle;
        private Answer answer;

        public Question(String questionTitle) {
                this.questionTitle = questionTitle;
                this.answer = null;
        }

        public String getQuestionTitle() {
                return questionTitle;
        }

        public void setQuestionTitle(String questionTitle) {
                if(questionTitle == "" || questionTitle == null){
                        this.questionTitle = "<No text given>";
                }
                this.questionTitle = questionTitle;
        }
        
        public Answer getAnswer(){
                return answer;
        }
        
        public void setAnswer(Answer answer){
                if(answer == null){
                        System.out.println("Incorrect answer type, please try again with a valid answer object");
                        return;
                }
                this.answer = answer;
        }
        
        
        public void removeAnswer(){
                answer = null;
        }
        
        @Override
        public String toString(){
                if(answer != null){
                        return "Question title: " + this.getQuestionTitle() + ". Answer: " + answer.toString();
                }
                return "Question title: " + getQuestionTitle();
        }
}
