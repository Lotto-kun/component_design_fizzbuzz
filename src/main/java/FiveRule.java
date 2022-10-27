public class FiveRule implements Rule {
    private final int ruleValue = 5;
    private final String result = "Buzz";

    @Override
    public boolean apply(int num) {
        return num % ruleValue == 0;
    }

    @Override
    public String getResult(int num) {
        if (apply(num)) {
            return result;
        }
        return String.valueOf(num);
    }

    public int getRuleValue(){
        return ruleValue;
    }
}
