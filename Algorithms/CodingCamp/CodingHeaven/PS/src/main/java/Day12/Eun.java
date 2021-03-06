package Day12;

public class Eun {

	public static void main(String[] args) {
	int[][] picture=new int[][] {
		{1,1,1,0},{1,2,2,0},{1,0,0,1},{0,0,0,1},{0,0,0,3},{0,0,0,3}
	};
	int answ[]=new int[2];
	Soalution M=new Soalution();
	answ=M.solution(6,4,picture);
//	show
//	for(int i=0; i<6; i++) {
//		System.out.println(picture[i][0]+" "+picture[i][1]+" "+picture[i][2]+" "+picture[i][3]);
//	}
	System.out.println(answ[0]+"  "+answ[1]);
}


}

class Soalution {
    public static int areaNum;
    public static int canNum;
    public static int maxCanNum;
    public static int intensity;
    public static int MM;
    public static int NN;
    public static int pic[][];
  public int[] solution(int m, int n, int[][] picture) {
      areaNum=0;
    canNum=0; 
maxCanNum=0;
    intensity=0;
      MM = m;
      NN = n;
      pic = new int[m][n];
      for(int i=0; i<m; i++){
          for(int j=0; j<n; j++){
              pic[i][j]=picture[i][j];
          }
      }
      for(int i=0; i<m; i++){
          for(int j=0; j<n; j++){
              if(pic[i][j]>0){
                  canNum = 0;
                  areaNum++;
                  intensity = pic[i][j];
                  dfs(i, j);
                  if(maxCanNum<canNum){
                      maxCanNum = canNum;
                  }
              }
          }
      }
        
      int[] answer = new int[2];
      answer[0] = areaNum;
      answer[1] = maxCanNum;
      return answer;
  }
    public static void dfs( int x, int y){
        if(x>=0&& y>=0 && x<MM&&y<NN){
            if(pic[x][y] == intensity){
                pic[x][y] = -1;
                canNum++;
                dfs(x+1, y);
                dfs(x-1, y);
                dfs(x, y+1);
                dfs(x, y-1);
            }
        }
    }
}
