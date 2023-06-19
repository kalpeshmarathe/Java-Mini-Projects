public class LinkedListPractice1 {
    node head;
    class node{
        int data;
        node next;
        node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    public void addfirst(int data)
    {
        node newnode = new node(data);
        if(head == null)
        {
           head = newnode;
            return;
        }

        newnode.next = head;
        head = newnode;
    }
    public void addlast(int data)
    {
        if(head == null)
        {
            return;
        }
        node newnode = new node(data);
        node currnode = head;

        while (currnode.next != null)
        {
            currnode = currnode.next;
        }
        currnode.next = newnode;
    }
    public void print()
    {
        if (head == null)
        {
            System.out.println("List is Empty");
            return;
        }
        node currnode = head;

        while (currnode != null)
        {
            System.out.print(currnode.data+"=>");
            currnode = currnode.next;
        }
        System.out.println("Null");

    }
    public void deletefirst()
    {
        if(head==null)
        {
            return;
        }
        head = head.next;
    }
    public void deletelast()
    {
        if(head == null)
        {
            return;
        }
        if(head.next == null)
        {
            head = null;
            return;
        }
        node curr = head;
        node nextcurr = curr.next;

        while(nextcurr.next!=null)
        {
            curr = curr.next;
            nextcurr = nextcurr.next;
        }
        curr.next = null;
    }
   public void reverse()
   {
       if (head == null)
       {
           return;
       }
       if(head.next == null)
       {
           return ;
       }
       node prevnode = head;
       node currnode = head.next;
       while (currnode != null)
       {
           System.out.println(currnode.data+"=>");
           node nextnode = currnode.next;
           currnode.next = prevnode;

           //update
           prevnode = currnode;
           currnode = nextnode;
       }
       head.next = null;
       head = prevnode;
   }

   public node reverserecursive(node head)
   {
       if (head==null||head.next==null)
       {
           return head;
       }
       node newHead = reverserecursive(head.next);
       head.next.next = head;
       head.next = null;
       return newHead;
   }

    public static void main(String[] args) {
        LinkedListPractice1 list1 = new LinkedListPractice1();
        list1.print();
        list1.addfirst(3);
        list1.addfirst(2);
        list1.addfirst(1);
        list1.addlast(4);
        list1.addlast(5);
        list1.print();

        list1.deletelast();
        list1.print();
        list1.head = list1.reverserecursive(list1.head);
        list1.print();



    }

}
