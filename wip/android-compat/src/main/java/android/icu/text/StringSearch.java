package android.icu.text;

import java.text.CharacterIterator;

public final class StringSearch {
    private final com.ibm.icu.text.StringSearch delegate;

    public StringSearch(String pattern, CharacterIterator target, RuleBasedCollator collator) {
        delegate = new com.ibm.icu.text.StringSearch(pattern, target, collator.unwrap());
    }

    public void setOverlapping(boolean allowOverlap) {
        delegate.setOverlapping(allowOverlap);
    }

    public void setTarget(CharacterIterator target) {
        delegate.setTarget(target);
    }

    public void setPattern(String pattern) {
        delegate.setPattern(pattern);
    }

    public int first() {
        return delegate.first();
    }

    public int next() {
        return delegate.next();
    }

    public String getMatchedText() {
        return delegate.getMatchedText();
    }
}
