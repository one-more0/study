package io.renren.modules.phpems.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "x2_knows")
public class KnowsEntity {
    @TableId
    private Integer knowsid;
    private Integer knows;
}
