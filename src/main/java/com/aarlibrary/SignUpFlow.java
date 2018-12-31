package com.aarlibrary;

/**
 * This is sign up flow claas
 * this class will provide all interface to oncam sign up flow
 */
public class SignUpFlow {
    /**
     * @param emailAddress email address of user
     * @param password user password
     * @param listener callback listener for login response from oncam sdk
     */
    public void onSignUp(String emailAddress, String password, SignUpListener listener) {
        if (listener != null) {
            listener.signUpSuccess();
        } else {
            listener.signUpError(new Exception("Error Message"));
        }
    }

    /**
     * Using this listener user can get callback of sign up response
     */
    public interface SignUpListener {
        /**
         * this will give sign up success callback
         */
        void signUpSuccess();

        /**
         * @param exception, it will provide you exception with more details
         *                   of sign up error
         */
        void signUpError(Exception exception);
    }
}
