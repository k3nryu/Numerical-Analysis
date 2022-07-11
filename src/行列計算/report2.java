package 行列計算;

import java.util.Random;

public class report2 {
	static void house(double[][] A, double eps) {
		int n = A.length;
		double w, sigma, norm, sum, dtad;
		double[] x = new double[n];
		double[] ad = new double[n];
		double[] dta = new double[n];
		int ip = 0;

		for (int k = 0; k < n - 2; k++) {
			w = 0.0;
			for (int i = k + 1; i < n; i++) {
				if (Math.abs(A[i][k]) > w) {
					w = Math.abs(A[i][k]);
					ip = 1;
				}
			}
			if (ip != k + 1) {
				for (int j = 0; j < n; j++) {
					w = A[k + 1][j];
					A[k + 1][j] = A[ip][j];
					A[ip][j] = w;
				}
				for (int j = 0; j < n; j++) {
					w = A[j][k + 1];
					A[j][k + 1] = A[j][ip];
					A[j][ip] = w;
				}
			}
			for (int i = 0; i <= k; i++) {
				x[i] = 0.0;
			}
			for (int i = k + 1; i < n; i++) {
				x[i] = A[i][k];
			}
			if (Math.abs(x[k + 1]) < eps)
				continue;
			sum = 0.0;
			for (int i = k + 1; i < n; i++) {
				sum += x[i] * x[i];
			}
			sigma = -Math.sqrt(sum) * x[k + 1] / Math.abs(x[k + 1]);
			x[k + 1] -= sigma;
			norm = Math.sqrt(-2 * sigma * x[k + 1]);
			for (int i = k + 1; i < n; i++) {
				x[i] /= norm;
			}
			for (int i = 0; i < n; i++) {
				ad[i] = dta[i] = 0.0;
				for (int j = k + 1; j < n; j++) {
					ad[i] += A[i][j] * x[j];
					dta[i] += x[j] * A[j][i];
				}
			}
			dtad = 0.0;
			for (int i = k + 1; i < n; i++) {
				dtad += ad[i] * x[i];
			}
			for (int i = 0; i < n; i++) {
				ad[i] = 2 * (ad[i] - x[i] * dtad);
				dta[i] = 2 * (dta[i] - dtad * x[i]);
			}
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					A[i][j] -= (ad[i] * x[j] + x[i] * dta[j]);
				}
			}
		}
	}

	// public static void main(String[] args) {
	static double[] eigen_QR(double[][] A, double eps) {

		int n = A.length;
		double[] d = new double[n];
		double[][] q = new double[n][n];
		double[] w = new double[n];
		double sum1, sum2, wa;
		double sint, cost;
		house(A, eps);
		// System.out.println("Householde=");
		// Calc.printMat(A);

		int m = n;
		while (m != 1) {
			if (Math.abs(A[m - 1][m - 2]) < eps) {
				m = m - 1;
				continue;
			}
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					q[i][j] = 0.0;
				}
				q[i][i] = 1.0;
			}

			for (int i = 0; i < m - 1; i++) {
				sum1 = Math.sqrt(A[i][i] * A[i][i] + A[i + 1][i] * A[i + 1][i]);
				if (Math.abs(sum1) < eps) {
					sint = 0.0;
					cost = 0.0;
				} else {
					sint = A[i + 1][i] / sum1;
					cost = A[i][i] / sum1;
				}
				for (int j = i + 1; j < m; j++) {
					sum2 = A[i][j] * cost + A[i + 1][j] * sint;
					A[i + 1][j] = -A[i][j] * sint + A[i + 1][j] * cost;
					A[i][j] = sum2;
				}
				A[i + 1][i] = 0.0;
				A[i][i] = sum1;
				for (int j = 0; j < m; j++) {
					sum2 = q[j][i] * cost + q[j][i + 1] * sint;
					q[j][i + 1] = -q[j][i] * sint + q[j][i + 1] * cost;
					q[j][i] = sum2;
				}
				// System.out.println("A=");
				// Calc.printMat(A);
			}
			// System.out.println("Q=");
			// Calc.printMat(q);
			// System.out.println("R=");
			// Calc.printMat(A);
			for (int i = 0; i < m; i++) {
				for (int k = i; k < m; k++) {
					w[k] = A[i][k];
				}
				for (int j = 0; j < m; j++) {
					sum1 = 0.0;
					for (int k = i; k < m; k++) {
						sum1 += w[k] * q[k][j];
					}
					A[i][j] = sum1;
				}
			}
			// System.out.println("RQ=");
			// Calc.printMat(A);
			for (int i = 0; i < m; i++) {
				d[i] = A[i][i];
			}
		}
		return d;
		// System.out.println("eigen=");
		// Calc.printVec(d);
	}

	public static void main(String[] args) {
		double eps = 1.0E-12;
		int n = 4;
		double[][] A = new double[n][n];
		double[][] At = new double[n][n];
		double[][] AAt = new double[n][n];
		double[][] AtA = new double[n][n];

		for (int k = 0; k < 10; k++) {
			Random r = new Random();
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					A[i][j] = Math.abs(r.nextInt(10) % 10);
					At[j][i] = A[i][j];
				}
			}
			AAt = Calc.multipleMat(A, At);
			AtA = Calc.multipleMat(At, A);
			// eigen_QR(AAt,eps);
			// eigen_QR(AtA,eps);
			// Calc.printVec(eigen_QR(AAt,eps));
			// Calc.printVec(eigen_QR(AtA,eps));
			System.out.println(Calc.vecNorm2(eigen_QR(AAt, eps)) / Calc.vecNorm2(eigen_QR(AtA, eps)));
		}

		// System.out.println("A=");
		// Calc.printMat(A);
		// System.out.println("At=");
		// Calc.printMat(At);
		// System.out.println("AAt=");
		// Calc.printMat(AAt);
		// System.out.println("AtA=");
		// Calc.printMat(AtA);
		//

	}
}
