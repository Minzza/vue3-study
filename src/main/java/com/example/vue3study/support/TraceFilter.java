package com.example.vue3study.support;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;
import org.springframework.web.util.ContentCachingResponseWrapper;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.UUID;

@Component
public class TraceFilter extends OncePerRequestFilter {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    private static final String REQUEST_ID_ATTRIBUTE = "tid";

    private static final String REQUEST_ID_HEADER = "X-Request-ID";

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        HttpServletRequest req = (HttpServletRequest) request;
        ContentCachingResponseWrapper responseWrapper = new ContentCachingResponseWrapper( response );

        String transactionId = UUID.randomUUID().toString();

        MDC.put(REQUEST_ID_ATTRIBUTE, transactionId);

        filterChain.doFilter(req, responseWrapper);

        log.info("test");
    }
}
