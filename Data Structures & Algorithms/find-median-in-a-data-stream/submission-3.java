class MedianFinder {
    PriorityQueue<Integer> smaller; // maxHeap
    PriorityQueue<Integer> larger; // minHeap
    public MedianFinder() {
        smaller = new PriorityQueue<Integer>(Collections.reverseOrder());
        larger = new PriorityQueue<Integer>();
    }

    public void addNum(int num) {
        if (smaller.size() == 0)
            smaller.offer(num);
        else {
            if (smaller.peek() > num)
                smaller.offer(num);
            else
                larger.offer(num);
        }
        if (smaller.size() > larger.size())
            larger.offer(smaller.poll());
        if (larger.size() > smaller.size())
            smaller.offer(larger.poll());
    }

    public double findMedian() {
        if (smaller.size() == larger.size())
            return ((double) smaller.peek() + larger.peek()) / 2.0;
        return smaller.peek();
    }
}
