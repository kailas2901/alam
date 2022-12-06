import java.io.*;
class ReadCont{

public static void main(String[]args) throws IOException{



File f3 = new File("file1.txt");



f3.createNewFile();

if(!f3.exists()){

f3.createNewFile();

}

FileReader fr = new FileReader(f3);
BufferedReader br = new BufferedReader(fr);
String line;
while((line = br.readLine())!=null){
System.out.println(line);
}

br.close();
}

}