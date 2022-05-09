package Modules;

import apiActions.Actions;
import java.util.List;
import java.util.stream.Collectors;


public class Patterns {
    private static Actions actions;


    public static List<Integer> getNumViews(){
       List<String> numViewStringList =actions.getRequest("api/patterns").xmlPath().getList("patterns.pattern.numViews");
       return numViewStringList.stream().map(Integer::parseInt).collect(Collectors.toList());
    }

    public static boolean isNumViewsGreaterThanValue(int value){
        return getNumViews().stream().allMatch(i -> i> value);
    }


}
