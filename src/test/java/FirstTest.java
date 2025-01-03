import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static org.assertj.core.api.Assertions.assertThat;

public class FirstTest {

    @Test
    void t1(){
        int rst = 1;
        assertThat(rst).isEqualTo(1);
    }

    @Test
    void t2(){
        TestApp app = new TestApp();
        app.run();

     //   assertThat(result).isEqualTo("aaa");
    }

    @Test
    void t3(){
        //테스트 봇 선입력
//        Scanner sc = new Scanner("종료\n");
//
//        ByteArrayOutputStream out = new ByteArrayOutputStream();
//        System.setOut(new PrintStream(out));
//
//        TestApp app = new TestApp();
//        app.run();

        String out = TestBot.run("종료");

        assertThat(out.toString()).contains("명언앱 종료");
    }

    @Test
    @DisplayName("== 명언 앱 == 출력")
    void t4(){
        //테스트 봇 선입력
        String out = TestBot.run("종료");

        // 테스트 코드 작성이 어려움.
        // assertJ 를 사용법을 잘 모름.

        assertThat(out.toString())
                .containsSubsequence("== 명언 앱 ==", "명언앱 종료");
    }
}
