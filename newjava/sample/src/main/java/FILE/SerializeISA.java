package FILE;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;    
class Person implements Serializable{    
 int id;    
 String name;    
 Person(int id, String name) {    
  this.id = id;    
  this.name = name;    
 }    
}    
class Student extends Person{    
 String course;    
 int fee;    
 public Student(int id, String name, String course, int fee) {    
  super(id,name);    
  this.course=course;    
  this.fee=fee;    
 }    
}    
public class SerializeISA  
{    
 public static void main(String args[])  
 {    
    try{    
   
  Student s1 =new Student(211,"ravi","Engineering",50000);    
  //Creating stream and writing the object    
  FileOutputStream fout=new FileOutputStream("f1.txt");    
  ObjectOutputStream out=new ObjectOutputStream(fout);    
  out.writeObject(s1);    
  out.flush();    
  //closing the stream    
  out.close();    
  System.out.println("success");    
  }catch(Exception e){System.out.println(e);}    
  try{    
  //Creating stream to read the object    
  ObjectInputStream in=new ObjectInputStream(new FileInputStream("f1.txt"));    
  Student s=(Student)in.readObject();    
  //printing the data of the serialized object    
  System.out.println(s.id+" "+s.name+" "+s.course+" "+s.fee);    
  //closing the stream    
  in.close();    
  }catch(Exception e){System.out.println(e);}    
 }    
}  