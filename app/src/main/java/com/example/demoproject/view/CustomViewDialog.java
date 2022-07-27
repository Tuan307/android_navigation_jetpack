package com.example.demoproject.view;

import android.app.Activity;
import android.app.Dialog;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.demoproject.R;

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
        Button btn1 = dialog.findViewById(R.id.btnToast);
        btn1.setOnClickListener(view -> {
            sendToast(activity, message);
        });
        dialog.show();
    }

    public void sendToast(Activity activity, String message) {
        Toast.makeText(activity, message, Toast.LENGTH_SHORT).show();
    }
}
