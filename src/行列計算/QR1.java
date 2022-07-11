package 行列計算;

public class QR1 {
	static void S_House(double a[], int N) {
		int i, j, k;
		double sum, alpha, sigma, ud, TOL = 1.0E-7;
		double[] u = new double[N], p = new double[N], pb = new double[N];
		for (k = 0; k <= N - 3; k++) {
			for (i = 0; i <= k; i++)
				u[i] = 0.0;
			for (i = k + 1; i <= N - 1; i++)
				u[i] = a[N * i + k];

			/* 変換行列Hの構築 */
			for (sum = 0.0, i = k + 1; i < N; i++)
				sum += u[i] * u[i];
			sigma = Math.sqrt(sum);
			if (Math.abs(sum) < TOL)
				continue;
			if (u[k + 1] < 0)
				sigma *= -1.0;
			u[k + 1] += sigma;
			alpha = 1.0 / (sigma * u[k + 1]);
			/* 相似変換 */
			for (i = 0; i < N; i++) {
				for (p[i] = 0.0, pb[i] = 0.0, j = k + 1; j < N; j++) {
					p[i] += alpha * a[N * i + j] * u[j];
					pb[i] += alpha * a[N * j + i] * u[j];
				}
			}
			for (ud = 0.0, i = k + 1; i < N; i++) {
				ud = ud + u[i] * pb[i];
				for (i = 0; i < N; i++) {
					p[i] -= alpha * ud * u[i];
					for (i = 0; i <= N - 1; i++) {
						for (j = 0; j <= N - 1; j++) {
							a[N * i + j] -= (u[i] * pb[j] + p[i] * u[j]);
						}

					}
				}
			}
		}
	}

	/*
	 * public static void main(String[] args) { double A[][] = {{1, 0, 1, 0}, {0, 1,
	 * 0, 1}, {1, 0, 1, 0}, {0, 1, 0, 1}}; System.out.println("A=");
	 * Calc.printMat(A);
	 */
	void S_QR(double a[], int N) {
		int i, j, k, m = N;
		double sum, aa, mu, sinx, cosx, TOL = 1.0E-7;
		double[] q = new double[N * N], w = new double[N];
		/* 収束判定 */
		for (m = N; m > 1; m--) {
			while (Math.abs(a[N * (m - 1) + m - 2]) > TOL) {
				mu = a[N * (m - 1) + (m - 1)];
				for (i = 0; i <= m - 1; i++)
					a[N * i + i] = a[N * i + i] - mu;
				/* QR分解 */
				for (i = 0; i <= m * m - 1; i++)
					q[i] = 0.0;
				for (i = 0; i <= m - 1; i++)
					q[m * i + i] = 1.0;
				for (i = 0; i <= m - 2; i++) {
					sum = a[N * i + i] * a[N * i + i] + a[N * i + N + i] * a[N * i + N + i];
					sum = Math.sqrt(sum);
					if (Math.sqrt(sum) < TOL) {
						sinx = 0.0;
						cosx = 0.0;
					} else {
						sinx = a[N * i + N + i] / sum;
						cosx = a[N * i + i] / sum;
					}
					for (j = i + 1; j <= m - 1; j++) {
						aa = a[N * i + j] * cosx + a[N * i + N + j] * sinx;
						a[N * i + N + j] = -a[N * i + j] * sinx + a[N * i + N + j] * cosx;
						a[N * i + j] = aa;
					}
					a[N * i + i] = sum;
					a[N * (i + 1) + i] = 0.0;
					for (j = 0; j <= m - 1; j++) {
						aa = q[m * j + i] * cosx + q[m * j + i + 1] * sinx;
						q[m * j + i + 1] = -q[m * j + i] * sinx + q[m * j + i + 1] * cosx;
						q[m * j + i] = aa;
					}
				}
				for (i = 0; i <= m - 1; i++) {
					for (j = i; j <= m - 1; j++)
						w[j] = a[N * i + j];
					for (j = 0; j <= m - 1; j++) {
						for (sum = 0.0, k = i; k <= m - 1; k++)
							sum += w[k] * q[m * k + j];
						a[N * i + j] = sum;
					}
				}
				for (i = 0; i <= m - 1; i++)
					a[N * i + i] = a[N * i + i] + mu;
			}

		}
		m--;
	}
}
