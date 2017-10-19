package com.cafe.app.android.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cafe.app.android.R;
import com.cafe.app.android.fragments.Fragment;

public class MenuItemsDataAdapter extends RecyclerView.Adapter<MenuItemsDataAdapter.ViewHolder> {
    private Fragment mFragment;
    private RecyclerView mRecyclerView;

    public MenuItemsDataAdapter(Fragment fragment) {
        mFragment = fragment;
    }

    @Override
    public MenuItemsDataAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.menu_items_row_layout, viewGroup, false);

        return new MenuItemsDataAdapter.ViewHolder(view);
    }

    @Override
    public int getItemCount() {
        return 3;
    }

    @Override
    public void onBindViewHolder(final MenuItemsDataAdapter.ViewHolder viewHolder, final int position) {

    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(View view) {
            super(view);
        }
    }
}
