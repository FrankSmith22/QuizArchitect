/**
 * File Name: ShortAnswer.java
 * Short Description: Specific answer type for short answers with text areas
 * @author Frank Smith
 * Version date: 5/28/20
 */

package Model;

public class ShortAnswer implements Answer{
        private boolean autogradeable;
        private int charLimit;
        private int cols;
        private int rows;
        private String submittedResponse;

        public ShortAnswer(int charLimit, int cols, int rows, boolean autogradeable) {
                setAutogradeable(autogradeable);
                if(charLimit < 1){
                        System.out.println("Invalid character limit, defaulting to 250");
                        this.charLimit = 250;
                }else{this.charLimit = charLimit;}
                
                if(cols < 1){
                        System.out.println("Invalid column number, defaulting to 20");
                        this.cols = 20;
                }else{this.cols = cols;}
                
                if(rows < 1){
                        System.out.println("Invalid row number, defaulting to 20");
                        this.rows = 20;
                }else{this.rows = rows;}
        }
        
        //This constructor is the more likely scenario
        public ShortAnswer(int charLimit, int cols, int rows) {
                this(charLimit, cols, rows, false);
        }

        public int getCharLimit() {
                return charLimit;
        }

        public void setCharLimit(int charLimit) {
                if(charLimit < 1){
                        System.out.println("Invalid character limit, defaulting to 250");
                        this.charLimit = 250;
                }else{
                        this.charLimit = charLimit;
                }
        }

        public int getCols() {
                return cols;
        }

        public void setCols(int cols) {
                if(cols < 1){
                        System.out.println("Invalid column number, defaulting to 20");
                        this.cols = 20;
                }else{
                        this.cols = cols;
                }
        }

        public int getRows() {
                return rows;
        }

        public void setRows(int rows) {
                if(rows < 1){
                        System.out.println("Invalid row number, defaulting to 20");
                        this.rows = 20;
                }else{
                        this.rows = rows;
                }
        }
        
        @Override
        public String toString(){
                String string = "\n<Short Answer>\ncharLimit: " + charLimit + "\ncols: " + cols + "\nrows: " + rows;
                string += "\nsubmittedResponse: " + getSubmittedResponse();
                string += "\n===============================";
                return string;
        }

        @Override
        public String getSubmittedResponse() {
                return submittedResponse;
        }

        @Override
        public void setSubmittedResponse(String submittedResponse) {
                if (submittedResponse == "" || submittedResponse == null) {
                        this.submittedResponse = "<No text given>";
                }
                // Since short answers vary, no need to lower case the submitted response
                this.submittedResponse = submittedResponse;
        }

        @Override
        public boolean isAutogradeable() {
                return autogradeable;
        }

        @Override
        public void setAutogradeable(boolean autogradeable) {
                this.autogradeable = autogradeable;
        }
}
