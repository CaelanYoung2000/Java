public class DLinkedList {
    private class Node
    {
        String data;
        Node next;
        Node prev;
        public Node(String s)
        {
            data = s;
            next = null;
            prev = null;
        }
    }
    
    private Node first;
    private Node last;
    private int length;
    private Node curPos;
    
    public DLinkedList()
    {
        length = 0;
        first = last = curPos = null;
    }
    
    public void makeEmpty()
    {
        length = 0;
        first = last = curPos = null;
    }
    public int lengthIs()
    {
        return length;
    }
    
    public void addToFirst(String s)
    {
        Node newNode = new Node(s);
        newNode.next = first;
        if(length>0) first.prev = newNode;
        first = newNode;
        length++;
        if(length==1) last = newNode;
    }
    
    public void addToLast(String s)
    {
        Node newNode = new Node(s);
        if(length==0)
        {
            first = last = newNode;
            length++;
            return;
        }
        last.next = newNode;
        newNode.prev = last;
        last = newNode;
        length++;
        
    }
    
    public int Find(String s)
    {
        Node current = first;
        int rank = 0;
        while(current!=null)
        {
            if(current.data.equals(s)) return rank;
            else
            {
                current = current.next;
                rank++;
            }
        }
        return -1;
    }
    
    public void Insert(String s, int rank)
    {
        if(rank<=0) 
        {
            addToFirst(s);
            return;
        }
        if(rank>=length)
        {
            addToLast(s);
            return;
        }
        Node newNode = new Node(s);
        Node current = first;
        for(int i=0;i<rank-1;i++)
            current = current.next;
        
        newNode.next = current.next;
        current.next = newNode;
        newNode.prev = current;
        newNode.next.prev = newNode;
        
        length++;
    }
    public void deleteFromFirst()
    {
        if(length==0) return;
        if(curPos == first) curPos = null;
        first = first.next;
        if(first!=null) first.prev = null;
        length--;
        if(length==0) last = null;
    }
    public void deleteFromLast()
    {
        if(length==0) return;
        if(length==1) 
        {
            makeEmpty();
            return;
        }
        last.prev.next = null;
        if(curPos==last) curPos = last.prev;
        last = last.prev;
        length--;
    }
    
    public boolean isLast()
    {
        return curPos == last;
    }
    public String getNext()
    {
        if(isLast()) return null;
        if(curPos==null) curPos = first;
        else curPos = curPos.next;
        return curPos.data;
    }
    
    public void reset()
    {
        curPos = null;
    }
    
    public String toString()
    {
        String output = "The list has:";
        Node current = first;
        for(int i=0;i<length;i++)
        {
            output = output+'\n'+current.data;
            current = current.next;
        }
        return output;
    }
     
    
    /* Added Methods */
    /* Added Methods */
    /* Added Methods */
    
    public String RetrieveAt(int index) 
    {
        Node current = first;
        int count = 0;
        while (current != null) {
            if (count == index) {
                return current.data;
            }
            else {
                count++;
                current = current.next;
            }
 
        }
        return null;
    }
    public void DeleteAt(int index)
    { 
        if (first == null) 
            return; 
  
        Node temp = first; 
  
        if (index == 0) 
        { 
            first = temp.next;  
            return; 
        } 
  
        for (int i=0; temp!=null && i<index-1; i++) 
            temp = temp.next; 
  
        if (temp == null || temp.next == null) 
            return; 
  
        Node next = temp.next.next; 
  
        temp.next = next;  
    } 
    
    public void swap(int n1, int n2){  
        Node prevNode1 = null, prevNode2 = null, node1 = first, node2 = first;  
          
         
        if(first == null) {  
            return;  
        }  
          
         
        if(n1 == n2)  
            return;  
          
        
        while(node1 != null && !node1.data.equals(n1)){  
            prevNode1 = node1;  
            node1 = node1.next;  
        }  
          
       
        while(node2 != null && !node2.data.equals(n2)){  
            prevNode2 = node2;  
            node2 = node2.next;  
        }  
          
        if(node1 != null && node2 != null) {  
              
            
            if(prevNode1 != null)  
                prevNode1.next = node2;          
            else  
                first  = node2;  
              
            
            if(prevNode2 != null)  
                prevNode2.next = node1;  
            else  
                first  = node1;  
              
          
            Node temp = node1.next;   
            node1.next = node2.next;   
            node2.next = temp;       
        }
    }
}
    /* Added Methods */
    /* Added Methods */
    /* Added Methods */
