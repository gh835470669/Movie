package com.luwei.hackvr.controller;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.luwei.hackvr.pojo.Article;
import com.luwei.hackvr.pojo.Kuaixun;
import com.luwei.hackvr.service.ArticleService;
import com.luwei.hackvr.service.KuaixunService;
import com.luwei.hackvr.service.ToutiaoService;
import com.luwei.hackvr.service.VideoService;
import com.luwei.hackvr.utils.CheckMobile;
import com.luwei.hackvr.utils.ConstantUtils;
import com.luwei.hackvr.utils.HtmlUtil;
import com.luwei.hackvr.utils.QRCodeUtil;

@Controller
@RequestMapping("/news")
public class NewsController {
    private static Logger logger = Logger.getLogger(NewsController.class);
    
    @Autowired
    private ArticleService articleService;
    @Autowired
    private KuaixunService kuaixunService;
    @Autowired
    private ToutiaoService toutiaoService;
    @Autowired
    private VideoService videoService;

    @RequestMapping(value = "")
    public String news (
            HttpServletRequest request, HttpServletResponse response, Model model) throws IOException {
        try {
            if (check(request, response)) {
                List<Article> articles = articleService.getLateArticles(0, 8);
                List<Map<String, Object>> zixunToutios = articleService.getZixunToutiaoArticles(3);
                
                request.setAttribute("articles", articles);
                request.setAttribute("zixunToutios", zixunToutios);
                request.setAttribute("zixunType", ConstantUtils.zixunType);
                return "jsp/mobile/news_wap";
            } else {
                List<Article> articles = articleService.getLateArticles(0, 8);
                List<Map<String, Object>> zixunToutios = articleService.getZixunToutiaoArticles(3);
//              TODO  目前采用30条之后在设为热门头条
//              List<Article> remenToutiaos = articleService.getRemenToutiaoArticles();
                List<Article> remenToutiaos = articleService.getLateArticles(30, 6);
                Map<String, Object> shixunToutiao = articleService.getShixunToutiaoArticle();
                Map<String, Object> guanchaToutiao = articleService.getGuanchaToutiaoArticle();
                Map<String, Object> yingshiToutiao = articleService.getYingshiToutiaoArticle();
                Map<String, Object> youxiToutiao = articleService.getYouxiToutiaoArticle();
                List<Kuaixun> kuaixuns = kuaixunService.getLateKuaixuns(0, 5);
                
                request.setAttribute("articles", articles);
                request.setAttribute("zixunToutios", zixunToutios);
                request.setAttribute("remenToutiaos", remenToutiaos);
                request.setAttribute("shixunToutiao", shixunToutiao);
                request.setAttribute("guanchaToutiao", guanchaToutiao);
                request.setAttribute("yingshiToutiao", yingshiToutiao);
                request.setAttribute("youxiToutiao", youxiToutiao);
                request.setAttribute("kuaixuns", kuaixuns);
                request.setAttribute("zixunType", ConstantUtils.zixunType);
                return "jsp/news";
            }
        } catch (Exception e) {
            logger.error("加载资讯页面异常", e);
            model.addAttribute("errorMessage", "加载资讯页面异常");
            return "error";
        }
    }
    
    // 1: newsletter  2: observation  3: game  4: movie
    @RequestMapping(value = "/{type}")
    public String type (
    		@PathVariable("type") String typeRequest,
            HttpServletRequest request, HttpServletResponse response, Model model) throws IOException {
        try {
        	Byte typeString = 0;
        	if (typeRequest.equals("newsletter")) {
        		typeString = 1;
        	} else if (typeRequest.equals("observation")) {
        	    typeString = 2;
        	} else if (typeRequest.equals("game")) {
        	    typeString = 3;
        	} else if (typeRequest.equals("movie")) {
        	    typeString = 4;
        	}

            if (typeString == 0) {
                return "notfound";
            }
            
            if (check(request, response)) {
                Map<String, Object> article = new HashMap<String, Object>();
                if (typeString == 1) {
                    article = articleService.getShixunToutiaoArticle();
                } else if (typeString == 2) {
                    article = articleService.getGuanchaToutiaoArticle();
                } else if (typeString == 3) {
                    article = articleService.getYouxiToutiaoArticle();
                } else if (typeString == 4) {
                    article = articleService.getYingshiToutiaoArticle();
                }
                List<Article> articles = articleService.getLateArticles(0, 8, typeString);
                
                request.setAttribute("type", typeString);
                request.setAttribute("article", article);
                request.setAttribute("articles", articles);
                request.setAttribute("zixunType", ConstantUtils.zixunType);
                return "jsp/mobile/newsclass_wap";
            } else {
                List<Article> articles = articleService.getLateArticles(0, 8, typeString);
//              TODO
//              List<Article> remenToutiaos = articleService.getRemenToutiaoArticles();
                List<Article> remenToutiaos = articleService.getLateArticles(30, 6);
                
                request.setAttribute("type", typeString);
                request.setAttribute("articles", articles);
                request.setAttribute("remenToutiaos", remenToutiaos);
                request.setAttribute("zixunType", ConstantUtils.zixunType);
                return "jsp/newsclass";
            }
        } catch (Exception e) {
            logger.error("加载资讯类型页面异常", e);
            model.addAttribute("errorMessage", "加载资讯类型页面异常");
            return "error";
        }
    }

