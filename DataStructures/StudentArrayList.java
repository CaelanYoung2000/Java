class Student {
    
   private String lastName;
   private String firstName;
   private int id;
   private double gpa;
   private String phone;
   private int year;
   private int month;
   private int date;
   private String home;

   public Student(int in_id, String ln, String fn, double g, String phone, int yy, int mm, int dd, String address) {
       
       id = in_id;
       lastName = ln;
       firstName = fn;
       gpa = g;
       this.phone = phone;
       year = yy; 
       month = mm;
       date = dd;
       home = address;
               
   }

   public int getID() {
       return id;
   }

   public double getGPA() {
       return gpa;
   }

   public String getLName() {
       return lastName;
   }

   public String getFName() {
       return firstName;
   }

   public String getPhone() {
       return phone;
   }

   public void setPhone(String phone) {
       this.phone = phone;
   }
}

class StudentArrayList {
   protected Student[] list;
   protected int length;
   protected int curPos;
   protected int capacity;

   public StudentArrayList() {
       list = new Student[100];
       length = 0;
       capacity = 100;
       curPos = -1;
   }

   public StudentArrayList(int c) {
       if (c < 1)
           capacity = 100;
       else
           capacity = c;
       list = new Student[capacity];
       length = 0;
       curPos = -1;
   }

   public int getCapacity() {
       return capacity;
   }

   public void makeEmpty() {
       length = 0;
       curPos = -1;
   }

   public boolean isFull() {
// if(length==capacity) return true;
// else return false;

       return length == capacity;
   }

   public int lengthIs() {
       return length;
   }

   public Student retrieveItem(int id) {
       for (int i = 0; i < length; i++) {
           if (id == list[i].getID()) {
               Student r = new Student(list[i].getID(), list[i].getLName(), list[i].getFName(), list[i].getGPA(),
                       list[i].getPhone());
               return r;
           }
       }
       return null;
   }

   public boolean insertItem(int id, String lName, String fName, double gpa, String phone) {
// if(length>=capacity) return false;
       if (isFull())
           return false;
       //checking for duplicate id
       for(int i=0; i<length; i++) {
           if(list[i].getID() == id) {
               System.err.println("Duplicate ID not allowed");
               return false;
           }
       }
       list[length] = new Student(id, lName, fName, gpa, phone);
       length++;
       return true;
   }

   public boolean deleteItem(int id) {
       int hit = -1;
       for (int i = 0; i < length; i++) {
           if (id == list[i].getID())
               hit = i;
       }

       if (hit == -1)
           return false;
       else {
           list[hit] = list[length - 1];
           length--;
           return true;
       }
   }
  
   //swap id method
   public void swapID(int id1, int id2) {
       Student temp;
       int index1 = 0, index2=0;
      
       for(int i =0; i<length; i++) {
           if(list[i].getID() == id1)
               index1 = i;
           if(list[i].getID() == id2)
               index2 = i;
       }
      
       temp = list[index1];
       list[index1] = list[index2];
       list[index2] = temp;
   }
  
   //modify method
   public void modify(int id, String lastName, String firstName, float GPA, String phone) {
       boolean changed = false;
       for(int i =0; i<length; i++) {
           if(list[i].getID() == id) {
               list[i] = new Student(id, lastName, firstName, GPA, phone);
               changed = true;
           }
       }
       if(!changed)
           insertItem(id, lastName, firstName, GPA, phone);
   }

   public Student getNext() {
       if (curPos + 1 >= length)
           return null;
       else {
           curPos++;
           return new Student(list[curPos].getID(), list[curPos].getLName(), list[curPos].getFName(),
                   list[curPos].getGPA(), list[curPos].getPhone());
       }
   }

   public void reset() {
       curPos = -1;
   }

   public boolean isLast() {
       if (curPos >= length - 1)
           return true;
       else
           return false;
   }

   public String toString() {
       String output;
       output = "There are " + length + " students in the list\n";
       for (int i = 0; i < length; i++) {
           output = output + list[i].getID() + " " + list[i].getFName() + " " + list[i].getLName() + " "
                   + list[i].getGPA()+" "+ list[i].getPhone() + '\n';
       }
       return output;
   }
}