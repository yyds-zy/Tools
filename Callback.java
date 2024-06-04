
// step 1
interface OnUserInfoListener {
    UserInfo userInfo();
}

// step 2

pubilc class CallBack {

      private static UserInfo mUserInfo;

      private static OnUserInfoListener onUserInfoListener;

      public static void setUserInfoListener(OnUserInfoListener onuserinfolistener) {
             onUserInfoListener = onuserinfolistener;
      }

      /**
       *  调用类先实现接口和初始化listener然后可以调用getUserInfo获取用户信息
       */ 
      public static UserInfo getUserInfo(int userID) {
          // 网络操作  得到result
          return mUserInfo;
      }

       /**
       *  网络请求类调用这个方法传值
       */
      public static void setUserInfo(UserInfo userInfo) {
          mUserInfo = userInfo;
      }
}

pubilc class MainA implements OnUserInfoListener {

     onCreate() {
        CallBack.setUserInfoListener(this);
        CallBack.getUserInfo(25);
     }

     @Override
     public UserInfo userInfo() {
         // json解析 UI展示
     }
  
}

