public class DeleteNthNodeFromLast {
    node head;
    private int size;
    DeleteNthNodeFromLast()
    {
        this.size = size;
    }
    class node{
        int data;
        node next;
        node(int data)
        {
            this.data = data;
            this.next = null;
            size++;
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
    public void print()
    {
        node currnode = head;
        while(currnode != null)
        {
            System.out.print(currnode.data+"=>");
            currnode = currnode.next;
        }
        System.out.println("Null");

    }
    public void getsize()
    {
        System.out.println(size);
        return;
    }
    public void deleteNth(int idx)
    {
           int number = size - idx ;
           int i = 1;
           node currnode = head;
           node currnodenext = currnode.next;
           while(number != i)
           {
               i++;
               currnode = currnode.next;
               currnodenext = currnodenext.next;
           }
           currnode.next = currnodenext.next;
           size--;
    }
    public static void main(String[] args) {
        DeleteNthNodeFromLast list = new DeleteNthNodeFromLast();
        list.addfirst(1);
        list.addfirst(2);
        list.addfirst(5);
        list.addfirst(4);
        list.addfirst(3);

        list.print();
        list.getsize();
        list.deleteNth(3);
        list.print();
        list.deleteNth(2);
        list.print();

    }
}
