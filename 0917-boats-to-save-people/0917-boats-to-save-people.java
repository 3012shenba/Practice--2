class Solution {
    public int numRescueBoats(int[] people, int limit)
    {
        int boat=0;
        Arrays.sort(people);
        int s=0;
        int end=people.length-1;
        while(s<=end)
        {
            if((people[s]+people[end])<=limit)
                s++;
             end--;
             boat++;  
        }
        return boat;  
    }
}