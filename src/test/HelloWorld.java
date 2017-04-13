package test;

import javax.swing.JOptionPane;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // TODO code application logic here

        String rad;

        float radius,area,circum;

       rad = JOptionPane.showInputDialog("Enter the Radius of circle:");

        radius = Integer.parseInt(rad);
        area = (float) (Math.PI*radius*radius);
        circum = (float) (2*Math.PI*radius);

        JOptionPane.showMessageDialog(null, "Area: " + area,"AREA",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "circumference: " + circum, "Circumfernce",JOptionPane.INFORMATION_MESSAGE);
	}

}
