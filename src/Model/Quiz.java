/**
 * File Name: Quiz.java
 * Short Description: Class responsible for holding list of questions
 * @author Frank Smith
 * Version date: 5/28/20
 */

package Model;

import java.util.ArrayList;

public class Quiz {
        private String quizTitle;
        private ArrayList<Question> questions;

        public Quiz(String quizTitle) {
                if(quizTitle == "" || quizTitle == null){
                        this.quizTitle = "<No text given>";
                }
                else{
                        this.quizTitle = quizTitle;
                }
                this.questions = new ArrayList<Question>();
        }

        public String getQuizTitle() {
                return quizTitle;
        }

        public void setQuizTitle(String quizTitle) {
                if(quizTitle == "" || quizTitle == null){
                        this.quizTitle = "<No text given>";
                        return;
                }
                this.quizTitle = quizTitle;
        }

        public ArrayList<Question> getQuestions() {
                return questions;
        }        
        
        public void addQuestion(Question question){
                if(question == null){
                        System.out.println("Please provide a valid question");
                        return;
                }
                this.questions.add(question);
        }
        
        public void removeQuestion(int index){
                if(index < 0 || index > questions.size()){
                        System.out.println("Please provide a valid range");
                        return;
                }
                this.questions.remove(index);
        }
        
        @Override
        public String toString(){
                String string = "Quiz title: " + getQuizTitle();
                if(questions.size() != 0){
                        for(int i=0; i < questions.size(); i++){
                                string += "\nQuestion " + i+1 + ": " + questions.get(i).getQuestionTitle();
                        }
                }
                return string;
        }
}
