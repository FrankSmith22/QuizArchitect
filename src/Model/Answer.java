/**
 * File Name: Answer.java
 * Short Description: Class that specific Answers will extend from to have more customizability
 * @author Frank Smith
 * Version date: 5/28/20
 */

package Model;

public interface Answer {
        public boolean isAutogradeable();

        public void setAutogradeable(boolean autogradeable);
        
        public void setSubmittedResponse(String response);
        
        public String getSubmittedResponse();
        
}
