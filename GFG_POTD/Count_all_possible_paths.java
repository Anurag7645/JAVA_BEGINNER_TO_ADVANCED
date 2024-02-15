package GFG_POTD;

public class Count_all_possible_paths {
    public int isPossible(int[][] paths)
    {
        for(int i=0;i<paths.length;i++)
        {
            int cnt = 0;
            
            for(int j=0;j<paths[0].length;j++)
            {
                cnt+=paths[i][j];
            }
            
            if(cnt%2!=0)
            {
                return 0;
            }
        }
        return 1;// Code here
    }
}
