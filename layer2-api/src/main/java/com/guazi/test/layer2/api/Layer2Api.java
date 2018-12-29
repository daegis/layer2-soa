package com.guazi.test.layer2.api;

import com.guazi.test.layer2.vo.Layer2RequestVo;
import com.guazi.test.layer2.vo.Layer2Response;

/**
 * Using IntelliJ IDEA.
 *
 * @author XIANYINGDA at 2018-12-29 13:59
 */
public interface Layer2Api {
    Layer2Response getLayer2Response(Layer2RequestVo requestVo);
}
