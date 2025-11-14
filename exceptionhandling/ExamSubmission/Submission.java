package exceptionhandling.ExamSubmission;

public class Submission {
	static void submitExam(String fileName, int LocalDateTime, int submissionTime) throws LateSubmissionException,InvalidFileFormatException {
		 String extention=".pdf";
		 int check=0;
		 if(!fileName.contains(extention)) {
			 check=1;
		 }if(LocalDateTime>submissionTime) {
			 check=2;
		 }
		 switch(check) {
		 case 1:
			 throw new InvalidFileFormatException("Submission failed: invalid file format");
		 case 2:
			 throw new LateSubmissionException("Submission failed: Late Submission");
		default:
			System.out.println("The Submission is successfull");
		 }
		 
	}
}
