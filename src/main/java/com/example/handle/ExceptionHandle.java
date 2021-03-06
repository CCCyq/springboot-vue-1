package com.example.handle;

import com.example.model.ArticleType;
import com.example.model.Category;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Date;

/**
 * 全局异常处理
 *
 * @author jiangchong
 * @since 2017/8/24 20:47
 */
@RestControllerAdvice
public class ExceptionHandle {
    private String id;
    private String title;
    private String author;
    private ArticleType articleType;
    private String tag;
    private Category category;
    private String content;
    private Date createTime;
    private Date modifyTime;
    private Boolean drafts;
    private Boolean recycle;

    public ExceptionHandle() {
    }

    public ExceptionHandle(String id, String title, String author, ArticleType articleType, String tag, Category category, String content, Date createTime, Date modifyTime, Boolean drafts, Boolean recycle) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.articleType = articleType;
        this.tag = tag;
        this.category = category;
        this.content = content;
        this.createTime = createTime;
        this.modifyTime = modifyTime;
        this.drafts = drafts;
        this.recycle = recycle;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public ArticleType getArticleType() {
        return articleType;
    }

    public void setArticleType(ArticleType articleType) {
        this.articleType = articleType;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Boolean getDrafts() {
        return drafts;
    }

    public void setDrafts(Boolean drafts) {
        this.drafts = drafts;
    }

    public Boolean getRecycle() {
        return recycle;
    }

    public void setRecycle(Boolean recycle) {
        this.recycle = recycle;
    }
}
