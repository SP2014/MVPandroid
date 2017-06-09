package mohak.mvpandroid.ui.Login;

import mohak.mvpandroid.ui.Base.BaseMvpPresenter;

/**
 * Created by mohak on 26/5/17.
 */

public interface LoginMvpPresenter<V extends LoginMvpView> extends BaseMvpPresenter<V>{

    void signUpCheck(String email , String password);

    void alreadySignedUpCheck();
}
