package com.example.actionbar2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import androidx.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;


public class DialogFragment  extends androidx.fragment.app.DialogFragment{

@Nullable
@Override
public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        super.onCreateView(inflater, container, savedInstanceState);
        return inflater.inflate(R.layout.fragment_dialog, container, false);
        }
        }
