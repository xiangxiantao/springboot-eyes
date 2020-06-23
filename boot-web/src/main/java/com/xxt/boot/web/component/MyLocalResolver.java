package com.xxt.boot.web.component;

import org.apache.tomcat.util.descriptor.LocalResolver;
import org.omg.CORBA.Object;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.LocaleResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;
import java.util.Set;

/**
 * 在链接中携带local信息 l=zh_CN/l=en_US
 */
@Component
public class MyLocalResolver implements LocaleResolver {

    @Override
    public Locale resolveLocale(HttpServletRequest request) {
        String locale = request.getParameter("l");
        if (!StringUtils.isEmpty(locale)){
            String[] info=locale.split("_");
            return new Locale(info[0],info[1]);
        }
        return Locale.getDefault();
    }

    @Override
    public void setLocale(HttpServletRequest request, HttpServletResponse response, Locale locale) {

    }
}
