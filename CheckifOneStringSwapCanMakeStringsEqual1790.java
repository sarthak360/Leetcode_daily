class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if (s1.equals(s2)){
            return true;
        }
        int firstdif=-1;
        int seconddif=-1;
        int diffCount=0;
        for (int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                diffCount++;
                if(firstdif==-1){
                    firstdif=i;
                }
                else if(seconddif==-1){
                    seconddif=i;
                }
                else return false;
            }
        }
        if (diffCount != 2) {
            return false;
        }
        return s1.charAt(firstdif) == s2.charAt(seconddif) && s1.charAt(seconddif) == s2.charAt(firstdif);
    }

}
