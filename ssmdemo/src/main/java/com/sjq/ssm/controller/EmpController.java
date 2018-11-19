package com.sjq.ssm.controller;

import com.sjq.ssm.service.EmpService;
import com.sjq.ssm.util.PageUtil;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * className:EmpController
 * discriptoin:雇员控制层
 * author:孙家庆
 * createTime:2018-11-07 15:51
 */
@Controller
@RequestMapping("/emp")
public class EmpController {


    @Autowired
    private EmpService empService;

    /**
     * 雇员列表
     * @param map
     * @param model
     * @return
     */
    @RequestMapping("/list")
    public String list(@RequestParam Map map , Model model , HttpServletRequest request){

        map.put("pageSize",5);
        int pageNo = map.get("pageNo") == null ? 1 : Integer.valueOf(map.get("pageNo") + "");
        String stringPage = new PageUtil(pageNo,5,empService.getPageCount(map),request).getStringPage();
        model.addAttribute("stringPage",stringPage);
        model.addAttribute("empList",empService.getPage(map));
        return "emp/list";
    }

    @RequestMapping("/toAdd")
    public String toAdd(){
        return "emp/add";
    }

    @RequestMapping("/add")
    public String add(@RequestParam Map map,Model model){

        int i = empService.add(map);
        if(i>0) {
            return "redirect:/emp/list.do";
        }else{
            model.addAttribute("text","添加失败！！！");
            return "emp/add";
        }
    }

    @RequestMapping("/toUpdate")
    public String toUpdate(@RequestParam int EMPNO , Model model){
        model.addAttribute("map",empService.selectById(EMPNO));
        return "emp/update";
    }

    @RequestMapping("/update")
    public String update(@RequestParam Map map){
        empService.update(map);
        return "redirect:/emp/list.do";
    }

    @RequestMapping("/delete")
    public String delete(@RequestParam int EMPNO){
        empService.delete(EMPNO);
        return "redirect:/emp/list.do";
    }
}
