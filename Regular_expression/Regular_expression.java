// Regular expression
/*
 * use Regular expression to find the pattern in a string
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regular_expression{
    public static void main(String[] args) {
        String phonenumber = "110,119,120,911,123435";
        Pattern pattern = Pattern.compile("1[0-9]{2}");
        Matcher matcher = pattern.matcher(phonenumber);
        while(matcher.find()){
            System.out.println("start index" + matcher.start());
            System.out.println("end index" + matcher.end());
            System.out.println(matcher.group(0));
    }
    for(String s:phonenumber.split(","))
    {
        System.out.println(s);
    }
}   
}