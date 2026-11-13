class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        double time[] = new double[n];
        int count = 0;
        int vector[][] = new int[n][2];
        for(int i = 0;i<n;i++)
        {
            vector[i][0] = position[i];
            vector[i][1] = speed[i];
        }
        Arrays.sort(vector, (a, b)-> a[0]-b[0]);
        for(int i = 0;i<n;i++)
        {
            time[i] = (double)(target-vector[i][0])/vector[i][1];
            System.out.println(time[i]);
        }
        Stack<Double> st = new Stack<>();
        for(int i = n-1;i>=0;i--)
        {
            while(!st.isEmpty() && time[i]>st.peek())
            st.pop();
            if(st.isEmpty())
            count++;
            st.push(time[i]);
        }
        return count;
    }
}