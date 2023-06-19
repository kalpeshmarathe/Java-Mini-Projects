import java.util.PriorityQueue;
import java.util.Scanner;

public class RankBasedAdmissionSystem {
    static class student implements Comparable<student>{
        String name;
        int rank;
        student(String name,int rank)
        {
            this.name = name;
            this.rank = rank;
        }
        @Override
        public int compareTo(student s2)
        {
            return this.rank - s2.rank;
        }
    }
    public static void main(String[] args) {
        System.out.println("HELLO THIS IS XYZ COLLAGE PORTAL");
        System.out.println();
        System.out.println("\t \t \tWELCOME \t");
        System.out.println("NOTE: this is collage portal where you get your \n rank over a collage admission on basis of your\n rank and there are only 15 seats ");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Name =");
        String name = sc.nextLine();
        System.out.print("Enter Your Rank =");
        int rank = sc.nextInt();

        PriorityQueue<student> pq = new PriorityQueue<student>();
        pq.add(new student("kalpesh" , 1));

        pq.add(new student("tanuj" , 10));
        pq.add(new student("kaustubh" , 16));
        pq.add(new student(name,rank));


        while(!pq.isEmpty())
        {
            System.out.println(pq.peek().name+"=>"+pq.peek().rank);
            pq.remove();
        }
    }
}
