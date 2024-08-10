package Arraylists;

import java.util.Arrays;

import static java.lang.StringTemplate.STR;

public class MyArrayList {
    private int data[]; // Globally declared array
    private int last = 0;

    public MyArrayList(){
        data = new int[10];// default constructor  to initialise array size
    }

    public MyArrayList(int initialCapacity){
        data = new int[initialCapacity]; // parametrized constructor with some initial Capaccity
    }

    public int size(){
        return last;
    }

    public void add(int element){
        ensureCapacity();
        data[last++] = element;
    }

    public void add(int index, int element){
        if(index < 0 || index > last)
            throw new IndexOutOfBoundsException(STR."\{index} out of bounds for \{last}");
        ensureCapacity();
        for(int i = last; i > index; i--){
            data[i] = data[i-1];
        }
        data[index] = element;
        last++;
    }

    public  void ensureCapacity(){
        if(last == data.length){
            int temp[] = new int[data.length * 2];
            for(int i = 0; i < data.length; i++){
                temp[i] = data[i];
            }
            data = temp;
        }
    }

    public String toString(){
        if(last == 0)return "[]";
        StringBuilder sb = new StringBuilder("[");
        for(int i = 0; i < last; i++){
            sb.append(STR."\{data[i]}, ");
        }
        sb.delete(sb.length()-2,sb.length());
        return sb + "]";
    }

    public int remove(int index){
        if(index < 0 || index >= last)
            throw new IndexOutOfBoundsException(STR."Cannot delete \{index}");
        int temp = data[index];
        for(int i = index; i < last; i++){
            data[i] = data[i+1];
        }
        data[last-1] = 0;
        last--;
        return temp;
    }
}
