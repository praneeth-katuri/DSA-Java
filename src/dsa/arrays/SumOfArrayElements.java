package dsa.arrays;

import java.io.*;
import java.util.*;

public class SumOfArrayElements {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for (int i = 0; i < t; i++) {
			long sum = 0;
			int n = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				sum += Long.parseLong(st.nextToken());
			}
			System.out.println(sum);
		}
		br.close();
	}
}