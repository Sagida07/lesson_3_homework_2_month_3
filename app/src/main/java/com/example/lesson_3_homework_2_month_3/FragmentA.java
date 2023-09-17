package com.example.lesson_3_homework_2_month_3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lesson_3_homework_2_month_3.CelebrityAdapter;
import com.example.lesson_3_homework_2_month_3.R;

import java.util.ArrayList;

public class FragmentA extends Fragment {

    protected RecyclerView rvCelebrity;
    private ArrayList<String> celebrityList = new ArrayList<>();

    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_a, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rvCelebrity = requireActivity().findViewById(R.id.rv_celebrity);
        loadData();
        CelebrityAdapter adapter = new CelebrityAdapter(celebrityList);
        rvCelebrity.setAdapter(adapter);
    }

    private void loadData() {
        celebrityList.add("Anne Hathaway");
        celebrityList.add("Scarlett Johansson");
        celebrityList.add("Tom Cruise");
        celebrityList.add("Tom Hardy");
        celebrityList.add("Will Smith");
        celebrityList.add("Ryan Gosling");
        celebrityList.add("Margot Robbie");
        celebrityList.add("Cillian Murphy");
        celebrityList.add("Johnny Depp");
        celebrityList.add("Leonardo DiCaprio");
        celebrityList.add("Bradley Pitt");
    }
}
