package com.example.android.miwok;

/**
 * Created by jane on 16-10-18.
 * Represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok translation for that word.
 */

public class Word {

    private static final int NO_IMAGE_PROVIDED = -1;

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
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /**
     * Sound Id for the word
     */
    private int mSoundResourceId;

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user's default (such as English)
     * @param miwokTranslation   is the word in the Miwok language
     */
    public Word(String defaultTranslation, String miwokTranslation, int soundResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mSoundResourceId = soundResourceId;
    }

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user's default (such as English)
     * @param miwokTranslation   is the word in the Miwok language
     * @param imageResourceId    is the drawable resource ID for the image associated with the word
     */
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int soundResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mSoundResourceId = soundResourceId;
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
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    /**
     * Get the sound Id of the word.
     */
    public int getSoundResourceId() {
        return mSoundResourceId;
    }

}
