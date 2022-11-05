package example.micronaut.api;

import example.micronaut.model.BookmarkAddRequest;
import example.micronaut.model.BookmarkMutationResponse;
import example.micronaut.model.Error;
import example.micronaut.model.Get2UsersIdBookmarksResponse;
import example.micronaut.model.Problem;
import java.util.Set;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import jakarta.inject.Inject;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.HashSet;


/**
 * API tests for BookmarksApi
 */
@MicronautTest
public class BookmarksApiTest {

    @Inject
    BookmarksApi api;

    
    /**
     * Bookmarks by User
     *
     * Returns Tweet objects that have been bookmarked by the requesting User
     */
    @Test
    @Disabled("Not Implemented")
    public void getUsersIdBookmarksTest() {
        // given
        String id = "example";
        Integer maxResults = 56;
        String paginationToken = "example";
        Set<String> tweetFields = new HashSet<>();
        Set<String> expansions = new HashSet<>();
        Set<String> mediaFields = new HashSet<>();
        Set<String> pollFields = new HashSet<>();
        Set<String> userFields = new HashSet<>();
        Set<String> placeFields = new HashSet<>();

        // when
        Get2UsersIdBookmarksResponse body = api.getUsersIdBookmarks(id, maxResults, paginationToken, tweetFields, expansions, mediaFields, pollFields, userFields, placeFields).block();

        // then
        // TODO implement the getUsersIdBookmarksTest()
    }

    
    /**
     * Add Tweet to Bookmarks
     *
     * Adds a Tweet (ID in the body) to the requesting User&#39;s (in the path) bookmarks
     */
    @Test
    @Disabled("Not Implemented")
    public void postUsersIdBookmarksTest() {
        // given
        String id = "example";
        BookmarkAddRequest bookmarkAddRequest = new BookmarkAddRequest("1346889436626259968");

        // when
        BookmarkMutationResponse body = api.postUsersIdBookmarks(id, bookmarkAddRequest).block();

        // then
        // TODO implement the postUsersIdBookmarksTest()
    }

    
    /**
     * Remove a bookmarked Tweet
     *
     * Removes a Tweet from the requesting User&#39;s bookmarked Tweets.
     */
    @Test
    @Disabled("Not Implemented")
    public void usersIdBookmarksDeleteTest() {
        // given
        String id = "example";
        String tweetId = "example";

        // when
        BookmarkMutationResponse body = api.usersIdBookmarksDelete(id, tweetId).block();

        // then
        // TODO implement the usersIdBookmarksDeleteTest()
    }

    
}
