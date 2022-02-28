public class singlyLinkedList {

   private class Node
    {
        String data;
        Node next;
        public Node(String s)
        {
            data = s;
            next = null;
        }
        public Node(String s, Node n)
        {
            data = s;
            next = n;
        }
    }
    private Node first;
    private Node last;
    private int length;
    private Node currentPos;

    public singlyLinkedList()
    {
        length = 0;
        first = last = currentPos = null;
    }
    public void MakeEmpty()
    {
        length = 0;
        first = last = currentPos = null;
    }
    public int LengthIs()
    {
        return length;
    }
    public void AddToFirst(String s)
    {
        Node newNode = new Node(s, first);
        first = newNode;
        length++;
        if(length==1) last = newNode;
    }
    public void AddToLast(String s)
    {
        Node newNode = new Node(s);
        if(length==0)
        {
            first = last = newNode;
            length++;
            return;
        }
        last.next=newNode;
        last = newNode;
        length++;
    }

    public boolean Find(String s)
    {
        Node current = first;
        while(current != null)
        {
            if(current.data.compareTo(s)==0) return true;
            else current = current.next;
        }
        return false;
    }

    public void InsertAt(String s, int rank)
    {
        if(rank<=0)
        {
            AddToFirst(s);
            return;
        }
        if(rank>=length)
        {
            AddToLast(s);
            return;
        }
        Node newNode = new Node(s);
        Node current = first;
        for(int i=0; i<rank-1;i++) current = current.next;
        newNode.next = current.next;
        current.next = newNode;
        length ++;
    }
    public void DeleteFromFirst()
    {
        if(length == 0) return;
        first = first.next;
        length--;
        if(length == 0) last = null;
    }
    public void DeleteFromLast()
    {
        if(length==0) return;
        if(length==1)
        {
            MakeEmpty();
            return;
        }

        Node newLast = first;
        while(newLast.next!=last) newLast = newLast.next;
        last = newLast;
        last.next = null;
        length--;
    }
    public boolean IsLast()
    {
        return currentPos==last;
    }
    public String GetNext()
    {
        if(IsLast()) return null;
        if(currentPos==null) currentPos = first;
        else currentPos = currentPos.next;
        return currentPos.data;
    }
    public void Reset()
    {
        currentPos = null;
    }
    @Override
    public String toString()
    {
        String output="The List Has:";
        Node current = first;
        for(int i=0; i<length;i++)
        {
            output = output+'\n'+current.data;
            current = current.next;
        }
        return output;
    }

}