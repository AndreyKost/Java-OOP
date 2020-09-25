package strings;

import java.util.ArrayList;

public class StackOfStrings {
    private ArrayList<String> data;

    public StackOfStrings(){
        this.data=new ArrayList<>();
    }

    public void push(String item){
        this.data.add(item);
    }

    public String pop(){
        String str=this.data.get(this.data.size()-1);
        this.data.remove(this.data.size()-1);

        return str;
    }

    public String peek(){
        return this.data.get(this.data.size()-1);
    }

    public boolean isEmpty(){
        if(this.data.size()<=0){
            return true;
        }
        return false;
    }

}
