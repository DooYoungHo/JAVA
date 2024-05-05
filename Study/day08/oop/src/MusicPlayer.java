public class MusicPlayer {
    int volume = 0;
    boolean isOn = false;

    // On
    void musicPlayerOn() {
        isOn = true;
        System.out.println("음악 플레이어를 시작합니다...!");
    }
    // Off
    void musicPlayerOff() {
        isOn = false;
        volume = 0;
        System.out.println("음악 플레이어를 끕니다...!");
    }
    // Volume Up
    void volumeUp() {
        volume++;
        System.out.println("음악 플레이어 볼륨 : " + volume);
    }
    // Volume Down
    void volumeDown() {
        volume--;
        System.out.println("음악 플레이어 볼륨 : " + volume);
    }
    // Volume Status
    void musicPlayerStatus() {
        System.out.println("음악 플레이어 상태 확인...!");
        if (isOn)
            System.out.println("음악 플레이어 On, 볼륨 : " + volume);
        else
            System.out.println("음악 플레이어 Off");
    }
}
