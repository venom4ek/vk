package ru.netology.domain;

public class Post {
    private int postId;
    private String namePost; // заголовок поста. можно было указать как headPost
    private String textPost; // содержимое поста
    private int date;
    private CommentsInfo commentsInfo;
    private LikesInfo likeInfo;
    private RepostsInfo repostsInfo; // SharedInfo
    private ViewsInfo viewsInfo;
    private String postType;


    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public String getNamePost() {
        return namePost;
    }

    public void setNamePost(String namePost) {
        this.namePost = namePost;
    }

    public String getTextPost() {
        return textPost;
    }

    public void setTextPost(String textPost) {
        this.textPost = textPost;
    }

    public int getData() {
        return date;
    }

    public void setData(int data) {
        this.date = date;
    }

    public CommentsInfo getCommentsInfo() {
        return commentsInfo;
    }

    public void setCommentsInfo(CommentsInfo commentsInfo) {
        this.commentsInfo = commentsInfo;
    }

    public LikesInfo getLikeInfo() {
        return likeInfo;
    }

    public void setLikeInfo(LikesInfo likeInfo) {
        this.likeInfo = likeInfo;
    }

    public RepostsInfo getSharedInfo() {
        return repostsInfo;
    }

    public void setSharedInfo(RepostsInfo sharedInfo) {
        this.repostsInfo = sharedInfo;
    }

    public ViewsInfo getViewsInfo() {
        return viewsInfo;
    }

    public void setViewsInfo(ViewsInfo viewsInfo) {
        this.viewsInfo = viewsInfo;
    }

    public String getPostType() {
        return postType;
    }

    public void setPostType(String postType) {
        this.postType = postType;
    }
}
