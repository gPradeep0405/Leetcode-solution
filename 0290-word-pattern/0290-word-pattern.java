class Solution {
    public boolean wordPattern(String pat, String s) {
        // Map<String,Character> map=new HashMap<>();
        String[] arr=s.split(" ");
        // int  j=0;
        // for (int i = 0; i < arr.length; i++) {
        //     if (!map.containsKey(arr[i])) {
        //         map.put(arr[i], pat.charAt(j));
        //         j++;
        //     }
        // }
        // Set<String> set=new HashSet<>();
        // for(String i:map.keySet()){
        //     set.add(i);
        // }
        // return set.size()==map.size();
        Set<Character> ch=new HashSet<>();
        for(char i:pat.toCharArray()){
            ch.add(i);
        }
        Set<String> str=new HashSet<>();
        for(String i:arr){
            str.add(i);
        }
        if(pat.length()!=arr.length){
            return false;
        }
        if(ch.size()!=str.size()){
            return false;
        }
        for(int  i=0;i<pat.length();i++){
            for(int j=i+1;j<pat.length();j++){
                 if (pat.charAt(i) == pat.charAt(j)) {
                    if (!arr[i].equalsIgnoreCase(arr[j])) {
                        return false;
                    }
                }

                // Same word must have same pattern
                if (arr[i].equalsIgnoreCase(arr[j])) {
                    if (pat.charAt(i) != pat.charAt(j)) {
                        return false;
                    }
                }
            }
        }
        return true;

        
    }
}