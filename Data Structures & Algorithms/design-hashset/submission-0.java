class MyHashSet {
    List<Integer> list=new ArrayList<>();
    public MyHashSet() {
        this.list=list;
    }
    
    public void add(int key) {
        if(!list.contains(key))
        list.add(Integer.valueOf(key));
    }
    
    public void remove(int key) {
        list.remove(Integer.valueOf(key));
    }
    
    public boolean contains(int key) {
        if(list.contains(key)){
            return true;
        }else{
            return false;
        }
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */