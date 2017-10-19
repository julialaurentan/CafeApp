package com.cafe.app.android.adapters;

import com.cafe.app.android.fragments.Fragment;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cafe.app.android.R;

public class MenuDataAdapter extends RecyclerView.Adapter<MenuDataAdapter.ViewHolder> {
    private Fragment mFragment;
    private RecyclerView mRecyclerView;
    private MenuItemsDataAdapter mAdapter;

    public MenuDataAdapter(final Fragment fragment) {
        mFragment = fragment;
    }

    @Override
    public MenuDataAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.menu_row_layout, viewGroup, false);
        mAdapter = new MenuItemsDataAdapter(mFragment);

        mRecyclerView = view.findViewById(R.id.menu_items_recycler_view);
        mRecyclerView.setHasFixedSize(true);
        final RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(mFragment.getActivity());
        mRecyclerView.setLayoutManager(layoutManager);
        mRecyclerView.setAdapter(mAdapter);

        return new ViewHolder(view);
    }

    @Override
    public int getItemCount() {
        return 25;
    }

    @Override
    public void onBindViewHolder(final MenuDataAdapter.ViewHolder viewHolder, final int position) {

    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(View view) {
            super(view);
        }
    }
}
