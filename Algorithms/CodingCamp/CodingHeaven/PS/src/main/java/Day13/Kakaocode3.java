package Day13;

public class Kakaocode3 {

	public static void main(String[] args) {
		Solution sol=new Solution();
		int ans1;
		int ans2;
		ans1=sol.solution("ab");
		ans2=sol.solution("");

		System.out.println(ans1 + " " + ans2);

	}

}

class Solution
{
	int count;
	int k;
	public int solution(String s)
	{
		int answer = 0;
		int temp;
		if(s.length()==1)return 1;
		if(s.length()==2&&s.charAt(0)!=s.charAt(1))return 1;
		

			for(int i=0; i<s.length();i++) {
				count=0;
				k=1;
				temp=ans(s,i,k);
				if(temp>answer)answer=temp;
			}
			
			for(int i=0; i<s.length()-1;i++) {
				if(s.charAt(i)==s.charAt(i+1)) {
					count=0;
					k=0;
					temp=ans2(s,i,k);
					if(temp>answer)answer=temp;
				}
			}
		
        return answer;
    }
	public int ans(String s,int i,int k) {
		if(i-k>=0 && i+k<s.length()&&s.charAt(i-k)==s.charAt(i+k)) {
			count++;
			k++;
			ans(s,i,k);
		}
		else {
			return 0;
		}
		
		return count*2+1;
	}
	
	public int ans2(String s,int i,int k) {
		if(i-k>=0 && i+1+k<s.length()&&s.charAt(i-k)==s.charAt(i+1+k)) {
			count++;
			k++;
			ans2(s,i,k);
		}
		else {
			return 0;
		}
		
		return count*2;
	}
	
	
}

//(s.charAt(i-k)!=s.charAt(i+k))
