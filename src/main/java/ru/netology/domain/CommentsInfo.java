package ru.netology.domain;

public class CommentsInfo {
    private int count; // количество комментариев
    private boolean canComment; // может ли пользователь оставлять комментарий к данному посту

    // правка с учетом документации
    private int[] canPost;  // информация о том, может ли текущий пользователь комментировать запись (1 — может, 0 — не может)
    private int[] groupsCanPost;  // информация о том, могут ли сообщества комментировать запись;
    private boolean canClose;  //  может ли текущий пользователь закрыть комментарии к записи
    private boolean canOpen;  // может ли текущий пользователь открыть комментарии к записи
}