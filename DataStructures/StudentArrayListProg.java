public class StudentArrayListProg{
  public static void main(String[] args) {
       StudentArrayList myList = new StudentArrayList(50);
       myList.insertItem(1000, "One", "Student1", 3.8, "153-563-8999");
       myList.insertItem(1001, "Two", "Student2", 2.7, "256-893-8789");
       myList.insertItem(1002, "Three", "Student3", 1.9, "153-223-6539");
       myList.insertItem(1003, "Four", "Student4", 1.5, "323-123-8999");
      
       System.out.println(myList);

  }
  
}

