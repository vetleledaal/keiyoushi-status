package android.app;

import android.content.Context;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;

public class Presentation {
    private final Context context;
    private final Display display;
    private final ViewGroup decorView;

    public Presentation(Context context, Display display) {
        this.context = context;
        this.display = display;
        decorView = new ViewGroup(context);
    }

    public Display getDisplay() {
        return display;
    }

    public void setContentView(View view, ViewGroup.LayoutParams params) {
        view.setLayoutParams(params);
        decorView.addView(view);
    }

    public void show() {
    }

    public void dismiss() {
        while (decorView.getChildCount() > 0) {
            decorView.removeView(decorView.getChildAt(0));
        }
    }
}
