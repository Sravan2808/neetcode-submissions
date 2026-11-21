class Node {
    public int key, val;
    public Node prev, next;

    Node() {
        key = val = -1;
        prev = next = null;
    }
    Node(int k, int val) {
        key = k;
        this.val = val;
        next = prev = null;
    }
}

class LRUCache {
    private Map<Integer, Node> mp;
    private int cap;
    private Node head;
    private Node tail;

    private void deleteNode(Node node) {
        Node prevNode = node.prev;
        Node nodeNext = node.next;

        prevNode.next = nodeNext;
        nodeNext.prev = prevNode;
    }

    private void insertAfterHead(Node node) {
        Node nextNode = head.next;
        head.next = node;
        node.next = nextNode;
        nextNode.prev = node;
        node.prev = head;
    }
    public LRUCache(int capacity) {
        mp = new HashMap<>();
        cap = capacity;

        head = new Node();
        tail = new Node();
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        if(!mp.containsKey(key)) return -1;

        Node node = mp.get(key);
        int val = node.val;

        deleteNode(node);
        insertAfterHead(node);

        return val;
    }

    public void put(int key, int value) {
        if (mp.containsKey(key)) {
            Node node = mp.get(key);
            node.val = value;

            deleteNode(node);
            insertAfterHead(node);

            return;
        }
        if(mp.size()==cap){
            Node node = tail.prev;
            mp.remove(node.key);
            deleteNode(node);
        }
        Node newNode = new Node(key,value);
        mp.put(key,newNode);
        insertAfterHead(newNode);
    }
}
