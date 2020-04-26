package cn.jiyun.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
    * 学生对应专业表
    */
@TableName(value = "major")
public class Major {
    /**
     * 主键id
     */
    @TableId(value = "mid", type = IdType.AUTO)
    private Integer mid;

    /**
     * 专业类型
     */
    @TableField(value = "mname")
    private String mname;

    public static final String COL_MID = "mid";

    public static final String COL_MNAME = "mname";

    /**
     * 获取主键id
     *
     * @return mid - 主键id
     */
    public Integer getMid() {
        return mid;
    }

    /**
     * 设置主键id
     *
     * @param mid 主键id
     */
    public void setMid(Integer mid) {
        this.mid = mid;
    }

    /**
     * 获取专业类型
     *
     * @return mname - 专业类型
     */
    public String getMname() {
        return mname;
    }

    /**
     * 设置专业类型
     *
     * @param mname 专业类型
     */
    public void setMname(String mname) {
        this.mname = mname;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", mid=").append(mid);
        sb.append(", mname=").append(mname);
        sb.append("]");
        return sb.toString();
    }
}