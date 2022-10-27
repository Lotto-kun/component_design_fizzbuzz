import java.util.ArrayList;
import java.util.List;

public class Main {
    public static RuleComposite rules = new RuleComposite();
    public static final int NUMS = 45;
    public static void main(String[] args) {
        rules.addRule(new ThreeRule());
        rules.addRule(new FiveRule());
        rules.addRule((new SevenRule()));
        List<String> result = fizzBuzzGame(NUMS);
        System.out.println(result);
    }
    public static List<String> fizzBuzzGame(int nums){
        List<String> result = new ArrayList<>();
        for (int i = 1; i <= nums; i++){
            result.add(rules.getResult(i));
        }
        return result;
    }
}
