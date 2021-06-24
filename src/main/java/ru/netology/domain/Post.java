package ru.netology.domain;

public class Post {
    private int postID;

    private int groupId;
    private int authorID;
    private int ownerID;
    private String textInfo;
    private int publicationData;
    private int viewsNumber;
    private int likesCount;
    private int audioUrl;
    private String imageUrl;
    private boolean friendsOnly;
    private boolean pinPost;
    private boolean disableComments;
    private boolean markAsAdd;
    private boolean AuthorName;
    private boolean deletePost;
    private boolean addToBookmarks;
    private boolean topicNonSelected;
    private boolean topicArt;
    private boolean topicIt;
    private boolean topicGames;
    private boolean topicMusic;
    private boolean topicPhoto;
    private boolean topicScience;
    private boolean topicSports;
    private boolean topicTravel;
    private boolean topicMovies;
    private boolean topicHumor;
    private GeoInfo geoInfo;
    private PostEdition postEdition;
    private Like like;
    private CommentsInfo commentsInfo;
    private Repost repost;
    private Report report;
    private SourceEdition sourceEdition;
    private GraffitiPainter graffitiPainter;

    // getters/setters


    int post() {
        // TODO: add logic
        return null;
    }

}
// КОММЕНТАРИЙ К ЗАДАНИЮ:
//у меня не оказалось полей, связанных с самым основным ID для постов - ID самого поста, также я не учла, что лайки также отображаются и считаются и в комментариях
//к тому же я упустила целый класс Geo, хотя старалась учесть каждый минимальный уголок постов - как от имени человека, так и от имени коммьюнити. Но так как больше внимания я уделяла все же постам групп, упустила поле Только для друзей.
// но удивлена отсутствию других полей и классов, которые у меня присутствуют. не понимаю, почему нет граффити, экспортов, "пожаловаться", а также отдельного класса для таймера, который довольно насыщен действиями и полями...
