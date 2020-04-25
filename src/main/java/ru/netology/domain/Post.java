package ru.netology.domain;

public class Post {
    private int postId;
    private String namePost;
    private String textPost;
    private int data;
    private CommentsInfo commentsInfo;
    private LikesInfo likeInfo;
    private SharedInfo sharedInfo;
    private ViewsInfo viewsInfo;
    private MoreInfo moreInfo;


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
        return data;
    }

    public void setData(int data) {
        this.data = data;
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

    public SharedInfo getSharedInfo() {
        return sharedInfo;
    }

    public void setSharedInfo(SharedInfo sharedInfo) {
        this.sharedInfo = sharedInfo;
    }

    public ViewsInfo getViewsInfo() {
        return viewsInfo;
    }

    public void setViewsInfo(ViewsInfo viewsInfo) {
        this.viewsInfo = viewsInfo;
    }

    public MoreInfo getMoreInfo() {
        return moreInfo;
    }

    public void setMoreInfo(MoreInfo moreInfo) {
        this.moreInfo = moreInfo;
    }
}
