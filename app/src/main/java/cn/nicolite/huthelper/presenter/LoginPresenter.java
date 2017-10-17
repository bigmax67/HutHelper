package cn.nicolite.huthelper.presenter;

import cn.nicolite.huthelper.base.presenter.BasePresenter;
import cn.nicolite.huthelper.model.bean.HttpResult;
import cn.nicolite.huthelper.model.bean.User;
import cn.nicolite.huthelper.network.api.APIUtils;
import cn.nicolite.huthelper.view.activity.LoginActivity;
import cn.nicolite.huthelper.view.iview.ILoginView;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by nicolite on 17-10-17.
 */

public class LoginPresenter extends BasePresenter<ILoginView, LoginActivity> {

    public LoginPresenter(ILoginView view, LoginActivity activity) {
        super(view, activity);
    }

    public void login(String username, String password){


        APIUtils
                .getLoginAPI()
                .login(username, password)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<HttpResult<User>>() {
                    @Override
                    public void onSubscribe(@NonNull Disposable d) {
                        if (getView() != null){
                            getView().showLoading();
                        }

                    }

                    @Override
                    public void onNext(@NonNull HttpResult<User> userHttpResult) {
                        if (getView() != null){
                            getView().closeLoading();
                            if (userHttpResult.getCode().equals("200")){
                                getView().onSuccess();
                            }else {
                                getView().showMessage(userHttpResult.getMsg());
                            }
                        }
                    }

                    @Override
                    public void onError(@NonNull Throwable e) {
                        if (getView() != null){
                            getView().showMessage(e.toString());
                        }
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
}