package com.folioreader.util;

import android.content.Context;
import android.support.v4.content.ContextCompat;

import com.folioreader.R;

import uk.co.deanwild.materialshowcaseview.ShowcaseConfig;

public class ShowcaseUtil {

    public static ShowcaseConfig createShowcaseConfig(Context context) {
        ShowcaseConfig showcaseConfig = new ShowcaseConfig();
        showcaseConfig.setContentTextAppearance(R.style.Text_Highlight_Title);
        showcaseConfig.setContentTextAppearance(R.style.Text_Highlight_Content);

        int textColor = ContextCompat.getColor(context, R.color.showcase_text);
        int maskColor = ContextCompat.getColor(context, R.color.showcase_mask);

        showcaseConfig.setTitleTextColor(textColor);
        showcaseConfig.setContentTextColor(textColor);
        showcaseConfig.setMaskColour(maskColor);
        int DEFAULT_SHOWCASE_DELAY_IN_MILLIS = 500;
        showcaseConfig.setDelay(DEFAULT_SHOWCASE_DELAY_IN_MILLIS);
        return showcaseConfig;
    }
}
