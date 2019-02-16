package adjacencymatrix;
import java.io.*;
import java.util.ArrayList;
public class AdjacencyMatrix {

    public static void main(String[] args) throws FileNotFoundException, IOException {
       File file = new File("E:\\test.txt");
       BufferedReader br = new BufferedReader(new FileReader(file));
       String st;
       int [][] a;
       ArrayList test = new ArrayList();
       st = br.readLine();
       int Node = Integer.parseInt(st);
       String edges = br.readLine();
       a = new int[Node][Node];
       while((st=br.readLine())!=null){
           String [] s1 = st.split(",");
           int p = Integer.parseInt(s1[0]);
           int q = Integer.parseInt(s1[1]);
           a[p][q]=1;
           a[q][p]=1;
       }
       for(int i=0;i<a.length;i++){
           for(int j=0;j<a[0].length;j++){
               System.out.print(a[i][j]+" ");
           }
           System.out.println();
       }
       //list
       
    }
    
}
