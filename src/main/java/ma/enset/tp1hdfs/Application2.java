package ma.enset.tp1hdfs;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

import java.io.*;

public class Application2 {
    public static void main(String[] args) throws IOException {
        Configuration conf=new Configuration();
        conf.set("fs.defaultFS","hdfs://localhost:9000");
        FileSystem fs=FileSystem.get(conf);
        //fs.createNewFile(new Path("/file2.txt"));
        FSDataInputStream fsip=fs.open(new Path("/file3.txt"));
        InputStreamReader ipsr=new InputStreamReader(fsip);
        BufferedReader br=new BufferedReader(ipsr);
        String ligne=null;
       while ((ligne=br.readLine())!=null){
           System.out.println(ligne);
       }

        fs.close();
    }
}
