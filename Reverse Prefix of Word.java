class Solution {
    public String reversePrefix(String word, char ch) {
         int ind=word.indexOf(ch);
        if(ind==-1){
            return word;
        }
        StringBuilder str=new StringBuilder(word.substring(0,ind+1));
        str.reverse();
        str.append(word.substring(ind+1));
        return str.toString();
    }
}
