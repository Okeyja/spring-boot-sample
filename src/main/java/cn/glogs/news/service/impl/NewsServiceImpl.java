package cn.glogs.news.service.impl;

import cn.glogs.news.dao.DetailTypeDao;
import cn.glogs.news.dao.NewsMessageDao;
import cn.glogs.news.dao.NewsTypeDao;
import cn.glogs.news.entity.NewsDetailType;
import cn.glogs.news.entity.NewsMessage;
import cn.glogs.news.entity.NewsType;
import cn.glogs.news.service.NewsService;
import cn.glogs.news.surface.NewsSurface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NewsServiceImpl implements NewsService {

    @Autowired
    NewsMessageDao newsMessageDao;

    @Autowired
    DetailTypeDao detailTypeDao;

    @Autowired
    NewsTypeDao newsTypeDao;

    @Override
    public List<NewsSurface> listAllMessages() {
        List<NewsSurface> newsSurfaces = new ArrayList<>();
        List<NewsMessage> newsMessages = newsMessageDao.selectAllMessages();
        for (NewsMessage msg : newsMessages) {

            NewsDetailType detailType = detailTypeDao.getDetailTypeById(msg.getDetailType());

            NewsType newsType = newsTypeDao.getTypeById(detailType.getTypeId());

            NewsSurface newsSurface = new NewsSurface();
            newsSurface.setId(msg.getId());
            newsSurface.setTitle(msg.getTitle());
            newsSurface.setDetailTypeName(detailType.getDetailTypeName());
            newsSurface.setTypeName(newsType.getTypeName());
            newsSurface.setTime(msg.getTime());

            newsSurfaces.add(newsSurface);
        }
        return newsSurfaces;
    }

    @Override
    public NewsSurface showMessage(int messageId) {

        // 获取新闻
        NewsMessage news = newsMessageDao.selectMessageById(messageId);
        // 获取细节类型
        NewsDetailType detailType = detailTypeDao.getDetailTypeById(news.getDetailType());
        // 获取大类型
        NewsType type = newsTypeDao.getTypeById(detailType.getTypeId());

        NewsSurface surface = new NewsSurface();
        surface.setId(news.getId());
        surface.setTitle(news.getTitle());
        surface.setDetailTypeName(detailType.getDetailTypeName());
        surface.setTypeName(type.getTypeName());
        surface.setAddress(news.getAddress());
        surface.setContent(news.getContent());
        surface.setTime(news.getTime());

        return surface;
    }

    @Override
    public int deleteNews(int id) {
        return newsMessageDao.deleteById(id);
    }

    @Override
    public int editNews(NewsMessage news) {
        return newsMessageDao.edit(news);
    }
}