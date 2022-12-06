import java.io.*;

class RD{
public static void main(String[] args)throws IOException{

File f1=new File("ij.txt");
f1.createNewFile();
System.out.println("file created");

FileReader f3=new FileReader(f1);
BufferedReader f4=new BufferedReader(f3);
String ind;
while((ind=f4.readLine())!=null){
System.out.println(ind);
}

f4.close();

}

}