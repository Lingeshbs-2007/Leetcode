// Last updated: 9/11/2026, 9:25:31 AM
class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Stack<Integer> st = new Stack<>();
        Queue<Integer> q = new LinkedList<>();
        for(int i = sandwiches.length -1 ; i>= 0 ; i--)
             st.push(sandwiches[i]);
        for(int stu : students)
             q.add(stu);     
        int t = 0;     
        while(!q.isEmpty() && !st.isEmpty() && t < st.size()){
            if(q.peek() == st.peek()){
                st.pop();
                q.poll();
                t = 0;
            }
            else{
                t++;
                q.add(q.poll());
            }    
        }     
        return q.size(); 
    }
}