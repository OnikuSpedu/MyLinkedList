public class MyLinkedList {

    private int size;
    private Node start, end;

    public MyLinkedList() {
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

    public void add(int index, String value) {
        if (index >= 0 && index <= size()) {
            if (index == 0) {
                Node n = new Node(value);
                n.setNext(this.start);
                this.start.setPrev(n);
                this.start = n;
                this.size++;
            } else if (index == size()) {
                add(value);
            } else {
                Node newNode = new Node(value);
                Node next = retrieveNode(index);
                Node prev = next.getPrev();

                newNode.setNext(next);
                newNode.setPrev(prev);
                prev.setNext(newNode);
                next.setPrev(newNode);

                this.size++;
            }
        } else {
            throw new IndexOutOfBoundsException();
        }

    }

    public String get(int index) {
        if (index >= 0 && index <= size()) {
            return retrieveNode(index).getData();
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    public String set(int index, String value) {
        if (index >= 0 && index <= size()) {
            Node n = retrieveNode(index);
            n.setData(value);
            return n.getData();
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    public String toString() {
        Node current = this.start;
        String output = "";
        for (int i = 0; i < size(); i++) {
            output += current.getData();
            if (i < size() - 1) {
                output += ", ";
            }
            Node n = current.getNext();
            current = n;
        }
        return output;
    }

    public String toStringReversed() {
        Node current = this.end;
        String output = "";
        for (int i = 0; i < size(); i++) {
            output += current.getData();
            if (i < size() - 1) {
                output += ", ";
            }
            Node n = current.getPrev();
            current = n;
        }
        return output;
    }

    private Node retrieveNode(int index) {
        if (index >= 0 && index < size()) {
            Node current = this.start;
            for (int i = 0; i < index; i++) {
                current = current.getNext();
            }
            return current;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    public String remove(int index) {
        if (index >= 0 && index < size()) {
            String output = "";
            if (size() == 1) {
                output = this.start.getData();
                this.start = null;
                this.end = null;
            } else if (index == 0) {
                output = this.start.getData();
                this.start.setData(null);
                Node n = start.getNext();
                this.start.setNext(null);
                n.setPrev(null);
                this.start = n;
            } else if (index == size() - 1) {
                output = this.end.getData();
                this.end.setData(null);
                Node n = end.getPrev();
                this.end.setPrev(null);
                n.setNext(null);
                this.end = n;
            } else {
                Node removedNode = retrieveNode(index);
                output = removedNode.getData();
                Node pNode = removedNode.getPrev();
                Node nNode = removedNode.getNext();
                pNode.setNext(nNode);
                nNode.setPrev(pNode);
                removedNode.setPrev(null);
                removedNode.setNext(null);
                removedNode.setData(null);
            }

            this.size--;
            return output;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }
}