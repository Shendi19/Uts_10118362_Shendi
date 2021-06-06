package com.example.uts_10118362_shendi;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
/* Tanggal pengerjaan : Minggu 6 Juni 2021
        NIM : 10118362
        NAMA : Shendi Rakhma Diansyah
        Kelas : IF-9*/

public class Profile extends Fragment {
    public Profile() {
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_profile, container, false);
    }
}