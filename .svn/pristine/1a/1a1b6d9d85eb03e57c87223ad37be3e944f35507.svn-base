package com.luwei.hackvr.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.luwei.hackvr.pojo.Article;
import com.luwei.hackvr.pojo.Game;
import com.luwei.hackvr.pojo.Kuaixun;
import com.luwei.hackvr.pojo.Video;
import com.luwei.hackvr.service.ArticleService;
import com.luwei.hackvr.service.GameService;
import com.luwei.hackvr.service.KuaixunService;
import com.luwei.hackvr.service.ToutiaoService;
import com.luwei.hackvr.service.VideoService;
import com.luwei.hackvr.utils.ConstantUtils;

@Controller
@RequestMapping("json/")
public class JsonController {
    private static Logger logger = Logger.getLogger(JsonController.class);
    
    @Autowired
    private ArticleService articleService;
    
    @Autowired
    private KuaixunService kuaixunService;
    
    @Autowired
    private ToutiaoService toutiaoService;
    
    @Autowired
    private VideoService videoservice;
    
    @Autowired
    private GameService gameService;
    
    @ResponseBody
    @RequestMapping("article.do")
    public Map<String, Object> article(
            @RequestParam(value="index") Integer index,
            @RequestParam(value="num") Integer num,
            HttpServletRequest request, Model model,
            HttpServletResponse response) throws Exception{
//        response.setCharacterEncoding("UTF-8"); //设置编码格式
//        response.setContentType("text/html");   //设置数据格式
        
        List<Article> articles = articleService.getLateArticles(index, num);
        Map<String, Object> map = new HashMap<String, Object>();
        if (articles == null) {
            map.put("isEnd", "true");
            map.put("dataList", new ArrayList<Article>());
        } else {
            map.put("isEnd", "false");
            map.put("dataList", articles);
        }
        
        return map;
    }
    
    @ResponseBody
    @RequestMapping("type.do")
    public Map<String, Object> type(
            @RequestParam(value="index") Integer index,
            @RequestParam(value="num") Integer num,
            @RequestParam(value="type") Byte type,
            HttpServletRequest request, Model model,
            HttpServletResponse response) throws Exception{
        
        List<Article> articles = articleService.getLateArticles(index, num, type);
        Map<String, Object> map = new HashMap<String, Object>();
        if (articles == null) {
            map.put("isEnd", "true");
            map.put("dataList", new ArrayList<Article>());
        } else {
            map.put("isEnd", "false");
            map.put("dataList", articles);
        }
        
        return map;
    }
    
    @ResponseBody
    @RequestMapping("video.do")
    public Map<String, Object> video(
            @RequestParam(value="index") Integer index,
            @RequestParam(value="num") Integer num,
            @RequestParam(value="type") Byte type,
            HttpServletRequest request, Model model,
            HttpServletResponse response) throws Exception{

        List<Video> videos = videoservice.getLateVideos(index, num, type);
        Map<String, Object> map = new HashMap<String, Object>();
        if (videos == null) {
            map.put("isEnd", "true");
            map.put("dataList", new ArrayList<Video>());
        } else {
            map.put("isEnd", "false");
            map.put("dataList", videos);
        }
        
        return map;
    }

    @ResponseBody
    @RequestMapping("videoZuire.do")
    public Map<String, Object> videoZuire(
            @RequestParam(value="index") Integer index,
            @RequestParam(value="num") Integer num,
            HttpServletRequest request, Model model,
            HttpServletResponse response) throws Exception{

        List<Video> videos = videoservice.getRemenVideos(index, num);
        Map<String, Object> map = new HashMap<String, Object>();
        if (videos == null) {
            map.put("isEnd", "true");
            map.put("dataList", new ArrayList<Video>());
        } else {
            map.put("isEnd", "false");
            map.put("dataList", videos);
        }
        
        return map;
    }
    
    @ResponseBody
    @RequestMapping("videoZuixin.do")
    public Map<String, Object> videoZuixin(
            @RequestParam(value="index") Integer index,
            @RequestParam(value="num") Integer num, 
            HttpServletRequest request, Model model,
            HttpServletResponse response) throws Exception{

        List<Video> videos = videoservice.getLateVideos(index, num);
        Map<String, Object> map = new HashMap<String, Object>();
        if (videos == null) {
            map.put("isEnd", "true");
            map.put("dataList", new ArrayList<Video>());
        } else {
            map.put("isEnd", "false");
            map.put("dataList", videos);
        }
        
        return map;
    }
    
