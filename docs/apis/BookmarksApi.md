# BookmarksApi

All URIs are relative to *https://api.twitter.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getUsersIdBookmarks**](BookmarksApi.md#getUsersIdBookmarks) | **GET** /2/users/{id}/bookmarks | Bookmarks by User |
| [**postUsersIdBookmarks**](BookmarksApi.md#postUsersIdBookmarks) | **POST** /2/users/{id}/bookmarks | Add Tweet to Bookmarks |
| [**usersIdBookmarksDelete**](BookmarksApi.md#usersIdBookmarksDelete) | **DELETE** /2/users/{id}/bookmarks/{tweet_id} | Remove a bookmarked Tweet |


## Creating BookmarksApi

To initiate an instance of `BookmarksApi`, you can use micronaut's `ApplicationContext`:
```java
/* imports
import io.micronaut.runtime.Micronaut;
import io.micronaut.context.ApplicationContext;
import example.micronaut.api.BookmarksApi;
*/

ApplicationContext context = Micronaut.run(/* ... */);
PetApi apiInstance = context.getBean(BookmarksApi.class);
```

Or the `@Inject` annotation:
```java
@Singleton
class MyClass {
    @Inject
    BookmarksApi bookmarksApi;

    /* ... use the injected variable */
}
```
Note that the class needs to be annotated with one of Micronaut's [scope annotations](https://docs.micronaut.io/latest/guide/#scopes) like `Singleton` in order to be processed.

More information can be found inside [Inversion of Control guide section](https://docs.micronaut.io/latest/guide/#ioc).

<a name="getUsersIdBookmarks"></a>
# **getUsersIdBookmarks**
```java
Mono<Get2UsersIdBookmarksResponse> BookmarksApi.getUsersIdBookmarks(idmaxResultspaginationTokentweetFieldsexpansionsmediaFieldspollFieldsuserFieldsplaceFields)
```

Bookmarks by User

Returns Tweet objects that have been bookmarked by the requesting User

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | `String`| The ID of the authenticated source User for whom to return results. | |
| **maxResults** | `Integer`| The maximum number of results. | [optional parameter] |
| **paginationToken** | `String`| This parameter is used to get the next &#39;page&#39; of results. | [optional parameter] |
| **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional parameter] [enum: `attachments`, `author_id`, `context_annotations`, `conversation_id`, `created_at`, `edit_controls`, `edit_history_tweet_ids`, `entities`, `geo`, `id`, `in_reply_to_user_id`, `lang`, `non_public_metrics`, `organic_metrics`, `possibly_sensitive`, `promoted_metrics`, `public_metrics`, `referenced_tweets`, `reply_settings`, `source`, `text`, `withheld`] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional parameter] [enum: `attachments.media_keys`, `attachments.poll_ids`, `author_id`, `edit_history_tweet_ids`, `entities.mentions.username`, `geo.place_id`, `in_reply_to_user_id`, `referenced_tweets.id`, `referenced_tweets.id.author_id`] |
| **mediaFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Media fields to display. | [optional parameter] [enum: `alt_text`, `duration_ms`, `height`, `media_key`, `non_public_metrics`, `organic_metrics`, `preview_image_url`, `promoted_metrics`, `public_metrics`, `type`, `url`, `variants`, `width`] |
| **pollFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Poll fields to display. | [optional parameter] [enum: `duration_minutes`, `end_datetime`, `id`, `options`, `voting_status`] |
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional parameter] [enum: `created_at`, `description`, `entities`, `id`, `location`, `name`, `pinned_tweet_id`, `profile_image_url`, `protected`, `public_metrics`, `url`, `username`, `verified`, `withheld`] |
| **placeFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Place fields to display. | [optional parameter] [enum: `contained_within`, `country`, `country_code`, `full_name`, `geo`, `id`, `name`, `place_type`] |


### Return type
[**Get2UsersIdBookmarksResponse**](Get2UsersIdBookmarksResponse.md)

### Authorization
* **[OAuth2UserToken](auth.md#OAuth2UserToken)**, scopes: `bookmark.read`, `tweet.read`, `users.read`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`, `application/problem+json`

<a name="postUsersIdBookmarks"></a>
# **postUsersIdBookmarks**
```java
Mono<BookmarkMutationResponse> BookmarksApi.postUsersIdBookmarks(idbookmarkAddRequest)
```

Add Tweet to Bookmarks

Adds a Tweet (ID in the body) to the requesting User&#39;s (in the path) bookmarks

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | `String`| The ID of the authenticated source User for whom to add bookmarks. | |
| **bookmarkAddRequest** | [**BookmarkAddRequest**](BookmarkAddRequest.md)|  | |


### Return type
[**BookmarkMutationResponse**](BookmarkMutationResponse.md)

### Authorization
* **[OAuth2UserToken](auth.md#OAuth2UserToken)**, scopes: `bookmark.write`, `tweet.read`, `users.read`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`, `application/problem+json`

<a name="usersIdBookmarksDelete"></a>
# **usersIdBookmarksDelete**
```java
Mono<BookmarkMutationResponse> BookmarksApi.usersIdBookmarksDelete(idtweetId)
```

Remove a bookmarked Tweet

Removes a Tweet from the requesting User&#39;s bookmarked Tweets.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | `String`| The ID of the authenticated source User whose bookmark is to be removed. | |
| **tweetId** | `String`| The ID of the Tweet that the source User is removing from bookmarks. | |


### Return type
[**BookmarkMutationResponse**](BookmarkMutationResponse.md)

### Authorization
* **[OAuth2UserToken](auth.md#OAuth2UserToken)**, scopes: `bookmark.write`, `tweet.read`, `users.read`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`, `application/problem+json`

