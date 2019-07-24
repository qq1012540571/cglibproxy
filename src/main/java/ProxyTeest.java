/**
 * @author 黄豪强
 * @create 2019/7/24 9:09
 */
public class ProxyTeest {
    public static void main(String[] args) {
           CglibProxy cglibProxy=new CglibProxy();
            PlayGame playGame= (PlayGame) cglibProxy.newInstall(new PlayGame());
            playGame.play();
    }
}
