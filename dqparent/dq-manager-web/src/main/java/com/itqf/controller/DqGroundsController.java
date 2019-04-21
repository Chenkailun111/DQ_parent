package com.itqf.controller;

import com.itqf.mapper.DqGroundsMapper;
import com.itqf.pojo.DqGrounds;
import com.itqf.service.DqEntitiesService;
import com.itqf.service.DqGroundsService;
import com.itqf.utils.DataGridResult;
import com.itqf.utils.ResultDTO;
import com.itqf.utils.TreeNodeDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class DqGroundsController {
    @Resource
    private DqGroundsService dqGroundsService;
    @Resource
    private DqEntitiesService dqEntitiesService;

    @RequestMapping("/findAll")
    @ResponseBody
    public List<DqGrounds> findAll(){
       return dqGroundsService.findAll();
    }

    @RequestMapping("/findGrounds")
    @ResponseBody
    public DataGridResult findGrouds(@RequestParam(defaultValue = "1") int page,@RequestParam(defaultValue = "10") int rows){
        return dqGroundsService.findGrouds(page,rows);
    }
    /**
     * 查询场地的类型
     */
    @RequestMapping("/selectEntityType")
    @ResponseBody
    public  List<TreeNodeDTO>  selectEntityType(){

        return dqEntitiesService.findAll();
    }

    /**
     * 新增场地
     */
    @RequestMapping("addGrounds")
    @ResponseBody
    public ResultDTO addGrounds(DqGrounds dqGrounds,String images){
        return  dqGroundsService.addGrounds(dqGrounds,images);
    }

    @RequestMapping("deleteGrounds")
    @ResponseBody
    public ResultDTO deleteGrounds(@RequestParam("ids") List<Integer> ids){
        //RequestParam前端属性和接受的不一致可以自定义
        return  dqGroundsService.deleteGrounds(ids);
    }



}
