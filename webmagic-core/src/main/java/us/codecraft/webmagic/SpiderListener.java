package us.codecraft.webmagic;

/**
 * Listener of Spider on page processing. Used for monitor and such on.
 *
 * @author code4crafer@gmail.com
 * @since 0.5.0
 */
/**
 * 监听接口
 * @author tengyu
 *
 */
public interface SpiderListener {

    public void onSuccess(Request request);

    public void onError(Request request);
}
