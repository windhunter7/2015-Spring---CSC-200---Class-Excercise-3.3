import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame jf = new JFrame();
		jf.setLocationRelativeTo(null);
		jf.setTitle("Simple Calculator");
		jf.toFront();
		jf.setAlwaysOnTop(true);
		
		String widthInput = JOptionPane.showInputDialog(jf,
				"Enter the width of the rectangle:\n");
		double width = Double.parseDouble(widthInput);

		String heightInput = JOptionPane.showInputDialog(jf,
				"Enter the height of the rectangle:\n");
		double height = Double.parseDouble(heightInput);

		JOptionPane.showMessageDialog(jf,
				"The perimeter of the rectangle is:\n\n" + ((width*2)+(height*2)) +
				"\n\nThe area of the rectangle is:\n\n" + (width*height));

		System.exit(0);

	}

}
