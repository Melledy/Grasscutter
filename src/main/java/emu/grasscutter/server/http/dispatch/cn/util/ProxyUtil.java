package emu.grasscutter.server.http.dispatch.cn.util;

import com.github.monkeywie.proxyee.intercept.HttpProxyInterceptPipeline;

import static emu.grasscutter.Configuration.HTTP_INFO;
import static emu.grasscutter.Configuration.lr;


/**
 * Proxy util
 *
 * @author litht
 * @date 2022/05/19
 */
public class ProxyUtil {
    /**
     * @param pipeline
     */
    public static void forwardToGrasscutter(HttpProxyInterceptPipeline pipeline) {
        pipeline.getRequestProto().setHost(HTTP_INFO.accessAddress);
        pipeline.getRequestProto().setPort(lr(HTTP_INFO.bindPort, HTTP_INFO.bindPort));
    }
}
