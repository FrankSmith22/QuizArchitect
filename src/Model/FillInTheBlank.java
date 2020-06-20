/**
 * File Name: FillInTheBlank.java
 * Short Description: Specific answer type for fill in the blank type quiz questions with text fields
 *
 * @author Frank Smith Version date: 5/28/20
 */
package Model;

import java.util.ArrayList;

public class FillInTheBlank implements Answer {

        private boolean autogradeable;
        private int charLimit;
        private ArrayList<String> possibleAnswers;
        private String submittedResponse;

        public FillInTheBlank(boolean autogradeable) {
                setAutogradeable(autogradeable);
                possibleAnswers = new ArrayList<String>();
        }

        public FillInTheBlank() {
                possibleAnswers = new ArrayList<String>();
        }

        public int getCharLimit() {
                return charLimit;
        }

        public void setCharLimit(int charLimit) {
                if (charLimit <= 0) {
                        System.out.println("Please enter a valid integer above 0");
                }
                this.charLimit = charLimit;
        }

        public ArrayList<String> getPossibleAnswers() {
                return possibleAnswers;
        }

        public void addPossibleAnswer(String answer) {
                if (answer == "" || answer == null) {
                        possibleAnswers.add("<No text given>");
                }
                possibleAnswers.add(answer);
        }

        public void removePossibleAnswer(int index) {
                possibleAnswers.remove(index);
        }

        public String toString() {
                String string = "\n<Fill In The Blank>\nChar Limit: " + charLimit;
                for (int i = 0; i < getPossibleAnswers().size(); i++) {
                        string += "\nAnswer " + i + ": " + this.getPossibleAnswers().get(i);
                }
                string += "\nsubmittedResponse: " + submittedResponse;
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
        public String getSubmittedResponse() {
                return submittedResponse;
        }

        @Override
        public void setSubmittedResponse(String response) {
                if (response == "" || response == null) {
                        this.submittedResponse = "<No text given>";
                }
                this.submittedResponse = response.toLowerCase();
        }
}