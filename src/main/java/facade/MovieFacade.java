package facade;

/**
 * Created with IntelliJ IDEA
 *
 * @Author yuanhaoyue swithaoy@gmail.com
 * @Description 外观模式
 * @Date 2018-03-15
 * @Time 13:52
 */
public class MovieFacade {
    private DVD dvd;
    private Acoustics acoustics;
    private Screen screen;

    public MovieFacade(DVD dvd, Acoustics acoustics, Screen screen) {
        this.dvd = dvd;
        this.acoustics = acoustics;
        this.screen = screen;
    }

    public void openMovie() {
        dvd.openDVD();
        acoustics.openAcoustics();
        screen.openScreen();
        System.out.println("电影开始放映!");
    }

    public void endMovie() {
        dvd.endDVD();
        acoustics.endAcoustics();
        screen.endScreen();
        System.out.println("电影结束放映!");
    }
}
