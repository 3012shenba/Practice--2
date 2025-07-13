class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        int n1=players.length;
        int n2=trainers.length;
        int count=0;
        int st=0;
        int end=0;
        while(st<n1&&end<n2)
        {
            if(players[st]<=trainers[end])
            {
                count++;
                st++;
                end++;
            }
            else
            {
                end++;
            }
        }
        return count;
    }
}