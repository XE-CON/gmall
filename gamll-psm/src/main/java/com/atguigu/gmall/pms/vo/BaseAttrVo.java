package com.atguigu.gmall.pms.vo;

import com.atguigu.gmall.pms.entity.ProductAttrValueEntity;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;
import org.springframework.util.CollectionUtils;


import java.util.List;

@Data
public class BaseAttrVo extends ProductAttrValueEntity {

    private void setValueSelected(List<String> selected){
        if (CollectionUtils.isEmpty(selected)){
            return;
        }
        this.setAttrValue(StringUtils.join(selected,","));
    }
}
