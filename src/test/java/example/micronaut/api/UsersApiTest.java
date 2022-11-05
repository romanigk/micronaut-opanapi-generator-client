package example.micronaut.api;

import example.micronaut.model.BlockUserMutationResponse;
import example.micronaut.model.BlockUserRequest;
import example.micronaut.model.Error;
import example.micronaut.model.Get2ListsIdFollowersResponse;
import example.micronaut.model.Get2ListsIdMembersResponse;
import example.micronaut.model.Get2TweetsIdLikingUsersResponse;
import example.micronaut.model.Get2TweetsIdRetweetedByResponse;
import example.micronaut.model.Get2UsersByResponse;
import example.micronaut.model.Get2UsersByUsernameUsernameResponse;
import example.micronaut.model.Get2UsersIdBlockingResponse;
import example.micronaut.model.Get2UsersIdFollowersResponse;
import example.micronaut.model.Get2UsersIdFollowingResponse;
import example.micronaut.model.Get2UsersIdMutingResponse;
import example.micronaut.model.Get2UsersIdResponse;
import example.micronaut.model.Get2UsersMeResponse;
import example.micronaut.model.Get2UsersResponse;
import example.micronaut.model.MuteUserMutationResponse;
import example.micronaut.model.MuteUserRequest;
import example.micronaut.model.Problem;
import java.util.Set;
import example.micronaut.model.UsersFollowingCreateRequest;
import example.micronaut.model.UsersFollowingCreateResponse;
import example.micronaut.model.UsersFollowingDeleteResponse;
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
 * API tests for UsersApi
 */
@MicronautTest
public class UsersApiTest {

