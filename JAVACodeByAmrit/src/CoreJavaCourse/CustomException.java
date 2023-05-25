package CoreJavaCourse;

public class CustomException {
  
	public static void validForAge(int age) throws VotingException {
		 if(age<14) {
			 System.out.println("not eligible for voting");
		 }
		 else {
			 System.out.println("your are eligible for voting");
		 }
	}
	public static void main(String[] args) throws VotingException {
		 try {
			validForAge(13);
		} catch (Exception e) {
			e.printStackTrace();
		}
		 finally {
			System.out.println("thansk for come to vote");
		}
	}
}
