public class Solution_38 {
    public String countAndSay(int n) {
        if (n==1){
            return "1";
        }
        else{
            String temp = "1";
            for(int i = 1; i<n ; i++){
                 temp = core(temp);
            }
            return temp;
        }

    }
    public static String core(String string){
        StringBuilder temp=new StringBuilder();
        int num = 0;
        for (int i = 0 ;i<string.length();){
            char a = string.charAt(i);
            int j = i;
            for (;j<string.length();j++){
                if (string.charAt(i)==string.charAt(j)){
                    num++;
                }
                else{
                    break;
                }
            }
            i = j;
            temp.append(""+num+a);
            num = 0;
        }
        return temp.toString();
    }
    public static String core2(String string){
        StringBuilder temp=new StringBuilder();
        int num = 1;
        char a = string.charAt(0);
        for (int j = 1;j<string.length();j++){
            if (string.charAt(j)==a){
                num++;
            }
            else{
                temp.append(num);
                temp.append(a);
                a = string.charAt(j);
                num = 1;

            }
        }
        temp.append(num);
        temp.append(a);
        return temp.toString();
    }
    public static void main(String[] args) {
        System.out.println(core2("1211"));
    }

}
