package example.micronaut.api;

import example.micronaut.model.Error;
import example.micronaut.model.Get2ListsIdResponse;
import example.micronaut.model.Get2UsersIdFollowedListsResponse;
import example.micronaut.model.Get2UsersIdListMembershipsResponse;
import example.micronaut.model.Get2UsersIdOwnedListsResponse;
import example.micronaut.model.Get2UsersIdPinnedListsResponse;
import example.micronaut.model.ListAddUserRequest;
import example.micronaut.model.ListCreateRequest;
import example.micronaut.model.ListCreateResponse;
import example.micronaut.model.ListDeleteResponse;
import example.micronaut.model.ListFollowedRequest;
import example.micronaut.model.ListFollowedResponse;
import example.micronaut.model.ListMutateResponse;
import example.micronaut.model.ListPinnedRequest;
import example.micronaut.model.ListPinnedResponse;
import example.micronaut.model.ListUnpinResponse;
import example.micronaut.model.ListUpdateRequest;
import example.micronaut.model.ListUpdateResponse;
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
 * API tests for ListsApi
 */
@MicronautTest
public class ListsApiTest {

    @Inject
    ListsApi api;

    
    /**
     * Get a User&#39;s List Memberships
     *
     * Get a User&#39;s List Memberships.
     */
    @Test
    @Disabled("Not Implemented")
    public void getUserListMembershipsTest() {
        // given
        String id = "2244994945";
        Integer maxResults = 100;
        String paginationToken = "example";
        Set<String> listFields = new HashSet<>();
        Set<String> expansions = new HashSet<>();
        Set<String> userFields = new HashSet<>();

        // when
        Get2UsersIdListMembershipsResponse body = api.getUserListMemberships(id, maxResults, paginationToken, listFields, expansions, userFields).block();

        // then
        // TODO implement the getUserListMembershipsTest()
    }

    
    /**
     * Add a List member
     *
     * Causes a User to become a member of a List.
     */
    @Test
    @Disabled("Not Implemented")
    public void listAddMemberTest() {
        // given
        String id = "example";
        ListAddUserRequest listAddUserRequest = new ListAddUserRequest("2244994945");

        // when
        ListMutateResponse body = api.listAddMember(id, listAddUserRequest).block();

        // then
        // TODO implement the listAddMemberTest()
    }

    
    /**
     * Create List
     *
     * Creates a new List.
     */
    @Test
    @Disabled("Not Implemented")
    public void listIdCreateTest() {
        // given
        ListCreateRequest listCreateRequest = new ListCreateRequest("example");

        // when
        ListCreateResponse body = api.listIdCreate(listCreateRequest).block();

        // then
        // TODO implement the listIdCreateTest()
    }

    
    /**
     * Delete List
     *
     * Delete a List that you own.
     */
    @Test
    @Disabled("Not Implemented")
    public void listIdDeleteTest() {
        // given
        String id = "example";

        // when
        ListDeleteResponse body = api.listIdDelete(id).block();

        // then
        // TODO implement the listIdDeleteTest()
    }

    
    /**
     * List lookup by List ID.
     *
     * Returns a List.
     */
    @Test
    @Disabled("Not Implemented")
    public void listIdGetTest() {
        // given
        String id = "example";
        Set<String> listFields = new HashSet<>();
        Set<String> expansions = new HashSet<>();
        Set<String> userFields = new HashSet<>();

        // when
        Get2ListsIdResponse body = api.listIdGet(id, listFields, expansions, userFields).block();

        // then
        // TODO implement the listIdGetTest()
    }

    
    /**
     * Update List.
     *
     * Update a List that you own.
     */
    @Test
    @Disabled("Not Implemented")
    public void listIdUpdateTest() {
        // given
        String id = "example";
        ListUpdateRequest listUpdateRequest = new ListUpdateRequest();

        // when
        ListUpdateResponse body = api.listIdUpdate(id, listUpdateRequest).block();

        // then
        // TODO implement the listIdUpdateTest()
    }

    
    /**
     * Remove a List member
     *
     * Causes a User to be removed from the members of a List.
     */
    @Test
    @Disabled("Not Implemented")
    public void listRemoveMemberTest() {
        // given
        String id = "example";
        String userId = "example";

        // when
        ListMutateResponse body = api.listRemoveMember(id, userId).block();

        // then
        // TODO implement the listRemoveMemberTest()
    }

    
    /**
     * Follow a List
     *
     * Causes a User to follow a List.
     */
    @Test
    @Disabled("Not Implemented")
    public void listUserFollowTest() {
        // given
        String id = "example";
        ListFollowedRequest listFollowedRequest = new ListFollowedRequest("1146654567674912769");

        // when
        ListFollowedResponse body = api.listUserFollow(id, listFollowedRequest).block();

        // then
        // TODO implement the listUserFollowTest()
    }

    
    /**
     * Get a User&#39;s Owned Lists.
     *
     * Get a User&#39;s Owned Lists.
     */
    @Test
    @Disabled("Not Implemented")
    public void listUserOwnedListsTest() {
        // given
        String id = "2244994945";
        Integer maxResults = 100;
        String paginationToken = "example";
        Set<String> listFields = new HashSet<>();
        Set<String> expansions = new HashSet<>();
        Set<String> userFields = new HashSet<>();

        // when
        Get2UsersIdOwnedListsResponse body = api.listUserOwnedLists(id, maxResults, paginationToken, listFields, expansions, userFields).block();

        // then
        // TODO implement the listUserOwnedListsTest()
    }

    
    /**
     * Pin a List
     *
     * Causes a User to pin a List.
     */
    @Test
    @Disabled("Not Implemented")
    public void listUserPinTest() {
        // given
        String id = "example";
        ListPinnedRequest listPinnedRequest = new ListPinnedRequest("1146654567674912769");

        // when
        ListPinnedResponse body = api.listUserPin(id, listPinnedRequest).block();

        // then
        // TODO implement the listUserPinTest()
    }

    
    /**
     * Get a User&#39;s Pinned Lists
     *
     * Get a User&#39;s Pinned Lists.
     */
    @Test
    @Disabled("Not Implemented")
    public void listUserPinnedListsTest() {
        // given
        String id = "example";
        Set<String> listFields = new HashSet<>();
        Set<String> expansions = new HashSet<>();
        Set<String> userFields = new HashSet<>();

        // when
        Get2UsersIdPinnedListsResponse body = api.listUserPinnedLists(id, listFields, expansions, userFields).block();

        // then
        // TODO implement the listUserPinnedListsTest()
    }

    
    /**
     * Unfollow a List
     *
     * Causes a User to unfollow a List.
     */
    @Test
    @Disabled("Not Implemented")
    public void listUserUnfollowTest() {
        // given
        String id = "example";
        String listId = "example";

        // when
        ListFollowedResponse body = api.listUserUnfollow(id, listId).block();

        // then
        // TODO implement the listUserUnfollowTest()
    }

    
    /**
     * Unpin a List
     *
     * Causes a User to remove a pinned List.
     */
    @Test
    @Disabled("Not Implemented")
    public void listUserUnpinTest() {
        // given
        String id = "example";
        String listId = "example";

        // when
        ListUnpinResponse body = api.listUserUnpin(id, listId).block();

        // then
        // TODO implement the listUserUnpinTest()
    }

    
    /**
     * Get User&#39;s Followed Lists
     *
     * Returns a User&#39;s followed Lists.
     */
    @Test
    @Disabled("Not Implemented")
    public void userFollowedListsTest() {
        // given
        String id = "2244994945";
        Integer maxResults = 100;
        String paginationToken = "example";
        Set<String> listFields = new HashSet<>();
        Set<String> expansions = new HashSet<>();
        Set<String> userFields = new HashSet<>();

        // when
        Get2UsersIdFollowedListsResponse body = api.userFollowedLists(id, maxResults, paginationToken, listFields, expansions, userFields).block();

        // then
        // TODO implement the userFollowedListsTest()
    }

    
}
