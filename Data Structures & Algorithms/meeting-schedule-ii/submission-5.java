/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public int minMeetingRooms(List<Interval> intervals) {
        int n = intervals.size();
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for(int i=0;i<n;i++){
            int first = intervals.get(i).start;
            int second = intervals.get(i).end;
            map.put(first,map.getOrDefault(first, 0)+1);
            map.put(second,map.getOrDefault(second, 0)-1);
        }

        int cnt = 0;
        int maxOverLap = 0;
        for(int i : map.keySet()){
            cnt+=map.get(i);
            maxOverLap = Math.max(cnt,maxOverLap);
        }
        return maxOverLap;
    }
}
