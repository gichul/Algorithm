import java.util.*;

public class P11509{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int[] H=new int[N+1];
		int[] M=new int[N+1];
		int ans=0;
		for(int i=1; i<=N;i++){
			H[i]=sc.nextInt();
			if(M[H[i]]==0)ans++;
			else M[H[i]]--;
			M[H[i]-1]+=1;
		}
		System.out.println(ans);
	}
}
