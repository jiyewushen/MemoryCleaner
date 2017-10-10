package edu.wkd.towave.memorycleaner.tools;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import edu.wkd.towave.memorycleaner.R;
import edu.wkd.towave.memorycleaner.ui.activity.base.BaseActivity;

public class ToolbarUtils {

    public static void initToolbar(Toolbar toolbar, AppCompatActivity activity) {
        if (toolbar == null || activity == null) return;
        if (activity instanceof BaseActivity) {
            toolbar.setBackgroundColor(
                    ((BaseActivity) activity).getColorPrimary());
        }
        else {
            toolbar.setBackgroundColor(
                    activity.getResources().getColor(R.color.toolbar_bg_color));
        }
        toolbar.setTitleTextColor(
                activity.getResources().getColor(R.color.toolbar_title_color));
        toolbar.collapseActionView();
        activity.setSupportActionBar(toolbar);
        if (activity.getSupportActionBar() != null) {
            activity.getSupportActionBar()
                    .setHomeAsUpIndicator(
                            R.drawable.ic_arrow_back_white_24dp);
            activity.getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }
}
