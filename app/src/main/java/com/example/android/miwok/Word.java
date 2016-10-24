package com.example.android.miwok;

/**
 * Created by jane on 16-10-18.
 * Represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok translation for that word.
 */

public class Word {

    /**
     * Default translation for the word
     */
    private String mDefaultTranslation;

    /**
     * Miwok translation for the word
     */
    private String mMiwokTranslation;

    /**
     * Image Id for the word
     */
    private int mImageResourceId;

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user's default (such as English)
     *
     * @param miwokTranslation is the word in the Miwok language
     *
     */
    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }


    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user's default (such as English)
     *
     * @param miwokTranslation is the word in the Miwok language
     *
     * @param imageResourceId is the drawable resource ID for the image associated with the word
     *
     */
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the default translation of the word.
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    /**
     * Get the image Id of the word.
     */
    public int getImageResourceId()  {
        return mImageResourceId;
    }

}
