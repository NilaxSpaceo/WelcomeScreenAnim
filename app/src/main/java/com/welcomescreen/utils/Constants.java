package com.welcomescreen.utils;

import com.welcomescreen.animation.AccordionTransformer;
import com.welcomescreen.animation.BackgroundToForegroundTransformer;
import com.welcomescreen.animation.CubeInTransformer;
import com.welcomescreen.animation.CubeOutTransformer;
import com.welcomescreen.animation.DefaultTransformer;
import com.welcomescreen.animation.DepthPageTransformer;
import com.welcomescreen.animation.FlipHorizontalTransformer;
import com.welcomescreen.animation.FlipVerticalTransformer;
import com.welcomescreen.animation.ForegroundToBackgroundTransformer;
import com.welcomescreen.animation.RotateDownTransformer;
import com.welcomescreen.animation.RotateUpTransformer;
import com.welcomescreen.animation.ScaleInOutTransformer;
import com.welcomescreen.animation.StackTransformer;
import com.welcomescreen.animation.TabletTransformer;
import com.welcomescreen.animation.ZoomInTransformer;
import com.welcomescreen.animation.ZoomOutSlideTransformer;
import com.welcomescreen.animation.ZoomOutTranformer;

import java.util.ArrayList;

/**
 * Created by nilax on 26/10/16.
 */

public class Constants {


    public static final ArrayList<TransformerItem> TRANSFORM_CLASSES;

    static {
        TRANSFORM_CLASSES = new ArrayList<>();
        TRANSFORM_CLASSES.add(new TransformerItem(DefaultTransformer.class));
        TRANSFORM_CLASSES.add(new TransformerItem(AccordionTransformer.class));
        TRANSFORM_CLASSES.add(new TransformerItem(BackgroundToForegroundTransformer.class));
        TRANSFORM_CLASSES.add(new TransformerItem(CubeInTransformer.class));
        TRANSFORM_CLASSES.add(new TransformerItem(CubeOutTransformer.class));
        TRANSFORM_CLASSES.add(new TransformerItem(DepthPageTransformer.class));
        TRANSFORM_CLASSES.add(new TransformerItem(FlipHorizontalTransformer.class));
        TRANSFORM_CLASSES.add(new TransformerItem(FlipVerticalTransformer.class));
        TRANSFORM_CLASSES.add(new TransformerItem(ForegroundToBackgroundTransformer.class));
        TRANSFORM_CLASSES.add(new TransformerItem(RotateDownTransformer.class));
        TRANSFORM_CLASSES.add(new TransformerItem(RotateUpTransformer.class));
        TRANSFORM_CLASSES.add(new TransformerItem(ScaleInOutTransformer.class));
        TRANSFORM_CLASSES.add(new TransformerItem(StackTransformer.class));
        TRANSFORM_CLASSES.add(new TransformerItem(TabletTransformer.class));
        TRANSFORM_CLASSES.add(new TransformerItem(ZoomInTransformer.class));
        TRANSFORM_CLASSES.add(new TransformerItem(ZoomOutSlideTransformer.class));
        TRANSFORM_CLASSES.add(new TransformerItem(ZoomOutTranformer.class));
    }
}
