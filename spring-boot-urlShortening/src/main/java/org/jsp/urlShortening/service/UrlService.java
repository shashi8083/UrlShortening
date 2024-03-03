package org.jsp.urlShortening.service;

import org.jsp.urlShortening.model.Url;
import org.jsp.urlShortening.model.UrlDto;
import org.springframework.stereotype.Service;

@Service
public interface UrlService
{
    public Url generateShortLink(UrlDto urlDto);
    public Url persistShortLink(Url url);
    public Url getEncodedUrl(String url);
    public  void  deleteShortLink(Url url);
}
