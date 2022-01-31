package com.coupon.resent.resentsms.feign.client;

import feign.Client;
import feign.Logger;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.conn.ssl.TrustStrategy;
import org.apache.http.ssl.SSLContexts;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

@Configuration
public class PaytmFeignClientConfiguration {
    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }

    @Bean
    public Client feignClient() {
        return new Client.Default(getSSLSocketFactory(), new NoopHostnameVerifier());
    }

    private SSLSocketFactory getSSLSocketFactory() {
        try {
            TrustStrategy acceptingTrustStrategy = new TrustStrategy() {
                @Override
                public boolean isTrusted(X509Certificate[] chain, String authType) throws CertificateException {
                    // TODO Auto-generated method stub
                    return true;
                }
            };
            SSLContext sslContext = SSLContexts.custom().loadTrustMaterial(null, acceptingTrustStrategy).build();
            return sslContext.getSocketFactory();
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }


}
