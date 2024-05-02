package com.controller;


import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.StringUtil;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;

import com.entity.ShoukuanEntity;

import com.service.ShoukuanService;
import com.entity.view.ShoukuanView;
import com.service.YonghuService;
import com.utils.PageUtils;
import com.utils.R;

/**
 * 收款信息
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/shoukuan")
public class ShoukuanController {
    private static final Logger logger = LoggerFactory.getLogger(ShoukuanController.class);

    @Autowired
    private ShoukuanService shoukuanService;


    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;



    //级联表service
    @Autowired
    private YonghuService yonghuService;


    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isEmpty(role)){
            return R.error(511,"权限为空");
        }
        else if("员工".equals(role)){
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        }
        params.put("orderBy","id");
        PageUtils page = shoukuanService.queryPage(params);

        //字典表数据转换
        List<ShoukuanView> list =(List<ShoukuanView>)page.getList();
        for(ShoukuanView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        ShoukuanEntity shoukuan = shoukuanService.selectById(id);
        if(shoukuan !=null){
            //entity转view
            ShoukuanView view = new ShoukuanView();
            BeanUtils.copyProperties( shoukuan , view );//把实体数据重构到view中

            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody ShoukuanEntity shoukuan, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,shoukuan:{}",this.getClass().getName(),shoukuan.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isEmpty(role)){
            return R.error(511,"权限为空");
        }
        Wrapper<ShoukuanEntity> queryWrapper = new EntityWrapper<ShoukuanEntity>()
            .eq("dingdan_name", shoukuan.getDingdanName())
            .eq("gongshi_name", shoukuan.getGongshiName())
            .eq("shoukuan_name", shoukuan.getShoukuanName())
            .eq("jingshou_name", shoukuan.getJingshouName())
            .eq("zhifu_types", shoukuan.getZhifuTypes())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        ShoukuanEntity shoukuanEntity = shoukuanService.selectOne(queryWrapper);
        if(shoukuanEntity==null){
            shoukuan.setCreateTime(new Date());
            shoukuanService.insert(shoukuan);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody ShoukuanEntity shoukuan, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,shoukuan:{}",this.getClass().getName(),shoukuan.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isEmpty(role)){
            return R.error(511,"权限为空");
        }
        //根据字段查询是否有相同数据
        Wrapper<ShoukuanEntity> queryWrapper = new EntityWrapper<ShoukuanEntity>()
            .notIn("id",shoukuan.getId())
            .andNew()
            .eq("dingdan_name", shoukuan.getDingdanName())
            .eq("gongshi_name", shoukuan.getGongshiName())
            .eq("shoukuan_name", shoukuan.getShoukuanName())
            .eq("jingshou_name", shoukuan.getJingshouName())
            .eq("zhifu_types", shoukuan.getZhifuTypes())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        ShoukuanEntity shoukuanEntity = shoukuanService.selectOne(queryWrapper);
        if(shoukuanEntity==null){
            //  String role = String.valueOf(request.getSession().getAttribute("role"));
            //  if("".equals(role)){
            //      shoukuan.set
            //  }
            shoukuanService.updateById(shoukuan);//根据id更新
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }



    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        shoukuanService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }



    /**
    * 前端列表
    */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("list方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isEmpty(role)){
            return R.error(511,"权限为空");
        }
        else if("员工".equals(role)){
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        }
        // 没有指定排序字段就默认id倒序
        if(StringUtil.isEmpty(String.valueOf(params.get("orderBy")))){
            params.put("orderBy","id");
        }
        PageUtils page = shoukuanService.queryPage(params);

        //字典表数据转换
        List<ShoukuanView> list =(List<ShoukuanView>)page.getList();
        for(ShoukuanView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c);
        }
        return R.ok().put("data", page);
    }

    /**
    * 前端详情
    */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        logger.debug("detail方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        ShoukuanEntity shoukuan = shoukuanService.selectById(id);
            if(shoukuan !=null){
                //entity转view
                ShoukuanView view = new ShoukuanView();
                BeanUtils.copyProperties( shoukuan , view );//把实体数据重构到view中

                //修改对应字典表字段
                dictionaryService.dictionaryConvert(view);
                return R.ok().put("data", view);
            }else {
                return R.error(511,"查不到数据");
            }
    }


    /**
    * 前端保存
    */
    @RequestMapping("/add")
    public R add(@RequestBody ShoukuanEntity shoukuan, HttpServletRequest request){
        logger.debug("add方法:,,Controller:{},,shoukuan:{}",this.getClass().getName(),shoukuan.toString());
        Wrapper<ShoukuanEntity> queryWrapper = new EntityWrapper<ShoukuanEntity>()
            .eq("dingdan_name", shoukuan.getDingdanName())
            .eq("gongshi_name", shoukuan.getGongshiName())
            .eq("shoukuan_name", shoukuan.getShoukuanName())
            .eq("jingshou_name", shoukuan.getJingshouName())
            .eq("zhifu_types", shoukuan.getZhifuTypes())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        ShoukuanEntity shoukuanEntity = shoukuanService.selectOne(queryWrapper);
        if(shoukuanEntity==null){
            shoukuan.setCreateTime(new Date());
        //  String role = String.valueOf(request.getSession().getAttribute("role"));
        //  if("".equals(role)){
        //      shoukuan.set
        //  }
        shoukuanService.insert(shoukuan);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }





}

