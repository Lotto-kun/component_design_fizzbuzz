public class ThreeRule implements Rule{
    private final int ruleValue = 3;
    private final String result = "Fizz";

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
