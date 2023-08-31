package ma.enset.tp1hdfs;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.*;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class Application {
    public static void main(String[] args) throws IOException {
       Configuration conf=new Configuration();
       conf.set("fs.defaultFS","hdfs://localhost:9000");
       FileSystem fs=FileSystem.get(conf);
       //fs.createNewFile(new Path("/file2.txt"));
        FSDataOutputStream fsop=fs.create(new Path("/file3.txt"));
        OutputStreamWriter opsw=new OutputStreamWriter(fsop);
        PrintWriter pw=new PrintWriter(opsw,true);
        pw.println("Bonjour");
        pw.println("tour le monde");
        pw.println("bddc1");

       fs.close();
    }
}
