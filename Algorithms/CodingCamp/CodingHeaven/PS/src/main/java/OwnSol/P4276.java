package OwnSol;
import java.util.Scanner;
import java.util.ArrayList;

public class P4276 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	long i;
	int j;
	long n,m;
	int k;
	String temp;
	long num_of_0=0;
	ArrayList<Long> ans=new ArrayList<>();
	
	
	//여기를 음수가 나올 떄 까지 무한 반복하면 되겠다.
	while(true) {
		num_of_0=0;
		n=sc.nextLong();
		m=sc.nextLong();
		if(n<0)break; 
	
		for(i=n; i<=m; i++) {
			temp=Long.toString(i);
			for(j=0;j<temp.length();j++) {
				if(temp.charAt(j)=='0') {
					num_of_0++;	
				}
			}
		}
		ans.add(num_of_0);
	}
	
	
	for(k=0; k<ans.size();k++) {
		System.out.println(ans.get(k));
	}
				

		


	}

}
