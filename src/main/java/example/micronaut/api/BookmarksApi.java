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
import example.micronaut.model.BookmarkAddRequest;
import example.micronaut.model.BookmarkMutationResponse;
import example.micronaut.model.Error;
import example.micronaut.model.Get2UsersIdBookmarksResponse;
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
public interface BookmarksApi {
    /**
     * Bookmarks by User
     * Returns Tweet objects that have been bookmarked by the requesting User
     *
     * @param id The ID of the authenticated source User for whom to return results. (required)
     * @param maxResults The maximum number of results. (optional)
     * @param paginationToken This parameter is used to get the next &#39;page&#39; of results. (optional)
     * @param tweetFields A comma separated list of Tweet fields to display. (optional)
     * @param expansions A comma separated list of fields to expand. (optional)
     * @param mediaFields A comma separated list of Media fields to display. (optional)
     * @param pollFields A comma separated list of Poll fields to display. (optional)
     * @param userFields A comma separated list of User fields to display. (optional)
     * @param placeFields A comma separated list of Place fields to display. (optional)
     * @return Get2UsersIdBookmarksResponse
     * 
     * @see <a href="https://developer.twitter.com/en/docs/twitter-api/tweets/bookmarks/api-reference/get-users-id-bookmarks">Bookmarks by User Documentation</a>
     */
    @Get(uri="/2/users/{id}/bookmarks")
    @Consumes({"application/json", "application/problem+json"})
    Mono<Get2UsersIdBookmarksResponse> getUsersIdBookmarks(
        @PathVariable(name="id") @NotNull String id, 
        @QueryValue(value="max_results") @Nullable @Min(1) @Max(100) Integer maxResults, 
        @QueryValue(value="pagination_token") @Nullable @Size(min=1) String paginationToken, 
        @QueryValue(value="tweet.fields") @Nullable @Size(min=1) Set<String> tweetFields, 
        @QueryValue(value="expansions") @Nullable @Size(min=1) Set<String> expansions, 
        @QueryValue(value="media.fields") @Nullable @Size(min=1) Set<String> mediaFields, 
        @QueryValue(value="poll.fields") @Nullable @Size(min=1) Set<String> pollFields, 
        @QueryValue(value="user.fields") @Nullable @Size(min=1) Set<String> userFields, 
        @QueryValue(value="place.fields") @Nullable @Size(min=1) Set<String> placeFields
    );

    /**
     * Add Tweet to Bookmarks
     * Adds a Tweet (ID in the body) to the requesting User&#39;s (in the path) bookmarks
     *
     * @param id The ID of the authenticated source User for whom to add bookmarks. (required)
     * @param bookmarkAddRequest  (required)
     * @return BookmarkMutationResponse
     * 
     * @see <a href="https://developer.twitter.com/en/docs/twitter-api/tweets/bookmarks/api-reference/post-users-id-bookmarks">Add Tweet to Bookmarks Documentation</a>
     */
    @Post(uri="/2/users/{id}/bookmarks")
    @Consumes({"application/json", "application/problem+json"})
    @Produces({"application/json"})
    Mono<BookmarkMutationResponse> postUsersIdBookmarks(
        @PathVariable(name="id") @NotNull String id, 
        @Body @NotNull @Valid BookmarkAddRequest bookmarkAddRequest
    );

    /**
     * Remove a bookmarked Tweet
     * Removes a Tweet from the requesting User&#39;s bookmarked Tweets.
     *
     * @param id The ID of the authenticated source User whose bookmark is to be removed. (required)
     * @param tweetId The ID of the Tweet that the source User is removing from bookmarks. (required)
     * @return BookmarkMutationResponse
     * 
     * @see <a href="https://developer.twitter.com/en/docs/twitter-api/tweets/bookmarks/api-reference/delete-users-id-bookmarks-tweet_id">Remove a bookmarked Tweet Documentation</a>
     */
    @Delete(uri="/2/users/{id}/bookmarks/{tweet_id}")
    @Consumes({"application/json", "application/problem+json"})
    Mono<BookmarkMutationResponse> usersIdBookmarksDelete(
        @PathVariable(name="id") @NotNull String id, 
        @PathVariable(name="tweet_id") @NotNull @Pattern(regexp="^[0-9]{1,19}$") String tweetId
    );

}