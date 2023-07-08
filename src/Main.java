import java.util.LinkedList;
import java.util.Objects;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        task4();
    }

    public static void task4() {
        LinkedList<Integer> list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        list = reverseList(list);
        System.out.println(list);
        enqueue(list, 6);
        dequeue(list);
        System.out.println(list);
        System.out.println(first(list));
    }

    public static LinkedList<Integer> reverseList(LinkedList<Integer> list) {
        LinkedList<Integer> new_list = new LinkedList();
        for (Integer o : list) {
            new_list.addFirst(o);
        }
        return (new_list);
    }

    public static LinkedList<Integer> enqueue(LinkedList list, Integer element) {
        list.addLast(element);
        return (list);
    }

    public static Integer dequeue(LinkedList list) {
        Integer res = (Integer) list.getFirst();
        list.removeFirst();
        return (res);
    }

    public static Integer first(LinkedList list){
        Integer res = (Integer) list.getFirst();
        return (res);
    }
}