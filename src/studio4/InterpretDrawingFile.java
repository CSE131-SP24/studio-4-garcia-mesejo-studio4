package studio4;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		
		String shape = in.next();
		int Red = in.nextInt();
		int Green = in.nextInt();
		int Blue = in.nextInt();
		boolean jizzy = in.nextBoolean();
		double xaxis = in.nextDouble();
		double yaxis = in.nextDouble();
		double width = in.nextDouble();
		double height = in.nextDouble();
		Color color = new Color(Red, Green, Blue);
		StdDraw.setPenColor(color);
		//if(shape == "triangle") {
			double y2 = in.nextDouble();
			double y3 = in.nextDouble();
			double[] x = {xaxis, yaxis, width};
			double[] y = {height, y2, y3};
			if(jizzy == true) {
				StdDraw.filledPolygon(x, y);
			}
			else {
				StdDraw.polygon(x, y);
			}
			
			
		//}
		}
}
