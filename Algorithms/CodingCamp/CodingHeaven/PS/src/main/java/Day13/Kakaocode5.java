package Day13;

public class Kakaocode5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Soulution AN=new Soulution();
		System.out.println(AN.solution(10));

	}

}

class Soulution {
	  public int solution(int n) {
	      int answer = 0;
	      long count=0;
	      long[] ans=new long[60001];
	      ans[0]=1;
	      ans[1]=1;
	      for(int i=2; i<=60000; i++) {
	    	  ans[i]=ans[i-1]%1000000007+ans[i-2]%1000000007;
	      }
	      System.out.println(ans[60000]);

	      
	      answer=(int)ans[n]%1000000007;
	      
	      return answer;
	  }
	}