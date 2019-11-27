package dsjava1;


import java.io.*;
// zakar mourad
public class Lecteur extends Thread{

   private String fileName;
    private String threadName;
    private  MyBuffer buffer;

    public Lecteur(String fileName, String threadName, MyBuffer buffer) {
        this.fileName = fileName;
        this.threadName = threadName;
        this.buffer = buffer;
    }

    public String readWord() throws IOException {
        File f = new File(this.fileName);
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(f)));
        String line;
        while ((line = reader.readLine())!=null){
                String[] Wordlist = line.split("[ ;.,!?\"]");
                while (!line.equals(Wordlist)){
                    System.out.println(line);
                }
        }
        return line;
    }
    public void run(){
        File f = new File(this.fileName);
        BufferedInputStream bufferedInputStream = null;
        try {
            bufferedInputStream = new BufferedInputStream(new FileInputStream(f));
            byte[] buf=  new  byte[10];
            int in = 0;
            while ((in=bufferedInputStream.read(buf))>=0){
                for (int i=0;i<in;i++) {
                     System.out.print((char) buf[i]);
                     if (in<this.buffer.data.size()){
                         
                     }else {
                         this.buffer.addWord(String.valueOf(((char) buf[i])));
                     }
                 }
            }
            bufferedInputStream.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

}
