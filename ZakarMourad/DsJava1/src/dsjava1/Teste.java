package dsjava1;

import java.io.File;
// zakar mourad
public class Teste {

    public static void main(String[] args) {

        String file1 = "C:\\Users\\Client27\\Desktop\\java\\fichier1.txt";
        String file2 = "C:\\\\Users\\\\Client27\\\\Desktop\\\\java\\\\fichier2.txt";
        MyBuffer buffer = new MyBuffer(100);
        Processor procssor = new Processor("Thread",buffer);
        Processor procssor2= new Processor("Thread1",buffer);
        procssor.start();
        procssor2.start();
        new Lecteur(file1,"Thread",buffer).start();
        new Lecteur(file2,"Thread1",buffer).start();

    }
}
