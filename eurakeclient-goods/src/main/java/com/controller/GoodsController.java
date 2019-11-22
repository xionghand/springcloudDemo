package com.controller;

import com.pojo.Goods;
import com.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/goods")
public class GoodsController {
    @Autowired
    private GoodsService goodsService;

    @RequestMapping("/toshow")
    public ModelAndView queryAll() {
        List<Goods> list = new ArrayList<>();
        list = goodsService.queryAll();
        ModelAndView mv = new ModelAndView();
        mv.addObject("list", list);
        mv.setViewName("show");
        return mv;
    }

    @RequestMapping("/buyGoods")
    public ModelAndView buyGoods(@RequestParam("id") int id){
        ModelAndView mv = new ModelAndView();
        goodsService.buyGoods(id);
        mv.setViewName("redirect:toshow");
        return mv;
    }
}
