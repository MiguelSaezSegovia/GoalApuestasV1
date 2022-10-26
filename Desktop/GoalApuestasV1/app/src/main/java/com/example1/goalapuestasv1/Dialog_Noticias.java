package com.example1.goalapuestasv1;

import android.app.Dialog;
import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class Dialog_Noticias extends Dialog {
    public Dialog_Noticias(@NonNull Context context) {
        super(context);
    }

    public Dialog_Noticias(@NonNull Context context, int themeResId) {
        super(context, themeResId);
    }

    protected Dialog_Noticias(@NonNull Context context, boolean cancelable, @Nullable OnCancelListener cancelListener) {
        super(context, cancelable, cancelListener);
    }
}
