public class Driver {
    public static void main(String[] args) {
        Node n = new Node("1");
        System.out.println(n.getData());
        
        MyLinkedList l = new MyLinkedList();
        l.add("0");
        l.add("2");
        l.add("3");
        System.out.println(l);
        l.add(1, "1");
        System.out.println(l);
        System.out.println(l.get(3));
        l.set(0, "zero");
        l.add(0, "-1");
        System.out.println(l);
        

        
    }
}