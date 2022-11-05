# UsersApi

All URIs are relative to *https://api.twitter.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**findMyUser**](UsersApi.md#findMyUser) | **GET** /2/users/me | User lookup me |
| [**findUserById**](UsersApi.md#findUserById) | **GET** /2/users/{id} | User lookup by ID |
| [**findUserByUsername**](UsersApi.md#findUserByUsername) | **GET** /2/users/by/username/{username} | User lookup by username |
| [**findUsersById**](UsersApi.md#findUsersById) | **GET** /2/users | User lookup by IDs |
| [**findUsersByUsername**](UsersApi.md#findUsersByUsername) | **GET** /2/users/by | User lookup by usernames |
| [**listGetFollowers**](UsersApi.md#listGetFollowers) | **GET** /2/lists/{id}/followers | Returns User objects that follow a List by the provided List ID |
| [**listGetMembers**](UsersApi.md#listGetMembers) | **GET** /2/lists/{id}/members | Returns User objects that are members of a List by the provided List ID. |
| [**tweetsIdLikingUsers**](UsersApi.md#tweetsIdLikingUsers) | **GET** /2/tweets/{id}/liking_users | Returns User objects that have liked the provided Tweet ID |
| [**tweetsIdRetweetingUsers**](UsersApi.md#tweetsIdRetweetingUsers) | **GET** /2/tweets/{id}/retweeted_by | Returns User objects that have retweeted the provided Tweet ID |
| [**usersIdBlock**](UsersApi.md#usersIdBlock) | **POST** /2/users/{id}/blocking | Block User by User ID |
| [**usersIdBlocking**](UsersApi.md#usersIdBlocking) | **GET** /2/users/{id}/blocking | Returns User objects that are blocked by provided User ID |
| [**usersIdFollow**](UsersApi.md#usersIdFollow) | **POST** /2/users/{id}/following | Follow User |
| [**usersIdFollowers**](UsersApi.md#usersIdFollowers) | **GET** /2/users/{id}/followers | Followers by User ID |
| [**usersIdFollowing**](UsersApi.md#usersIdFollowing) | **GET** /2/users/{id}/following | Following by User ID |
| [**usersIdMute**](UsersApi.md#usersIdMute) | **POST** /2/users/{id}/muting | Mute User by User ID. |
| [**usersIdMuting**](UsersApi.md#usersIdMuting) | **GET** /2/users/{id}/muting | Returns User objects that are muted by the provided User ID |
| [**usersIdUnblock**](UsersApi.md#usersIdUnblock) | **DELETE** /2/users/{source_user_id}/blocking/{target_user_id} | Unblock User by User ID |
| [**usersIdUnfollow**](UsersApi.md#usersIdUnfollow) | **DELETE** /2/users/{source_user_id}/following/{target_user_id} | Unfollow User |
| [**usersIdUnmute**](UsersApi.md#usersIdUnmute) | **DELETE** /2/users/{source_user_id}/muting/{target_user_id} | Unmute User by User ID |


## Creating UsersApi

To initiate an instance of `UsersApi`, you can use micronaut's `ApplicationContext`:
```java
/* imports
import io.micronaut.runtime.Micronaut;
import io.micronaut.context.ApplicationContext;
import example.micronaut.api.UsersApi;
*/

ApplicationContext context = Micronaut.run(/* ... */);
PetApi apiInstance = context.getBean(UsersApi.class);
```

Or the `@Inject` annotation:
```java
@Singleton
class MyClass {
    @Inject
    UsersApi usersApi;

    /* ... use the injected variable */
}
```
Note that the class needs to be annotated with one of Micronaut's [scope annotations](https://docs.micronaut.io/latest/guide/#scopes) like `Singleton` in order to be processed.

More information can be found inside [Inversion of Control guide section](https://docs.micronaut.io/latest/guide/#ioc).

<a name="findMyUser"></a>
# **findMyUser**
```java
Mono<Get2UsersMeResponse> UsersApi.findMyUser(userFieldsexpansionstweetFields)
```

User lookup me

This endpoint returns information about the requesting User.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional parameter] [enum: `created_at`, `description`, `entities`, `id`, `location`, `name`, `pinned_tweet_id`, `profile_image_url`, `protected`, `public_metrics`, `url`, `username`, `verified`, `withheld`] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional parameter] [enum: `pinned_tweet_id`] |
| **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional parameter] [enum: `attachments`, `author_id`, `context_annotations`, `conversation_id`, `created_at`, `edit_controls`, `edit_history_tweet_ids`, `entities`, `geo`, `id`, `in_reply_to_user_id`, `lang`, `non_public_metrics`, `organic_metrics`, `possibly_sensitive`, `promoted_metrics`, `public_metrics`, `referenced_tweets`, `reply_settings`, `source`, `text`, `withheld`] |


### Return type
[**Get2UsersMeResponse**](Get2UsersMeResponse.md)

### Authorization
* **[OAuth2UserToken](auth.md#OAuth2UserToken)**, scopes: `tweet.read`, `users.read`
* **[UserToken](auth.md#UserToken)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`, `application/problem+json`

<a name="findUserById"></a>
# **findUserById**
```java
Mono<Get2UsersIdResponse> UsersApi.findUserById(iduserFieldsexpansionstweetFields)
```

User lookup by ID

This endpoint returns information about a User. Specify User by ID.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | `String`| The ID of the User to lookup. | |
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional parameter] [enum: `created_at`, `description`, `entities`, `id`, `location`, `name`, `pinned_tweet_id`, `profile_image_url`, `protected`, `public_metrics`, `url`, `username`, `verified`, `withheld`] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional parameter] [enum: `pinned_tweet_id`] |
| **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional parameter] [enum: `attachments`, `author_id`, `context_annotations`, `conversation_id`, `created_at`, `edit_controls`, `edit_history_tweet_ids`, `entities`, `geo`, `id`, `in_reply_to_user_id`, `lang`, `non_public_metrics`, `organic_metrics`, `possibly_sensitive`, `promoted_metrics`, `public_metrics`, `referenced_tweets`, `reply_settings`, `source`, `text`, `withheld`] |


### Return type
[**Get2UsersIdResponse**](Get2UsersIdResponse.md)

### Authorization
* **[BearerToken](auth.md#BearerToken)**
* **[OAuth2UserToken](auth.md#OAuth2UserToken)**, scopes: `tweet.read`, `users.read`
* **[UserToken](auth.md#UserToken)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`, `application/problem+json`

<a name="findUserByUsername"></a>
# **findUserByUsername**
```java
Mono<Get2UsersByUsernameUsernameResponse> UsersApi.findUserByUsername(usernameuserFieldsexpansionstweetFields)
```

User lookup by username

This endpoint returns information about a User. Specify User by username.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **username** | `String`| A username. | |
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional parameter] [enum: `created_at`, `description`, `entities`, `id`, `location`, `name`, `pinned_tweet_id`, `profile_image_url`, `protected`, `public_metrics`, `url`, `username`, `verified`, `withheld`] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional parameter] [enum: `pinned_tweet_id`] |
| **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional parameter] [enum: `attachments`, `author_id`, `context_annotations`, `conversation_id`, `created_at`, `edit_controls`, `edit_history_tweet_ids`, `entities`, `geo`, `id`, `in_reply_to_user_id`, `lang`, `non_public_metrics`, `organic_metrics`, `possibly_sensitive`, `promoted_metrics`, `public_metrics`, `referenced_tweets`, `reply_settings`, `source`, `text`, `withheld`] |


### Return type
[**Get2UsersByUsernameUsernameResponse**](Get2UsersByUsernameUsernameResponse.md)

### Authorization
* **[BearerToken](auth.md#BearerToken)**
* **[OAuth2UserToken](auth.md#OAuth2UserToken)**, scopes: `tweet.read`, `users.read`
* **[UserToken](auth.md#UserToken)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`, `application/problem+json`

<a name="findUsersById"></a>
# **findUsersById**
```java
Mono<Get2UsersResponse> UsersApi.findUsersById(idsuserFieldsexpansionstweetFields)
```

User lookup by IDs

This endpoint returns information about Users. Specify Users by their ID.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ids** | [**List&lt;String&gt;**](String.md)| A list of User IDs, comma-separated. You can specify up to 100 IDs. | |
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional parameter] [enum: `created_at`, `description`, `entities`, `id`, `location`, `name`, `pinned_tweet_id`, `profile_image_url`, `protected`, `public_metrics`, `url`, `username`, `verified`, `withheld`] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional parameter] [enum: `pinned_tweet_id`] |
| **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional parameter] [enum: `attachments`, `author_id`, `context_annotations`, `conversation_id`, `created_at`, `edit_controls`, `edit_history_tweet_ids`, `entities`, `geo`, `id`, `in_reply_to_user_id`, `lang`, `non_public_metrics`, `organic_metrics`, `possibly_sensitive`, `promoted_metrics`, `public_metrics`, `referenced_tweets`, `reply_settings`, `source`, `text`, `withheld`] |


### Return type
[**Get2UsersResponse**](Get2UsersResponse.md)

### Authorization
* **[BearerToken](auth.md#BearerToken)**
* **[OAuth2UserToken](auth.md#OAuth2UserToken)**, scopes: `tweet.read`, `users.read`
* **[UserToken](auth.md#UserToken)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`, `application/problem+json`

<a name="findUsersByUsername"></a>
# **findUsersByUsername**
```java
Mono<Get2UsersByResponse> UsersApi.findUsersByUsername(usernamesuserFieldsexpansionstweetFields)
```

User lookup by usernames

This endpoint returns information about Users. Specify Users by their username.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **usernames** | [**List&lt;String&gt;**](String.md)| A list of usernames, comma-separated. | |
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional parameter] [enum: `created_at`, `description`, `entities`, `id`, `location`, `name`, `pinned_tweet_id`, `profile_image_url`, `protected`, `public_metrics`, `url`, `username`, `verified`, `withheld`] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional parameter] [enum: `pinned_tweet_id`] |
| **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional parameter] [enum: `attachments`, `author_id`, `context_annotations`, `conversation_id`, `created_at`, `edit_controls`, `edit_history_tweet_ids`, `entities`, `geo`, `id`, `in_reply_to_user_id`, `lang`, `non_public_metrics`, `organic_metrics`, `possibly_sensitive`, `promoted_metrics`, `public_metrics`, `referenced_tweets`, `reply_settings`, `source`, `text`, `withheld`] |


### Return type
[**Get2UsersByResponse**](Get2UsersByResponse.md)

### Authorization
* **[BearerToken](auth.md#BearerToken)**
* **[OAuth2UserToken](auth.md#OAuth2UserToken)**, scopes: `tweet.read`, `users.read`
* **[UserToken](auth.md#UserToken)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`, `application/problem+json`

<a name="listGetFollowers"></a>
# **listGetFollowers**
```java
Mono<Get2ListsIdFollowersResponse> UsersApi.listGetFollowers(idmaxResultspaginationTokenuserFieldsexpansionstweetFields)
```

Returns User objects that follow a List by the provided List ID

Returns a list of Users that follow a List by the provided List ID

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | `String`| The ID of the List. | |
| **maxResults** | `Integer`| The maximum number of results. | [optional parameter] [default to `100`] |
| **paginationToken** | `String`| This parameter is used to get a specified &#39;page&#39; of results. | [optional parameter] |
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional parameter] [enum: `created_at`, `description`, `entities`, `id`, `location`, `name`, `pinned_tweet_id`, `profile_image_url`, `protected`, `public_metrics`, `url`, `username`, `verified`, `withheld`] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional parameter] [enum: `pinned_tweet_id`] |
| **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional parameter] [enum: `attachments`, `author_id`, `context_annotations`, `conversation_id`, `created_at`, `edit_controls`, `edit_history_tweet_ids`, `entities`, `geo`, `id`, `in_reply_to_user_id`, `lang`, `non_public_metrics`, `organic_metrics`, `possibly_sensitive`, `promoted_metrics`, `public_metrics`, `referenced_tweets`, `reply_settings`, `source`, `text`, `withheld`] |


### Return type
[**Get2ListsIdFollowersResponse**](Get2ListsIdFollowersResponse.md)

### Authorization
* **[BearerToken](auth.md#BearerToken)**
* **[OAuth2UserToken](auth.md#OAuth2UserToken)**, scopes: `list.read`, `tweet.read`, `users.read`
* **[UserToken](auth.md#UserToken)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`, `application/problem+json`

<a name="listGetMembers"></a>
# **listGetMembers**
```java
Mono<Get2ListsIdMembersResponse> UsersApi.listGetMembers(idmaxResultspaginationTokenuserFieldsexpansionstweetFields)
```

Returns User objects that are members of a List by the provided List ID.

Returns a list of Users that are members of a List by the provided List ID.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | `String`| The ID of the List. | |
| **maxResults** | `Integer`| The maximum number of results. | [optional parameter] [default to `100`] |
| **paginationToken** | `String`| This parameter is used to get a specified &#39;page&#39; of results. | [optional parameter] |
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional parameter] [enum: `created_at`, `description`, `entities`, `id`, `location`, `name`, `pinned_tweet_id`, `profile_image_url`, `protected`, `public_metrics`, `url`, `username`, `verified`, `withheld`] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional parameter] [enum: `pinned_tweet_id`] |
| **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional parameter] [enum: `attachments`, `author_id`, `context_annotations`, `conversation_id`, `created_at`, `edit_controls`, `edit_history_tweet_ids`, `entities`, `geo`, `id`, `in_reply_to_user_id`, `lang`, `non_public_metrics`, `organic_metrics`, `possibly_sensitive`, `promoted_metrics`, `public_metrics`, `referenced_tweets`, `reply_settings`, `source`, `text`, `withheld`] |


### Return type
[**Get2ListsIdMembersResponse**](Get2ListsIdMembersResponse.md)

### Authorization
* **[BearerToken](auth.md#BearerToken)**
* **[OAuth2UserToken](auth.md#OAuth2UserToken)**, scopes: `list.read`, `tweet.read`, `users.read`
* **[UserToken](auth.md#UserToken)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`, `application/problem+json`

<a name="tweetsIdLikingUsers"></a>
# **tweetsIdLikingUsers**
```java
Mono<Get2TweetsIdLikingUsersResponse> UsersApi.tweetsIdLikingUsers(idmaxResultspaginationTokenuserFieldsexpansionstweetFields)
```

Returns User objects that have liked the provided Tweet ID

Returns a list of Users that have liked the provided Tweet ID

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | `String`| A single Tweet ID. | |
| **maxResults** | `Integer`| The maximum number of results. | [optional parameter] [default to `100`] |
| **paginationToken** | `String`| This parameter is used to get the next &#39;page&#39; of results. | [optional parameter] |
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional parameter] [enum: `created_at`, `description`, `entities`, `id`, `location`, `name`, `pinned_tweet_id`, `profile_image_url`, `protected`, `public_metrics`, `url`, `username`, `verified`, `withheld`] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional parameter] [enum: `pinned_tweet_id`] |
| **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional parameter] [enum: `attachments`, `author_id`, `context_annotations`, `conversation_id`, `created_at`, `edit_controls`, `edit_history_tweet_ids`, `entities`, `geo`, `id`, `in_reply_to_user_id`, `lang`, `non_public_metrics`, `organic_metrics`, `possibly_sensitive`, `promoted_metrics`, `public_metrics`, `referenced_tweets`, `reply_settings`, `source`, `text`, `withheld`] |


### Return type
[**Get2TweetsIdLikingUsersResponse**](Get2TweetsIdLikingUsersResponse.md)

### Authorization
* **[BearerToken](auth.md#BearerToken)**
* **[OAuth2UserToken](auth.md#OAuth2UserToken)**, scopes: `like.read`, `tweet.read`, `users.read`
* **[UserToken](auth.md#UserToken)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`, `application/problem+json`

<a name="tweetsIdRetweetingUsers"></a>
# **tweetsIdRetweetingUsers**
```java
Mono<Get2TweetsIdRetweetedByResponse> UsersApi.tweetsIdRetweetingUsers(idmaxResultspaginationTokenuserFieldsexpansionstweetFields)
```

Returns User objects that have retweeted the provided Tweet ID

Returns a list of Users that have retweeted the provided Tweet ID

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | `String`| A single Tweet ID. | |
| **maxResults** | `Integer`| The maximum number of results. | [optional parameter] [default to `100`] |
| **paginationToken** | `String`| This parameter is used to get the next &#39;page&#39; of results. | [optional parameter] |
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional parameter] [enum: `created_at`, `description`, `entities`, `id`, `location`, `name`, `pinned_tweet_id`, `profile_image_url`, `protected`, `public_metrics`, `url`, `username`, `verified`, `withheld`] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional parameter] [enum: `pinned_tweet_id`] |
| **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional parameter] [enum: `attachments`, `author_id`, `context_annotations`, `conversation_id`, `created_at`, `edit_controls`, `edit_history_tweet_ids`, `entities`, `geo`, `id`, `in_reply_to_user_id`, `lang`, `non_public_metrics`, `organic_metrics`, `possibly_sensitive`, `promoted_metrics`, `public_metrics`, `referenced_tweets`, `reply_settings`, `source`, `text`, `withheld`] |


### Return type
[**Get2TweetsIdRetweetedByResponse**](Get2TweetsIdRetweetedByResponse.md)

### Authorization
* **[BearerToken](auth.md#BearerToken)**
* **[OAuth2UserToken](auth.md#OAuth2UserToken)**, scopes: `tweet.read`, `users.read`
* **[UserToken](auth.md#UserToken)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`, `application/problem+json`

<a name="usersIdBlock"></a>
# **usersIdBlock**
```java
Mono<BlockUserMutationResponse> UsersApi.usersIdBlock(idblockUserRequest)
```

Block User by User ID

Causes the User (in the path) to block the target User. The User (in the path) must match the User context authorizing the request

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | `String`| The ID of the authenticated source User that is requesting to block the target User. | |
| **blockUserRequest** | [**BlockUserRequest**](BlockUserRequest.md)|  | |


### Return type
[**BlockUserMutationResponse**](BlockUserMutationResponse.md)

### Authorization
* **[OAuth2UserToken](auth.md#OAuth2UserToken)**, scopes: `block.write`, `tweet.read`, `users.read`
* **[UserToken](auth.md#UserToken)**

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`, `application/problem+json`

<a name="usersIdBlocking"></a>
# **usersIdBlocking**
```java
Mono<Get2UsersIdBlockingResponse> UsersApi.usersIdBlocking(idmaxResultspaginationTokenuserFieldsexpansionstweetFields)
```

Returns User objects that are blocked by provided User ID

Returns a list of Users that are blocked by the provided User ID

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | `String`| The ID of the authenticated source User for whom to return results. | |
| **maxResults** | `Integer`| The maximum number of results. | [optional parameter] |
| **paginationToken** | `String`| This parameter is used to get a specified &#39;page&#39; of results. | [optional parameter] |
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional parameter] [enum: `created_at`, `description`, `entities`, `id`, `location`, `name`, `pinned_tweet_id`, `profile_image_url`, `protected`, `public_metrics`, `url`, `username`, `verified`, `withheld`] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional parameter] [enum: `pinned_tweet_id`] |
| **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional parameter] [enum: `attachments`, `author_id`, `context_annotations`, `conversation_id`, `created_at`, `edit_controls`, `edit_history_tweet_ids`, `entities`, `geo`, `id`, `in_reply_to_user_id`, `lang`, `non_public_metrics`, `organic_metrics`, `possibly_sensitive`, `promoted_metrics`, `public_metrics`, `referenced_tweets`, `reply_settings`, `source`, `text`, `withheld`] |


### Return type
[**Get2UsersIdBlockingResponse**](Get2UsersIdBlockingResponse.md)

### Authorization
* **[OAuth2UserToken](auth.md#OAuth2UserToken)**, scopes: `block.read`, `tweet.read`, `users.read`
* **[UserToken](auth.md#UserToken)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`, `application/problem+json`

<a name="usersIdFollow"></a>
# **usersIdFollow**
```java
Mono<UsersFollowingCreateResponse> UsersApi.usersIdFollow(idusersFollowingCreateRequest)
```

Follow User

Causes the User(in the path) to follow, or “request to follow” for protected Users, the target User. The User(in the path) must match the User context authorizing the request

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | `String`| The ID of the authenticated source User that is requesting to follow the target User. | |
| **usersFollowingCreateRequest** | [**UsersFollowingCreateRequest**](UsersFollowingCreateRequest.md)|  | [optional parameter] |


### Return type
[**UsersFollowingCreateResponse**](UsersFollowingCreateResponse.md)

### Authorization
* **[OAuth2UserToken](auth.md#OAuth2UserToken)**, scopes: `follows.write`, `tweet.read`, `users.read`
* **[UserToken](auth.md#UserToken)**

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`, `application/problem+json`

<a name="usersIdFollowers"></a>
# **usersIdFollowers**
```java
Mono<Get2UsersIdFollowersResponse> UsersApi.usersIdFollowers(idmaxResultspaginationTokenuserFieldsexpansionstweetFields)
```

Followers by User ID

Returns a list of Users who are followers of the specified User ID.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | `String`| The ID of the User to lookup. | |
| **maxResults** | `Integer`| The maximum number of results. | [optional parameter] |
| **paginationToken** | `String`| This parameter is used to get a specified &#39;page&#39; of results. | [optional parameter] |
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional parameter] [enum: `created_at`, `description`, `entities`, `id`, `location`, `name`, `pinned_tweet_id`, `profile_image_url`, `protected`, `public_metrics`, `url`, `username`, `verified`, `withheld`] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional parameter] [enum: `pinned_tweet_id`] |
| **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional parameter] [enum: `attachments`, `author_id`, `context_annotations`, `conversation_id`, `created_at`, `edit_controls`, `edit_history_tweet_ids`, `entities`, `geo`, `id`, `in_reply_to_user_id`, `lang`, `non_public_metrics`, `organic_metrics`, `possibly_sensitive`, `promoted_metrics`, `public_metrics`, `referenced_tweets`, `reply_settings`, `source`, `text`, `withheld`] |


### Return type
[**Get2UsersIdFollowersResponse**](Get2UsersIdFollowersResponse.md)

### Authorization
* **[BearerToken](auth.md#BearerToken)**
* **[OAuth2UserToken](auth.md#OAuth2UserToken)**, scopes: `follows.read`, `tweet.read`, `users.read`
* **[UserToken](auth.md#UserToken)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`, `application/problem+json`

<a name="usersIdFollowing"></a>
# **usersIdFollowing**
```java
Mono<Get2UsersIdFollowingResponse> UsersApi.usersIdFollowing(idmaxResultspaginationTokenuserFieldsexpansionstweetFields)
```

Following by User ID

Returns a list of Users that are being followed by the provided User ID

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | `String`| The ID of the User to lookup. | |
| **maxResults** | `Integer`| The maximum number of results. | [optional parameter] |
| **paginationToken** | `String`| This parameter is used to get a specified &#39;page&#39; of results. | [optional parameter] |
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional parameter] [enum: `created_at`, `description`, `entities`, `id`, `location`, `name`, `pinned_tweet_id`, `profile_image_url`, `protected`, `public_metrics`, `url`, `username`, `verified`, `withheld`] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional parameter] [enum: `pinned_tweet_id`] |
| **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional parameter] [enum: `attachments`, `author_id`, `context_annotations`, `conversation_id`, `created_at`, `edit_controls`, `edit_history_tweet_ids`, `entities`, `geo`, `id`, `in_reply_to_user_id`, `lang`, `non_public_metrics`, `organic_metrics`, `possibly_sensitive`, `promoted_metrics`, `public_metrics`, `referenced_tweets`, `reply_settings`, `source`, `text`, `withheld`] |


### Return type
[**Get2UsersIdFollowingResponse**](Get2UsersIdFollowingResponse.md)

### Authorization
* **[BearerToken](auth.md#BearerToken)**
* **[OAuth2UserToken](auth.md#OAuth2UserToken)**, scopes: `follows.read`, `tweet.read`, `users.read`
* **[UserToken](auth.md#UserToken)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`, `application/problem+json`

<a name="usersIdMute"></a>
# **usersIdMute**
```java
Mono<MuteUserMutationResponse> UsersApi.usersIdMute(idmuteUserRequest)
```

Mute User by User ID.

Causes the User (in the path) to mute the target User. The User (in the path) must match the User context authorizing the request.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | `String`| The ID of the authenticated source User that is requesting to mute the target User. | |
| **muteUserRequest** | [**MuteUserRequest**](MuteUserRequest.md)|  | [optional parameter] |


### Return type
[**MuteUserMutationResponse**](MuteUserMutationResponse.md)

### Authorization
* **[OAuth2UserToken](auth.md#OAuth2UserToken)**, scopes: `mute.write`, `tweet.read`, `users.read`
* **[UserToken](auth.md#UserToken)**

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`, `application/problem+json`

<a name="usersIdMuting"></a>
# **usersIdMuting**
```java
Mono<Get2UsersIdMutingResponse> UsersApi.usersIdMuting(idmaxResultspaginationTokenuserFieldsexpansionstweetFields)
```

Returns User objects that are muted by the provided User ID

Returns a list of Users that are muted by the provided User ID

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | `String`| The ID of the authenticated source User for whom to return results. | |
| **maxResults** | `Integer`| The maximum number of results. | [optional parameter] [default to `100`] |
| **paginationToken** | `String`| This parameter is used to get the next &#39;page&#39; of results. | [optional parameter] |
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional parameter] [enum: `created_at`, `description`, `entities`, `id`, `location`, `name`, `pinned_tweet_id`, `profile_image_url`, `protected`, `public_metrics`, `url`, `username`, `verified`, `withheld`] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional parameter] [enum: `pinned_tweet_id`] |
| **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional parameter] [enum: `attachments`, `author_id`, `context_annotations`, `conversation_id`, `created_at`, `edit_controls`, `edit_history_tweet_ids`, `entities`, `geo`, `id`, `in_reply_to_user_id`, `lang`, `non_public_metrics`, `organic_metrics`, `possibly_sensitive`, `promoted_metrics`, `public_metrics`, `referenced_tweets`, `reply_settings`, `source`, `text`, `withheld`] |


### Return type
[**Get2UsersIdMutingResponse**](Get2UsersIdMutingResponse.md)

### Authorization
* **[OAuth2UserToken](auth.md#OAuth2UserToken)**, scopes: `mute.read`, `tweet.read`, `users.read`
* **[UserToken](auth.md#UserToken)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`, `application/problem+json`

<a name="usersIdUnblock"></a>
# **usersIdUnblock**
```java
Mono<BlockUserMutationResponse> UsersApi.usersIdUnblock(sourceUserIdtargetUserId)
```

Unblock User by User ID

Causes the source User to unblock the target User. The source User must match the User context authorizing the request

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sourceUserId** | `String`| The ID of the authenticated source User that is requesting to unblock the target User. | |
| **targetUserId** | `String`| The ID of the User that the source User is requesting to unblock. | |


### Return type
[**BlockUserMutationResponse**](BlockUserMutationResponse.md)

### Authorization
* **[OAuth2UserToken](auth.md#OAuth2UserToken)**, scopes: `block.write`, `tweet.read`, `users.read`
* **[UserToken](auth.md#UserToken)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`, `application/problem+json`

<a name="usersIdUnfollow"></a>
# **usersIdUnfollow**
```java
Mono<UsersFollowingDeleteResponse> UsersApi.usersIdUnfollow(sourceUserIdtargetUserId)
```

Unfollow User

Causes the source User to unfollow the target User. The source User must match the User context authorizing the request

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sourceUserId** | `String`| The ID of the authenticated source User that is requesting to unfollow the target User. | |
| **targetUserId** | `String`| The ID of the User that the source User is requesting to unfollow. | |


### Return type
[**UsersFollowingDeleteResponse**](UsersFollowingDeleteResponse.md)

### Authorization
* **[OAuth2UserToken](auth.md#OAuth2UserToken)**, scopes: `follows.write`, `tweet.read`, `users.read`
* **[UserToken](auth.md#UserToken)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`, `application/problem+json`

<a name="usersIdUnmute"></a>
# **usersIdUnmute**
```java
Mono<MuteUserMutationResponse> UsersApi.usersIdUnmute(sourceUserIdtargetUserId)
```

Unmute User by User ID

Causes the source User to unmute the target User. The source User must match the User context authorizing the request

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sourceUserId** | `String`| The ID of the authenticated source User that is requesting to unmute the target User. | |
| **targetUserId** | `String`| The ID of the User that the source User is requesting to unmute. | |


### Return type
[**MuteUserMutationResponse**](MuteUserMutationResponse.md)

### Authorization
* **[OAuth2UserToken](auth.md#OAuth2UserToken)**, scopes: `mute.write`, `tweet.read`, `users.read`
* **[UserToken](auth.md#UserToken)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`, `application/problem+json`

