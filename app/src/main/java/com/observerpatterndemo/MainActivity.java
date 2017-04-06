package com.observerpatterndemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/**
 * @TODO<观察者模式 示例 demo >
 * @author 小嵩
 * @date 2017-4-5 17:43:15
 */

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Person pMing,pQing,pLiang;
    private XiaosongSubject mSubject;

    private TextView tv_output;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initEvent();
    }

    private void initView() {

        findViewById(R.id.btn_add_one).setOnClickListener(this);
        findViewById(R.id.btn_add_two).setOnClickListener(this);
        findViewById(R.id.btn_add_three).setOnClickListener(this);

        findViewById(R.id.btn_notify).setOnClickListener(this);
        findViewById(R.id.btn_delete).setOnClickListener(this);

        tv_output = (TextView)findViewById(R.id.tv_output);
    }

    private void initEvent() {

        //创建被观察者
        mSubject = new XiaosongSubject();

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_add_one:
                if (pMing==null){
                    pMing = new Person("小明");
                    mSubject.attach(pMing);
                    Toast.makeText(this,"小明关注了我",Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(this,"小明已关注我了，不能再重复操作",Toast.LENGTH_SHORT).show();
                }
                break;

            case R.id.btn_add_two:
                if (pQing==null){
                    pQing = new Person("小琴");
                    mSubject.attach(pQing);
                    Toast.makeText(this,"小琴关注了我",Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(this,"小琴已关注我了，不能再重复操作",Toast.LENGTH_SHORT).show();
                }
                break;

            case R.id.btn_add_three:
                if (pLiang==null){
                    pLiang = new Person("阿亮");
                    mSubject.attach(pLiang);
                    Toast.makeText(this,"阿亮关注了我",Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(this,"阿亮已关注我了，不能再重复操作",Toast.LENGTH_SHORT).show();
                }
                break;

            case R.id.btn_notify:
                tv_output.setText("");
                mSubject.notify("小嵩更新微博啦~ 快来看看吧", tv_output);
                break;

            case R.id.btn_delete:
                if (pMing!=null){
                    mSubject.detach(pMing);
                    pMing = null;
                }

                if (pQing!=null){
                    mSubject.detach(pQing);
                    pQing = null;
                }

                if (pLiang!=null){
                    mSubject.detach(pLiang);
                    pLiang = null;
                }

                break;

            default:
                break;
        }
    }
}
