package android.icu.text;

public final class Normalizer2 {
    private final com.ibm.icu.text.Normalizer2 delegate;

    private Normalizer2(com.ibm.icu.text.Normalizer2 delegate) {
        this.delegate = delegate;
    }

    public static Normalizer2 getNFKCCasefoldInstance() {
        return new Normalizer2(com.ibm.icu.text.Normalizer2.getNFKCCasefoldInstance());
    }

    public String normalize(CharSequence source) {
        return delegate.normalize(source);
    }
}
