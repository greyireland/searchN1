package us.codecraft.webmagic.downloader;

import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Request;
import us.codecraft.webmagic.Task;

/**
 * Downloader is the part that downloads web pages and store in Page object. <br>
 * Downloader has {@link #setThread(int)} method because downloader is always the bottleneck of a crawler,
 * there are always some mechanisms such as pooling in downloader, and pool size is related to thread numbers.
 *
 * @author code4crafter@gmail.com <br>
 * @since 0.1.0
 */
/**
 * 传入一个request,将页面下载下来保存到page对象中。
 * @author tengyu
 *
 */
public interface Downloader {

    /**
     * Downloads web pages and store in Page object.
     *
     * @param request request
     * @param task task
     * @return page
     */
    public Page download(Request request, Task task);

    /**
     * Tell the downloader how many threads the spider used.
     * @param threadNum number of threads
     */
    public void setThread(int threadNum);
}
