package xyz.bolitao.my_mall.entity;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 专题评论表
 * </p>
 *
 * @author bolitao
 * @since 2021-04-19
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="CmsSubjectComment对象", description="专题评论表")
public class CmsSubjectComment implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long subjectId;

    private String memberNickName;

    private String memberIcon;

    private String content;

    private LocalDateTime createTime;

    private Integer showStatus;


}