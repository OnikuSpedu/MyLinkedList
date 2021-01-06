public class Node{

    private String data;
    private Node next,prev;
    
    public Node(String value){
        data = value;
    }
    
    public String getData() {
        return this.data;
    }
    public Node getNext() {
        return this.next;
    }
    public Node getPrev() {
        return this.prev;
    }
    public void setData(String data) {
        this.data = data;
    }
    public void setNext(Node n) {
        this.next = n;
    }
    public void setPrev(Node n) {
        this.prev = n;
    }
}