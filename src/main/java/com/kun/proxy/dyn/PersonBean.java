package com.kun.proxy.dyn;

/**
 * @author kun
 * @data 2019/3/25 17:19
 */
public interface PersonBean {
    /**
     * 获取名字
     * @return 名字
     */
    String getName();
    String getGender();

    /**
     * 获取兴趣
     * @return  兴趣
     */
    String getInterests();

    /**
     * 获取评分
     * @return  评分
     */
    int getHotOrNotRating();

    /**
     * 设置名字
     * @param name 名字
     */
    void setName(String name);

    /**
     * 设置性别
     * @param gender 性别
     */
    void setGender(String gender);

    /**
     * 设置兴趣
     * @param interests 兴趣
     */
    void setInterests(String interests);

    /**
     * 打分
     * @param rating 分数
     */
    void setHotOrNotRating(int rating);
}
