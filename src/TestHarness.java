
import Model.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author BEAST
 */
public class TestHarness {

        public TestHarness() {

                //Question 1 with correct field inputs
//                Question question1 = new Question("What type of Java method is one that already exists, but with a different set of parameters?");
//                System.out.println(question1.getQuestionTitle());
//                System.out.println(question1.toString());
//                question1.setQuestionTitle("Which of these number data types exist in Java?");
//                System.out.println(question1.toString());
//
//                MultipleChoice mcAnswer = new MultipleChoice();
//                mcAnswer.addAnswerChoice("int");
//                mcAnswer.addCorrectChoice("int");
//                mcAnswer.addAnswerChoice("double");
//                mcAnswer.addCorrectChoice("double");
//                mcAnswer.addAnswerChoice("boolean");
//                mcAnswer.addAnswerChoice("String");
//                System.out.println(mcAnswer.toString());
//
//                question1.setAnswer(mcAnswer);
//                System.out.println("\n" + question1.toString());
//
//                // Question 2 with error inputs
//                Question question2 = new Question("");
//                System.out.println(question2.getQuestionTitle());
//                System.out.println(question2.toString());
//                question2.setAnswer(null);
//                
//                MultipleChoice mcAnswer2 = new MultipleChoice();
//                System.out.println(mcAnswer2.toString());
//                mcAnswer2.addAnswerChoice("");
//                mcAnswer2.addCorrectChoice("");
//                mcAnswer2.addAnswerChoice(null);
//                System.out.println(mcAnswer2.toString());

//                testClassHeirarchy();
                testInterface();
        }
        
        public void testClassHeirarchy(){
                ArrayList<MultipleChoice> answers = new ArrayList<MultipleChoice>();
                MultipleChoice mcAnswer = new MultipleChoice();
                MultiSelect msAnswer = new MultiSelect();
                TrueFalse tfAnswer = new TrueFalse();
                
                answers.add(mcAnswer);
                answers.add(msAnswer);
                answers.add(tfAnswer);
                
                for(int i=0; i < answers.size(); i++){
                        answers.get(i).addAnswerChoice("Apples");
                        answers.get(i).addAnswerChoice("Bananas");
                        answers.get(i).addAnswerChoice("Oranges");
                        answers.get(i).addAnswerChoice("Grapes");
                        answers.get(i).addCorrectChoice("Apples");
                        answers.get(i).addCorrectChoice("Bananas");
                }
                
                // To get a clear overview of each questions possible and correct answers
                for(int i=0; i < answers.size(); i++){
                        System.out.println(answers.get(i).toString());
                }
        }
        
        public void testInterface(){
                ArrayList<Answer> answers = new ArrayList<Answer>();
                
                FillInTheBlank answer1 = new FillInTheBlank();
                MultipleChoice answer2 = new MultipleChoice();
                ShortAnswer answer3 = new ShortAnswer(250, 20, 30);
                Slider answer4 = new Slider(25, 75, 60);
                
                answers.add(answer1);
                answers.add(answer2);
                answers.add(answer3);
                answers.add(answer4);
                
                answer2.addAnswerChoice("Hello World!");
                
                for(int i = 0; i < answers.size(); i++){
                        answers.get(i).setSubmittedResponse("Hello World!");
                        System.out.println(answers.get(i));
                }
        }
}