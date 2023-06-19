import java.util.Comparator;
import java.util.PriorityQueue;

public class heap {
    static class students  implements  Comparable<students>{
        String name;
        int rank;

        students(String name, int rank)
        {
            this.name = name;
            this.rank = rank;

        }
        @Override
        public int compareTo(students s2)
        {
            return this.rank - s2.rank;
        }
    }

    public static void main(String[] args) {
        PriorityQueue <students> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(new students("kalpesh" , 1));
        pq.add(new students("ulka" , 12));
        pq.add(new students("tanuj" , 10));
        pq.add(new students("kaustubh" , 16));


        while(!pq.isEmpty())
        {
            System.out.println(pq.peek().name+"=>"+pq.peek().rank);
            pq.remove();
        }
    }
}
