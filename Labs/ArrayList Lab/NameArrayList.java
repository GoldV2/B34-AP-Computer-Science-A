import java.util.ArrayList;

class NameArrayList {
    int size = 0;
    ArrayList<String> vals = new ArrayList<String>();

    public NameArrayList() {

    }

    public void add(String val) {
        if (!(this.vals.contains(val) || val.equals(""))) {
            this.vals.add(val);
        }
    }

    public void remove(String val) {
        if (this.vals.contains(val)) {
            this.vals.remove(val);
        }
    }
}
