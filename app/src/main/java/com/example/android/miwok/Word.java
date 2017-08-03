package com.example.android.miwok;

import android.media.Image;

/**
 * Created by daniel on 2/08/17.
 */

public class Word {

    private static final int NO_IMAGE_PROVIDED = -1;
    private String mMiwokTranslation;
    private String mDefaultTranslation;
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mImageResourceId = imageResourceId;
    }

    public Word(String defaultTranslation, String miwokTranslation) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
