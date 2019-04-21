package com.itqf.utils;

/**
 * EeayUI树形结构封装的对象
 * 每个节点都具备以下属性：
 *
 * id：节点ID，对加载远程数据很重要。
 * text：显示节点文本。
 * state：节点状态，'open' 或 'closed'，默认：'open'。如果为'closed'的时候，将不自动展开该节点。
 */
public class TreeNodeDTO {

    private int id;
    private String text;
    private String state;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
