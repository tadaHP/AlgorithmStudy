import java.util.Deque;
import java.util.LinkedList;

public class AboutDeque {
    public void runDeque(){
        Deque<Integer> deque = new LinkedList<>();

        for(int i = 0 ; i < 10 ; i ++)
            deque.add(i);

        //add
        deque.addFirst(-1); //add here -> deque
        deque.addLast(10); //deque  <- addhere same as deque.add(10)
        //diffrent upside is exception when err downside is return false when err
        deque.offerFirst(-2); //add here -> deque
        deque.offerLast(11); //deque  <- addhere same as deque.offer(10)

        //remove
        System.out.println(deque.removeFirst());//remove here -> deque same as deque.remove()
        System.out.println(deque.removeLast());//remove deque <- here
        //diffrent upside is exception when err downside is return false when err
        System.out.println(deque.pollFirst());//remove here -> deque same as deque.remove()
        System.out.println(deque.pollLast());//remove deque <- here

        //get
        System.out.println(deque.getFirst());
        System.out.println(deque.peekLast());
        //diffrent upside is exception when err downside is return false when err
        System.out.println(deque.peekFirst());//same as peek
        System.out.println(deque.peekLast());
        //ETC
        System.out.println("deque size: "+deque.size());
        deque.clear();
        System.out.println("deque isEmpty: "+deque.isEmpty());
    }
}
