import java.util.Random;
import java.util.Scanner;

public class RockPapersScissors
{
	private static int choise;
	private static Random  random = new Random();
	private static int computerChoise;
	
	public static void main(String[] args)
	{
		System.out.println("Please Choose What You Show: ");
		System.out.println("1 - Rock\n2 - Paper\n3 - Scissors");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		choise = scanner.nextInt();
		
		computerChoise = random.nextInt(3)+1;
		/** we define a method youWin(int,int) which takes the values
		 * of player choise and computer choise and compares them to see who wins.
		 * If player wins youWin method returns true and the expression bellow if is executed.
		 * if no - this between {} after else.
		 */
		if(youWin(choise, computerChoise))
		{
			System.out.println("Congratulations you win!");
		}
		
		else if(choise==computerChoise)
		{
			System.out.println("You showed the same, no one wins! Good Luck Next Time!");
		}
		
		else
		{
			System.out.println("Computer wins! Good Luck Next Time!");
		}
	}
	/** 
	 * In this method we set the default to false. 
	 * We check if player wins an if so return true.
	 * If the choises are equal, we return false.
	 * @param playerChoise
	 * @param compterChoise
	 * @return
	 */
	public static boolean youWin(int playerChoise, int compterChoise)
	{
		boolean youWin=false;
		
		if((playerChoise==1&&compterChoise==3)||(playerChoise == 2&&compterChoise==1)||(playerChoise==3&&compterChoise==2))
		{
			youWin=true;
		}
		return youWin;
	}
}
