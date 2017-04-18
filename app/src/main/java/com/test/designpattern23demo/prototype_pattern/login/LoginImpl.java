package com.test.designpattern23demo.prototype_pattern.login;

/**
 * @project： DesignPattern23Demo
 * @package： com.test.designpattern23demo.prototype_pattern.login
 * @class: LoginImpl
 * @author: 陆伟
 * @Date: 2017/4/3 10:52
 * @desc： TODO
 */
public class LoginImpl implements Login {
    private static final String TAG = "LoginImpl";

    @Override
    public void login() {
        //登录到服务器，获得用户信息
        User loginUser = new User();
        //将服务器返回的完成信息设置给loginUser对象
        loginUser.age = 22;
        loginUser.name = "Mr.Simple";
        loginUser.address = new Address("北京市", "海淀区", "花园东路");

        //登录完之后，将用户信息设置到Sessin中
        LoginSession.getsLoginSession().setLoginedUser(loginUser);
    }


    public static class LoginSession {

        private static LoginSession sLoginSession = null;

        //已登录用户
        private User loginedUser;

        private LoginSession() {
        }

        public static LoginSession getsLoginSession() {
            if(sLoginSession == null) {
                sLoginSession = new LoginSession();
            }
            return sLoginSession;
        }

        void setLoginedUser(User user) {
            loginedUser = user;
        }

        public User getLoginedUser(){
            return loginedUser;
        }
    }
}
