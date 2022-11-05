# SpacesApi

All URIs are relative to *https://api.twitter.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**findSpaceById**](SpacesApi.md#findSpaceById) | **GET** /2/spaces/{id} | Space lookup by Space ID |
| [**findSpacesByCreatorIds**](SpacesApi.md#findSpacesByCreatorIds) | **GET** /2/spaces/by/creator_ids | Space lookup by their creators |
| [**findSpacesByIds**](SpacesApi.md#findSpacesByIds) | **GET** /2/spaces | Space lookup up Space IDs |
| [**searchSpaces**](SpacesApi.md#searchSpaces) | **GET** /2/spaces/search | Search for Spaces |
| [**spaceBuyers**](SpacesApi.md#spaceBuyers) | **GET** /2/spaces/{id}/buyers | Retrieve the list of Users who purchased a ticket to the given space |
| [**spaceTweets**](SpacesApi.md#spaceTweets) | **GET** /2/spaces/{id}/tweets | Retrieve Tweets from a Space. |


## Creating SpacesApi

To initiate an instance of `SpacesApi`, you can use micronaut's `ApplicationContext`:
```java
/* imports
import io.micronaut.runtime.Micronaut;
import io.micronaut.context.ApplicationContext;
import example.micronaut.api.SpacesApi;
*/

ApplicationContext context = Micronaut.run(/* ... */);
PetApi apiInstance = context.getBean(SpacesApi.class);
```

Or the `@Inject` annotation:
```java
@Singleton
class MyClass {
    @Inject
    SpacesApi spacesApi;

    /* ... use the injected variable */
}
```
Note that the class needs to be annotated with one of Micronaut's [scope annotations](https://docs.micronaut.io/latest/guide/#scopes) like `Singleton` in order to be processed.

More information can be found inside [Inversion of Control guide section](https://docs.micronaut.io/latest/guide/#ioc).

<a name="findSpaceById"></a>
# **findSpaceById**
```java
Mono<Get2SpacesIdResponse> SpacesApi.findSpaceById(idspaceFieldsexpansionsuserFieldstopicFields)
```

Space lookup by Space ID

Returns a variety of information about the Space specified by the requested ID

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | `String`| The ID of the Space to be retrieved. | |
| **spaceFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Space fields to display. | [optional parameter] [enum: `created_at`, `creator_id`, `ended_at`, `host_ids`, `id`, `invited_user_ids`, `is_ticketed`, `lang`, `participant_count`, `scheduled_start`, `speaker_ids`, `started_at`, `state`, `subscriber_count`, `title`, `topic_ids`, `updated_at`] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional parameter] [enum: `creator_id`, `host_ids`, `invited_user_ids`, `speaker_ids`, `topic_ids`] |
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional parameter] [enum: `created_at`, `description`, `entities`, `id`, `location`, `name`, `pinned_tweet_id`, `profile_image_url`, `protected`, `public_metrics`, `url`, `username`, `verified`, `withheld`] |
| **topicFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Topic fields to display. | [optional parameter] [enum: `description`, `id`, `name`] |


### Return type
[**Get2SpacesIdResponse**](Get2SpacesIdResponse.md)

### Authorization
* **[BearerToken](auth.md#BearerToken)**
* **[OAuth2UserToken](auth.md#OAuth2UserToken)**, scopes: `space.read`, `tweet.read`, `users.read`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`, `application/problem+json`

<a name="findSpacesByCreatorIds"></a>
# **findSpacesByCreatorIds**
```java
Mono<Get2SpacesByCreatorIdsResponse> SpacesApi.findSpacesByCreatorIds(userIdsspaceFieldsexpansionsuserFieldstopicFields)
```

Space lookup by their creators

Returns a variety of information about the Spaces created by the provided User IDs

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **userIds** | [**List&lt;String&gt;**](String.md)| The IDs of Users to search through. | |
| **spaceFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Space fields to display. | [optional parameter] [enum: `created_at`, `creator_id`, `ended_at`, `host_ids`, `id`, `invited_user_ids`, `is_ticketed`, `lang`, `participant_count`, `scheduled_start`, `speaker_ids`, `started_at`, `state`, `subscriber_count`, `title`, `topic_ids`, `updated_at`] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional parameter] [enum: `creator_id`, `host_ids`, `invited_user_ids`, `speaker_ids`, `topic_ids`] |
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional parameter] [enum: `created_at`, `description`, `entities`, `id`, `location`, `name`, `pinned_tweet_id`, `profile_image_url`, `protected`, `public_metrics`, `url`, `username`, `verified`, `withheld`] |
| **topicFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Topic fields to display. | [optional parameter] [enum: `description`, `id`, `name`] |


### Return type
[**Get2SpacesByCreatorIdsResponse**](Get2SpacesByCreatorIdsResponse.md)

### Authorization
* **[BearerToken](auth.md#BearerToken)**
* **[OAuth2UserToken](auth.md#OAuth2UserToken)**, scopes: `space.read`, `tweet.read`, `users.read`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`, `application/problem+json`

<a name="findSpacesByIds"></a>
# **findSpacesByIds**
```java
Mono<Get2SpacesResponse> SpacesApi.findSpacesByIds(idsspaceFieldsexpansionsuserFieldstopicFields)
```

Space lookup up Space IDs

Returns a variety of information about the Spaces specified by the requested IDs

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ids** | [**List&lt;String&gt;**](String.md)| The list of Space IDs to return. | |
| **spaceFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Space fields to display. | [optional parameter] [enum: `created_at`, `creator_id`, `ended_at`, `host_ids`, `id`, `invited_user_ids`, `is_ticketed`, `lang`, `participant_count`, `scheduled_start`, `speaker_ids`, `started_at`, `state`, `subscriber_count`, `title`, `topic_ids`, `updated_at`] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional parameter] [enum: `creator_id`, `host_ids`, `invited_user_ids`, `speaker_ids`, `topic_ids`] |
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional parameter] [enum: `created_at`, `description`, `entities`, `id`, `location`, `name`, `pinned_tweet_id`, `profile_image_url`, `protected`, `public_metrics`, `url`, `username`, `verified`, `withheld`] |
| **topicFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Topic fields to display. | [optional parameter] [enum: `description`, `id`, `name`] |


### Return type
[**Get2SpacesResponse**](Get2SpacesResponse.md)

### Authorization
* **[BearerToken](auth.md#BearerToken)**
* **[OAuth2UserToken](auth.md#OAuth2UserToken)**, scopes: `space.read`, `tweet.read`, `users.read`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`, `application/problem+json`

<a name="searchSpaces"></a>
# **searchSpaces**
```java
Mono<Get2SpacesSearchResponse> SpacesApi.searchSpaces(querystatemaxResultsspaceFieldsexpansionsuserFieldstopicFields)
```

Search for Spaces

Returns Spaces that match the provided query.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **query** | `String`| The search query. | |
| **state** | `String`| The state of Spaces to search for. | [optional parameter] [default to `all`] [enum: `live`, `scheduled`, `all`] |
| **maxResults** | `Integer`| The number of results to return. | [optional parameter] [default to `100`] |
| **spaceFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Space fields to display. | [optional parameter] [enum: `created_at`, `creator_id`, `ended_at`, `host_ids`, `id`, `invited_user_ids`, `is_ticketed`, `lang`, `participant_count`, `scheduled_start`, `speaker_ids`, `started_at`, `state`, `subscriber_count`, `title`, `topic_ids`, `updated_at`] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional parameter] [enum: `creator_id`, `host_ids`, `invited_user_ids`, `speaker_ids`, `topic_ids`] |
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional parameter] [enum: `created_at`, `description`, `entities`, `id`, `location`, `name`, `pinned_tweet_id`, `profile_image_url`, `protected`, `public_metrics`, `url`, `username`, `verified`, `withheld`] |
| **topicFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Topic fields to display. | [optional parameter] [enum: `description`, `id`, `name`] |


### Return type
[**Get2SpacesSearchResponse**](Get2SpacesSearchResponse.md)

### Authorization
* **[BearerToken](auth.md#BearerToken)**
* **[OAuth2UserToken](auth.md#OAuth2UserToken)**, scopes: `space.read`, `tweet.read`, `users.read`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`, `application/problem+json`

<a name="spaceBuyers"></a>
# **spaceBuyers**
```java
Mono<Get2SpacesIdBuyersResponse> SpacesApi.spaceBuyers(idpaginationTokenmaxResultsuserFieldsexpansionstweetFields)
```

Retrieve the list of Users who purchased a ticket to the given space

Retrieves the list of Users who purchased a ticket to the given space

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | `String`| The ID of the Space to be retrieved. | |
| **paginationToken** | `String`| This parameter is used to get a specified &#39;page&#39; of results. | [optional parameter] |
| **maxResults** | `Integer`| The maximum number of results. | [optional parameter] [default to `100`] |
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional parameter] [enum: `created_at`, `description`, `entities`, `id`, `location`, `name`, `pinned_tweet_id`, `profile_image_url`, `protected`, `public_metrics`, `url`, `username`, `verified`, `withheld`] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional parameter] [enum: `pinned_tweet_id`] |
| **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional parameter] [enum: `attachments`, `author_id`, `context_annotations`, `conversation_id`, `created_at`, `edit_controls`, `edit_history_tweet_ids`, `entities`, `geo`, `id`, `in_reply_to_user_id`, `lang`, `non_public_metrics`, `organic_metrics`, `possibly_sensitive`, `promoted_metrics`, `public_metrics`, `referenced_tweets`, `reply_settings`, `source`, `text`, `withheld`] |


### Return type
[**Get2SpacesIdBuyersResponse**](Get2SpacesIdBuyersResponse.md)

### Authorization
* **[OAuth2UserToken](auth.md#OAuth2UserToken)**, scopes: `space.read`, `tweet.read`, `users.read`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`, `application/problem+json`

<a name="spaceTweets"></a>
# **spaceTweets**
```java
Mono<Get2SpacesIdTweetsResponse> SpacesApi.spaceTweets(idmaxResultstweetFieldsexpansionsmediaFieldspollFieldsuserFieldsplaceFields)
```

Retrieve Tweets from a Space.

Retrieves Tweets shared in the specified Space.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | `String`| The ID of the Space to be retrieved. | |
| **maxResults** | `Integer`| The number of Tweets to fetch from the provided space. If not provided, the value will default to the maximum of 100. | [optional parameter] [default to `100`] |
| **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional parameter] [enum: `attachments`, `author_id`, `context_annotations`, `conversation_id`, `created_at`, `edit_controls`, `edit_history_tweet_ids`, `entities`, `geo`, `id`, `in_reply_to_user_id`, `lang`, `non_public_metrics`, `organic_metrics`, `possibly_sensitive`, `promoted_metrics`, `public_metrics`, `referenced_tweets`, `reply_settings`, `source`, `text`, `withheld`] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional parameter] [enum: `attachments.media_keys`, `attachments.poll_ids`, `author_id`, `edit_history_tweet_ids`, `entities.mentions.username`, `geo.place_id`, `in_reply_to_user_id`, `referenced_tweets.id`, `referenced_tweets.id.author_id`] |
| **mediaFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Media fields to display. | [optional parameter] [enum: `alt_text`, `duration_ms`, `height`, `media_key`, `non_public_metrics`, `organic_metrics`, `preview_image_url`, `promoted_metrics`, `public_metrics`, `type`, `url`, `variants`, `width`] |
| **pollFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Poll fields to display. | [optional parameter] [enum: `duration_minutes`, `end_datetime`, `id`, `options`, `voting_status`] |
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional parameter] [enum: `created_at`, `description`, `entities`, `id`, `location`, `name`, `pinned_tweet_id`, `profile_image_url`, `protected`, `public_metrics`, `url`, `username`, `verified`, `withheld`] |
| **placeFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Place fields to display. | [optional parameter] [enum: `contained_within`, `country`, `country_code`, `full_name`, `geo`, `id`, `name`, `place_type`] |


### Return type
[**Get2SpacesIdTweetsResponse**](Get2SpacesIdTweetsResponse.md)

### Authorization
* **[BearerToken](auth.md#BearerToken)**
* **[OAuth2UserToken](auth.md#OAuth2UserToken)**, scopes: `space.read`, `tweet.read`, `users.read`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`, `application/problem+json`

