package android.icu.text;

public final class RuleBasedCollator extends Collator {
    private final com.ibm.icu.text.RuleBasedCollator ruleBasedDelegate;

    public RuleBasedCollator(String rules) throws Exception {
        this(new com.ibm.icu.text.RuleBasedCollator(rules));
    }

    RuleBasedCollator(com.ibm.icu.text.RuleBasedCollator delegate) {
        super(delegate);
        ruleBasedDelegate = delegate;
    }

    public void setCaseLevel(boolean caseLevel) {
        ruleBasedDelegate.setCaseLevel(caseLevel);
    }

    @Override
    public void setStrength(int strength) {
        ruleBasedDelegate.setStrength(strength);
    }

    @Override
    public void setDecomposition(int decomposition) {
        ruleBasedDelegate.setDecomposition(decomposition);
    }

    com.ibm.icu.text.RuleBasedCollator unwrap() {
        return ruleBasedDelegate;
    }
}
