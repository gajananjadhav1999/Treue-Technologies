import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

	public class Vote 
	{
	    static int age;
	    static String Name;
	    static String Party;
	    static Map<Integer, Integer> candidateVotes = new HashMap<>();

	    public static void First() 
	    {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("=================================");
	        System.out.println("!!!....ONLINE VOTING BOOTH....!!!");
	        System.out.println("=================================");
	        System.out.println();
	        System.out.println("=================================");
	        System.out.println("<<<<<----ENTER YOUR NAME---->>>>>");
	        Name = sc.nextLine();
	        System.out.println("<<<<<----ENTER YOUR AGE---->>>>>");
	        if (sc.nextInt() > 18)
	        {
	            System.out.println("<<<--YOU ARE ELIGIBLE TO VOTE-->>>");
	        } else 
	        {
	            System.out.println("YOU ARE NOT ELIGIBLE FOR VOTING ");
	        }
	        System.out.println();
	        System.out.println("====================================");
	        System.out.println("||  FOLLOWING ARE THE CANDIDATES  ||");
	        System.out.println("====================================");
	        System.out.println(" 1 --> Candidate (1) ");
	        System.out.println(" 2 --> Candidate (2) ");
	        System.out.println(" 3 --> Candidate (3) ");
	        int candidateChoice = sc.nextInt();
	       
	        candidateVotes.put(candidateChoice, candidateVotes.getOrDefault(candidateChoice, 0) + 1);
	        
	        System.out.println("Your Vote is been Counted ");
	        System.out.println();
	        System.out.println("** THANK YOU FOR VOTING "+Name+ " **");
	    }

	    public static void displayVoteCounts()
	    {
	        System.out.println("====================================");
	        System.out.println("   CANDIDATE     |     VOTE COUNT  ");
	        System.out.println("====================================");
	        for (Map.Entry<Integer, Integer> entry : candidateVotes.entrySet())
	        {
	            System.out.printf("   Candidate (%d)   |       %d%n", entry.getKey(), entry.getValue());
	        }
	        System.out.println("====================================");
	    }

	    public static void main(String[] args)
	    {
	        First();
	        displayVoteCounts();
	    }
	}



