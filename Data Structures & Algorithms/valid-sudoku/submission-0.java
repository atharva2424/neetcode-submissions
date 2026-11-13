class Solution {
    public boolean rowsncolomns(char[][] board)
    {
        for(int i = 0;i<9;i++)
        {
            Set<Character> set = new HashSet<>();
            for(int j = 0;j<9;j++)
            {
                if(board[i][j]>='1')
                {
                    if(!set.contains(board[i][j]))
                    set.add(board[i][j]);
                    else
                    return false;
                }
            }
            set = new HashSet<Character>();
            for(int j = 0;j<9;j++)
            {
                if(board[j][i]>='1')
                {
                    if(!set.contains(board[j][i]))
                    set.add(board[j][i]);
                    else
                    return false;
                }
            }
        }
        return true;
    }
    public boolean submatrix(char[][] board)
    {
        for(int i = 0;i<9;i+=3)
        {
            for(int j = 0;j<9;j+=3)
            {
                Set<Character> set = new HashSet<>();
                for(int a = 0;a<3;a++)
                {
                    for(int b = 0;b<3;b++)
                    {
                        if(board[i+a][j+b]>='1')
                        {
                            if(!set.contains(board[i+a][j+b]))
                            set.add(board[i+a][j+b]);
                            else
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
    public boolean isValidSudoku(char[][] board) {
        boolean rnc = rowsncolomns(board);
        boolean sub = submatrix(board);
        return rnc && sub;
    }
}
