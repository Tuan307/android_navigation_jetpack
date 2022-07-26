package com.example.demoproject;

import android.app.Activity;
import android.app.Dialog;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class CustomViewDialog {
    public void showDialog(Activity activity, String message) {
        final Dialog dialog = new Dialog(activity);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.dialog_view);

        TextView txt = dialog.findViewById(R.id.txtMessage);
        txt.setText(message);
        Button btn = dialog.findViewById(R.id.btnCloseDialog);
        btn.setOnClickListener(view -> {
            dialog.dismiss();
        });
        dialog.show();
    }
}