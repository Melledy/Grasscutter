package emu.grasscutter.server.http.dispatch.cn;

import com.github.monkeywie.proxyee.server.HttpProxyServer;
import com.github.monkeywie.proxyee.server.HttpProxyServerConfig;
import emu.grasscutter.Grasscutter;

import static emu.grasscutter.Configuration.PROXY_INFO;
import static emu.grasscutter.Configuration.lr;
import static emu.grasscutter.utils.Language.translate;

/**
 * @author litht
 */
public class HttpProxy {
    private HttpProxyServer server;
    private HttpProxyServerConfig config;


    public HttpProxy() {
        server = new HttpProxyServer();
        config = new HttpProxyServerConfig();
    }

    /**
     * 初始化
     */
    public void init() {
        /* https */
        config.setHandleSsl(true);
        /* 设置serverConfig */
        server.serverConfig(config);
        /* 设置拦截器 */
        server.proxyInterceptInitializer(new InterceptInitializer());
    }

    /**
     * 启动
     */
    public void start() {
        Thread thread = new Thread(() -> {
            server.start(PROXY_INFO.bindPort);
        });
        String url = "https://" + PROXY_INFO.accessAddress + ":" + lr(PROXY_INFO.accessPort, PROXY_INFO.bindPort);
        Grasscutter.getLogger().info(translate("messages.proxy.port", PROXY_INFO.accessAddress, lr(PROXY_INFO.accessPort, PROXY_INFO.bindPort)));
        Grasscutter.getLogger().info(translate("messages.proxy.cert", url));
        Grasscutter.getLogger().info(translate("messages.proxy.proxy", PROXY_INFO.accessAddress, lr(PROXY_INFO.accessPort, PROXY_INFO.bindPort)));
        thread.start();

    }
}
