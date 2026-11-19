package android.icu.text;

import java.util.Locale;
import java.util.Comparator;

public class Collator implements Comparator<Object> {
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

    public static Collator getInstance(Locale locale) {
        return new RuleBasedCollator(
                (com.ibm.icu.text.RuleBasedCollator) com.ibm.icu.text.Collator.getInstance(locale));
    }

    public int compare(String source, String target) {
        return delegate.compare(source, target);
    }

    @Override
    public int compare(Object source, Object target) {
        return delegate.compare(source, target);
    }

    public void setStrength(int strength) {
        delegate.setStrength(strength);
    }

    public void setDecomposition(int decomposition) {
        delegate.setDecomposition(decomposition);
    }
}
