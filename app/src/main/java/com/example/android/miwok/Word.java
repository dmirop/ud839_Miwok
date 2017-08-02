package com.example.android.miwok;

/**
 * Created by daniel on 2/08/17.
 */

public class Word {

    private String mMiwokTranslation;
    private String mDefaultTranslation;

    public Word (String defaultTranslation, String miwokTranslation){
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }
}
