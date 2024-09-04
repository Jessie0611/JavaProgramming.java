import javax.swing.JOptionPane; 
public class CollegeAdmission{
   public static void main(String args[]){ 
        int testScore;
        int classRank;
        String testScoreString;
        String classRankString;


        testScoreString = JOptionPane.showInputDialog("Enter Student Test Score: ");
        testScore = Integer.parseInt(testScoreString);
        classRankString = JOptionPane.showInputDialog("Enter Class Rank: ");
        classRank = Integer.parseInt(classRankString);
System.out.println("Test Score:" + testScore);
System.out.println("Class Rank:" + classRank);

     if( testScore >= 90 )
     {
	if( classRank >= 25)
        {
     	   System.out.println("Accept");
        }
	else
	   System.out.println("Reject"); 
     }
     else 
     {
	if( testScore >= 80 )
	{
	   if( classRank >= 50 )
	      System.out.println("Accept");
	   else
	      System.out.println("Reject");
	}
	else
	{
           if( testScore >= 70 )
	   {
		if( classRank >=75 ) 
		   System.out.println("Accept");
		else
		   System.out.println("Reject");
	   }
	   else
		System.out.println("Reject");
        }
      }
   }
}
