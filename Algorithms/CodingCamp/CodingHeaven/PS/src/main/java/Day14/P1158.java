package Day14;
import java.util.*;

public class P1158 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N,M;
		int count=0;
		N=sc.nextInt();
		M=sc.nextInt();
		int[] J=new int[N+1];
		Arrays.fill(J, 1);
		ArrayList<Integer> ans=new ArrayList<>();
		
		//i는 index를 나타낸다.
		int i=M;
		while(count!=N) {
			int check=0;
				while(true) {
					if(i==N+1)i=1;
					if(J[i]==0) {
						continue;
					}
					check++;
					if(check==M)break;
				}		
			ans.add(i);
			J[i]=0;
			count++;
		}
		
		for(int j=1; j<=N; j++) {
			System.out.print(J[i]+ " ");
		}
		
		
		
	}

}