    @Inject
    UsersApi api;

    
    /**
     * User lookup me
     *
     * This endpoint returns information about the requesting User.
     */
    @Test
    @Disabled("Not Implemented")
    public void findMyUserTest() {
        // given
        Set<String> userFields = new HashSet<>();
        Set<String> expansions = new HashSet<>();
        Set<String> tweetFields = new HashSet<>();

        // when
        Get2UsersMeResponse body = api.findMyUser(userFields, expansions, tweetFields).block();

        // then
        // TODO implement the findMyUserTest()
    }

    
    /**
     * User lookup by ID
     *
     * This endpoint returns information about a User. Specify User by ID.
     */
    @Test
    @Disabled("Not Implemented")
    public void findUserByIdTest() {
        // given
        String id = "2244994945";
        Set<String> userFields = new HashSet<>();
        Set<String> expansions = new HashSet<>();
        Set<String> tweetFields = new HashSet<>();

        // when
        Get2UsersIdResponse body = api.findUserById(id, userFields, expansions, tweetFields).block();

        // then
        // TODO implement the findUserByIdTest()
    }

    
    /**
     * User lookup by username
     *
     * This endpoint returns information about a User. Specify User by username.
     */
    @Test
    @Disabled("Not Implemented")
    public void findUserByUsernameTest() {
        // given
        String username = "TwitterDev";
        Set<String> userFields = new HashSet<>();
        Set<String> expansions = new HashSet<>();
        Set<String> tweetFields = new HashSet<>();

        // when
        Get2UsersByUsernameUsernameResponse body = api.findUserByUsername(username, userFields, expansions, tweetFields).block();

        // then
        // TODO implement the findUserByUsernameTest()
    }

    
    /**
     * User lookup by IDs
     *
     * This endpoint returns information about Users. Specify Users by their ID.
     */
    @Test
    @Disabled("Not Implemented")
    public void findUsersByIdTest() {
        // given
        List<String> ids = Arrays.asList("example");
        Set<String> userFields = new HashSet<>();
        Set<String> expansions = new HashSet<>();
        Set<String> tweetFields = new HashSet<>();

        // when
        Get2UsersResponse body = api.findUsersById(ids, userFields, expansions, tweetFields).block();

        // then
        // TODO implement the findUsersByIdTest()
    }

    
    /**
     * User lookup by usernames
     *
     * This endpoint returns information about Users. Specify Users by their username.
     */
    @Test
    @Disabled("Not Implemented")
    public void findUsersByUsernameTest() {
        // given
        List<String> usernames = Arrays.asList("example");
        Set<String> userFields = new HashSet<>();
        Set<String> expansions = new HashSet<>();
        Set<String> tweetFields = new HashSet<>();

        // when
        Get2UsersByResponse body = api.findUsersByUsername(usernames, userFields, expansions, tweetFields).block();

        // then
        // TODO implement the findUsersByUsernameTest()
    }

    
    /**
     * Returns User objects that follow a List by the provided List ID
     *
     * Returns a list of Users that follow a List by the provided List ID
     */
    @Test
    @Disabled("Not Implemented")
    public void listGetFollowersTest() {
        // given
        String id = "example";
        Integer maxResults = 100;
        String paginationToken = "example";
        Set<String> userFields = new HashSet<>();
        Set<String> expansions = new HashSet<>();
        Set<String> tweetFields = new HashSet<>();

        // when
        Get2ListsIdFollowersResponse body = api.listGetFollowers(id, maxResults, paginationToken, userFields, expansions, tweetFields).block();

        // then
        // TODO implement the listGetFollowersTest()
    }

    
    /**
     * Returns User objects that are members of a List by the provided List ID.
     *
     * Returns a list of Users that are members of a List by the provided List ID.
     */
    @Test
    @Disabled("Not Implemented")
    public void listGetMembersTest() {
        // given
        String id = "example";
        Integer maxResults = 100;
        String paginationToken = "example";
        Set<String> userFields = new HashSet<>();
        Set<String> expansions = new HashSet<>();
        Set<String> tweetFields = new HashSet<>();

        // when
        Get2ListsIdMembersResponse body = api.listGetMembers(id, maxResults, paginationToken, userFields, expansions, tweetFields).block();

        // then
        // TODO implement the listGetMembersTest()
    }

    
    /**
     * Returns User objects that have liked the provided Tweet ID
     *
     * Returns a list of Users that have liked the provided Tweet ID
     */
    @Test
    @Disabled("Not Implemented")
    public void tweetsIdLikingUsersTest() {
        // given
        String id = "example";
        Integer maxResults = 100;
        String paginationToken = "example";
        Set<String> userFields = new HashSet<>();
        Set<String> expansions = new HashSet<>();
        Set<String> tweetFields = new HashSet<>();

        // when
        Get2TweetsIdLikingUsersResponse body = api.tweetsIdLikingUsers(id, maxResults, paginationToken, userFields, expansions, tweetFields).block();

        // then
        // TODO implement the tweetsIdLikingUsersTest()
    }

    
    /**
     * Returns User objects that have retweeted the provided Tweet ID
     *
     * Returns a list of Users that have retweeted the provided Tweet ID
     */
    @Test
    @Disabled("Not Implemented")
    public void tweetsIdRetweetingUsersTest() {
        // given
        String id = "example";
        Integer maxResults = 100;
        String paginationToken = "example";
        Set<String> userFields = new HashSet<>();
        Set<String> expansions = new HashSet<>();
        Set<String> tweetFields = new HashSet<>();

        // when
        Get2TweetsIdRetweetedByResponse body = api.tweetsIdRetweetingUsers(id, maxResults, paginationToken, userFields, expansions, tweetFields).block();

        // then
        // TODO implement the tweetsIdRetweetingUsersTest()
    }

    
    /**
     * Block User by User ID
     *
     * Causes the User (in the path) to block the target User. The User (in the path) must match the User context authorizing the request
     */
    @Test
    @Disabled("Not Implemented")
    public void usersIdBlockTest() {
        // given
        String id = "example";
        BlockUserRequest blockUserRequest = new BlockUserRequest("2244994945");

        // when
        BlockUserMutationResponse body = api.usersIdBlock(id, blockUserRequest).block();

        // then
        // TODO implement the usersIdBlockTest()
    }

    
    /**
     * Returns User objects that are blocked by provided User ID
     *
     * Returns a list of Users that are blocked by the provided User ID
     */
    @Test
    @Disabled("Not Implemented")
    public void usersIdBlockingTest() {
        // given
        String id = "example";
        Integer maxResults = 56;
        String paginationToken = "example";
        Set<String> userFields = new HashSet<>();
        Set<String> expansions = new HashSet<>();
        Set<String> tweetFields = new HashSet<>();

        // when
        Get2UsersIdBlockingResponse body = api.usersIdBlocking(id, maxResults, paginationToken, userFields, expansions, tweetFields).block();

        // then
        // TODO implement the usersIdBlockingTest()
    }

    
    /**
     * Follow User
     *
     * Causes the User(in the path) to follow, or “request to follow” for protected Users, the target User. The User(in the path) must match the User context authorizing the request
     */
    @Test
    @Disabled("Not Implemented")
    public void usersIdFollowTest() {
        // given
        String id = "example";
        UsersFollowingCreateRequest usersFollowingCreateRequest = new UsersFollowingCreateRequest("2244994945");

        // when
        UsersFollowingCreateResponse body = api.usersIdFollow(id, usersFollowingCreateRequest).block();

        // then
        // TODO implement the usersIdFollowTest()
    }

    
    /**
     * Followers by User ID
     *
     * Returns a list of Users who are followers of the specified User ID.
     */
    @Test
    @Disabled("Not Implemented")
    public void usersIdFollowersTest() {
        // given
        String id = "2244994945";
        Integer maxResults = 56;
        String paginationToken = "example";
        Set<String> userFields = new HashSet<>();
        Set<String> expansions = new HashSet<>();
        Set<String> tweetFields = new HashSet<>();

        // when
        Get2UsersIdFollowersResponse body = api.usersIdFollowers(id, maxResults, paginationToken, userFields, expansions, tweetFields).block();

        // then
        // TODO implement the usersIdFollowersTest()
    }

    
    /**
     * Following by User ID
     *
     * Returns a list of Users that are being followed by the provided User ID
     */
    @Test
    @Disabled("Not Implemented")
    public void usersIdFollowingTest() {
        // given
        String id = "2244994945";
        Integer maxResults = 56;
        String paginationToken = "example";
        Set<String> userFields = new HashSet<>();
        Set<String> expansions = new HashSet<>();
        Set<String> tweetFields = new HashSet<>();

        // when
        Get2UsersIdFollowingResponse body = api.usersIdFollowing(id, maxResults, paginationToken, userFields, expansions, tweetFields).block();

        // then
        // TODO implement the usersIdFollowingTest()
    }

    
    /**
     * Mute User by User ID.
     *
     * Causes the User (in the path) to mute the target User. The User (in the path) must match the User context authorizing the request.
     */
    @Test
    @Disabled("Not Implemented")
    public void usersIdMuteTest() {
        // given
        String id = "example";
        MuteUserRequest muteUserRequest = new MuteUserRequest("2244994945");

        // when
        MuteUserMutationResponse body = api.usersIdMute(id, muteUserRequest).block();

        // then
        // TODO implement the usersIdMuteTest()
    }

    
    /**
     * Returns User objects that are muted by the provided User ID
     *
     * Returns a list of Users that are muted by the provided User ID
     */
    @Test
    @Disabled("Not Implemented")
    public void usersIdMutingTest() {
        // given
        String id = "example";
        Integer maxResults = 100;
        String paginationToken = "example";
        Set<String> userFields = new HashSet<>();
        Set<String> expansions = new HashSet<>();
        Set<String> tweetFields = new HashSet<>();

        // when
        Get2UsersIdMutingResponse body = api.usersIdMuting(id, maxResults, paginationToken, userFields, expansions, tweetFields).block();

        // then
        // TODO implement the usersIdMutingTest()
    }

    
    /**
     * Unblock User by User ID
     *
     * Causes the source User to unblock the target User. The source User must match the User context authorizing the request
     */
    @Test
    @Disabled("Not Implemented")
    public void usersIdUnblockTest() {
        // given
        String sourceUserId = "example";
        String targetUserId = "example";

        // when
        BlockUserMutationResponse body = api.usersIdUnblock(sourceUserId, targetUserId).block();

        // then
        // TODO implement the usersIdUnblockTest()
    }

    
    /**
     * Unfollow User
     *
     * Causes the source User to unfollow the target User. The source User must match the User context authorizing the request
     */
    @Test
    @Disabled("Not Implemented")
    public void usersIdUnfollowTest() {
        // given
        String sourceUserId = "example";
        String targetUserId = "example";

        // when
        UsersFollowingDeleteResponse body = api.usersIdUnfollow(sourceUserId, targetUserId).block();

        // then
        // TODO implement the usersIdUnfollowTest()
    }

    
    /**
     * Unmute User by User ID
     *
     * Causes the source User to unmute the target User. The source User must match the User context authorizing the request
     */
    @Test
    @Disabled("Not Implemented")
    public void usersIdUnmuteTest() {
        // given
        String sourceUserId = "example";
        String targetUserId = "example";

        // when
        MuteUserMutationResponse body = api.usersIdUnmute(sourceUserId, targetUserId).block();

        // then
        // TODO implement the usersIdUnmuteTest()
    }

    
}
