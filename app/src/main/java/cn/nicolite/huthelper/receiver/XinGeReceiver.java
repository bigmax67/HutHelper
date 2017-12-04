package cn.nicolite.huthelper.receiver;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.content.LocalBroadcastManager;

import com.tencent.android.tpush.XGPushBaseReceiver;
import com.tencent.android.tpush.XGPushClickedResult;
import com.tencent.android.tpush.XGPushRegisterResult;
import com.tencent.android.tpush.XGPushShowedResult;
import com.tencent.android.tpush.XGPushTextMessage;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import cn.nicolite.huthelper.app.MApplication;
import cn.nicolite.huthelper.db.DaoHelper;
import cn.nicolite.huthelper.db.dao.DaoSession;
import cn.nicolite.huthelper.db.dao.NoticeDao;
import cn.nicolite.huthelper.model.Constants;
import cn.nicolite.huthelper.model.bean.Notice;
import cn.nicolite.huthelper.utils.LogUtils;

/**
 * 信鸽推送
 * Created by nicolite on 17-9-13.
 */

public class XinGeReceiver extends XGPushBaseReceiver {
    private static final String TAG = "XinGeReceiver";

    @Override
    public void onRegisterResult(Context context, int i, XGPushRegisterResult xgPushRegisterResult) {

    }

    @Override
    public void onUnregisterResult(Context context, int i) {

    }

    @Override
    public void onSetTagResult(Context context, int i, String s) {

    }

    @Override
    public void onDeleteTagResult(Context context, int i, String s) {

    }

    @Override
    public void onTextMessage(Context context, XGPushTextMessage xgPushTextMessage) {

    }

    @Override
    public void onNotifactionClickedResult(Context context, XGPushClickedResult xgPushClickedResult) {

    }

    @Override
    public void onNotifactionShowedResult(Context context, XGPushShowedResult xgPushShowedResult) {
        LogUtils.d(TAG, xgPushShowedResult.toString());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss", Locale.CHINA);

        Notice notice = new Notice();
        notice.setTitle(xgPushShowedResult.getTitle());
        notice.setContent(xgPushShowedResult.getContent());
        notice.setTime(simpleDateFormat.format(new Date()));
        notice.setUserId(getLoginUser());
        NoticeDao noticeDao = getDaoSession().getNoticeDao();
        noticeDao.insert(notice);

        //发送更新通知的广播
        Intent intent = new Intent(Constants.mainBroadcast);
        Bundle bundle = new Bundle();
        bundle.putInt("type", Constants.BROADCAST_TYPE_NOTICE);
        intent.putExtras(bundle);
        LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
    }

    /**
     * 获取daoSession
     */
    protected DaoSession getDaoSession() {
        return DaoHelper.getDaoHelper(MApplication.AppContext).getDaoSession();
    }

    /**
     * 获取当前登录用户
     */
    protected String getLoginUser() {
        SharedPreferences preferences = MApplication.AppContext.getSharedPreferences("login_user", Context.MODE_PRIVATE);
        return preferences.getString("userId", null);
    }

}
