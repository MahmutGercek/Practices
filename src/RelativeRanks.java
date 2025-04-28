import java.util.HashMap;
public class RelativeRanks {
    public static void main(String[] args){
        int[] score = {10,3,8,9,4};
        System.out.println(findRelativeRanks(score));
    }
    public static String[] findRelativeRanks(int[] score){
        String[] medals = new String[score.length];
        HashMap<Integer,Integer> Leaderboard = new HashMap<>();
        int biggest=score[0];
        for(int i=0;i< score.length;i++){
            Leaderboard.put(score[i],i);
            if(score[i]>biggest){
                biggest=score[i];
            }
        }
        int[] placements=new int[biggest+1];
        for(int i=0;i< score.length;i++){
            placements[score[i]]=1;
        }
        int placement=1;
        for(int i=biggest;i>=0;i--){
            if(placements[i]==1){
                int indexofnumber =Leaderboard.get(i);
                if(placement==1){
                    medals[indexofnumber]= "Gold Medal";
                }
                else if(placement==2){
                    medals[indexofnumber]= "Silver Medal";
                }
                else if(placement==3){
                    medals[indexofnumber]= "Bronze Medal";
                }
                else{
                    medals[indexofnumber] = String.valueOf(placement);
                }
                placement++;
            }
        }
        return medals;
    }
}
