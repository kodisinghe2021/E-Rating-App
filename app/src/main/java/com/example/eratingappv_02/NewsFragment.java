package com.example.eratingappv_02;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class NewsFragment extends Fragment {
    private RecyclerView recyclerView;
    private String array_games_titles[], array_games_types[];
    private int images_main_id[] = {R.drawable.bullwide, R.drawable.ghoatwide, R.drawable.rabwide, R.drawable.wolfwide};
    private int images_logo_id[] = {R.drawable.bulllogo, R.drawable.ghoatlogo, R.drawable.rablogo, R.drawable.wolflogo};
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_news, container, false);
    }

}