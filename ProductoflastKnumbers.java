class ProductOfNumbers {
    private ArrayList<Integer> prefixProduct;
    private int lastZeroIndex;
    public ProductOfNumbers() {
        prefixProduct = new ArrayList<>();
        prefixProduct.add(1);  
        lastZeroIndex = -1;
    }
    
    public void add(int num) {
        if (num == 0) {
            prefixProduct.clear();
            prefixProduct.add(1);  
            lastZeroIndex = prefixProduct.size() - 1; 
        } else {
            int lastProduct = prefixProduct.get(prefixProduct.size() - 1);
            prefixProduct.add(lastProduct * num);
        }
    }
    
    public int getProduct(int k) {
        int n = prefixProduct.size();
        if (k >= n) {  
            return 0;
        }
        return prefixProduct.get(n - 1) / prefixProduct.get(n - 1 - k);
    }
    
}
