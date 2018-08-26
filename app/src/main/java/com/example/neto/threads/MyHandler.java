package com.example.neto.threads;

import android.os.Handler;
import android.os.Message;
import android.widget.Button;
import android.widget.TextView;

public class MyHandler extends Handler {

    private TextView textView;
    private Button button;

    public MyHandler(TextView nTextView, Button nButton){
        this.button = nButton;
        this.textView = nTextView;
    }

    @Override
    public void handleMessage(Message msg) {
        if(msg.what==100){
            textView.setText("Processamento Finalizado");
            button.setEnabled(true);
        }
    }
}
