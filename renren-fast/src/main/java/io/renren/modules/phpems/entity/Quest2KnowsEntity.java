package io.renren.modules.phpems.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "x2_quest2knows")
public class Quest2KnowsEntity {
    @TableId
    private Integer qkid;
    private Integer qkquestionid;
    private Integer qkkonwsid;
}
