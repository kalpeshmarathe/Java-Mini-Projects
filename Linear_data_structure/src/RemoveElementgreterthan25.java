import java.util.Scanner;

public class RemoveElementgreterthan25
{
    node head;
    class node{
        node next;
        int data;
        node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    public void addlast(int data)
    {
        node newnode  = new node(data);
        if(head == null)
        {
            head = newnode;
            return;
        }
        node currnode = head;
        while(currnode.next != null)
        {
            currnode = currnode.next;
        }
        currnode.next = newnode;

    }
    public void print()
    {
        if(head == null)
        {

            System.out.println("List Is Empty");
        }
        node currnode = head;
        while(currnode!= null)
        {
            System.out.print(currnode.data+"=>");
            currnode = currnode.next;
        }
        System.out.println("Null");

    }
    public void removegreterthen25()
    {
        node curr = head;
        node currnext = curr.next;
        while(currnext.next!=null)
        {
            if(currnext.data > 25)
            {
                curr.next = currnext.next;
            }
        }


    }

    public static void main(String[] args) {
        RemoveElementgreterthan25 list3 = new RemoveElementgreterthan25();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number Between 0 - 50 and press 0 if you want to quite ");
        int x = 1;
        while (x != 0)
        {
            x = sc.nextInt();
            list3.addlast(x);
        }

        list3.print();
        list3.removegreterthen25();
        list3.print();
    }
}
