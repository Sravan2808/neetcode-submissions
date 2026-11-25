class Pair{
    int dist;
    int point[];

    Pair(int dist,int point[]){
        this.dist = dist;
        this.point = point;
    }
}
class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->b.dist-a.dist);

        for(int point[]:points){
            int dist = point[0]*point[0]+point[1]*point[1];
            pq.offer(new Pair(dist,point));

            if(pq.size()>k) pq.poll();
        }

        int ans[][] = new int[k][2];

        for(int i=0;i<k;i++) ans[i]=pq.poll().point;

        return ans;

    }
}
