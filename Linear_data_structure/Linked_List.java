public class Linked_List {
    class node
    {
        String date;
        node next;
        node head;
        node(string data)
        {
            this.data = data;
            this.next = null;
        }
    }
    public void addfirst(string data)
    {
        node newnode = new node();
        if(head == null)
        {
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }
    public static void main(String[] args) {
        Linked_List list = new Linked_List();
        list.addfirst("K");
    }
}
