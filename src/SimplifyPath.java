import java.util.Stack;
public class SimplifyPath {
    public static void main(String[] args){
        System.out.println(clearpath("/Z/Iyy/HSyT/ItVqc/.././//Z/.././.././../a/gK/../ZurH///x/../////././../.."));
    }
    public static String clearpath(String s){
        String endstring="";
        Stack<String> returner = new Stack<>();
        String[] letters = s.split("/");
        for(int i=0;i<letters.length;i++){
            if(!letters[i].equals("")&&!letters[i].equals("..")&&!letters[i].equals(".")){
                returner.push("/"+letters[i]);
            }
            else if(letters[i].equals("..")&&i-1>=0&&!returner.isEmpty()){
                returner.pop();
            }
        }
        for(int i=0;i<returner.size();i++){
            endstring+= returner.get(i);
        }
        if(endstring.equals("")){
            return "/";
        }
        return endstring;
    }
}
