public class MyLinkedList{

    private int size;
    private Node start,end;  

    public MyLinkedList(){
        this.size = 0;
        this.start = null;
        this.end = null;
    }

    public int size() {
        return this.size;
    }

    public boolean add(String value) {
        Node n = new Node(value);
        if (size() == 0) {
            this.start = n;
            this.end = n;
            this.size++;
        } else {
            this.end.setNext(n);
            n.setPrev(this.end);
            this.end = n;
            this.size++;
        }
        return true;
    }

    public boolean add(int index, String value) {
        if (index >= 0 && index <= size()) {
            if (index == 0) {
                Node n = new Node(value);
                n.setNext(this.start);
            } else if (index == size()) {
                add(value);
            } else {

            }

            return true;
        } else {
            throw new IndexOutOfBoundsException();
        }
        
    }

    public String get(int index);
    public String set(int index, String value);
    public String toString();
    //Any helper method that returns a Node object MUST BE PRIVATE!
}