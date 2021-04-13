package view;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ViewInterface {
    public static Scanner input=new Scanner(System.in);
    public static String getInput() {
        return input.nextLine();
    }
    public static void showResult(String result){
        System.out.println(result);
    }
    public static Matcher getCommandMatcher(String input , String regex){
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(input);
        matcher.find();
        return matcher;
    }
}