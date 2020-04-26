package cn.jiyun.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;

/**
    * 员工表
    */
@TableName(value = "emp")
public class Emp {
    /**
     * 主键id
     */
    @TableId(value = "eid", type = IdType.AUTO)
    private Integer eid;

    /**
     * 员工姓名
     */
    @TableField(value = "ename")
    private String ename;

    /**
     * 员工性别
     */
    @TableField(value = "sex")
    private String sex;

    /**
     * 爱好
     */
    @TableField(value = "hobby")
    private String hobby;

    /**
     * 图片地址
     */
    @TableField(value = "img")
    private String img;

    /**
     * 生日
     */
    @TableField(value = "birthday")
    private Date birthday;

    /**
     * 外键id
     */
    @TableField(value = "did")
    private Integer did;

    /**
     * 地址
     */
    @TableField(value = "addr")
    private String addr;

    @TableField(value = "creatTime")
    private Date creattime;

    public static final String COL_EID = "eid";

    public static final String COL_ENAME = "ename";

    public static final String COL_SEX = "sex";

    public static final String COL_HOBBY = "hobby";

    public static final String COL_IMG = "img";

    public static final String COL_BIRTHDAY = "birthday";

    public static final String COL_DID = "did";

    public static final String COL_ADDR = "addr";

    public static final String COL_CREATTIME = "creatTime";

    /**
     * 获取主键id
     *
     * @return eid - 主键id
     */
    public Integer getEid() {
        return eid;
    }

    /**
     * 设置主键id
     *
     * @param eid 主键id
     */
    public void setEid(Integer eid) {
        this.eid = eid;
    }

    /**
     * 获取员工姓名
     *
     * @return ename - 员工姓名
     */
    public String getEname() {
        return ename;
    }

    /**
     * 设置员工姓名
     *
     * @param ename 员工姓名
     */
    public void setEname(String ename) {
        this.ename = ename;
    }

    /**
     * 获取员工性别
     *
     * @return sex - 员工性别
     */
    public String getSex() {
        return sex;
    }

    /**
     * 设置员工性别
     *
     * @param sex 员工性别
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * 获取爱好
     *
     * @return hobby - 爱好
     */
    public String getHobby() {
        return hobby;
    }

    /**
     * 设置爱好
     *
     * @param hobby 爱好
     */
    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    /**
     * 获取图片地址
     *
     * @return img - 图片地址
     */
    public String getImg() {
        return img;
    }

    /**
     * 设置图片地址
     *
     * @param img 图片地址
     */
    public void setImg(String img) {
        this.img = img;
    }

    /**
     * 获取生日
     *
     * @return birthday - 生日
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * 设置生日
     *
     * @param birthday 生日
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * 获取外键id
     *
     * @return did - 外键id
     */
    public Integer getDid() {
        return did;
    }

    /**
     * 设置外键id
     *
     * @param did 外键id
     */
    public void setDid(Integer did) {
        this.did = did;
    }

    /**
     * 获取地址
     *
     * @return addr - 地址
     */
    public String getAddr() {
        return addr;
    }

    /**
     * 设置地址
     *
     * @param addr 地址
     */
    public void setAddr(String addr) {
        this.addr = addr;
    }

    /**
     * @return creatTime
     */
    public Date getCreattime() {
        return creattime;
    }

    /**
     * @param creattime
     */
    public void setCreattime(Date creattime) {
        this.creattime = creattime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", eid=").append(eid);
        sb.append(", ename=").append(ename);
        sb.append(", sex=").append(sex);
        sb.append(", hobby=").append(hobby);
        sb.append(", img=").append(img);
        sb.append(", birthday=").append(birthday);
        sb.append(", did=").append(did);
        sb.append(", addr=").append(addr);
        sb.append(", creattime=").append(creattime);
        sb.append("]");
        return sb.toString();
    }
}