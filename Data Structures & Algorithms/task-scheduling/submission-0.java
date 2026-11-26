class Solution {
    public int leastInterval(char[] tasks, int n) {
        int map[] = new int[26];
        for(char task : tasks){
            map[task-'A']++;
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i:map){
            if(i>0) pq.add(i);
        }

        int time = 0;
        
        while(!pq.isEmpty()){
            List<Integer> temp = new ArrayList<>();
            for(int i=1;i<=n+1;i++){
                if(!pq.isEmpty()){
                    int freq = pq.poll();
                    freq--;
                    temp.add(freq);
                }
            }
            
            for(int t : temp){
                if(t>0) pq.add(t);
            }

            if(pq.isEmpty()) time+=temp.size();
            else time+=n+1;
        }
        return time;
    }
}
