import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class ClassExcerciseThreePointFour {

	public static void main(String[] args) {

		//Variables
		String numberOfPeople, numberOfPlayers;
		int numberOfPeopleToInt, groupSize, numberOfPlayersToInt;
		int teamSize = -1;
		boolean twoPointOne = true;
		boolean twoPointTwo = false;
		String groupSizeString = "";

		//JFrame Properties
		JFrame jf = new JFrame();
		jf.setLocationRelativeTo(null);
		jf.setTitle("Assignment 2");
		jf.toFront();
		jf.setAlwaysOnTop(true);

		//Input
		numberOfPeople = JOptionPane.showInputDialog(jf,
			"Specify how many people there are:\n\n");
		numberOfPeopleToInt = Integer.parseInt(numberOfPeople);

		numberOfPlayers = JOptionPane.showInputDialog(jf,
			"Specify how many players there are:\n\n");
		numberOfPlayersToInt = Integer.parseInt(numberOfPlayers);

		//Calculations: 2.1
		if (twoPointOne)
		{
			if (numberOfPeopleToInt > 10)
			{
				groupSize = numberOfPeopleToInt/2;
				twoPointOne = false;
				twoPointTwo = true;
				groupSizeString = Integer.toString(groupSize);
			}

			else if ((numberOfPeopleToInt >= 3) && (numberOfPeopleToInt <= 10))
			{
				groupSize = numberOfPeopleToInt/3;
				twoPointOne = false;
				twoPointTwo = true;
				groupSizeString = Integer.toString(groupSize);
			}

			else
			{
				groupSize = 0;
				twoPointOne = false;
				twoPointTwo = true;
				groupSizeString = ("The number of people has to be at least 3.");
			}

		}

		//calculations: 2.2
		if (twoPointTwo)
		{
			if ((numberOfPlayersToInt >= 11) && (numberOfPlayersToInt <= 55))
			{
				teamSize = numberOfPlayersToInt / 11;
			}

			else
			{
				teamSize = 1;
			}
		}

		//Output
		JOptionPane.showMessageDialog(jf,
			"Number of People:\n\n" + numberOfPeople +
			"\n\nGroup Size:\n\n" + groupSizeString +
			"\n\nNumber of Players:\n\n" + numberOfPlayers +
			"\n\nTeam Size:\n\n" + teamSize);
	}
}
