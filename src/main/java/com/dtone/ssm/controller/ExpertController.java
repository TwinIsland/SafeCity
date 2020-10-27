package com.dtone.ssm.controller;

import com.dtone.ssm.entity.ExpertEntity;
import com.dtone.ssm.service.IExpertService;
import com.dtone.ssm.service.IMedicamentService;
import com.dtone.ssm.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author mac
 * @date 2020/10/27  11:07
 * @desc
 */
@RestController
@RequestMapping("html/")
@Slf4j  //获取日志对象
public class ExpertController
{

        @Autowired
        private IExpertService iExpertService;

        //获取日志对象（用于写调试日志）
        //private final Logger logger = LoggerFactory.getLogger(this.getClass());
        @RequestMapping("user/expert")
        public String getExpert(ExpertEntity expertEntity,HttpSession session){
            log.info("收到专家一览请求："+expertEntity );
            iExpertService.selectAllExpert();
            return "success";
        }
//    /**
//     * 请求总页数处理
//     * @return
//     */
//    @RequestMapping("user/total")
//    public String totalPage(){
//        String totalPage = String.valueOf(userService.getTotalPage());
//        return totalPage;
//    }
//
//    /**
//     * 请求购物车
//     * @param session
//     * @return
//     */
//    @RequestMapping("user/shopcar")
//    public List<ShopCarBean> getShopCar(int page,HttpSession session) {
//        String name = (String)session.getAttribute("name");
//        List<ShopCarBean> shopCarBeans = userService.getShopCarBookPage(name,page);
//        return shopCarBeans;
//    }
//
//    /**
//     * 删除购物车请求
//     * @param id
//     * @return
//     */
//    @RequestMapping("user/delete")
//    public String deleteShopCar(int id){
//        userService.deleteShopCarBook(id);
//        return "success";
//    }
//        @RequestMapping("user/")
//        public String getName(HttpServletRequest request){
//            //log.info("Session: " + request.getSession().getId());
//            Object uName = request.getSession().getAttribute("name");
//            if(uName == null){
//                return "false";
//            }
//            return uName.toString();
//        }
//    }

}
