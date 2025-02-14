class ProductOfNumbers {
    List<Integer> l;
    public ProductOfNumbers() {
        l=new ArrayList<>();
    }
    
    public void add(int num) {
        l.add(0, num);
    }
    
    public int getProduct(int k) {
        int pro=1;
        while(k-->0) pro*=l.get(k);
        return pro;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */