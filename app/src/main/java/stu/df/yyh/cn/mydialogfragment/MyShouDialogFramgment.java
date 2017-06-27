package stu.df.yyh.cn.mydialogfragment;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import stu.df.yyh.cn.mydialogfragment.utils.GetToast;

/**
 * Created by Administrator on 2017/6/27 0027.
 */

public class MyShouDialogFramgment extends DialogFragment {
    private Button btn_cancle;
    private Button btn_ok;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
      View v = inflater.inflate(R.layout.fragment_dialog, container, false);
      btn_cancle = (Button) v.findViewById(R.id.btn_cancle);
      btn_ok = (Button) v.findViewById(R.id.btn_ok);
        btn_cancle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dismiss();
            }
        });
        btn_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GetToast.useString(getActivity(),"今晚开始papapa了...");
            }
        });
        return v;
    }

   /* @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        // 设置主题的构造方法
        // AlertDialog.Builder builder = new AlertDialog.Builder(getActivity(), R.style.CustomDialog);
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View view = inflater.inflate(R.layout.fragment_dialog, null);

        builder.setView(view);
        // Do Someting,eg: TextView tv = view.findViewById(R.id.tv);
        return builder.create();
    }*/

    /*@Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        //为了样式统一和兼容性，可以使用 V7 包下的 AlertDialog.Builder
     AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
     LayoutInflater inflater = getActivity().getLayoutInflater();
	View view = inflater.inflate(R.layout.fragment_dialog, null);
	Dialog dialog = new Dialog(getActivity(), R.style.CustomDialog);
  	// 关闭标题栏，setContentView() 之前调用
	dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
	dialog.setContentView(view);
	dialog.setCanceledOnTouchOutside(true);
	return dialog;
    }*/
}
