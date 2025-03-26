package Algorithms;

public class GradientDescent {
	
	public static void main(String[] args) {
		double learningRate = 0.1;
		double x = 5;
		double tolerance = 0.0001;
		int maxIterations = 1000;
		int iteration = 0;
		
	while (iteration < maxIterations) {
		double gradient = 2*x;
		double newX = x - learningRate * gradient;
		if(Math.abs(newX - x) < tolerance) {
			break;
		}
		x = newX;
		iteration++;
	}
		
	}
	

}
