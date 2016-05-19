package monday;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;

public class MinimalPointCalculation {

	private static class Point {
		private double xCord;
		private double yCord;
		private String name;

		public Point(double x, double y, String name) {
			xCord = x;
			yCord = y;
			this.name = name;
		}

		public double getxCord() {
			return xCord;
		}

		public double getyCord() {
			return yCord;
		}

		public String toString() {
			return name;
		}

	}

	private static class DistanceCalculator extends Thread {

		private List<Point> points;
		int indexFrom;
		int indexTo;
		Map<Point, Point> pointToPoint;

		public DistanceCalculator(List<Point> points, int indexFrom, int indexTo, Map<Point, Point> pointToPoint) {
			this.points = points;
			this.indexFrom = indexFrom;
			this.indexTo = indexTo;
			this.pointToPoint = pointToPoint;
		}

		public void run() {
			doCalculations(points, indexFrom, indexTo, pointToPoint);
		}
	}

	public static List<Point> generatePoints() {
		List<Point> points = new ArrayList<>(100_000);
		Random r = new Random();

		for (int i = 0; i < 20_000; i++) {
			double firstRand = (0 + (10_000 - 0) * r.nextDouble());
			double secondRand = 0 + (10_000 - 0) * r.nextDouble();
			points.add(new Point(firstRand, secondRand, "Point" + i));
		}

		return points;
	}

	public static Map<Point, Point> getNearestPoints(List<Point> points) {
		Map<Point, Point> pointToPoint = new HashMap<>();
		DistanceCalculator dc1 = new DistanceCalculator(points, 0, points.size() / 5, pointToPoint);
		DistanceCalculator dc2 = new DistanceCalculator(points, points.size() / 5, 2 * points.size() / 5, pointToPoint);
		DistanceCalculator dc3 = new DistanceCalculator(points, 2 * points.size() / 5, 3 * points.size() / 5,
				pointToPoint);
		DistanceCalculator dc4 = new DistanceCalculator(points, 3 * points.size() / 5, 4 * points.size() / 5,
				pointToPoint);
		DistanceCalculator dc5 = new DistanceCalculator(points, 4 * points.size() / 5, points.size(), pointToPoint);
		dc1.start();
		dc2.start();
		dc3.start();
		dc4.start();
		dc5.start();
		while (dc1.isAlive() || dc2.isAlive() || dc3.isAlive() || dc4.isAlive() || dc5.isAlive()) {

		}
		return pointToPoint;
	}

	private static void doCalculations(List<Point> points, int indexFrom, int indexTo, Map<Point, Point> pointToPoint) {
		for (int i = indexFrom; i < indexTo - 1; i++) {
			Point nearestPoint = points.get(0);
			double x = (points.get(i).getxCord() - points.get(0).getxCord());
			double y = (points.get(i).getyCord() - points.get(0).getyCord());
			double minDistance = Math.sqrt((x * x) + (y * y));
			for (Point secondPoint : points) {
				x = (points.get(i).getxCord() - secondPoint.getxCord());
				y = (points.get(i).getyCord() - secondPoint.getyCord());
				double newDistance = Math.sqrt((x * x) + (y * y));

				if (minDistance > newDistance && newDistance != 0) {
					minDistance = newDistance;
					nearestPoint = secondPoint;
				}
			}
			synchronized (pointToPoint) {
				pointToPoint.put(points.get(i), nearestPoint);
			}
		}
	}

	public static void main(String[] args) {

		long startingTime = System.currentTimeMillis();
		List<Point> points = generatePoints();
		long firstRelyPoint = System.currentTimeMillis() - startingTime;
		System.out.println("First took:" + firstRelyPoint + "ms");
		Map<Point, Point> pointToPoint = getNearestPoints(points);
		long secondRelyPoint = System.currentTimeMillis() - startingTime;
		System.out.println("Second took:" + secondRelyPoint + "ms");

		for (Entry<Point, Point> entry : pointToPoint.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

	}

}
