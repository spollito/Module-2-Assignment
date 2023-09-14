class ObjectCount {
    
    static int count = 0;

    ObjectCount() {
        count++;
    }

    public static void main(String[] args) {
      
        ObjectCount a = new ObjectCount();
        ObjectCount b = new ObjectCount();
        ObjectCount c = new ObjectCount();
        ObjectCount d = new ObjectCount();

       
        System.out.print("Number of objects is " + ObjectCount.count);
    }
}

