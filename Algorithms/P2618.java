import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Crime {
	int i,j;

	public Crime(int i, int j) {
		this.i = i;
		this.j = j;
	}
}

public class P2618 {
	static int N, W;
	static Crime[] crimes;
	static int[][] totalRoute;
	static ArrayList<Integer> caseOrder;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		W = Integer.parseInt(br.readLine());
		
		crimes = new Crime[W+1];		
		for(int i=1; i<=W; i++) {
			String[] location = br.readLine().split(" ");
			crimes[i] = new Crime(Integer.parseInt(location[0]), Integer.parseInt(location[1]));
		}
		
		// 1. Calculate shortest distance
		totalRoute = new int[W+1][W+1];
		totalRoute[0][0] = 0;
		System.out.println(movePolice(0, 0));
		
		// 2. Find shortest path
		caseOrder = new ArrayList<>();
		int finalCase1 = 0;
		int finalCase2 = 0;
		while(finalCase1 < W && finalCase2 < W) {
			int nextCase = Math.max(finalCase1, finalCase2) + 1;
			
			int dist1 = totalRoute[nextCase][finalCase2] + distance(1, finalCase1, nextCase);
			int dist2 = totalRoute[finalCase1][nextCase] + distance(2, finalCase2, nextCase);

			if(dist1 <= dist2) {
				caseOrder.add(1);
				finalCase1 = nextCase;
			} else {
				caseOrder.add(2);
				finalCase2 = nextCase;
			}
		}

		StringBuilder sb = new StringBuilder();
		for(int i=0; i<W; i++) {
			sb.append(caseOrder.get(i) + "\n");
		}
		System.out.println(sb.toString());
	}
	 	
	static int movePolice(int police1, int police2) {		
		if(totalRoute[police1][police2] != 0) {
			return totalRoute[police1][police2];
		}
		
		if(police1 == W || police2 == W) {
			return 0;
		}
		
		int nextCase = Math.max(police1, police2) + 1;
		totalRoute[police1][police2] = Math.min(movePolice(nextCase, police2) + distance(1, police1, nextCase), movePolice(police1, nextCase) + distance(2, police2, nextCase));
		return totalRoute[police1][police2];
	}
	
	static int distance(int police, int lastPos, int currentPos) {
		if(lastPos == 0) {
			if(police == 1) {
				return (crimes[currentPos].i - 1) + (crimes[currentPos].j - 1);
			} else {
				return (N - crimes[currentPos].i) + (N - crimes[currentPos].j);
			}
		} else {
			return Math.abs(crimes[currentPos].i - crimes[lastPos].i) + Math.abs(crimes[currentPos].j - crimes[lastPos].j);
		}
	}
}

