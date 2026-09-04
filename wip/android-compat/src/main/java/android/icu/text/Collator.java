package android.icu.text;

public class Collator {
    public static final int NO_DECOMPOSITION = com.ibm.icu.text.Collator.NO_DECOMPOSITION;
    public static final int CANONICAL_DECOMPOSITION = com.ibm.icu.text.Collator.CANONICAL_DECOMPOSITION;
    public static final int PRIMARY = com.ibm.icu.text.Collator.PRIMARY;

    final com.ibm.icu.text.Collator delegate;

    Collator(com.ibm.icu.text.Collator delegate) {
        this.delegate = delegate;
    }

    public static Collator getInstance() {
        return new RuleBasedCollator((com.ibm.icu.text.RuleBasedCollator) com.ibm.icu.text.Collator.getInstance());
    }

    public void setStrength(int strength) {
        delegate.setStrength(strength);
    }

    public void setDecomposition(int decomposition) {
        delegate.setDecomposition(decomposition);
    }
}
