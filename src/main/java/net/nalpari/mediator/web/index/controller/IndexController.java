package net.nalpari.mediator.web.index.controller;

import lombok.extern.slf4j.Slf4j;
import net.nalpari.mediator.common.SystemUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Slf4j
@Controller
@RequestMapping("")
public class IndexController {

    @GetMapping("/")
    public ModelAndView index(HttpServletRequest request) throws Exception {
        ModelAndView mav = new ModelAndView();
        mav.addObject("clientIP", SystemUtil.getClientIp(request));
        mav.setViewName("index");
        return mav;
    }
}
