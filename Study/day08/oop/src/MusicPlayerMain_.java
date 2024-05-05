public class MusicPlayerMain_ {
    public static void main(String[] args) {
        /* 객체지향 vs 절차지향
        * 먼저 절차지향으로 코드를 짜고 객체지향으로 바꿔가며 이해해보자
        * */

        /* Q1. 음악 플레이어 만들기
        * 요구사항 :
        *   - 1. 음악 플레이어를 켜고 끌 수 있어야 한다.
        *   - 2. 음악 플레이어의 볼륨을 증가, 감소할 수 있어야 한다.
        *   - 3. 음악 플레이어의 상태를 확인할 수 있어야 한다.
        * */
        int volume = 0;
        boolean isOn = false;

        // 절차지향 프로그래밍
        // 음악 On
        isOn = true;
        System.out.println("음악 플레이어를 시작합니다...!");

        volume++;// 볼륨 증가
        System.out.println("음악 플레이어 볼륨 : " + volume);
        volume++;// 볼륨 증가
        System.out.println("음악 플레이어 볼륨 : " + volume);
        volume--;// 볼륨 감소
        System.out.println("음악 플레이어 볼륨 : " + volume);
        System.out.println("음악 플레이어 상태 확인");// 음악 플레이어 상태
        if (isOn)
            System.out.println("음악 플레이어 On, 볼륨 : " + volume);
        else
            System.out.println("음악 플레이어 Off");
        isOn = false;// 음악 플레이어 끄기
        System.out.println("음악 플레이어를 끕니다.");

        /* 위 코드에 클래스를 도입하자. MusicPlayerData 라는 클래스를 만들고, 음악 플레이어에 사용되는
        * 데이터들을 여기에 묶어서 필드(멤버 변수)로 사용하자 */
        MusicPlayerData myData = new MusicPlayerData();
        // 음악 On
        myData.isOn = true;
        System.out.println("음악 플레이어를 시작합니다...!");

        myData.volume++;// 볼륨 증가
        System.out.println("음악 플레이어 볼륨 : " + myData.volume);
        myData.volume++;// 볼륨 증가
        System.out.println("음악 플레이어 볼륨 : " + myData.volume);
        myData.volume--;// 볼륨 감소
        System.out.println("음악 플레이어 볼륨 : " + myData.volume);
        System.out.println("음악 플레이어 상태 확인");// 음악 플레이어 상태
        if (myData.isOn)
            System.out.println("음악 플레이어 On, 볼륨 : " + myData.volume);
        else
            System.out.println("음악 플레이어 Off");
        myData.isOn = false;// 음악 플레이어 끄기
        System.out.println("음악 플레이어를 끕니다.");
        System.out.println("");
        /* 위 코드들을 보면 중복되는 부분들이 있다.
        * 그리고 각각의 기능들은 재사용될 가능성이 높다.
        *   - 볼륨 증감
        *   - 음악 플레이어 On, Off
        *   - 음악 플레이어 상태 출력
        *
        * 메서드를 사용해 각각의 기능을 구분해보자
        * */
        MusicPlayerData myData2 = new MusicPlayerData();
        musicPlayerOn(myData2);
        volumeUp(myData2);
        volumeUp(myData2);
        musicPlayerStatus(myData2);
        volumeDown(myData2);
        musicPlayerStatus(myData2);
        musicPlayerOff(myData2);
        System.out.println("");
        /* 각 기능을 메서드로 만든 덕분에 기능이 모듈화가 되었다. 아래와 같은 장점이 생겼다.
        *   - 중복 제거 : 로직 중복이 제거되었다. 같은 로직이 필요하면 메서드를 여러번 호출하면 된다.
        *   - 변경 영향 범위 : 기능을 수정할 때 메서드 내부만 수정하면 된다.
        *   - 메서드 이름 추가 : 메서드 이름을 통해 코드를 더 쉽게 이해할 수 있다.
        * */

        /* 위처럼 기능과 데이터는 서로 분리되어 있다. 이를 하나로 묶어서 음악 플레이어라는 클래스를 만들어보자 */
        MusicPlayer music = new MusicPlayer();
        music.musicPlayerOn();
        music.volumeUp();
        music.volumeUp();
        music.volumeDown();
        music.musicPlayerStatus();
        music.volumeUp();
        music.volumeUp();
        music.volumeUp();
        music.musicPlayerStatus();
        music.musicPlayerOff();
    }
    // 볼륨 업
    static void volumeUp(MusicPlayerData data) {
        data.volume++;
        System.out.println("음악 플레이어 볼륨 : " + data.volume);
    }
    // 볼륨 다운
    static void volumeDown(MusicPlayerData data) {
        data.volume--;
        System.out.println("음악 플레이어 볼륨 : " + data.volume);
    }
    // 음악 플레이어 On
    static void musicPlayerOn(MusicPlayerData data) {
        data.isOn = true;
        System.out.println("음악 플레이어를 시작합니다...!");
    }
    // 음악 플레이어 Off
    static void musicPlayerOff(MusicPlayerData data) {
        data.isOn = false;
        System.out.println("음악 플레이어를 끕니다.");
    }
    // 음악 플레이어 상태 확인
    static void musicPlayerStatus(MusicPlayerData data) {
        System.out.println("음악 플레이어 상태 확인...!");
        if (data.isOn)
            System.out.println("음악 플레이어 On, 볼륨 : " + data.volume);
        else
            System.out.println("음악 플레이어 Off");
    }
}
