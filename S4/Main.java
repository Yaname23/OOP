import list.MyArrayList;
import list.MyLinkedList;
import list.MyList;



public class Main {
    public static void main(String[] args) {
        MyList<String> list = new MyArrayList<>();
        list.add("1");
        list.add("15");
        list.add("35");
        list.add("addd");
        System.out.println(list.get(0));
        list.delete(1);
        System.out.println(list);

        System.out.println("===============");

        MyLinkedList<String> linkedList = new MyLinkedList<>();

        linkedList.addLast("Luntik");
        linkedList.addLast("Marsik");
        linkedList.addLast("Bobik");
        linkedList.addLast("Aria");
        linkedList.addLast("Luna");
        
        System.out.println("LinkedList - " + linkedList);
        System.out.println("===============");
        
        linkedList.addFirst("Kimm");
        System.out.println("LinkedList with addFirst Kimm- " + linkedList);
        
        System.out.println("===============");


        System.out.println("Index elements -" + linkedList.get("Kimm"));
        System.out.println("Index elements - " + linkedList.get("Luna"));

        System.out.println("===============");

        linkedList.remove("Kimm");
        System.out.println("LinkedList without Kimm - " + linkedList);


    }
}