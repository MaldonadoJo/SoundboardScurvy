package com.example.soundboardscurvy.ui.home;

import android.media.MediaPlayer;
import android.view.View;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.soundboardscurvy.R;

public class HomeViewModel extends ViewModel {

    private final MutableLiveData<String> mText;
    private MediaPlayer mediaPlayer;
    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Pirate");

    }
    public void testNoise(View view){
        mediaPlayer = MediaPlayer.create(view.getContext(), R.raw.damn);
        mediaPlayer.start();
    }
    public LiveData<String> getText() {
        return mText;
    }
}