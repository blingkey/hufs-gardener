//package: 자바 파일의 소속. 자바 파일을 모아서 관리
package kr.co.hanbit.firstapp;

//import: 현재 소스 코드에서 다른 소스 코드의 메소드나 변수를 사용하고 싶을 때 선언
//        동일한 이름의 파일을 import할 때는 package명을 통해 구분해야 함
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

//MainActivity.java 파일은 레이아웃 파일인 activity_main.xml을 기반으로 화면을 보여주고 사용자 요청 처리
//MainAcitvity: 앱에서 액티비티로 동작
public class MainActivity extends AppCompatActivitiy {

	@Override
	//액티비티의 생명주기 메소드 중 하나. 메소드가 실행되면서 액시비티가 생성, 동작
	//레이아웃 파일 지정 or 사용자에게 액티비티를 보여주기 전에 실행할 코드 있다면 이 메소드에 작성해야 함
	protected void onCreate(Bundle savedInstanceState) {
		
		//super: 상위 클래스를 지칭 -> 상위 클래스인 AppCompatAcivity 클래스의 onCreate()메소드 호출
		super.onCreate(savedInstanceState);
		
		/*
		레이아웃 파일: 버튼이나 텍스트 등을 여기에 작성
		액티비티에서 보여줄 화면을 설정하는 코드
		R.layout.activity_main: /res/layout/activity_main.xml 파일 지칭
		/res/layout/activity_main.xml 파일: 레이아웃 파일(사용자에게 보여지는 화면)
		*/
		setContentView(R.layout.activity_main);
		
		Toolbar toolbar = (Toolbar) findViewByld(R.id.toolbar);
		setSupportActionBar(toolBar);
		
		FloatingActionButton fab = (FloatingActionButton)findViewByld(R.id.fab);
		fab.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Snackbar.mak(view, "Replace with your own action", Snackbar.LENGTH_LONG).setAction("Action", null).show();
			}
		});
	}
}
