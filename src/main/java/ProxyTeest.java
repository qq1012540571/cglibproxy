import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author 黄豪强
 * @create 2019/7/24 9:09
 */
public class ProxyTeest {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        CglibProxy cglibProx = new CglibProxy();
        PlayGame playGame = (PlayGame) cglibProx.newInstall(new PlayGame());
        playGame.play();
        /**
         * public方法的反射实现方法
         Method method = cglibProxy.getMethod("newInstall", new Class[]{Object.class});
         method.setAccessible(true);
         PlayGame playGame = (PlayGame) method.invoke(cglibProx, new PlayGame());
         playGame.play();
         *private方法的反射实现方法
         Method method = cglibProxy.getDeclaredMethod("newInstall", new Class[]{Object.class});
         method.setAccessible(true);
         PlayGame playGame = (PlayGame) method.invoke(cglibProx, new PlayGame());
         playGame.play();
         */
    }
}
