package ch09.sec07.exam03;
import ch09.sec06.exam03.Button;
public class ButtonExample {
    public static void main(String[] args) {
        //Ok 객체 버튼 생성
        Button btnOk = new Button();

        //Ok 버튼 객체에 ClickListener 구현 객체 주입
        btnOk.setClickListener(new Button.ClickListener() {
            @Override
            public void onClick() {
                System.out.println("Ok 버튼을 클릭했습니다.");
            }
        });

        //Ok 버튼 클릭하기
        btnOk.click();

        //------------------------------------------------------------------

        //Cancel 버튼 객체 생성
        Button btnCancel = new Button();

        //Cancel 버튼 객체에 ClickListener 구현 객체 주입
        btnCancel.setClickListener(new Button.ClickListener() {
            @Override
            public void onClick() {
                System.out.println("Cancel 버튼을 클릭했습니다.");
            }
     });
        //Cancel 버튼 클릭하기
        btnCancel.click();
    }
}
