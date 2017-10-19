package com.cafe.app.android.fragments;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cafe.app.android.R;
import com.cafe.app.android.adapters.MenuDataAdapter;

public class MenuFragment extends Fragment {
    private RecyclerView mRecyclerView;
    private MenuDataAdapter mAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_menu, container, false);

        mAdapter = new MenuDataAdapter(this);
        mRecyclerView = view.findViewById(R.id.menu_recycler_view);
        mRecyclerView.setHasFixedSize(true);
        final RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        mRecyclerView.setLayoutManager(layoutManager);
        mRecyclerView.setAdapter(mAdapter);

        return view;
    }
}
