class StringList {
    int size = 0;
    String[] vals = new String[0];

    public StringList() {

    }

    public String get(int i) {
        if (i < 0 || i >= size){
            return ""; // returning empty string because this.vals does not contain empty strings
        }

        return this.vals[i];
    }


    public void add(String val) {
        if (!(this.contains(val) || val.equals(""))) {
            String[] newVals = new String[this.size+1];
            for (int i = 0; i < this.size; i++) {
                newVals[i] = this.vals[i];  
            }
            
            this.size++;
            newVals[size-1] = val;
            this.vals = newVals;
        }
    }

    public void remove(String val) {
        if (this.contains(val)) {
            size--;
            String[] newVals = new String[size];
            for (int i = 0; i < this.size; i++) {
                if (vals[i] != val){
                    newVals[i] = this.vals[i];
                }
            }
    
            this.vals = newVals;
        }
    }

    public boolean contains(String val) {
        for (String v: this.vals) {
            if (v == val) {
                return true;
            }
        }

        return false;
    }

    public String toString() {
        String str = "[";
        for (String val : this.vals) {
            str += val + ", ";
        }
        
        str = str.substring(0, str.length()-2) + "]";
        return str;
    }


}
