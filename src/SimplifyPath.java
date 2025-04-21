import java.util.ArrayList;
public class SimplifyPath {
    public static void main(String[] args){
        System.out.println(clearpath("/Z/Iyy/HSyT/ItVqc/.././//Z/.././.././../a/gK/../ZurH///x/../////././../.."));
    }
    public static String clearpath(String s){
        String endstring="";
        ArrayList<String> words = new ArrayList<>();
        String[] letters = s.split("/");
        for(int i=0;i<letters.length;i++){
            if(!letters[i].equals("")&&!letters[i].equals("..")&&!letters[i].equals(".")){
                words.add("/"+letters[i]);
            }
            else if(letters[i].equals("..")&&i-1>=0&&!words.isEmpty()){
                words.remove(words.size()-1);
            }
        }
        for(int i=0;i<words.size();i++){
            endstring+= words.get(i);
        }
        return endstring;
    }
}
