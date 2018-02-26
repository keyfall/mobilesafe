package com.example.mobilesafe;

import com.example.mobilesafe.domain.UpdateInfo;

import android.app.Activity;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;



public class SplashActivity extends Activity {
			private UpdateInfo info;
			private TextView tv_splash_version;
			private static final int GET_INFO_SUCCESS = 10;
			private static final int SERVER_ERROR = 11;
			private static final int SERVER_URL_ERROR = 12;
			private static final int PROTOCOL_ERROR = 13;
			private static final int IO_ERROR = 14;
			private static final int XML_PARSE_ERROR = 15;
			protected static final String TAG = "SplashActivity";
			private long startTime;
			private RelativeLayout rl_splash;
			private long endTime;
			private Handler handler = new Handler(){
				public void handleMessage(android.os.Message msg) {
					switch(msg.what){
					case XML_PARSE_ERROR:
						Toast.makeText(getApplicationContext(), "xml解析错误", 1).show();
					
				case  IO_ERROR:
					Toast.makeText(getApplicationContext(), "xml解析错误", 1).show();
				
			case XML_PARSE_ERROR:
				Toast.makeText(getApplicationContext(), "xml解析错误", 1).show();
			
				case XML_PARSE_ERROR:
					Toast.makeText(getApplicationContext(), "xml解析错误", 1).show();

				case XML_PARSE_ERROR:
					Toast.makeText(getApplicationContext(), "xml解析错误", 1).show();

case XML_PARSE_ERROR:
	Toast.makeText(getApplicationContext(), "xml解析错误", 1).show();
}
					
					
				};
			};
			
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//设置为无标题栏
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		//设置为全屏模式
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_splash);
		tv_splash_version = (TextView) findViewById(R.id.tv_splash_version);
		tv_splash_version.setText("版本号:"+getVersion());
		
		setContentView(R.layout.activity_splash);
	}
	private String getVersion() {
		//得到系统的包管理器，已经得到了apk的面向对象的包装
		PackageManager pm = this.getPackageManager();
		try {
			//参数一：当前应用程序的包名，参数二：可选的附加信息，这里用不到，可以定义为0
			PackageInfo info= pm.getPackageInfo(getPackageName(), 0);
			
			return info.versionName;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return "";
		}
	
	}


}
