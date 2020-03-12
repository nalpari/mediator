package net.nalpari.mediator.common;

import javax.servlet.http.HttpServletRequest;

public class SystemUtil {
    public static String getClientIp(HttpServletRequest request) throws Exception {
        String ip = request.getHeader("X-FORWARDED-FOR");
        if (ip == null) ip = request.getRemoteAddr();

        return ip;
    }

    public static int getClientPort(HttpServletRequest request) throws Exception {
        return request.getRemotePort();
    }

    public static String getClient(HttpServletRequest request) throws Exception {
        return request.getRemoteAddr() + ":" + request.getServerPort();
    }
}
