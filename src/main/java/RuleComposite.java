import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class RuleComposite implements Rule{
    Set<Rule> rules = new TreeSet<>(Comparator.comparing(Rule::getRuleValue));
    public void addRule(Rule rule){
        rules.add(rule);
    }

    @Override
    public boolean apply(int num) {
        for (Rule rule : rules){
            if (rule.apply(num)){
                return true;
            }
        }
        return false;
    }

    public String getResult(int num){
        StringBuilder sb = new StringBuilder();
        for (Rule rule : rules){
            if (rule.apply(num)) {
                sb.append(rule.getResult(num));
            }
        }
        return sb.isEmpty() ? String.valueOf(num) : sb.toString();
    }

    @Override
    public int getRuleValue() {
        return 0;
    }
}
