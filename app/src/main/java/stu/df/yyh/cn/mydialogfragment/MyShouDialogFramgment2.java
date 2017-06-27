package stu.df.yyh.cn.mydialogfragment;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;

import stu.df.yyh.cn.mydialogfragment.utils.GetToast;

/**
 * Created by Administrator on 2017/6/27 0027.
 */

public class MyShouDialogFramgment2 extends DialogFragment {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        //为了样式统一和兼容性，可以使用 V7 包下的 AlertDialog.Builder
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View view = inflater.inflate(R.layout.fragment_dialog, null);
        Button    btn_cancle = (Button) view.findViewById(R.id.btn_cancle);
        Button     btn_ok = (Button) view.findViewById(R.id.btn_ok);
        final Dialog dialog = new Dialog(getActivity(), R.style.activity_DialogTransparent);
        // 关闭标题栏，setContentView() 之前调用
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(view);
        dialog.setCanceledOnTouchOutside(true);
        btn_cancle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });
        btn_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GetToast.useString(getActivity(),"今晚开始搞事情了...");
            }
        });
        return dialog;
    }
}
