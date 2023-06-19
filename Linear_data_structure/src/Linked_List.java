public class Linked_List {
    Node head;
    private int size;
    Linked_List()
    {
        this.size = 0;
    }
    class Node
    {
        String data;
        Node next;
        Node head;

        Node(String data)
        {
            this.data = data;
            this.next = null;
            size++;
        }
    }
    public void addfirst(String data)
    {
        Node newnode = new Node(data);
        if(head == null)
        {
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }
    public void addlast(String data)
    {
        Node newnode   = new Node(data);
        if(head == null)
        {
            head = newnode;
            return;
        }
        Node currnode= head;
        while (currnode.next != null)
        {
            currnode = currnode.next;
        }
        currnode.next = newnode;

    }
    public  void print()
    {
        if(head==null)
        {
            System.out.println("List Is Empty");
            return;
        }

        Node currnode= head;
        while (currnode!= null)
        {
            System.out.print(currnode.data+"-->");
            currnode = currnode.next;
        }

        System.out.println("null");
    }
    public void deletefirst()
    {
        if(head == null)
        {

            return;
        }
        head = head.next;
        size--;
    }
    public void deletelast()
    {
        if(head == null)
        {
            return;
        }
        size--;
        if(head.next == null)
        {
            head = null;
            return;
        }
        Node currnode = head;
        Node nextcurrnode = currnode.next;
        while(nextcurrnode.next!=null)
        {
            currnode = currnode.next;
            nextcurrnode = nextcurrnode.next;
        }
        currnode.next = null;
        size--;
    }

    public int getSize() {
        if (size<0)
        {
            return 0;
        }
        return size;
    }

    public static void main(String[] args) {
        Linked_List list = new Linked_List();
        list.addfirst("K");
        list.addlast("a");
        list.addlast("l");
        list.addfirst("hello");
        System.out.println(list.getSize());
        list.print();
        list.deletefirst();
        list.print();
        System.out.println(list.getSize());
        list.deletelast();
        list.print();
        list.deletelast();
        list.print();
        System.out.println(list.getSize());

        list.deletelast();
        list.print();
        System.out.println(list.getSize());
    }
}
