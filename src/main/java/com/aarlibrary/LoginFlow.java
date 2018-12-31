package com.aarlibrary;

/**
 * This is login flow of oncam sdk
 * it will provide all information fo login
 */
public class LoginFlow {


    /**
     * @param emailAddress user email address
     * @param password user password
     * @param listener callback of login success or error of oncam sdk
     */
    public void onLogin(String emailAddress, String password, LoginListener listener) {
        if (listener != null) {
            listener.loginSuccess();
        } else {
            listener.loginError(new Exception("Login exception"));
        }
    }

    /**
     * this is callback listener of oncam sdk login apis
     */
    public interface LoginListener {
        /**
         * user will be receiver success callback of login
         */
        void loginSuccess();

        /**
         * @param exception exception from login error from oncam sdk
         */
        void loginError(Exception exception);
    }
}
