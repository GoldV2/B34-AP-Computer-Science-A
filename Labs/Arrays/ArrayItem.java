public class ArrayItem {
    
    public int index;
    private int count;

    public ArrayItem(int index) {
        this.index = index;
    }

    public void increment(int multiple) {
        if (multiple > 0) {
            count *= multiple;
        }
        else {
            count++;
        }
    }

    public int getCount() {
        return this.count;
    }

}