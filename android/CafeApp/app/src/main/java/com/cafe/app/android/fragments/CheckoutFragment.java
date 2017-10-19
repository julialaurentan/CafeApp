package com.cafe.app.android.fragments;

import android.app.TimePickerDialog;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.TimePicker;

import com.cafe.app.android.R;

import java.util.Calendar;

public class CheckoutFragment extends Fragment {
    private LinearLayout mLayoutTimeView;
    private LinearLayout mLayoutAsap;
    private TextView txtPickupTime;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_checkout, container, false);
        mLayoutTimeView = view.findViewById(R.id.layout_select_time);
        mLayoutAsap = view.findViewById(R.id.layout_asap);
        txtPickupTime = view.findViewById(R.id.txtPickupTime);

        mLayoutTimeView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calendar currentTime = Calendar.getInstance();

                TimePickerDialog timePicker = new TimePickerDialog(getContext(), new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hour, int minute) {
                        int translatedHour = hour >= 13 ? hour - 12 : hour;
                        txtPickupTime.setText(translatedHour + " : " + minute + " " + (translatedHour < hour ? "PM" : "AM"));
                    }
                }, currentTime.get(Calendar.HOUR_OF_DAY), currentTime.get(Calendar.MINUTE), false);

                timePicker.setTitle("Please select pick-up time");
                timePicker.show();
            }
        });

        mLayoutAsap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        return view;
    }
}
