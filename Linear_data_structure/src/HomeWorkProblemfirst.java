public class HomeWorkProblemfirst {
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
        newnode.next =newnode;
        head = newnode;
    }
    public void addlast(int data)
    {
        node newnode=  new node(data);
        if(head == null)
        {
            head = newnode;
            return;
        }
        node currnode = head;
        while(currnode.next!=null)
        {
            currnode = currnode.next;
        }
        currnode.next = newnode;
    }

    public void print()
    {
        node currnode = head;
        while(currnode!=null)
        {
            System.out.print(currnode.data+"=>");
            currnode = currnode.next;
        }
        System.out.println("Null");
    }
    public void searchidx(int data)
    {
        int idx =1;
        node currnode = head;
        while(currnode!=null)
        {

            if(currnode.data == data)
            {
                System.out.println(idx);
                return;
            }
            currnode = currnode.next;
            idx++;
        }
        System.out.println("Element not found");

    }

    public void removegreter()
    {
        node currnode = head;
        node currnodenext = currnode.next;

        while(currnode.next!=null)
        {
            if(currnodenext.data > 8)
            {
                currnode.next = currnodenext.next;
            }
        }
    }
    public void insertat(int idx,int data)
    {
        node newnode = new node(data);
        int curridx = 0;
        node currnode = head;
        node currnodenext = currnode.next;
        while(curridx != idx)
        {
            curridx++;
            currnode = currnode.next;
            currnodenext = currnodenext.next;

        }

        currnode = newnode;

        while (currnode!=null)
        {
            currnode  = currnode.next;
        }
    }
    public static void main(String[] args) {
        HomeWorkProblemfirst list2 = new HomeWorkProblemfirst();
        list2.addfirst(1);
        list2.addlast(5);
        list2.addlast(7);
        list2.addlast(3);
        list2.addlast(8);
        list2.addlast(27);
        list2.addlast(35);
        list2.print();
        list2.searchidx(7);
//        list2.removegreter();
        list2.insertat(3,13);
        list2.print();
    }
}
