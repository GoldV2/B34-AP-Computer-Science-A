import java.util.ArrayList;

class NameArrayList {
    int size = 0;
    ArrayList<String> vals = new ArrayList<String>();

    public NameArrayList() {

    }

    public void add(String val) {
        if (this.vals.contains(val)) {
            this.vals.add(val);
        }
    }

    public String toString() {
        String str = "";
        for (String name : this.vals) {
            str += name + "\n";
        }

        return str;
    }
}
