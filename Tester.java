public class Tester {
    public static void main(String[] args) {
        personalTests();
    }
    
    public static void personalTests() {
        MyLinkedList l = new MyLinkedList();
        MyLinkedList la = new MyLinkedList();
        MyLinkedList lb = new MyLinkedList();
        MyLinkedList lc = new MyLinkedList();
        MyLinkedList ld = new MyLinkedList();
        MyLinkedList le = new MyLinkedList();

        l.add("0"); l.add("2"); l.add("3"); l.add(1, "1");
        System.out.println(l);
        System.out.println(l.get(3));
        l.set(0, "zero"); l.add(0, "-1"); l.add(0, "-2");
        System.out.println(l);
        l.remove(0); l.remove(4); l.remove(1);
        System.out.println(l);
        System.out.println(l.size());

        la.add("0"); la.add("1"); la.add("2"); la.add("3"); 
        lb.add("4"); lb.add("5"); lb.add("6"); lb.add("7"); 

        System.out.println("Not Empty Extend Not Empty");

        System.out.println(la);
        System.out.println(la.size());

        System.out.println(lb);
        System.out.println(lb.size());

        la.extend(lb);

        System.out.println(la);
        System.out.println(la.size());

        System.out.println(lb);
        System.out.println(lb.size());

        System.out.println(la.toStringReversed());
        System.out.println(lb.toStringReversed());

        System.out.println("Not Empty Extend Empty");

        System.out.println(la);
        System.out.println(la.size());

        System.out.println(lc);
        System.out.println(lc.size());

        la.extend(lc);

        System.out.println(la);
        System.out.println(la.size());

        System.out.println(lc);
        System.out.println(lc.size());

        System.out.println(la.toStringReversed());
        System.out.println(lc.toStringReversed());

        System.out.println("Empty Extend Not Empty");

        System.out.println(lc);
        System.out.println(lc.size());

        System.out.println(la);
        System.out.println(la.size());

        lc.extend(la);

        System.out.println(lc);
        System.out.println(lc.size());

        System.out.println(la);
        System.out.println(la.size());

        System.out.println(lc.toStringReversed());
        System.out.println(la.toStringReversed());

        System.out.println("Both Empty Extend");

        System.out.println(ld);
        System.out.println(ld.size());

        System.out.println(le);
        System.out.println(le.size());

        ld.extend(le);
        System.out.println(ld);
        System.out.println(ld.size());

        System.out.println(le);
        System.out.println(le.size());

        System.out.println(ld.toStringReversed());
        System.out.println(le.toStringReversed());
    }
}
    