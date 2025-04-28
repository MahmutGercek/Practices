import java.util.ArrayList;
public class StringInputAverage {
    public static void main(String[] args) {
        calculate("istanbul;1453");
    }
    public static void calculate(String x) {
        ArrayList<String> letters = new ArrayList<>();
        ArrayList<Integer> numbers = new ArrayList<>();
        int i = 0;
        double sum = 0;
        double product = 1;
        while (x.charAt(i) != ';') {
            letters.add(String.valueOf(x.charAt(i)));
            i++;
        }
        for(int j=i+1; j<x.length();j++){
            numbers.add(Integer.parseInt(String.valueOf(x.charAt(j))));
        }
        if(letters.size()<4){
            for(int k=0;k<numbers.size();k++){
                sum += numbers.get(k);
            }
            double aa=  sum /numbers.size();
            System.out.println(aa);
        }
        else{
            for(int k=0;k<numbers.size();k++){
                product *= numbers.get(k);
            }
            double ga = Math.pow(product,1.0/numbers.size());
            System.out.println(ga);
        }
    }
}



