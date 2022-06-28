import java.util.Queue;
import java.util.LinkedList;//Queue와 함께 사용

public class AboutQueue {
    
    public void runQueue(){
        Queue<Integer> queue = new LinkedList<>();

        for(int i = 0 ; i < 10 ; i ++){
            queue.add(i); //queue, out -> 0~9 <- in
        }

        //add
        System.out.println("Queue: "+queue.add(10));//if err, exception
        //Example
        // try {
        //     queue.add("e");//try to insert err
        // } catch (Exception e) {
        //     System.out.println("err: "+e);
        // }

        System.out.println("Offer: "+queue.offer(10));//if err, return false
        //Example
        // System.out.println("Offer, Error: "+queue.offer("e"));
        
        //getValue
        System.out.println("Peek: "+queue.peek());//값만 빼오기

        System.out.println("Poll: "+queue.poll());//if err, exception
        System.out.println("Remove: "+queue.remove());//if err, return false

        //ETC
        System.out.println("Queue Before Empty: "+queue.isEmpty());
        queue.clear();//큐 클리어
        System.out.println("queue Contains: "+queue.contains(4));
        System.out.println("Queue Equal: "+ queue.equals(queue));
        System.out.println("Queue After Empty: "+queue.isEmpty());



    }

}