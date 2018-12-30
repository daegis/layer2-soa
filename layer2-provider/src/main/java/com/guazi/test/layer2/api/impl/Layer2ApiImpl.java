package com.guazi.test.layer2.api.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.fastjson.JSON;
import com.guazi.test.layer2.api.Layer2Api;
import com.guazi.test.layer2.vo.Layer2RequestVo;
import com.guazi.test.layer2.vo.Layer2Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Using IntelliJ IDEA.
 *
 * @author XIANYINGDA at 2018-12-29 13:59
 */
@Path("/layer2")
@Produces({MediaType.APPLICATION_JSON})
@Consumes({MediaType.APPLICATION_JSON})
@Component
@Slf4j
@Service
public class Layer2ApiImpl implements Layer2Api {

    @Path("/response")
    @GET
    @Override
    public Layer2Response getLayer2Response(Layer2RequestVo requestVo) {
        log.info("传入参数：{}", JSON.toJSONString(requestVo));
        Layer2Response response = new Layer2Response();
        if (requestVo.getAge() == 18) {
            throw new RuntimeException("第二层模拟异常");
        }
        response.setName(requestVo.getName() + "layer2");
        response.setAge(requestVo.getAge());
        return response;
    }
}
