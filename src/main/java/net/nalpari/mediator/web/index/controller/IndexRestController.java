package net.nalpari.mediator.web.index.controller;

import net.nalpari.mediator.common.SystemUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/api/index")
public class IndexRestController {

    @GetMapping(value = {"/", ""})
    public String index(HttpServletRequest request) throws Exception {
        return SystemUtil.getClient(request);
    }
}
