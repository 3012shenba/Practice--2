class Solution {
    public int[] prisonAfterNDays(int[] cells, int n) {
        n=(n-1)%14+1;
        int[] newCells = new int[cells.length];
        if (n==0)
            return cells;
        for (int i=1;i<cells.length-1;i++)
            if (cells[i-1]==cells[i+1])
                newCells[i]=1;
            else
                newCells[i]=0;
        return prisonAfterNDays(newCells,n-1);
    }
}