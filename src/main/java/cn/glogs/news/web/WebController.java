package cn.glogs.news.web;

import cn.glogs.news.entity.NewsMessage;
import cn.glogs.news.service.NewsService;
import cn.glogs.news.surface.NewsSurface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class WebController {

    @Autowired
    NewsService newsService;

    @GetMapping("/newslist")
    public ModelAndView newsList() {
        List<NewsSurface> messages = newsService.listAllMessages();
        ModelAndView mv = new ModelAndView("newsList");
        mv.addObject("list", messages);
        return mv;
    }

    @GetMapping("/news/{id}")
    public ModelAndView newsPage(@PathVariable("id") int id) {
        NewsSurface surface = newsService.showMessage(id);
        ModelAndView mv = new ModelAndView("newsPage");
        mv.addObject("message", surface);
        return mv;
    }

    @GetMapping("/del/{id}")
    public ModelAndView deleteNews(@PathVariable("id") int id) {
        int resl = newsService.deleteNews(id);
        ModelAndView mv = new ModelAndView("result");
        String info = "删除成功！";
        if (resl == 0)
            info = "删除失败！";
        mv.addObject("resl", info);
        return mv;
    }

    @PostMapping("/news/{id}")
    public ModelAndView editMessage(@PathVariable("id") int id, NewsMessage news){
        int resl = newsService.editNews(news);
        ModelAndView mv = new ModelAndView("result");

        String info = "修改成功！";
        if (resl == 0)
            info = "修改失败！";
        mv.addObject("resl", info);

        return mv;
    }
}
