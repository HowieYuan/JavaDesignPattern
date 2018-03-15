package facade;

/**
 * Created with IntelliJ IDEA
 *
 * @Author yuanhaoyue swithaoy@gmail.com
 * @Description
 * @Date 2018-03-15
 * @Time 13:58
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        MovieFacade movieFacade = new MovieFacade(new DVD(), new Acoustics(), new Screen());
        movieFacade.openMovie();
        Thread.sleep(2000);
        movieFacade.endMovie();
    }
}
