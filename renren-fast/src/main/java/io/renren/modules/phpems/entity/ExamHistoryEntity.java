package io.renren.modules.phpems.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "x2_examhistory")
public class ExamHistoryEntity {
    @TableId
    private Integer ehid;
    private Integer ehscore;
    private String ehusername;
    private String ehscorelist;
}