    @ResponseBody
    @RequestMapping("kuaixun.do")
    public Map<String, Object> kuaixun(
            @RequestParam(value="index") Integer index,
            @RequestParam(value="num") Integer num,
            HttpServletRequest request, Model model,
            HttpServletResponse response) throws Exception{
        
        List<List<Kuaixun>> kuaixuns = kuaixunService.getDayKuaixunsByNum(index, num);
        Map<String, Object> map = new HashMap<String, Object>();
        if (kuaixuns == null) {
            map.put("isEnd", "true");
            map.put("dataList", new ArrayList<List<Kuaixun>>());
        } else {
            map.put("isEnd", "false");
            map.put("dataList", kuaixuns);
        }
        
        return map;
    }

    @ResponseBody
    @RequestMapping("gamepc.do")
    public Map<String, Object> gamepc(
            @RequestParam(value="index") Integer index,
            @RequestParam(value="num") Integer num,
            HttpServletRequest request, Model model,
            HttpServletResponse response) throws Exception{
        Map<String, Object> retMap = gameService.getLateGames(index, num);
        
        return retMap;
    }
    
    @ResponseBody
    @RequestMapping("gameclasspc.do")
    public Map<String, Object> gameclasspc(
            @RequestParam(value="index") Integer index,
            @RequestParam(value="num") Integer num,
            @RequestParam(value="type") Integer type,
            @RequestParam(value="system") Integer system,
            @RequestParam(value="device") Integer device,
            HttpServletRequest request, Model model,
            HttpServletResponse response) throws Exception{
        Map<String, Object> retMap = gameService.getLateGames(index, num, ConstantUtils.gameTypeStore[type], ConstantUtils.systemType[system], ConstantUtils.deviceTypeStore[device]);
        
        return retMap;
    }
    
    @ResponseBody
    @RequestMapping("game.do")
    public Map<String, Object> game(
            @RequestParam(value="index") Integer index,
            @RequestParam(value="num") Integer num,
            HttpServletRequest request, Model model,
            HttpServletResponse response) throws Exception{
        @SuppressWarnings("unchecked")
        List<Game> games = (List<Game>) gameService.getLateGames(index, num).get("dataList");
        Map<String, Object> map = new HashMap<String, Object>();
        if (games == null) {
            map.put("isEnd", "true");
            map.put("dataList", games);
        } else {
            map.put("isEnd", "false");
            map.put("dataList", games);
        }
        return map;
    }
    
    @ResponseBody
    @RequestMapping("gameclass.do")
    public Map<String, Object> gameclass(
            @RequestParam(value="index") Integer index,
            @RequestParam(value="num") Integer num,
            @RequestParam(value="type") Integer type,
            @RequestParam(value="system") Integer system,
            @RequestParam(value="device") Integer device,
            HttpServletRequest request, Model model,
            HttpServletResponse response) throws Exception{
        @SuppressWarnings("unchecked")
        List<Game> games = (List<Game>) gameService.getLateGames(index, num, ConstantUtils.gameTypeStore[type], ConstantUtils.systemType[system], ConstantUtils.deviceTypeStore[device]).get("dataList");
        Map<String, Object> map = new HashMap<String, Object>();
        if (games == null) {
            map.put("isEnd", "true");
            map.put("dataList", games);
        } else {
            map.put("isEnd", "false");
            map.put("dataList", games);
        }
        return map;
    }
    
    @ResponseBody
    @RequestMapping("gamePaihang.do")
    public Map<String, Object> gamePaihang(
            @RequestParam(value="index") Integer index,
            @RequestParam(value="num") Integer num,
            HttpServletRequest request, Model model,
            HttpServletResponse response) throws Exception{
        List<Game> games = gameService.getPaihangGames(index, num);
        Map<String, Object> map = new HashMap<String, Object>();
        if (games == null) {
            map.put("isEnd", "true");
            map.put("dataList", games);
        } else {
            map.put("isEnd", "false");
            map.put("dataList", games);
        }
        return map;
    }
    
    @ResponseBody
    @RequestMapping("gameTuijie.do")
    public Map<String, Object> gameTuijie(
            @RequestParam(value="index") Integer index,
            @RequestParam(value="num") Integer num,
            HttpServletRequest request, Model model,
            HttpServletResponse response) throws Exception{
//        TODO
        List<Game> games = gameService.getPaihangGames(index, num);
        Map<String, Object> map = new HashMap<String, Object>();
        if (games == null) {
            map.put("isEnd", "true");
            map.put("dataList", games);
        } else {
            map.put("isEnd", "false");
            map.put("dataList", games);
        }
        return map;
    }
    
}
