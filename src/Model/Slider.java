/**
 * File Name: Slider.java
 * Short Description: Specific answer type that is a slideable range of values
 * @author Frank Smith
 * Version date: 5/28/20
 */

package Model;

public class Slider implements Answer{
        private boolean autogradeable;
        private int submittedResponse;
        private int min;
        private int max;
        private int answerValue;

        public Slider(int min, int max, int answerValue, boolean autogradeable) {
                setAutogradeable(autogradeable);
                if(min >= max){
                        System.out.println("Invalid range, defaulting min to 0 and max to 100");
                        this.min = 0;
                        this.max = 100;
                }
                else{
                        this.min = min;
                        this.max = max;
                }
                
                if(answerValue < min || answerValue > max){
                        System.out.println("Please enter a valid answer value within the range");
                }
                else{
                        this.answerValue = answerValue;
                }
        }
        
        public Slider(int min, int max, int answerValue) {
                this(min, max, answerValue, true);
        }

        public int getMin() {
                return min;
        }

        public void setMin(int min) {
                if(min >= max){
                        System.out.println("Please enter a valid min");
                        return;
                }
                this.min = min;
        }

        public int getMax() {
                return max;
        }

        public void setMax(int max) {
                if(max <= min){
                        System.out.println("Please enter a valid max");
                        return;
                }
                this.max = max;
        }

        public int getAnswerValue() {
                return answerValue;
        }

        public void setAnswerValue(int answerValue) {
                this.answerValue = answerValue;
        }
        
        @Override
        public String toString(){
                String string = "<Slider>\nMax: " + max + "\nMin: " + min + "\nAnswer Value: " + answerValue + "\nSubmitted Response: " + submittedResponse;
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
                int responseInt;
                try{
                        responseInt = Integer.parseInt(response);
                }
                catch(NumberFormatException nfe){
                        System.out.println("The response was not a number somehow, please try again");
                        return;
                }
                if(responseInt > max || responseInt < min){
                        System.out.println("Response is out of bounds somehow, please try again");
                        return;
                }
                submittedResponse = responseInt;
        }

        @Override
        public String getSubmittedResponse() {
                //Since the interface requires a return type of String, int submittedResponse must be casted to String
                return String.valueOf(submittedResponse);
        }
}
