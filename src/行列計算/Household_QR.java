package 行列計算;

import sun.security.util.Length;

public class Household_QR {
	public static double[][] duut(double t[]) {
		double[][] c = new double[t.length][t.length];
		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j < t.length; j++) {
				c[i][j] = (-2.0) * t[i] * t[j];
			}
		}
		return c;
	}

	public static void main(String[] args) {
		double A[][] = { { 1, 0, 1, 0 }, { 0, 1, 0, 1 }, { 1, 0, 1, 0 }, { 0, 1, 0, 1 } };
		System.out.println("A=");
		Calc.printMat(A);
		int n = A.length;
		// --------以下是Household变换---------------------
		double[][] E = new double[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j) {
					E[i][j] = 1.0;
				} else {
					E[i][j] = 0.0;
				}
			}
		}

		double b[] = new double[n - 1];

		for (int j = 0; j < n - 1; j++) {
			b[j] = A[0][j + 1];
		}

		// Calc.printVec(b);
		double s = Calc.vecNorm2(b);
		double u[] = new double[n];
		for (int j = 2; j < n; j++) {
			u[0] = 0.0;
			u[1] = b[0] - s;
			u[j] = A[0][j];
		}
		// Calc.printVec(u);
		double uu = Calc.vecNorm2(u);
		for (int j = 0; j < n; j++) {
			u[j] = u[j] / uu;
		}
		// Calc.printVec(u);

		double P[][] = new double[n][n];
		P = Calc.addMat(E, duut(u));
		// Calc.printMat(P);
		double A_bar[][] = new double[n][n];
		A_bar = Calc.multipleMat(Calc.multipleMat(P, A), P);
		System.out.println("A_bar=");
		Calc.printMat(A_bar);

		System.out.println();
		// ------------以下是QR分解------------------------
		double Q[][] = new double[n][n];
		double R[][] = new double[n][n];
		double PP[][] = new double[n - 1][2];
		double Y[] = new double[n];
		double[][] AA = A_bar;
		double[][][] PI = new double[n - 1][n][n];
		for (int k = 0; k < n - 1; k++) {
			PP[k][0] = AA[k + 1][k] / Math.sqrt(Math.pow(AA[k][k], 2.0) + Math.pow(AA[k + 1][k], 2.0));
			PP[k][1] = AA[k][k] / Math.sqrt(Math.pow(AA[k][k], 2.0) + Math.pow(AA[k + 1][k], 2.0));
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (i == j) {
						PI[k][i][j] = 1.0;
					} else {
						PI[k][i][j] = 0.0;
					}
					PI[k][k][k] = PP[k][1];
					PI[k][k][k + 1] = (-PP[k][0]);
					PI[k][k + 1][k] = PP[k][0];
					PI[k][k + 1][k + 1] = PP[k][1];

				}
			}
			AA = Calc.multipleMat(PI[k], AA);

			System.out.println("P[k]=");
			Calc.printMat(PI[k]);
		}
		System.out.println("PP=");
		Calc.printMat(PP);

		R = AA;
		Q = Calc.multipleMat(Calc.multipleMat(PI[2], PI[1]), PI[0]);
		System.out.println("Q=");
		Calc.printMat(Q);
		System.out.println("R=");
		Calc.printMat(R);
	}

}
