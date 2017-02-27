package codohvh.excalibur.presenter;

import android.view.View;

import codohvh.excalibur.contract.SignUpContract;
import codohvh.excalibur.view.SignUpActivity;

/**
 * Created by Administrator on 2017/2/27.
 */

public class SignUpPresenter implements SignUpContract.ISignUpPresenter {
    private SignUpContract.ISignUpView iView;
    private SignUpContract.ISignUpModel iModel;

    public SignUpPresenter(SignUpActivity v){
        iView = v;
    }

}
