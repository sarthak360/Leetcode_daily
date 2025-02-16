class Solution {
    public int[] constructDistancedSequence(int n) {
        int size=2*n-1;
        int [] arr=new int[size];
        boolean []used = new boolean[n+1];
        backtrack(arr,used,n,0);
        
        return arr;
    }
    private static boolean backtrack(int[] arr, boolean[] used, int n, int index) {
        while (index < arr.length && arr[index] != 0) {
            index++;
        }
        if (index == arr.length) {
            return true;
        }

        for (int num = n; num >= 2; num--) {
            if (used[num]) continue;

            int secondPos = index + num; 
            if (secondPos < arr.length && arr[index] == 0 && arr[secondPos] == 0) {
                
                arr[index] = arr[secondPos] = num;
                used[num] = true;

                if (backtrack(arr, used, n, index + 1)) {
                    return true;
                }

                arr[index] = arr[secondPos] = 0;
                used[num] = false;
            }
        }

        if (!used[1]) {
            arr[index] = 1;
            used[1] = true;

            if (backtrack(arr, used, n, index + 1)) {
                return true;
            }

            arr[index] = 0;
            used[1] = false;
        }

        return false;
    }
}
