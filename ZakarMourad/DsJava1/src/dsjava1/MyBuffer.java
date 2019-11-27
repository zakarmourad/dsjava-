package dsjava1;
import java.util.LinkedList;
// zakar mourad
public class MyBuffer {

    private int size ;
    LinkedList<String> data = new LinkedList<String>();

    public MyBuffer(int size) {
        this.size = size;
    }

    public void addWord(String s){
    	if (this.data.size()<this.size) {
    		this.data.add(s);
    	}
        
    }

}
