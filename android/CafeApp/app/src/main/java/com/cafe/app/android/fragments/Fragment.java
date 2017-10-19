package com.cafe.app.android.fragments;

import android.support.v7.app.AlertDialog;
import android.widget.Toast;

public class Fragment extends android.support.v4.app.Fragment {
    public void message(int resId) {
        Toast.makeText(getActivity(), getString(resId), Toast.LENGTH_SHORT).show();
    }

    public void message(int resId, int duration) {
        Toast.makeText(getActivity(), getString(resId), duration).show();
    }

    public void alert(int titleResId, int msgResId) {
        AlertDialog dialog = new AlertDialog.Builder(getActivity())
                .setTitle(getString(titleResId))
                .setMessage(getString(msgResId))
                .create();
        dialog.show();
    }

    public void alert(int msgResId) {
        AlertDialog dialog = new AlertDialog.Builder(getActivity())
                .setMessage(getString(msgResId))
                .create();
        dialog.show();
    }
}
