package ru.netology.domain;

public class Post {
    private int postId; // идентификатор записи
    private int ownerId; // идентификатор владельца стены, на которой размещена запись
    private int userId; // идентификатор пользователя, создавшего пост
    private int wallId; // идентификатор стены, на которой находится пост
    private int date; // дата публикации поста
    private int text; // текст поста
    private int photoId; // идентификатор фото, прикрепленного к посту
    private int soundId; // идентификатор аудиозаписи, прикрепленной к посту
    private int repostId; // идентификатор записи, созданной на основе репоста
    private int commentId; // идентификатор комментария
    private int likeId; // идентификатор лайка
    private boolean canPost; // может ли пользователь оставлять запись на текущей стене

    // правка с комментарием преподавателя
    private CommentsInfo commentsInfo;
    private LikesInfo likesInfo;
    private RepostInfo repostInfo;
    private ViewsInfo viewsInfo;
}