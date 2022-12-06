import java.io.*;

class Read{
public static void main(String[] args)throws IOException{

File f1=new File("ij.txt");
f1.createNewFile();
System.out.println("file created");

FileWriter f2 = new FileWriter(f1);
f2.write("My Name is GGG");
f2.flush();
f2.close();


}

}