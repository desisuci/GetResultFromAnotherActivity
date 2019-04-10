package com.desisuci.getresultfromanotheractivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private TextView txtMsgobj;
    private Intent fromFirstAct;
    private String msg;
    private EditText inReplyObj;
    private String reply;
    public  Intent intent_reply;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        txtMsgobj = (TextView) findViewById(R.id.txtMsg);

        fromFirstAct = getIntent();
        msg = fromFirstAct.getStringExtra("msg");

        txtMsgobj.setText(msg);

        inReplyObj = (EditText) findViewById(R.id.inReply);
    }

    public  void reply (View view){
        intent_reply = new Intent();
        reply = inReplyObj.getText().toString();
        intent_reply.putExtra("replyMsg",reply);
        setResult(RESULT_OK,intent_reply);
        finish();

    }
}
