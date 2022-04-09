class Solution {
    public static String[] divideString(String s, int k, char fill) {
        ArrayList<String> ans = new ArrayList<>();
        String res = "";
        for(int i=0; i<s.length(); i++) {
            res += s.charAt(i);
            if(res.length() == k){
                ans.add(res);
                res = "";
            }
        }
        if(res.length() > 0 && res.length() != k) {
            while(res.length() != k) {
                res += fill;
            }
            ans.add(res);
        }
        String[] r=new String[ans.size()];
        for(int i=0;i<ans.size();i++){
            r[i]=ans.get(i);
        }
        return r;
    }
}

// class Solution {
// public static String[] divideString(String s, int k, char fill) {
//         ArrayList<String> ans = new ArrayList<>();

//         for(int i=0; i<s.length() && i+k<s.length()+1 ; i += k) {

//             String str = s.substring(i,i+k);
//             ans.add(str);
//         }

//         int d = 0;

//         if(s.length()%k == 0) {
//             d = 0;
//         }
//         else {
//             d = k - s.length() % k;
//             int p = s.length() - s.length()%k;

//             String last ="";
//             for(int i=p; i<s.length(); i++) {
//                 last += s.charAt(i);
//             }
//             for(int x=1; x<=d; x++) {
//                 last = last + fill;
//             }
//             ans.add(last);
//         }

//         String[] r=new String[ans.size()];
//         for(int i=0;i<ans.size();i++){
//             r[i]=ans.get(i);
//         }
//         return r;
//     }
// }