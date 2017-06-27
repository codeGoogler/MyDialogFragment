package stu.df.yyh.cn.mydialogfragment;

import android.app.Dialog;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
/**
 * 类功能描述：</br>
 * 新数据处理帮助类
 * @author 于亚豪
 *  博客地址： http://blog.csdn.net/androidstarjack
 * 公众号： 终端研发部
 * @version 1.0 </p> 修改时间：</br> 修改备注：</br>
 */
public class MainActivity extends AppCompatActivity {
    private Dialog dialog;
    @Bind(R.id.btn01)
    Button btn01;
    FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
    MyShouDialogFramgment mdf;
    MyShouDialogFramgment2 mdf2 = new MyShouDialogFramgment2();
    FragmentTransaction ft2 = getSupportFragmentManager().beginTransaction();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        dialog = new Dialog(this);
        dialog.setContentView(R.layout.fragment_dialog);
        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        ft2.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        mdf = new MyShouDialogFramgment();
        //用户恢复对话框的状态
        if(savedInstanceState != null && savedInstanceState.getBoolean("dialog_show"))
            btn01.performClick();
    }

    /**
     * 用于保存对话框的状态以便恢复
     */
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        if(dialog != null && dialog.isShowing())
            outState.putBoolean("dialog_show", true);
        else
            outState.putBoolean("dialog_show", false);
    }

    /**
     * 在Activity销毁之前，确保对话框以关闭
     */
    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(dialog != null && dialog.isShowing())
            dialog.dismiss();
    }
    @OnClick({R.id.btn01,R.id.btn02,R.id.btn03})
    public void onClick(View view){
        switch (view.getId()){
            case R.id.btn01:
                dialog.show();
                break;
            case R.id.btn02:
                mdf.show(ft, "df");
               //可以拓展
                break;
            case R.id.btn03:
                mdf2.show(ft2, "df");
                //可以拓展
                break;
        }
    }
    public void setDealONCliclListener(){

    }
}
