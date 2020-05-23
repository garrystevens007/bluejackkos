package com.example.firstprojectever.plugins;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import java.util.Calendar;
import java.util.Date;

public class PickerDialog extends DialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        Calendar c = Calendar.getInstance();
        int year  = c.get(Calendar.YEAR);
        int month  = c.get(Calendar.MONTH);
        int day  = c.get(Calendar.DAY_OF_MONTH);
        DatePickerDialog dpdialog = new DatePickerDialog(getActivity(),(DatePickerDialog.OnDateSetListener)getActivity(),year,month,day);
        c.add(Calendar.DATE,0);
        Date nDate = c.getTime();
        dpdialog.getDatePicker().setMinDate(nDate.getTime()-(nDate.getTime() % (24*60*60*1000)));

        return dpdialog;
    }
}
