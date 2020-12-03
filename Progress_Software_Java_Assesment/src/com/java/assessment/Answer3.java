package com.java.assessment;

import java.util.Scanner;

public class Answer3 {

	public static void main(String args[])

	{

		Scanner sc = new Scanner(System.in);

		int v1, v2, r1, r2, n;

		double x1, y1, x2, y2;

		v1 = sc.nextInt();

		r1 = sc.nextInt();

		v2 = sc.nextInt();

		r2 = sc.nextInt();

		n = sc.nextInt();

		int t1 = (v1 * n);

		int t2 = (v2 * n);

		if (t1 > 90 && t1 < 180)

			t1 = 180 - t1;

		else if (t1 > 180 && t1 < 270)

			t1 = 270 - t1;

		else if (t1 > 270 && t1 < 360)

			t1 = 360 - t1;

		if (t2 > 90 && t2 < 180)

			t2 = 180 - t2;

		else if (t2 > 180 && t2 < 270)

			t2 = 270 - t2;

		else if (t2 > 270 && t2 < 360)

			t2 = 360 - t2;

		double p1 = Math.toRadians((double) t1);

		double p2 = Math.toRadians((double) t2);

		x1 = r1 * (Math.cos(p1));

		y1 = r1 * (Math.sin(p1));

		x2 = r2 * (Math.cos(p2));

		y2 = r2 * (Math.sin(p2));

		double res = Math.sqrt((Math.pow((x2 - x1), 2)) + (Math.pow((y2 - y1), 2)));

		System.out.print(String.format("%.2f", res));
		sc.close();

	}
}
