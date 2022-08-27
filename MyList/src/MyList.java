public class MyList <T>{
    private int capacity = 10; // array initial value
    private T[] array;
    private int index = 0;

    public MyList() {
        this.array = (T[])new Object[capacity];
    }

    public MyList(int capacity) { // MyList<Integer> list = new MyList<>();
        this.capacity = capacity;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public int size(){
        return index;
    }

    public void add(T data){
        if(index == this.capacity){
            T[] newArray = (T[]) new Object[capacity * 2];
            int i = 0;
            for (T arr : this.array) {
                newArray[i] = arr;
                i++;
            }
            this.array = newArray;
            this.capacity = this.capacity*2;
        }
        array[index] = data;
        index++;
    }

    public T get(int index){
        if(index < 0 || index>this.index){
            return null;
        }else{
            return array[index];
        }
    }

    public T remove(int index){
        this.index--;
        if(index < 0 || index>this.index){
            return null;
        }else{
            T deleteIndexValue = this.array[index];
            for (int i = index; i<this.index; i++){
                this.array[i] = this.array[i+1];
            }
            this.array[size()] = null;
            return deleteIndexValue;
        }
    }

    public T set(int index, T data){
        if(index < 0 || index>this.index){
            return null;
        }else{
            T setIndexValue = this.array[index];
            this.array[index] = data;
            return setIndexValue;
        }
    }

    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        for(T arr : this.array){
            if(arr!=null){
                stringBuilder.append(arr.toString() + ",");
            }
        }
        stringBuilder.deleteCharAt(stringBuilder.length()-1);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public int indexOf(T data){
        int dataIndex = 0;
        boolean isThere = false;
        for(T arr : this.array){
            if(arr == data){
                isThere = true;
                break;
            }
            dataIndex++;
        }
        return isThere == true ? dataIndex : -1;
    }

    public int lastIndexOf(T data){
        int dataIndex = 0;
        int lastIndex = 0;
        boolean isThere = false;
        for(T arr : this.array){
            if(arr == data){
                isThere = true;
                lastIndex = dataIndex;
            }
            dataIndex++;
        }
        return isThere == true ? lastIndex : -1;
    }

    boolean isEmpty(){
        return index == 0 ? true : false;
    }

    public T[] toArray(){
        return this.array;
    }

    public void clear(){
        this.index = 0;
        this.capacity = 10;
        T[] newArray = (T[]) new Object[this.capacity];
        this.array = newArray;
    }

    public MyList<T> sublist(int start,int finish){
        MyList<T> newMyList = new MyList<>();
        for(int i = start+1; i<finish; i++){
            newMyList.add(this.array[i]);
        }
        return newMyList;
    }

    public boolean contains(T data){
        boolean isThere = false;
        for(T arr : this.array){
            if(arr == data){
                isThere = true;
            }
        }
        return isThere;
    }
}
