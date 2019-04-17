package com.leyou.common.vo;

import com.leyou.common.entity.Spu;

/**
 * @version : 1.0
 * @ClassName: SpuBo
 * @Description :
 * @auther: hejia
 * @date: 2019/4/17
 */
public class SpuBo extends Spu {
    /**商品分类名称*/
    private String cName;
    /**品牌名称*/
    private String bName;

    /**
     * @return cName
     */
    public String getcName() {
        return cName;
    }

    /**
     * @param cName cName
     */
    public void setcName(String cName) {
        this.cName = cName;
    }

    /**
     * @return bName
     */
    public String getbName() {
        return bName;
    }

    /**
     * @param bName bName
     */
    public void setbName(String bName) {
        this.bName = bName;
    }
}