    // 1: newsletter  2: observation  3: game  4: movie
    @RequestMapping(value="/{type}/{articleId}.html")
    public String article (
    		@PathVariable("type") String typeRequest,
            @PathVariable("articleId") int articleId,
            HttpServletRequest request, HttpServletResponse response, Model model) throws IOException {
        try {
            Byte typeString = 0;
            if (typeRequest.equals("newsletter")) {
                typeString = 1;
            } else if (typeRequest.equals("observation")) {
                typeString = 2;
            } else if (typeRequest.equals("game")) {
                typeString = 3;
            } else if (typeRequest.equals("movie")) {
                typeString = 4;
            }
            
            if (typeString == 0) {
                return "notfound";
            }
            
            if (check(request, response)) {
                Article article = articleService.getArticleById(articleId);
                
//              为移动端的html文本加入样式类
                article.setContent(HtmlUtil.insertClassToPTagWithImgTag(article.getContent(), "class='article-wap-img'", "class='font-size-1'"));
                
//              TODO  目前未加入标签，取同类的最新文章作为相关文章
                List<Article> xiangguanArticles = articleService.getLateArticles(0, 6, article.getType());
                
                request.setAttribute("article", article);
                request.setAttribute("xiangguanArticles", xiangguanArticles);
                request.setAttribute("zixunType", ConstantUtils.zixunType);
                return "jsp/mobile/newsarticle_wap";
            } else {
//                生成路径的二维码
                @SuppressWarnings("deprecation")
                String basePathString = request.getRealPath("/qrcode/article") + "/";
                String qrcodeUrlString = basePathString + articleId +".jpg";
                File file=new File(qrcodeUrlString);    
                if(!file.exists()) {
                    String url = request.getScheme() +"://" + request.getServerName()
                            + request.getServletPath();
                    if (request.getQueryString() != null){
                        url += "?" + request.getQueryString();
                    }
                    QRCodeUtil.encode(url, "", basePathString, true, articleId +".jpg");
                }
                
                Article article = articleService.getArticleById(articleId);
                
//              TODO
                List<Article> remenToutiaos = articleService.getLateArticles(30, 6);
//                TODO
                List<Article> xiangguanArticles = articleService.getLateArticles(0, 6, article.getType());

                request.setAttribute("qrcode", "./qrcode/article/" + articleId +".jpg");
                request.setAttribute("article", article);
                request.setAttribute("remenToutiaos", remenToutiaos);
                request.setAttribute("xiangguanArticles", xiangguanArticles);
                request.setAttribute("zixunType", ConstantUtils.zixunType);
                return "jsp/newsarticle";
            }
        } catch (Exception e) {
            logger.error("加载文章页面异常", e);
            model.addAttribute("errorMessage", "加载文章页面异常");
            return "error";
        }
    }
    
    @RequestMapping("/newsflash")
    public String flash (
            HttpServletRequest request, HttpServletResponse response, Model model) throws IOException {
        try {
            if (check(request, response)) {
                List<List<Kuaixun>> kuaixunSet = kuaixunService.getDayKuaixunsByNum(0, 5);

                request.setAttribute("kuaixunSet", kuaixunSet);
                request.setAttribute("zixunType", ConstantUtils.zixunType);
                return "jsp/mobile/newsflash_wap";
            } else {
//              TODO
                List<Article> remenToutiaos = articleService.getLateArticles(30, 6);
                List<List<Kuaixun>> kuaixunSet = kuaixunService.getDayKuaixunsByNum(0, 5);
                
                request.setAttribute("remenToutiaos", remenToutiaos);
                request.setAttribute("kuaixunSet", kuaixunSet);
                request.setAttribute("zixunType", ConstantUtils.zixunType);
                return "jsp/newsflash";
            }
        } catch (Exception e) {
            logger.error("加载快讯页面异常", e);
            model.addAttribute("errorMessage", "加载快讯页面异常");
            return "error";
        }
    }
    
    private boolean check(HttpServletRequest request, HttpServletResponse response) throws IOException{  
        boolean isFromMobile=false;  
          
//        HttpSession session= request.getSession();  
       //检查是否已经记录访问方式（移动端或pc端）  
//        if(null==session.getAttribute("ua")){  
            try{  
                //获取ua，用来判断是否为移动端访问  
                String userAgent = request.getHeader( "USER-AGENT" ).toLowerCase();    
                if(null == userAgent){    
                    userAgent = "";    
                }  
                isFromMobile = CheckMobile.check(userAgent);  
                //判断是否为移动端访问  
//                if(isFromMobile){  
////                    System.out.println("移动端访问");  
//                    session.setAttribute("ua","mobile");  
//                } else {  
////                    System.out.println("pc端访问");  
//                    session.setAttribute("ua","pc");  
//                }  
            }catch(Exception e){}  
//        }else{  
//            isFromMobile=session.getAttribute("ua").equals("mobile");  
//        }  
          
        return isFromMobile;  
    }
    
}
