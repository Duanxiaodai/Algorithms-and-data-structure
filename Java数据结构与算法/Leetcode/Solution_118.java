import java.util.ArrayList;
import java.util.List;

class Solution_118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        if (numRows>=1){
            List<Integer> temp = new ArrayList<>();
            temp.add(1);
            list.add(temp);
//            return list;
        }
        if (numRows>=2){
            List<Integer> temp = new ArrayList<>();
            temp.add(1);
            temp.add(1);
            list.add(temp);
        }
        for (int i = 2 ;i<numRows;i++){
            List<Integer> temp = new ArrayList<>();
            temp.add(1);
            for (int j = 1;j<=i-1;j++){
                temp.add(list.get(i-1).get(j-1)+list.get(i-1).get(j));
            }
            temp.add(1);
            list.add(temp);
        }

        return list;
    }
}