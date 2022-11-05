/*
 * Twitter API v2
 * Twitter API v2 available endpoints
 *
 * The version of the OpenAPI document: 2.55
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package example.micronaut.api;

import io.micronaut.http.annotation.*;
import io.micronaut.core.annotation.*;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.core.convert.format.Format;
import reactor.core.publisher.Mono;
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
import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;
import javax.validation.constraints.*;

@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2022-11-05T03:44:30.749524299+01:00[Europe/Berlin]")
@Client("${openapi-micronaut-client-base-path}")
public interface ListsApi {
    /**
     * Get a User&#39;s List Memberships
     * Get a User&#39;s List Memberships.
     *
     * @param id The ID of the User to lookup. (required)
     * @param maxResults The maximum number of results. (optional, default to 100)
     * @param paginationToken This parameter is used to get a specified &#39;page&#39; of results. (optional)
     * @param listFields A comma separated list of List fields to display. (optional)
     * @param expansions A comma separated list of fields to expand. (optional)
     * @param userFields A comma separated list of User fields to display. (optional)
     * @return Get2UsersIdListMembershipsResponse
     * 
     * @see <a href="https://developer.twitter.com/en/docs/twitter-api/lists/list-members/api-reference/get-users-id-list_memberships">Get a User&#39;s List Memberships Documentation</a>
     */
    @Get(uri="/2/users/{id}/list_memberships")
    @Consumes({"application/json", "application/problem+json"})
    Mono<Get2UsersIdListMembershipsResponse> getUserListMemberships(
        @PathVariable(name="id") @NotNull @Pattern(regexp="^[0-9]{1,19}$") String id, 
        @QueryValue(value="max_results", defaultValue="100") @Nullable @Min(1) @Max(100) Integer maxResults, 
        @QueryValue(value="pagination_token") @Nullable @Size(min=1, max=19) String paginationToken, 
        @QueryValue(value="list.fields") @Nullable @Size(min=1) Set<String> listFields, 
        @QueryValue(value="expansions") @Nullable @Size(min=1) Set<String> expansions, 
        @QueryValue(value="user.fields") @Nullable @Size(min=1) Set<String> userFields
    );

    /**
     * Add a List member
     * Causes a User to become a member of a List.
     *
     * @param id The ID of the List for which to add a member. (required)
     * @param listAddUserRequest  (optional)
     * @return ListMutateResponse
     * 
     * @see <a href="https://developer.twitter.com/en/docs/twitter-api/lists/list-members/api-reference/post-lists-id-members">Add a List member Documentation</a>
     */
    @Post(uri="/2/lists/{id}/members")
    @Consumes({"application/json", "application/problem+json"})
    @Produces({"application/json"})
    Mono<ListMutateResponse> listAddMember(
        @PathVariable(name="id") @NotNull @Pattern(regexp="^[0-9]{1,19}$") String id, 
        @Body @Nullable @Valid ListAddUserRequest listAddUserRequest
    );

    /**
     * Create List
     * Creates a new List.
     *
     * @param listCreateRequest  (optional)
     * @return ListCreateResponse
     * 
     * @see <a href="https://developer.twitter.com/en/docs/twitter-api/lists/manage-lists/api-reference/post-lists">Create List Documentation</a>
     */
    @Post(uri="/2/lists")
    @Consumes({"application/json", "application/problem+json"})
    @Produces({"application/json"})
    Mono<ListCreateResponse> listIdCreate(
        @Body @Nullable @Valid ListCreateRequest listCreateRequest
    );

    /**
     * Delete List
     * Delete a List that you own.
     *
     * @param id The ID of the List to delete. (required)
     * @return ListDeleteResponse
     * 
     * @see <a href="https://developer.twitter.com/en/docs/twitter-api/lists/manage-lists/api-reference/delete-lists-id">Delete List Documentation</a>
     */
    @Delete(uri="/2/lists/{id}")
    @Consumes({"application/json", "application/problem+json"})
    Mono<ListDeleteResponse> listIdDelete(
        @PathVariable(name="id") @NotNull @Pattern(regexp="^[0-9]{1,19}$") String id
    );

    /**
     * List lookup by List ID.
     * Returns a List.
     *
     * @param id The ID of the List. (required)
     * @param listFields A comma separated list of List fields to display. (optional)
     * @param expansions A comma separated list of fields to expand. (optional)
     * @param userFields A comma separated list of User fields to display. (optional)
     * @return Get2ListsIdResponse
     * 
     * @see <a href="https://developer.twitter.com/en/docs/twitter-api/lists/list-lookup/api-reference/get-lists-id">List lookup by List ID. Documentation</a>
     */
    @Get(uri="/2/lists/{id}")
    @Consumes({"application/json", "application/problem+json"})
    Mono<Get2ListsIdResponse> listIdGet(
        @PathVariable(name="id") @NotNull @Pattern(regexp="^[0-9]{1,19}$") String id, 
        @QueryValue(value="list.fields") @Nullable @Size(min=1) Set<String> listFields, 
        @QueryValue(value="expansions") @Nullable @Size(min=1) Set<String> expansions, 
        @QueryValue(value="user.fields") @Nullable @Size(min=1) Set<String> userFields
    );

    /**
     * Update List.
     * Update a List that you own.
     *
     * @param id The ID of the List to modify. (required)
     * @param listUpdateRequest  (optional)
     * @return ListUpdateResponse
     * 
     * @see <a href="https://developer.twitter.com/en/docs/twitter-api/lists/manage-lists/api-reference/put-lists-id">Update List. Documentation</a>
     */
    @Put(uri="/2/lists/{id}")
    @Consumes({"application/json", "application/problem+json"})
    @Produces({"application/json"})
    Mono<ListUpdateResponse> listIdUpdate(
        @PathVariable(name="id") @NotNull @Pattern(regexp="^[0-9]{1,19}$") String id, 
        @Body @Nullable @Valid ListUpdateRequest listUpdateRequest
    );

    /**
     * Remove a List member
     * Causes a User to be removed from the members of a List.
     *
     * @param id The ID of the List to remove a member. (required)
     * @param userId The ID of User that will be removed from the List. (required)
     * @return ListMutateResponse
     * 
     * @see <a href="https://developer.twitter.com/en/docs/twitter-api/lists/list-members/api-reference/delete-lists-id-members-user_id">Remove a List member Documentation</a>
     */
    @Delete(uri="/2/lists/{id}/members/{user_id}")
    @Consumes({"application/json", "application/problem+json"})
    Mono<ListMutateResponse> listRemoveMember(
        @PathVariable(name="id") @NotNull @Pattern(regexp="^[0-9]{1,19}$") String id, 
        @PathVariable(name="user_id") @NotNull @Pattern(regexp="^[0-9]{1,19}$") String userId
    );

    /**
     * Follow a List
     * Causes a User to follow a List.
     *
     * @param id The ID of the authenticated source User that will follow the List. (required)
     * @param listFollowedRequest  (optional)
     * @return ListFollowedResponse
     * 
     * @see <a href="https://developer.twitter.com/en/docs/twitter-api/lists/list-follows/api-reference/post-users-id-followed-lists">Follow a List Documentation</a>
     */
    @Post(uri="/2/users/{id}/followed_lists")
    @Consumes({"application/json", "application/problem+json"})
    @Produces({"application/json"})
    Mono<ListFollowedResponse> listUserFollow(
        @PathVariable(name="id") @NotNull String id, 
        @Body @Nullable @Valid ListFollowedRequest listFollowedRequest
    );

    /**
     * Get a User&#39;s Owned Lists.
     * Get a User&#39;s Owned Lists.
     *
     * @param id The ID of the User to lookup. (required)
     * @param maxResults The maximum number of results. (optional, default to 100)
     * @param paginationToken This parameter is used to get a specified &#39;page&#39; of results. (optional)
     * @param listFields A comma separated list of List fields to display. (optional)
     * @param expansions A comma separated list of fields to expand. (optional)
     * @param userFields A comma separated list of User fields to display. (optional)
     * @return Get2UsersIdOwnedListsResponse
     * 
     * @see <a href="https://developer.twitter.com/en/docs/twitter-api/lists/list-lookup/api-reference/get-users-id-owned_lists">Get a User&#39;s Owned Lists. Documentation</a>
     */
    @Get(uri="/2/users/{id}/owned_lists")
    @Consumes({"application/json", "application/problem+json"})
    Mono<Get2UsersIdOwnedListsResponse> listUserOwnedLists(
        @PathVariable(name="id") @NotNull @Pattern(regexp="^[0-9]{1,19}$") String id, 
        @QueryValue(value="max_results", defaultValue="100") @Nullable @Min(1) @Max(100) Integer maxResults, 
        @QueryValue(value="pagination_token") @Nullable @Size(min=1, max=19) String paginationToken, 
        @QueryValue(value="list.fields") @Nullable @Size(min=1) Set<String> listFields, 
        @QueryValue(value="expansions") @Nullable @Size(min=1) Set<String> expansions, 
        @QueryValue(value="user.fields") @Nullable @Size(min=1) Set<String> userFields
    );

    /**
     * Pin a List
     * Causes a User to pin a List.
     *
     * @param id The ID of the authenticated source User that will pin the List. (required)
     * @param listPinnedRequest  (required)
     * @return ListPinnedResponse
     * 
     * @see <a href="https://developer.twitter.com/en/docs/twitter-api/lists/pinned-lists/api-reference/post-users-id-pinned-lists">Pin a List Documentation</a>
     */
    @Post(uri="/2/users/{id}/pinned_lists")
    @Consumes({"application/json", "application/problem+json"})
    @Produces({"application/json"})
    Mono<ListPinnedResponse> listUserPin(
        @PathVariable(name="id") @NotNull String id, 
        @Body @NotNull @Valid ListPinnedRequest listPinnedRequest
    );

    /**
     * Get a User&#39;s Pinned Lists
     * Get a User&#39;s Pinned Lists.
     *
     * @param id The ID of the authenticated source User for whom to return results. (required)
     * @param listFields A comma separated list of List fields to display. (optional)
     * @param expansions A comma separated list of fields to expand. (optional)
     * @param userFields A comma separated list of User fields to display. (optional)
     * @return Get2UsersIdPinnedListsResponse
     * 
     * @see <a href="https://developer.twitter.com/en/docs/twitter-api/lists/pinned-lists/api-reference/get-users-id-pinned_lists">Get a User&#39;s Pinned Lists Documentation</a>
     */
    @Get(uri="/2/users/{id}/pinned_lists")
    @Consumes({"application/json", "application/problem+json"})
    Mono<Get2UsersIdPinnedListsResponse> listUserPinnedLists(
        @PathVariable(name="id") @NotNull String id, 
        @QueryValue(value="list.fields") @Nullable @Size(min=1) Set<String> listFields, 
        @QueryValue(value="expansions") @Nullable @Size(min=1) Set<String> expansions, 
        @QueryValue(value="user.fields") @Nullable @Size(min=1) Set<String> userFields
    );

    /**
     * Unfollow a List
     * Causes a User to unfollow a List.
     *
     * @param id The ID of the authenticated source User that will unfollow the List. (required)
     * @param listId The ID of the List to unfollow. (required)
     * @return ListFollowedResponse
     * 
     * @see <a href="https://developer.twitter.com/en/docs/twitter-api/lists/list-follows/api-reference/delete-users-id-followed-lists-list_id">Unfollow a List Documentation</a>
     */
    @Delete(uri="/2/users/{id}/followed_lists/{list_id}")
    @Consumes({"application/json", "application/problem+json"})
    Mono<ListFollowedResponse> listUserUnfollow(
        @PathVariable(name="id") @NotNull String id, 
        @PathVariable(name="list_id") @NotNull @Pattern(regexp="^[0-9]{1,19}$") String listId
    );

    /**
     * Unpin a List
     * Causes a User to remove a pinned List.
     *
     * @param id The ID of the authenticated source User for whom to return results. (required)
     * @param listId The ID of the List to unpin. (required)
     * @return ListUnpinResponse
     * 
     * @see <a href="https://developer.twitter.com/en/docs/twitter-api/lists/pinned-lists/api-reference/delete-users-id-pinned-lists-list_id">Unpin a List Documentation</a>
     */
    @Delete(uri="/2/users/{id}/pinned_lists/{list_id}")
    @Consumes({"application/json", "application/problem+json"})
    Mono<ListUnpinResponse> listUserUnpin(
        @PathVariable(name="id") @NotNull String id, 
        @PathVariable(name="list_id") @NotNull @Pattern(regexp="^[0-9]{1,19}$") String listId
    );

    /**
     * Get User&#39;s Followed Lists
     * Returns a User&#39;s followed Lists.
     *
     * @param id The ID of the User to lookup. (required)
     * @param maxResults The maximum number of results. (optional, default to 100)
     * @param paginationToken This parameter is used to get a specified &#39;page&#39; of results. (optional)
     * @param listFields A comma separated list of List fields to display. (optional)
     * @param expansions A comma separated list of fields to expand. (optional)
     * @param userFields A comma separated list of User fields to display. (optional)
     * @return Get2UsersIdFollowedListsResponse
     * 
     * @see <a href="https://developer.twitter.com/en/docs/twitter-api/lists/list-follows/api-reference/get-users-id-followed_lists">Get User&#39;s Followed Lists Documentation</a>
     */
    @Get(uri="/2/users/{id}/followed_lists")
    @Consumes({"application/json", "application/problem+json"})
    Mono<Get2UsersIdFollowedListsResponse> userFollowedLists(
        @PathVariable(name="id") @NotNull @Pattern(regexp="^[0-9]{1,19}$") String id, 
        @QueryValue(value="max_results", defaultValue="100") @Nullable @Min(1) @Max(100) Integer maxResults, 
        @QueryValue(value="pagination_token") @Nullable @Size(min=1, max=19) String paginationToken, 
        @QueryValue(value="list.fields") @Nullable @Size(min=1) Set<String> listFields, 
        @QueryValue(value="expansions") @Nullable @Size(min=1) Set<String> expansions, 
        @QueryValue(value="user.fields") @Nullable @Size(min=1) Set<String> userFields
    );

}