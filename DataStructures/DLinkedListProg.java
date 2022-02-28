public class DLinkedListProg {
    public static void main(String []args)
    {
        DLinkedList myList = new DLinkedList();
        myList.addToLast("Hello 1");
        myList.addToLast("Hello 2");
        myList.addToLast("Hello 3");
        myList.addToLast("Hello 4");
        myList.addToLast("Hello 5");
        myList.addToLast("Hello 6");
        myList.Insert("Special", 2);
        System.out.println(myList.Find("Special"));
        System.out.println(myList.Find("Speciall"));
        System.out.println(myList);
        myList.reset();
        while(!myList.isLast()) System.out.println(myList.getNext());
        while(myList.lengthIs()>0) myList.deleteFromLast();

        for(int i=0;i<500;i++) myList.addToFirst(Integer.toString(i));
        while(myList.lengthIs()>0) 
        {
            if(myList.lengthIs()%10000==0) System.out.println(myList.lengthIs());
            myList.deleteFromLast();
        }
        
        /* Added */
        /* Added */
        /* Added */
        
        System.out.println(myList.RetrieveAt(8));
        myList.DeleteAt(2);
        myList.swap(1, 2);
        
        /* Added */
        /* Added */
        /* Added */
    }
}