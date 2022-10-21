import javax.swing.JOptionPane;
public class Paycheck 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		final double hourly_Rate = 12.80;
		double hours_worked = Double.parseDouble(JOptionPane.showInputDialog("How many hours did you work?"));
		
		
		if (hours_worked < 0)
		{
			System.out.println("You're fired.");
		}
		else if (hours_worked > 40)
		{
			double pay = (hourly_Rate * 40) + ((hours_worked - 40) * (hourly_Rate * 1.5));
			System.out.printf("Your pay is $%.2f", pay);
		}
		else
		{
			double pay = hourly_Rate * hours_worked;
			System.out.printf("Your pay is $%.2f", pay);
		}
		
	}

}
