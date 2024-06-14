package _01_double._2_test_scores;
import javax.swing.JOptionPane;
public class aslk {
	public static void main(String[] args) {

		while(true) {
			String meow =JOptionPane.showInputDialog("what was your most reecent test score");
			double meowI;
			try {
				meowI = Double.parseDouble(meow)/1.0;
			} catch(Exception e) {
				continue;
			}
			if (meowI<0) {
				JOptionPane.showMessageDialog(null, "you know the rule, 5 second head start");}
			if (meowI>=0 && meowI<=10) {
				JOptionPane.showMessageDialog(null, "you incomprehesibly stupendously massive failure");
			}
			if (meowI>10 && meowI<=20) {
				JOptionPane.showMessageDialog(null, "you incomprehensiby massive failure");
			}
			if (meowI>20 && meowI<=30) {
				JOptionPane.showMessageDialog(null, "you massive failure");
			}
			if (meowI>30 && meowI<=40) {
				JOptionPane.showMessageDialog(null, "you super big failure");
			}
			if (meowI>40 && meowI<=50) {
				JOptionPane.showMessageDialog(null, "you stupidfailure");
			}
			if (meowI>50 && meowI<=60) {
				JOptionPane.showMessageDialog(null, "you big failure");
			}
			if (meowI>60 && meowI<=70) {
				JOptionPane.showMessageDialog(null, "you large failure");
			}
			if (meowI>70 && meowI<80) {
				JOptionPane.showMessageDialog(null, "you above averageziszed  failure");
			}
			if (meowI>80 && meowI<=90) {
				JOptionPane.showMessageDialog(null, "you failure");
			}
			if (meowI>90 && meowI<=100) {

				JOptionPane.showMessageDialog(null, "you small failure");


			}
			if (meowI>100) {
				JOptionPane.showMessageDialog(null, "you minute failure");
			}
		}

	}
}