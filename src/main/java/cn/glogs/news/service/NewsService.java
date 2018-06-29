package cn.glogs.news.service;

import cn.glogs.news.entity.NewsMessage;
import cn.glogs.news.surface.NewsSurface;

import java.util.List;

public interface NewsService {

    List<NewsSurface> listAllMessages();

    NewsSurface showMessage(int messageId);

    int deleteNews(int id);

    int editNews(NewsMessage news);
}
