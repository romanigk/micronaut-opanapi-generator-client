# TweetsApi

All URIs are relative to *https://api.twitter.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addOrDeleteRules**](TweetsApi.md#addOrDeleteRules) | **POST** /2/tweets/search/stream/rules | Add/Delete rules |
| [**createTweet**](TweetsApi.md#createTweet) | **POST** /2/tweets | Creation of a Tweet |
| [**deleteTweetById**](TweetsApi.md#deleteTweetById) | **DELETE** /2/tweets/{id} | Tweet delete by Tweet ID |
| [**findTweetById**](TweetsApi.md#findTweetById) | **GET** /2/tweets/{id} | Tweet lookup by Tweet ID |
| [**findTweetsById**](TweetsApi.md#findTweetsById) | **GET** /2/tweets | Tweet lookup by Tweet IDs |
| [**findTweetsThatQuoteATweet**](TweetsApi.md#findTweetsThatQuoteATweet) | **GET** /2/tweets/{id}/quote_tweets | Retrieve Tweets that quote a Tweet. |
| [**getRules**](TweetsApi.md#getRules) | **GET** /2/tweets/search/stream/rules | Rules lookup |
| [**getTweetsFirehoseStream**](TweetsApi.md#getTweetsFirehoseStream) | **GET** /2/tweets/firehose/stream | Firehose stream |
| [**getTweetsSample10Stream**](TweetsApi.md#getTweetsSample10Stream) | **GET** /2/tweets/sample10/stream | Sample 10% stream |
| [**hideReplyById**](TweetsApi.md#hideReplyById) | **PUT** /2/tweets/{tweet_id}/hidden | Hide replies |
| [**listsIdTweets**](TweetsApi.md#listsIdTweets) | **GET** /2/lists/{id}/tweets | List Tweets timeline by List ID. |
| [**sampleStream**](TweetsApi.md#sampleStream) | **GET** /2/tweets/sample/stream | Sample stream |
| [**searchStream**](TweetsApi.md#searchStream) | **GET** /2/tweets/search/stream | Filtered stream |
| [**spaceBuyers**](TweetsApi.md#spaceBuyers) | **GET** /2/spaces/{id}/buyers | Retrieve the list of Users who purchased a ticket to the given space |
| [**spaceTweets**](TweetsApi.md#spaceTweets) | **GET** /2/spaces/{id}/tweets | Retrieve Tweets from a Space. |
| [**tweetCountsFullArchiveSearch**](TweetsApi.md#tweetCountsFullArchiveSearch) | **GET** /2/tweets/counts/all | Full archive search counts |
| [**tweetCountsRecentSearch**](TweetsApi.md#tweetCountsRecentSearch) | **GET** /2/tweets/counts/recent | Recent search counts |
| [**tweetsFullarchiveSearch**](TweetsApi.md#tweetsFullarchiveSearch) | **GET** /2/tweets/search/all | Full-archive search |
| [**tweetsRecentSearch**](TweetsApi.md#tweetsRecentSearch) | **GET** /2/tweets/search/recent | Recent search |
| [**usersIdLike**](TweetsApi.md#usersIdLike) | **POST** /2/users/{id}/likes | Causes the User (in the path) to like the specified Tweet |
| [**usersIdLikedTweets**](TweetsApi.md#usersIdLikedTweets) | **GET** /2/users/{id}/liked_tweets | Returns Tweet objects liked by the provided User ID |
| [**usersIdMentions**](TweetsApi.md#usersIdMentions) | **GET** /2/users/{id}/mentions | User mention timeline by User ID |
| [**usersIdRetweets**](TweetsApi.md#usersIdRetweets) | **POST** /2/users/{id}/retweets | Causes the User (in the path) to retweet the specified Tweet. |
| [**usersIdTimeline**](TweetsApi.md#usersIdTimeline) | **GET** /2/users/{id}/timelines/reverse_chronological | User home timeline by User ID |
| [**usersIdTweets**](TweetsApi.md#usersIdTweets) | **GET** /2/users/{id}/tweets | User Tweets timeline by User ID |
| [**usersIdUnlike**](TweetsApi.md#usersIdUnlike) | **DELETE** /2/users/{id}/likes/{tweet_id} | Causes the User (in the path) to unlike the specified Tweet |
| [**usersIdUnretweets**](TweetsApi.md#usersIdUnretweets) | **DELETE** /2/users/{id}/retweets/{source_tweet_id} | Causes the User (in the path) to unretweet the specified Tweet |


## Creating TweetsApi

To initiate an instance of `TweetsApi`, you can use micronaut's `ApplicationContext`:
```java
/* imports
import io.micronaut.runtime.Micronaut;
import io.micronaut.context.ApplicationContext;
import example.micronaut.api.TweetsApi;
*/

ApplicationContext context = Micronaut.run(/* ... */);
PetApi apiInstance = context.getBean(TweetsApi.class);
```

Or the `@Inject` annotation:
```java
@Singleton
class MyClass {
    @Inject
    TweetsApi tweetsApi;

    /* ... use the injected variable */
}
```
Note that the class needs to be annotated with one of Micronaut's [scope annotations](https://docs.micronaut.io/latest/guide/#scopes) like `Singleton` in order to be processed.

More information can be found inside [Inversion of Control guide section](https://docs.micronaut.io/latest/guide/#ioc).

<a name="addOrDeleteRules"></a>
# **addOrDeleteRules**
```java
Mono<AddOrDeleteRulesResponse> TweetsApi.addOrDeleteRules(addOrDeleteRulesRequestdryRun)
```

Add/Delete rules

Add or delete rules from a User&#39;s active rule set. Users can provide unique, optionally tagged rules to add. Users can delete their entire rule set or a subset specified by rule ids or values.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **addOrDeleteRulesRequest** | [**AddOrDeleteRulesRequest**](AddOrDeleteRulesRequest.md)|  | |
| **dryRun** | `Boolean`| Dry Run can be used with both the add and delete action, with the expected result given, but without actually taking any action in the system (meaning the end state will always be as it was when the request was submitted). This is particularly useful to validate rule changes. | [optional parameter] |


### Return type
[**AddOrDeleteRulesResponse**](AddOrDeleteRulesResponse.md)

### Authorization
* **[BearerToken](auth.md#BearerToken)**

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`, `application/problem+json`

<a name="createTweet"></a>
# **createTweet**
```java
Mono<TweetCreateResponse> TweetsApi.createTweet(tweetCreateRequest)
```

Creation of a Tweet

Causes the User to create a Tweet under the authorized account.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tweetCreateRequest** | [**TweetCreateRequest**](TweetCreateRequest.md)|  | |


### Return type
[**TweetCreateResponse**](TweetCreateResponse.md)

### Authorization
* **[OAuth2UserToken](auth.md#OAuth2UserToken)**, scopes: `tweet.read`, `tweet.write`, `users.read`
* **[UserToken](auth.md#UserToken)**

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`, `application/problem+json`

<a name="deleteTweetById"></a>
# **deleteTweetById**
```java
Mono<TweetDeleteResponse> TweetsApi.deleteTweetById(id)
```

Tweet delete by Tweet ID

Delete specified Tweet (in the path) by ID.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | `String`| The ID of the Tweet to be deleted. | |


### Return type
[**TweetDeleteResponse**](TweetDeleteResponse.md)

### Authorization
* **[OAuth2UserToken](auth.md#OAuth2UserToken)**, scopes: `tweet.read`, `tweet.write`, `users.read`
* **[UserToken](auth.md#UserToken)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`, `application/problem+json`

<a name="findTweetById"></a>
# **findTweetById**
```java
Mono<Get2TweetsIdResponse> TweetsApi.findTweetById(idtweetFieldsexpansionsmediaFieldspollFieldsuserFieldsplaceFields)
```

Tweet lookup by Tweet ID

Returns a variety of information about the Tweet specified by the requested ID.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | `String`| A single Tweet ID. | |
| **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional parameter] [enum: `attachments`, `author_id`, `context_annotations`, `conversation_id`, `created_at`, `edit_controls`, `edit_history_tweet_ids`, `entities`, `geo`, `id`, `in_reply_to_user_id`, `lang`, `non_public_metrics`, `organic_metrics`, `possibly_sensitive`, `promoted_metrics`, `public_metrics`, `referenced_tweets`, `reply_settings`, `source`, `text`, `withheld`] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional parameter] [enum: `attachments.media_keys`, `attachments.poll_ids`, `author_id`, `edit_history_tweet_ids`, `entities.mentions.username`, `geo.place_id`, `in_reply_to_user_id`, `referenced_tweets.id`, `referenced_tweets.id.author_id`] |
| **mediaFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Media fields to display. | [optional parameter] [enum: `alt_text`, `duration_ms`, `height`, `media_key`, `non_public_metrics`, `organic_metrics`, `preview_image_url`, `promoted_metrics`, `public_metrics`, `type`, `url`, `variants`, `width`] |
| **pollFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Poll fields to display. | [optional parameter] [enum: `duration_minutes`, `end_datetime`, `id`, `options`, `voting_status`] |
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional parameter] [enum: `created_at`, `description`, `entities`, `id`, `location`, `name`, `pinned_tweet_id`, `profile_image_url`, `protected`, `public_metrics`, `url`, `username`, `verified`, `withheld`] |
| **placeFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Place fields to display. | [optional parameter] [enum: `contained_within`, `country`, `country_code`, `full_name`, `geo`, `id`, `name`, `place_type`] |


### Return type
[**Get2TweetsIdResponse**](Get2TweetsIdResponse.md)

### Authorization
* **[BearerToken](auth.md#BearerToken)**
* **[OAuth2UserToken](auth.md#OAuth2UserToken)**, scopes: `tweet.read`, `users.read`
* **[UserToken](auth.md#UserToken)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`, `application/problem+json`

<a name="findTweetsById"></a>
# **findTweetsById**
```java
Mono<Get2TweetsResponse> TweetsApi.findTweetsById(idstweetFieldsexpansionsmediaFieldspollFieldsuserFieldsplaceFields)
```

Tweet lookup by Tweet IDs

Returns a variety of information about the Tweet specified by the requested ID.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ids** | [**List&lt;String&gt;**](String.md)| A comma separated list of Tweet IDs. Up to 100 are allowed in a single request. | |
| **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional parameter] [enum: `attachments`, `author_id`, `context_annotations`, `conversation_id`, `created_at`, `edit_controls`, `edit_history_tweet_ids`, `entities`, `geo`, `id`, `in_reply_to_user_id`, `lang`, `non_public_metrics`, `organic_metrics`, `possibly_sensitive`, `promoted_metrics`, `public_metrics`, `referenced_tweets`, `reply_settings`, `source`, `text`, `withheld`] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional parameter] [enum: `attachments.media_keys`, `attachments.poll_ids`, `author_id`, `edit_history_tweet_ids`, `entities.mentions.username`, `geo.place_id`, `in_reply_to_user_id`, `referenced_tweets.id`, `referenced_tweets.id.author_id`] |
| **mediaFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Media fields to display. | [optional parameter] [enum: `alt_text`, `duration_ms`, `height`, `media_key`, `non_public_metrics`, `organic_metrics`, `preview_image_url`, `promoted_metrics`, `public_metrics`, `type`, `url`, `variants`, `width`] |
| **pollFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Poll fields to display. | [optional parameter] [enum: `duration_minutes`, `end_datetime`, `id`, `options`, `voting_status`] |
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional parameter] [enum: `created_at`, `description`, `entities`, `id`, `location`, `name`, `pinned_tweet_id`, `profile_image_url`, `protected`, `public_metrics`, `url`, `username`, `verified`, `withheld`] |
| **placeFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Place fields to display. | [optional parameter] [enum: `contained_within`, `country`, `country_code`, `full_name`, `geo`, `id`, `name`, `place_type`] |


### Return type
[**Get2TweetsResponse**](Get2TweetsResponse.md)

### Authorization
* **[BearerToken](auth.md#BearerToken)**
* **[OAuth2UserToken](auth.md#OAuth2UserToken)**, scopes: `tweet.read`, `users.read`
* **[UserToken](auth.md#UserToken)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`, `application/problem+json`

<a name="findTweetsThatQuoteATweet"></a>
# **findTweetsThatQuoteATweet**
```java
Mono<Get2TweetsIdQuoteTweetsResponse> TweetsApi.findTweetsThatQuoteATweet(idmaxResultspaginationTokenexcludetweetFieldsexpansionsmediaFieldspollFieldsuserFieldsplaceFields)
```

Retrieve Tweets that quote a Tweet.

Returns a variety of information about each Tweet that quotes the Tweet specified by the requested ID.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | `String`| A single Tweet ID. | |
| **maxResults** | `Integer`| The maximum number of results to be returned. | [optional parameter] [default to `10`] |
| **paginationToken** | `String`| This parameter is used to get a specified &#39;page&#39; of results. | [optional parameter] |
| **exclude** | [**Set&lt;String&gt;**](String.md)| The set of entities to exclude (e.g. &#39;replies&#39; or &#39;retweets&#39;). | [optional parameter] [enum: `replies`, `retweets`] |
| **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional parameter] [enum: `attachments`, `author_id`, `context_annotations`, `conversation_id`, `created_at`, `edit_controls`, `edit_history_tweet_ids`, `entities`, `geo`, `id`, `in_reply_to_user_id`, `lang`, `non_public_metrics`, `organic_metrics`, `possibly_sensitive`, `promoted_metrics`, `public_metrics`, `referenced_tweets`, `reply_settings`, `source`, `text`, `withheld`] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional parameter] [enum: `attachments.media_keys`, `attachments.poll_ids`, `author_id`, `edit_history_tweet_ids`, `entities.mentions.username`, `geo.place_id`, `in_reply_to_user_id`, `referenced_tweets.id`, `referenced_tweets.id.author_id`] |
| **mediaFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Media fields to display. | [optional parameter] [enum: `alt_text`, `duration_ms`, `height`, `media_key`, `non_public_metrics`, `organic_metrics`, `preview_image_url`, `promoted_metrics`, `public_metrics`, `type`, `url`, `variants`, `width`] |
| **pollFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Poll fields to display. | [optional parameter] [enum: `duration_minutes`, `end_datetime`, `id`, `options`, `voting_status`] |
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional parameter] [enum: `created_at`, `description`, `entities`, `id`, `location`, `name`, `pinned_tweet_id`, `profile_image_url`, `protected`, `public_metrics`, `url`, `username`, `verified`, `withheld`] |
| **placeFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Place fields to display. | [optional parameter] [enum: `contained_within`, `country`, `country_code`, `full_name`, `geo`, `id`, `name`, `place_type`] |


### Return type
[**Get2TweetsIdQuoteTweetsResponse**](Get2TweetsIdQuoteTweetsResponse.md)

### Authorization
* **[BearerToken](auth.md#BearerToken)**
* **[OAuth2UserToken](auth.md#OAuth2UserToken)**, scopes: `tweet.read`, `users.read`
* **[UserToken](auth.md#UserToken)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`, `application/problem+json`

<a name="getRules"></a>
# **getRules**
```java
Mono<RulesLookupResponse> TweetsApi.getRules(idsmaxResultspaginationToken)
```

Rules lookup

Returns rules from a User&#39;s active rule set. Users can fetch all of their rules or a subset, specified by the provided rule ids.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ids** | [**List&lt;String&gt;**](String.md)| A comma-separated list of Rule IDs. | [optional parameter] |
| **maxResults** | `Integer`| The maximum number of results. | [optional parameter] [default to `1000`] |
| **paginationToken** | `String`| This value is populated by passing the &#39;next_token&#39; returned in a request to paginate through results. | [optional parameter] |


### Return type
[**RulesLookupResponse**](RulesLookupResponse.md)

### Authorization
* **[BearerToken](auth.md#BearerToken)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`, `application/problem+json`

<a name="getTweetsFirehoseStream"></a>
# **getTweetsFirehoseStream**
```java
Mono<StreamingTweetResponse> TweetsApi.getTweetsFirehoseStream(partitionbackfillMinutesstartTimeendTimetweetFieldsexpansionsmediaFieldspollFieldsuserFieldsplaceFields)
```

Firehose stream

Streams 100% of public Tweets.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **partition** | `Integer`| The partition number. | |
| **backfillMinutes** | `Integer`| The number of minutes of backfill requested. | [optional parameter] |
| **startTime** | `OffsetDateTime`| YYYY-MM-DDTHH:mm:ssZ. The earliest UTC timestamp to which the Tweets will be provided. | [optional parameter] |
| **endTime** | `OffsetDateTime`| YYYY-MM-DDTHH:mm:ssZ. The latest UTC timestamp to which the Tweets will be provided. | [optional parameter] |
| **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional parameter] [enum: `attachments`, `author_id`, `context_annotations`, `conversation_id`, `created_at`, `edit_controls`, `edit_history_tweet_ids`, `entities`, `geo`, `id`, `in_reply_to_user_id`, `lang`, `non_public_metrics`, `organic_metrics`, `possibly_sensitive`, `promoted_metrics`, `public_metrics`, `referenced_tweets`, `reply_settings`, `source`, `text`, `withheld`] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional parameter] [enum: `attachments.media_keys`, `attachments.poll_ids`, `author_id`, `edit_history_tweet_ids`, `entities.mentions.username`, `geo.place_id`, `in_reply_to_user_id`, `referenced_tweets.id`, `referenced_tweets.id.author_id`] |
| **mediaFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Media fields to display. | [optional parameter] [enum: `alt_text`, `duration_ms`, `height`, `media_key`, `non_public_metrics`, `organic_metrics`, `preview_image_url`, `promoted_metrics`, `public_metrics`, `type`, `url`, `variants`, `width`] |
| **pollFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Poll fields to display. | [optional parameter] [enum: `duration_minutes`, `end_datetime`, `id`, `options`, `voting_status`] |
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional parameter] [enum: `created_at`, `description`, `entities`, `id`, `location`, `name`, `pinned_tweet_id`, `profile_image_url`, `protected`, `public_metrics`, `url`, `username`, `verified`, `withheld`] |
| **placeFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Place fields to display. | [optional parameter] [enum: `contained_within`, `country`, `country_code`, `full_name`, `geo`, `id`, `name`, `place_type`] |


### Return type
[**StreamingTweetResponse**](StreamingTweetResponse.md)

### Authorization
* **[BearerToken](auth.md#BearerToken)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`, `application/problem+json`

<a name="getTweetsSample10Stream"></a>
# **getTweetsSample10Stream**
```java
Mono<Get2TweetsSample10StreamResponse> TweetsApi.getTweetsSample10Stream(partitionbackfillMinutesstartTimeendTimetweetFieldsexpansionsmediaFieldspollFieldsuserFieldsplaceFields)
```

Sample 10% stream

Streams a deterministic 10% of public Tweets.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **partition** | `Integer`| The partition number. | |
| **backfillMinutes** | `Integer`| The number of minutes of backfill requested. | [optional parameter] |
| **startTime** | `OffsetDateTime`| YYYY-MM-DDTHH:mm:ssZ. The earliest UTC timestamp to which the Tweets will be provided. | [optional parameter] |
| **endTime** | `OffsetDateTime`| YYYY-MM-DDTHH:mm:ssZ. The latest UTC timestamp to which the Tweets will be provided. | [optional parameter] |
| **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional parameter] [enum: `attachments`, `author_id`, `context_annotations`, `conversation_id`, `created_at`, `edit_controls`, `edit_history_tweet_ids`, `entities`, `geo`, `id`, `in_reply_to_user_id`, `lang`, `non_public_metrics`, `organic_metrics`, `possibly_sensitive`, `promoted_metrics`, `public_metrics`, `referenced_tweets`, `reply_settings`, `source`, `text`, `withheld`] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional parameter] [enum: `attachments.media_keys`, `attachments.poll_ids`, `author_id`, `edit_history_tweet_ids`, `entities.mentions.username`, `geo.place_id`, `in_reply_to_user_id`, `referenced_tweets.id`, `referenced_tweets.id.author_id`] |
| **mediaFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Media fields to display. | [optional parameter] [enum: `alt_text`, `duration_ms`, `height`, `media_key`, `non_public_metrics`, `organic_metrics`, `preview_image_url`, `promoted_metrics`, `public_metrics`, `type`, `url`, `variants`, `width`] |
| **pollFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Poll fields to display. | [optional parameter] [enum: `duration_minutes`, `end_datetime`, `id`, `options`, `voting_status`] |
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional parameter] [enum: `created_at`, `description`, `entities`, `id`, `location`, `name`, `pinned_tweet_id`, `profile_image_url`, `protected`, `public_metrics`, `url`, `username`, `verified`, `withheld`] |
| **placeFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Place fields to display. | [optional parameter] [enum: `contained_within`, `country`, `country_code`, `full_name`, `geo`, `id`, `name`, `place_type`] |


### Return type
[**Get2TweetsSample10StreamResponse**](Get2TweetsSample10StreamResponse.md)

### Authorization
* **[BearerToken](auth.md#BearerToken)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`, `application/problem+json`

<a name="hideReplyById"></a>
# **hideReplyById**
```java
Mono<TweetHideResponse> TweetsApi.hideReplyById(tweetIdtweetHideRequest)
```

Hide replies

Hides or unhides a reply to an owned conversation.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tweetId** | `String`| The ID of the reply that you want to hide or unhide. | |
| **tweetHideRequest** | [**TweetHideRequest**](TweetHideRequest.md)|  | [optional parameter] |


### Return type
[**TweetHideResponse**](TweetHideResponse.md)

### Authorization
* **[OAuth2UserToken](auth.md#OAuth2UserToken)**, scopes: `tweet.moderate.write`, `tweet.read`, `users.read`
* **[UserToken](auth.md#UserToken)**

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`, `application/problem+json`

<a name="listsIdTweets"></a>
# **listsIdTweets**
```java
Mono<Get2ListsIdTweetsResponse> TweetsApi.listsIdTweets(idmaxResultspaginationTokentweetFieldsexpansionsmediaFieldspollFieldsuserFieldsplaceFields)
```

List Tweets timeline by List ID.

Returns a list of Tweets associated with the provided List ID.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | `String`| The ID of the List. | |
| **maxResults** | `Integer`| The maximum number of results. | [optional parameter] [default to `100`] |
| **paginationToken** | `String`| This parameter is used to get the next &#39;page&#39; of results. | [optional parameter] |
| **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional parameter] [enum: `attachments`, `author_id`, `context_annotations`, `conversation_id`, `created_at`, `edit_controls`, `edit_history_tweet_ids`, `entities`, `geo`, `id`, `in_reply_to_user_id`, `lang`, `non_public_metrics`, `organic_metrics`, `possibly_sensitive`, `promoted_metrics`, `public_metrics`, `referenced_tweets`, `reply_settings`, `source`, `text`, `withheld`] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional parameter] [enum: `attachments.media_keys`, `attachments.poll_ids`, `author_id`, `edit_history_tweet_ids`, `entities.mentions.username`, `geo.place_id`, `in_reply_to_user_id`, `referenced_tweets.id`, `referenced_tweets.id.author_id`] |
| **mediaFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Media fields to display. | [optional parameter] [enum: `alt_text`, `duration_ms`, `height`, `media_key`, `non_public_metrics`, `organic_metrics`, `preview_image_url`, `promoted_metrics`, `public_metrics`, `type`, `url`, `variants`, `width`] |
| **pollFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Poll fields to display. | [optional parameter] [enum: `duration_minutes`, `end_datetime`, `id`, `options`, `voting_status`] |
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional parameter] [enum: `created_at`, `description`, `entities`, `id`, `location`, `name`, `pinned_tweet_id`, `profile_image_url`, `protected`, `public_metrics`, `url`, `username`, `verified`, `withheld`] |
| **placeFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Place fields to display. | [optional parameter] [enum: `contained_within`, `country`, `country_code`, `full_name`, `geo`, `id`, `name`, `place_type`] |


### Return type
[**Get2ListsIdTweetsResponse**](Get2ListsIdTweetsResponse.md)

### Authorization
* **[BearerToken](auth.md#BearerToken)**
* **[OAuth2UserToken](auth.md#OAuth2UserToken)**, scopes: `list.read`, `tweet.read`, `users.read`
* **[UserToken](auth.md#UserToken)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`, `application/problem+json`

<a name="sampleStream"></a>
# **sampleStream**
```java
Mono<StreamingTweetResponse> TweetsApi.sampleStream(backfillMinutestweetFieldsexpansionsmediaFieldspollFieldsuserFieldsplaceFields)
```

Sample stream

Streams a deterministic 1% of public Tweets.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **backfillMinutes** | `Integer`| The number of minutes of backfill requested. | [optional parameter] |
| **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional parameter] [enum: `attachments`, `author_id`, `context_annotations`, `conversation_id`, `created_at`, `edit_controls`, `edit_history_tweet_ids`, `entities`, `geo`, `id`, `in_reply_to_user_id`, `lang`, `non_public_metrics`, `organic_metrics`, `possibly_sensitive`, `promoted_metrics`, `public_metrics`, `referenced_tweets`, `reply_settings`, `source`, `text`, `withheld`] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional parameter] [enum: `attachments.media_keys`, `attachments.poll_ids`, `author_id`, `edit_history_tweet_ids`, `entities.mentions.username`, `geo.place_id`, `in_reply_to_user_id`, `referenced_tweets.id`, `referenced_tweets.id.author_id`] |
| **mediaFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Media fields to display. | [optional parameter] [enum: `alt_text`, `duration_ms`, `height`, `media_key`, `non_public_metrics`, `organic_metrics`, `preview_image_url`, `promoted_metrics`, `public_metrics`, `type`, `url`, `variants`, `width`] |
| **pollFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Poll fields to display. | [optional parameter] [enum: `duration_minutes`, `end_datetime`, `id`, `options`, `voting_status`] |
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional parameter] [enum: `created_at`, `description`, `entities`, `id`, `location`, `name`, `pinned_tweet_id`, `profile_image_url`, `protected`, `public_metrics`, `url`, `username`, `verified`, `withheld`] |
| **placeFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Place fields to display. | [optional parameter] [enum: `contained_within`, `country`, `country_code`, `full_name`, `geo`, `id`, `name`, `place_type`] |


### Return type
[**StreamingTweetResponse**](StreamingTweetResponse.md)

### Authorization
* **[BearerToken](auth.md#BearerToken)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`, `application/problem+json`

<a name="searchStream"></a>
# **searchStream**
```java
Mono<FilteredStreamingTweetResponse> TweetsApi.searchStream(backfillMinutesstartTimeendTimetweetFieldsexpansionsmediaFieldspollFieldsuserFieldsplaceFields)
```

Filtered stream

Streams Tweets matching the stream&#39;s active rule set.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **backfillMinutes** | `Integer`| The number of minutes of backfill requested. | [optional parameter] |
| **startTime** | `OffsetDateTime`| YYYY-MM-DDTHH:mm:ssZ. The earliest UTC timestamp from which the Tweets will be provided. | [optional parameter] |
| **endTime** | `OffsetDateTime`| YYYY-MM-DDTHH:mm:ssZ. The latest UTC timestamp to which the Tweets will be provided. | [optional parameter] |
| **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional parameter] [enum: `attachments`, `author_id`, `context_annotations`, `conversation_id`, `created_at`, `edit_controls`, `edit_history_tweet_ids`, `entities`, `geo`, `id`, `in_reply_to_user_id`, `lang`, `non_public_metrics`, `organic_metrics`, `possibly_sensitive`, `promoted_metrics`, `public_metrics`, `referenced_tweets`, `reply_settings`, `source`, `text`, `withheld`] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional parameter] [enum: `attachments.media_keys`, `attachments.poll_ids`, `author_id`, `edit_history_tweet_ids`, `entities.mentions.username`, `geo.place_id`, `in_reply_to_user_id`, `referenced_tweets.id`, `referenced_tweets.id.author_id`] |
| **mediaFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Media fields to display. | [optional parameter] [enum: `alt_text`, `duration_ms`, `height`, `media_key`, `non_public_metrics`, `organic_metrics`, `preview_image_url`, `promoted_metrics`, `public_metrics`, `type`, `url`, `variants`, `width`] |
| **pollFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Poll fields to display. | [optional parameter] [enum: `duration_minutes`, `end_datetime`, `id`, `options`, `voting_status`] |
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional parameter] [enum: `created_at`, `description`, `entities`, `id`, `location`, `name`, `pinned_tweet_id`, `profile_image_url`, `protected`, `public_metrics`, `url`, `username`, `verified`, `withheld`] |
| **placeFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Place fields to display. | [optional parameter] [enum: `contained_within`, `country`, `country_code`, `full_name`, `geo`, `id`, `name`, `place_type`] |


### Return type
[**FilteredStreamingTweetResponse**](FilteredStreamingTweetResponse.md)

### Authorization
* **[BearerToken](auth.md#BearerToken)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`, `application/problem+json`

<a name="spaceBuyers"></a>
# **spaceBuyers**
```java
Mono<Get2SpacesIdBuyersResponse> TweetsApi.spaceBuyers(idpaginationTokenmaxResultsuserFieldsexpansionstweetFields)
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
Mono<Get2SpacesIdTweetsResponse> TweetsApi.spaceTweets(idmaxResultstweetFieldsexpansionsmediaFieldspollFieldsuserFieldsplaceFields)
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

<a name="tweetCountsFullArchiveSearch"></a>
# **tweetCountsFullArchiveSearch**
```java
Mono<Get2TweetsCountsAllResponse> TweetsApi.tweetCountsFullArchiveSearch(querystartTimeendTimesinceIduntilIdnextTokenpaginationTokengranularitysearchCountFields)
```

Full archive search counts

Returns Tweet Counts that match a search query.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **query** | `String`| One query/rule/filter for matching Tweets. Refer to https://t.co/rulelength to identify the max query length. | |
| **startTime** | `OffsetDateTime`| YYYY-MM-DDTHH:mm:ssZ. The oldest UTC timestamp (from most recent 7 days) from which the Tweets will be provided. Timestamp is in second granularity and is inclusive (i.e. 12:00:01 includes the first second of the minute). | [optional parameter] |
| **endTime** | `OffsetDateTime`| YYYY-MM-DDTHH:mm:ssZ. The newest, most recent UTC timestamp to which the Tweets will be provided. Timestamp is in second granularity and is exclusive (i.e. 12:00:01 excludes the first second of the minute). | [optional parameter] |
| **sinceId** | `String`| Returns results with a Tweet ID greater than (that is, more recent than) the specified ID. | [optional parameter] |
| **untilId** | `String`| Returns results with a Tweet ID less than (that is, older than) the specified ID. | [optional parameter] |
| **nextToken** | `String`| This parameter is used to get the next &#39;page&#39; of results. The value used with the parameter is pulled directly from the response provided by the API, and should not be modified. | [optional parameter] |
| **paginationToken** | `String`| This parameter is used to get the next &#39;page&#39; of results. The value used with the parameter is pulled directly from the response provided by the API, and should not be modified. | [optional parameter] |
| **granularity** | `String`| The granularity for the search counts results. | [optional parameter] [default to `hour`] [enum: `minute`, `hour`, `day`] |
| **searchCountFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of SearchCount fields to display. | [optional parameter] [enum: `end`, `start`, `tweet_count`] |


### Return type
[**Get2TweetsCountsAllResponse**](Get2TweetsCountsAllResponse.md)

### Authorization
* **[BearerToken](auth.md#BearerToken)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`, `application/problem+json`

<a name="tweetCountsRecentSearch"></a>
# **tweetCountsRecentSearch**
```java
Mono<Get2TweetsCountsRecentResponse> TweetsApi.tweetCountsRecentSearch(querystartTimeendTimesinceIduntilIdnextTokenpaginationTokengranularitysearchCountFields)
```

Recent search counts

Returns Tweet Counts from the last 7 days that match a search query.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **query** | `String`| One query/rule/filter for matching Tweets. Refer to https://t.co/rulelength to identify the max query length. | |
| **startTime** | `OffsetDateTime`| YYYY-MM-DDTHH:mm:ssZ. The oldest UTC timestamp (from most recent 7 days) from which the Tweets will be provided. Timestamp is in second granularity and is inclusive (i.e. 12:00:01 includes the first second of the minute). | [optional parameter] |
| **endTime** | `OffsetDateTime`| YYYY-MM-DDTHH:mm:ssZ. The newest, most recent UTC timestamp to which the Tweets will be provided. Timestamp is in second granularity and is exclusive (i.e. 12:00:01 excludes the first second of the minute). | [optional parameter] |
| **sinceId** | `String`| Returns results with a Tweet ID greater than (that is, more recent than) the specified ID. | [optional parameter] |
| **untilId** | `String`| Returns results with a Tweet ID less than (that is, older than) the specified ID. | [optional parameter] |
| **nextToken** | `String`| This parameter is used to get the next &#39;page&#39; of results. The value used with the parameter is pulled directly from the response provided by the API, and should not be modified. | [optional parameter] |
| **paginationToken** | `String`| This parameter is used to get the next &#39;page&#39; of results. The value used with the parameter is pulled directly from the response provided by the API, and should not be modified. | [optional parameter] |
| **granularity** | `String`| The granularity for the search counts results. | [optional parameter] [default to `hour`] [enum: `minute`, `hour`, `day`] |
| **searchCountFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of SearchCount fields to display. | [optional parameter] [enum: `end`, `start`, `tweet_count`] |


### Return type
[**Get2TweetsCountsRecentResponse**](Get2TweetsCountsRecentResponse.md)

### Authorization
* **[BearerToken](auth.md#BearerToken)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`, `application/problem+json`

<a name="tweetsFullarchiveSearch"></a>
# **tweetsFullarchiveSearch**
```java
Mono<Get2TweetsSearchAllResponse> TweetsApi.tweetsFullarchiveSearch(querystartTimeendTimesinceIduntilIdmaxResultsnextTokenpaginationTokensortOrdertweetFieldsexpansionsmediaFieldspollFieldsuserFieldsplaceFields)
```

Full-archive search

Returns Tweets that match a search query.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **query** | `String`| One query/rule/filter for matching Tweets. Refer to https://t.co/rulelength to identify the max query length. | |
| **startTime** | `OffsetDateTime`| YYYY-MM-DDTHH:mm:ssZ. The oldest UTC timestamp from which the Tweets will be provided. Timestamp is in second granularity and is inclusive (i.e. 12:00:01 includes the first second of the minute). | [optional parameter] |
| **endTime** | `OffsetDateTime`| YYYY-MM-DDTHH:mm:ssZ. The newest, most recent UTC timestamp to which the Tweets will be provided. Timestamp is in second granularity and is exclusive (i.e. 12:00:01 excludes the first second of the minute). | [optional parameter] |
| **sinceId** | `String`| Returns results with a Tweet ID greater than (that is, more recent than) the specified ID. | [optional parameter] |
| **untilId** | `String`| Returns results with a Tweet ID less than (that is, older than) the specified ID. | [optional parameter] |
| **maxResults** | `Integer`| The maximum number of search results to be returned by a request. | [optional parameter] [default to `10`] |
| **nextToken** | `String`| This parameter is used to get the next &#39;page&#39; of results. The value used with the parameter is pulled directly from the response provided by the API, and should not be modified. | [optional parameter] |
| **paginationToken** | `String`| This parameter is used to get the next &#39;page&#39; of results. The value used with the parameter is pulled directly from the response provided by the API, and should not be modified. | [optional parameter] |
| **sortOrder** | `String`| This order in which to return results. | [optional parameter] [enum: `recency`, `relevancy`] |
| **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional parameter] [enum: `attachments`, `author_id`, `context_annotations`, `conversation_id`, `created_at`, `edit_controls`, `edit_history_tweet_ids`, `entities`, `geo`, `id`, `in_reply_to_user_id`, `lang`, `non_public_metrics`, `organic_metrics`, `possibly_sensitive`, `promoted_metrics`, `public_metrics`, `referenced_tweets`, `reply_settings`, `source`, `text`, `withheld`] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional parameter] [enum: `attachments.media_keys`, `attachments.poll_ids`, `author_id`, `edit_history_tweet_ids`, `entities.mentions.username`, `geo.place_id`, `in_reply_to_user_id`, `referenced_tweets.id`, `referenced_tweets.id.author_id`] |
| **mediaFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Media fields to display. | [optional parameter] [enum: `alt_text`, `duration_ms`, `height`, `media_key`, `non_public_metrics`, `organic_metrics`, `preview_image_url`, `promoted_metrics`, `public_metrics`, `type`, `url`, `variants`, `width`] |
| **pollFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Poll fields to display. | [optional parameter] [enum: `duration_minutes`, `end_datetime`, `id`, `options`, `voting_status`] |
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional parameter] [enum: `created_at`, `description`, `entities`, `id`, `location`, `name`, `pinned_tweet_id`, `profile_image_url`, `protected`, `public_metrics`, `url`, `username`, `verified`, `withheld`] |
| **placeFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Place fields to display. | [optional parameter] [enum: `contained_within`, `country`, `country_code`, `full_name`, `geo`, `id`, `name`, `place_type`] |


### Return type
[**Get2TweetsSearchAllResponse**](Get2TweetsSearchAllResponse.md)

### Authorization
* **[BearerToken](auth.md#BearerToken)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`, `application/problem+json`

<a name="tweetsRecentSearch"></a>
# **tweetsRecentSearch**
```java
Mono<Get2TweetsSearchRecentResponse> TweetsApi.tweetsRecentSearch(querystartTimeendTimesinceIduntilIdmaxResultsnextTokenpaginationTokensortOrdertweetFieldsexpansionsmediaFieldspollFieldsuserFieldsplaceFields)
```

Recent search

Returns Tweets from the last 7 days that match a search query.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **query** | `String`| One query/rule/filter for matching Tweets. Refer to https://t.co/rulelength to identify the max query length. | |
| **startTime** | `OffsetDateTime`| YYYY-MM-DDTHH:mm:ssZ. The oldest UTC timestamp from which the Tweets will be provided. Timestamp is in second granularity and is inclusive (i.e. 12:00:01 includes the first second of the minute). | [optional parameter] |
| **endTime** | `OffsetDateTime`| YYYY-MM-DDTHH:mm:ssZ. The newest, most recent UTC timestamp to which the Tweets will be provided. Timestamp is in second granularity and is exclusive (i.e. 12:00:01 excludes the first second of the minute). | [optional parameter] |
| **sinceId** | `String`| Returns results with a Tweet ID greater than (that is, more recent than) the specified ID. | [optional parameter] |
| **untilId** | `String`| Returns results with a Tweet ID less than (that is, older than) the specified ID. | [optional parameter] |
| **maxResults** | `Integer`| The maximum number of search results to be returned by a request. | [optional parameter] [default to `10`] |
| **nextToken** | `String`| This parameter is used to get the next &#39;page&#39; of results. The value used with the parameter is pulled directly from the response provided by the API, and should not be modified. | [optional parameter] |
| **paginationToken** | `String`| This parameter is used to get the next &#39;page&#39; of results. The value used with the parameter is pulled directly from the response provided by the API, and should not be modified. | [optional parameter] |
| **sortOrder** | `String`| This order in which to return results. | [optional parameter] [enum: `recency`, `relevancy`] |
| **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional parameter] [enum: `attachments`, `author_id`, `context_annotations`, `conversation_id`, `created_at`, `edit_controls`, `edit_history_tweet_ids`, `entities`, `geo`, `id`, `in_reply_to_user_id`, `lang`, `non_public_metrics`, `organic_metrics`, `possibly_sensitive`, `promoted_metrics`, `public_metrics`, `referenced_tweets`, `reply_settings`, `source`, `text`, `withheld`] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional parameter] [enum: `attachments.media_keys`, `attachments.poll_ids`, `author_id`, `edit_history_tweet_ids`, `entities.mentions.username`, `geo.place_id`, `in_reply_to_user_id`, `referenced_tweets.id`, `referenced_tweets.id.author_id`] |
| **mediaFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Media fields to display. | [optional parameter] [enum: `alt_text`, `duration_ms`, `height`, `media_key`, `non_public_metrics`, `organic_metrics`, `preview_image_url`, `promoted_metrics`, `public_metrics`, `type`, `url`, `variants`, `width`] |
| **pollFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Poll fields to display. | [optional parameter] [enum: `duration_minutes`, `end_datetime`, `id`, `options`, `voting_status`] |
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional parameter] [enum: `created_at`, `description`, `entities`, `id`, `location`, `name`, `pinned_tweet_id`, `profile_image_url`, `protected`, `public_metrics`, `url`, `username`, `verified`, `withheld`] |
| **placeFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Place fields to display. | [optional parameter] [enum: `contained_within`, `country`, `country_code`, `full_name`, `geo`, `id`, `name`, `place_type`] |


### Return type
[**Get2TweetsSearchRecentResponse**](Get2TweetsSearchRecentResponse.md)

### Authorization
* **[BearerToken](auth.md#BearerToken)**
* **[OAuth2UserToken](auth.md#OAuth2UserToken)**, scopes: `tweet.read`, `users.read`
* **[UserToken](auth.md#UserToken)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`, `application/problem+json`

<a name="usersIdLike"></a>
# **usersIdLike**
```java
Mono<UsersLikesCreateResponse> TweetsApi.usersIdLike(idusersLikesCreateRequest)
```

Causes the User (in the path) to like the specified Tweet

Causes the User (in the path) to like the specified Tweet. The User in the path must match the User context authorizing the request.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | `String`| The ID of the authenticated source User that is requesting to like the Tweet. | |
| **usersLikesCreateRequest** | [**UsersLikesCreateRequest**](UsersLikesCreateRequest.md)|  | [optional parameter] |


### Return type
[**UsersLikesCreateResponse**](UsersLikesCreateResponse.md)

### Authorization
* **[OAuth2UserToken](auth.md#OAuth2UserToken)**, scopes: `like.write`, `tweet.read`, `users.read`
* **[UserToken](auth.md#UserToken)**

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`, `application/problem+json`

<a name="usersIdLikedTweets"></a>
# **usersIdLikedTweets**
```java
Mono<Get2UsersIdLikedTweetsResponse> TweetsApi.usersIdLikedTweets(idmaxResultspaginationTokentweetFieldsexpansionsmediaFieldspollFieldsuserFieldsplaceFields)
```

Returns Tweet objects liked by the provided User ID

Returns a list of Tweets liked by the provided User ID

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | `String`| The ID of the User to lookup. | |
| **maxResults** | `Integer`| The maximum number of results. | [optional parameter] |
| **paginationToken** | `String`| This parameter is used to get the next &#39;page&#39; of results. | [optional parameter] |
| **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional parameter] [enum: `attachments`, `author_id`, `context_annotations`, `conversation_id`, `created_at`, `edit_controls`, `edit_history_tweet_ids`, `entities`, `geo`, `id`, `in_reply_to_user_id`, `lang`, `non_public_metrics`, `organic_metrics`, `possibly_sensitive`, `promoted_metrics`, `public_metrics`, `referenced_tweets`, `reply_settings`, `source`, `text`, `withheld`] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional parameter] [enum: `attachments.media_keys`, `attachments.poll_ids`, `author_id`, `edit_history_tweet_ids`, `entities.mentions.username`, `geo.place_id`, `in_reply_to_user_id`, `referenced_tweets.id`, `referenced_tweets.id.author_id`] |
| **mediaFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Media fields to display. | [optional parameter] [enum: `alt_text`, `duration_ms`, `height`, `media_key`, `non_public_metrics`, `organic_metrics`, `preview_image_url`, `promoted_metrics`, `public_metrics`, `type`, `url`, `variants`, `width`] |
| **pollFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Poll fields to display. | [optional parameter] [enum: `duration_minutes`, `end_datetime`, `id`, `options`, `voting_status`] |
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional parameter] [enum: `created_at`, `description`, `entities`, `id`, `location`, `name`, `pinned_tweet_id`, `profile_image_url`, `protected`, `public_metrics`, `url`, `username`, `verified`, `withheld`] |
| **placeFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Place fields to display. | [optional parameter] [enum: `contained_within`, `country`, `country_code`, `full_name`, `geo`, `id`, `name`, `place_type`] |


### Return type
[**Get2UsersIdLikedTweetsResponse**](Get2UsersIdLikedTweetsResponse.md)

### Authorization
* **[BearerToken](auth.md#BearerToken)**
* **[OAuth2UserToken](auth.md#OAuth2UserToken)**, scopes: `like.read`, `tweet.read`, `users.read`
* **[UserToken](auth.md#UserToken)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`, `application/problem+json`

<a name="usersIdMentions"></a>
# **usersIdMentions**
```java
Mono<Get2UsersIdMentionsResponse> TweetsApi.usersIdMentions(idsinceIduntilIdmaxResultspaginationTokenstartTimeendTimetweetFieldsexpansionsmediaFieldspollFieldsuserFieldsplaceFields)
```

User mention timeline by User ID

Returns Tweet objects that mention username associated to the provided User ID

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | `String`| The ID of the User to lookup. | |
| **sinceId** | `String`| The minimum Tweet ID to be included in the result set. This parameter takes precedence over start_time if both are specified. | [optional parameter] |
| **untilId** | `String`| The maximum Tweet ID to be included in the result set. This parameter takes precedence over end_time if both are specified. | [optional parameter] |
| **maxResults** | `Integer`| The maximum number of results. | [optional parameter] |
| **paginationToken** | `String`| This parameter is used to get the next &#39;page&#39; of results. | [optional parameter] |
| **startTime** | `OffsetDateTime`| YYYY-MM-DDTHH:mm:ssZ. The earliest UTC timestamp from which the Tweets will be provided. The since_id parameter takes precedence if it is also specified. | [optional parameter] |
| **endTime** | `OffsetDateTime`| YYYY-MM-DDTHH:mm:ssZ. The latest UTC timestamp to which the Tweets will be provided. The until_id parameter takes precedence if it is also specified. | [optional parameter] |
| **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional parameter] [enum: `attachments`, `author_id`, `context_annotations`, `conversation_id`, `created_at`, `edit_controls`, `edit_history_tweet_ids`, `entities`, `geo`, `id`, `in_reply_to_user_id`, `lang`, `non_public_metrics`, `organic_metrics`, `possibly_sensitive`, `promoted_metrics`, `public_metrics`, `referenced_tweets`, `reply_settings`, `source`, `text`, `withheld`] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional parameter] [enum: `attachments.media_keys`, `attachments.poll_ids`, `author_id`, `edit_history_tweet_ids`, `entities.mentions.username`, `geo.place_id`, `in_reply_to_user_id`, `referenced_tweets.id`, `referenced_tweets.id.author_id`] |
| **mediaFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Media fields to display. | [optional parameter] [enum: `alt_text`, `duration_ms`, `height`, `media_key`, `non_public_metrics`, `organic_metrics`, `preview_image_url`, `promoted_metrics`, `public_metrics`, `type`, `url`, `variants`, `width`] |
| **pollFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Poll fields to display. | [optional parameter] [enum: `duration_minutes`, `end_datetime`, `id`, `options`, `voting_status`] |
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional parameter] [enum: `created_at`, `description`, `entities`, `id`, `location`, `name`, `pinned_tweet_id`, `profile_image_url`, `protected`, `public_metrics`, `url`, `username`, `verified`, `withheld`] |
| **placeFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Place fields to display. | [optional parameter] [enum: `contained_within`, `country`, `country_code`, `full_name`, `geo`, `id`, `name`, `place_type`] |


### Return type
[**Get2UsersIdMentionsResponse**](Get2UsersIdMentionsResponse.md)

### Authorization
* **[BearerToken](auth.md#BearerToken)**
* **[OAuth2UserToken](auth.md#OAuth2UserToken)**, scopes: `tweet.read`, `users.read`
* **[UserToken](auth.md#UserToken)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`, `application/problem+json`

<a name="usersIdRetweets"></a>
# **usersIdRetweets**
```java
Mono<UsersRetweetsCreateResponse> TweetsApi.usersIdRetweets(idusersRetweetsCreateRequest)
```

Causes the User (in the path) to retweet the specified Tweet.

Causes the User (in the path) to retweet the specified Tweet. The User in the path must match the User context authorizing the request.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | `String`| The ID of the authenticated source User that is requesting to retweet the Tweet. | |
| **usersRetweetsCreateRequest** | [**UsersRetweetsCreateRequest**](UsersRetweetsCreateRequest.md)|  | [optional parameter] |


### Return type
[**UsersRetweetsCreateResponse**](UsersRetweetsCreateResponse.md)

### Authorization
* **[OAuth2UserToken](auth.md#OAuth2UserToken)**, scopes: `tweet.read`, `tweet.write`, `users.read`
* **[UserToken](auth.md#UserToken)**

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`, `application/problem+json`

<a name="usersIdTimeline"></a>
# **usersIdTimeline**
```java
Mono<Get2UsersIdTimelinesReverseChronologicalResponse> TweetsApi.usersIdTimeline(idsinceIduntilIdmaxResultspaginationTokenexcludestartTimeendTimetweetFieldsexpansionsmediaFieldspollFieldsuserFieldsplaceFields)
```

User home timeline by User ID

Returns Tweet objects that appears in the provided User ID&#39;s home timeline

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | `String`| The ID of the authenticated source User to list Reverse Chronological Timeline Tweets of. | |
| **sinceId** | `String`| The minimum Tweet ID to be included in the result set. This parameter takes precedence over start_time if both are specified. | [optional parameter] |
| **untilId** | `String`| The maximum Tweet ID to be included in the result set. This parameter takes precedence over end_time if both are specified. | [optional parameter] |
| **maxResults** | `Integer`| The maximum number of results. | [optional parameter] |
| **paginationToken** | `String`| This parameter is used to get the next &#39;page&#39; of results. | [optional parameter] |
| **exclude** | [**Set&lt;String&gt;**](String.md)| The set of entities to exclude (e.g. &#39;replies&#39; or &#39;retweets&#39;). | [optional parameter] [enum: `replies`, `retweets`] |
| **startTime** | `OffsetDateTime`| YYYY-MM-DDTHH:mm:ssZ. The earliest UTC timestamp from which the Tweets will be provided. The since_id parameter takes precedence if it is also specified. | [optional parameter] |
| **endTime** | `OffsetDateTime`| YYYY-MM-DDTHH:mm:ssZ. The latest UTC timestamp to which the Tweets will be provided. The until_id parameter takes precedence if it is also specified. | [optional parameter] |
| **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional parameter] [enum: `attachments`, `author_id`, `context_annotations`, `conversation_id`, `created_at`, `edit_controls`, `edit_history_tweet_ids`, `entities`, `geo`, `id`, `in_reply_to_user_id`, `lang`, `non_public_metrics`, `organic_metrics`, `possibly_sensitive`, `promoted_metrics`, `public_metrics`, `referenced_tweets`, `reply_settings`, `source`, `text`, `withheld`] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional parameter] [enum: `attachments.media_keys`, `attachments.poll_ids`, `author_id`, `edit_history_tweet_ids`, `entities.mentions.username`, `geo.place_id`, `in_reply_to_user_id`, `referenced_tweets.id`, `referenced_tweets.id.author_id`] |
| **mediaFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Media fields to display. | [optional parameter] [enum: `alt_text`, `duration_ms`, `height`, `media_key`, `non_public_metrics`, `organic_metrics`, `preview_image_url`, `promoted_metrics`, `public_metrics`, `type`, `url`, `variants`, `width`] |
| **pollFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Poll fields to display. | [optional parameter] [enum: `duration_minutes`, `end_datetime`, `id`, `options`, `voting_status`] |
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional parameter] [enum: `created_at`, `description`, `entities`, `id`, `location`, `name`, `pinned_tweet_id`, `profile_image_url`, `protected`, `public_metrics`, `url`, `username`, `verified`, `withheld`] |
| **placeFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Place fields to display. | [optional parameter] [enum: `contained_within`, `country`, `country_code`, `full_name`, `geo`, `id`, `name`, `place_type`] |


### Return type
[**Get2UsersIdTimelinesReverseChronologicalResponse**](Get2UsersIdTimelinesReverseChronologicalResponse.md)

### Authorization
* **[OAuth2UserToken](auth.md#OAuth2UserToken)**, scopes: `tweet.read`, `users.read`
* **[UserToken](auth.md#UserToken)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`, `application/problem+json`

<a name="usersIdTweets"></a>
# **usersIdTweets**
```java
Mono<Get2UsersIdTweetsResponse> TweetsApi.usersIdTweets(idsinceIduntilIdmaxResultspaginationTokenexcludestartTimeendTimetweetFieldsexpansionsmediaFieldspollFieldsuserFieldsplaceFields)
```

User Tweets timeline by User ID

Returns a list of Tweets authored by the provided User ID

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | `String`| The ID of the User to lookup. | |
| **sinceId** | `String`| The minimum Tweet ID to be included in the result set. This parameter takes precedence over start_time if both are specified. | [optional parameter] |
| **untilId** | `String`| The maximum Tweet ID to be included in the result set. This parameter takes precedence over end_time if both are specified. | [optional parameter] |
| **maxResults** | `Integer`| The maximum number of results. | [optional parameter] |
| **paginationToken** | `String`| This parameter is used to get the next &#39;page&#39; of results. | [optional parameter] |
| **exclude** | [**Set&lt;String&gt;**](String.md)| The set of entities to exclude (e.g. &#39;replies&#39; or &#39;retweets&#39;). | [optional parameter] [enum: `replies`, `retweets`] |
| **startTime** | `OffsetDateTime`| YYYY-MM-DDTHH:mm:ssZ. The earliest UTC timestamp from which the Tweets will be provided. The since_id parameter takes precedence if it is also specified. | [optional parameter] |
| **endTime** | `OffsetDateTime`| YYYY-MM-DDTHH:mm:ssZ. The latest UTC timestamp to which the Tweets will be provided. The until_id parameter takes precedence if it is also specified. | [optional parameter] |
| **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional parameter] [enum: `attachments`, `author_id`, `context_annotations`, `conversation_id`, `created_at`, `edit_controls`, `edit_history_tweet_ids`, `entities`, `geo`, `id`, `in_reply_to_user_id`, `lang`, `non_public_metrics`, `organic_metrics`, `possibly_sensitive`, `promoted_metrics`, `public_metrics`, `referenced_tweets`, `reply_settings`, `source`, `text`, `withheld`] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional parameter] [enum: `attachments.media_keys`, `attachments.poll_ids`, `author_id`, `edit_history_tweet_ids`, `entities.mentions.username`, `geo.place_id`, `in_reply_to_user_id`, `referenced_tweets.id`, `referenced_tweets.id.author_id`] |
| **mediaFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Media fields to display. | [optional parameter] [enum: `alt_text`, `duration_ms`, `height`, `media_key`, `non_public_metrics`, `organic_metrics`, `preview_image_url`, `promoted_metrics`, `public_metrics`, `type`, `url`, `variants`, `width`] |
| **pollFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Poll fields to display. | [optional parameter] [enum: `duration_minutes`, `end_datetime`, `id`, `options`, `voting_status`] |
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional parameter] [enum: `created_at`, `description`, `entities`, `id`, `location`, `name`, `pinned_tweet_id`, `profile_image_url`, `protected`, `public_metrics`, `url`, `username`, `verified`, `withheld`] |
| **placeFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Place fields to display. | [optional parameter] [enum: `contained_within`, `country`, `country_code`, `full_name`, `geo`, `id`, `name`, `place_type`] |


### Return type
[**Get2UsersIdTweetsResponse**](Get2UsersIdTweetsResponse.md)

### Authorization
* **[BearerToken](auth.md#BearerToken)**
* **[OAuth2UserToken](auth.md#OAuth2UserToken)**, scopes: `tweet.read`, `users.read`
* **[UserToken](auth.md#UserToken)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`, `application/problem+json`

<a name="usersIdUnlike"></a>
# **usersIdUnlike**
```java
Mono<UsersLikesDeleteResponse> TweetsApi.usersIdUnlike(idtweetId)
```

Causes the User (in the path) to unlike the specified Tweet

Causes the User (in the path) to unlike the specified Tweet. The User must match the User context authorizing the request

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | `String`| The ID of the authenticated source User that is requesting to unlike the Tweet. | |
| **tweetId** | `String`| The ID of the Tweet that the User is requesting to unlike. | |


### Return type
[**UsersLikesDeleteResponse**](UsersLikesDeleteResponse.md)

### Authorization
* **[OAuth2UserToken](auth.md#OAuth2UserToken)**, scopes: `like.write`, `tweet.read`, `users.read`
* **[UserToken](auth.md#UserToken)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`, `application/problem+json`

<a name="usersIdUnretweets"></a>
# **usersIdUnretweets**
```java
Mono<UsersRetweetsDeleteResponse> TweetsApi.usersIdUnretweets(idsourceTweetId)
```

Causes the User (in the path) to unretweet the specified Tweet

Causes the User (in the path) to unretweet the specified Tweet. The User must match the User context authorizing the request

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | `String`| The ID of the authenticated source User that is requesting to retweet the Tweet. | |
| **sourceTweetId** | `String`| The ID of the Tweet that the User is requesting to unretweet. | |


### Return type
[**UsersRetweetsDeleteResponse**](UsersRetweetsDeleteResponse.md)

### Authorization
* **[OAuth2UserToken](auth.md#OAuth2UserToken)**, scopes: `tweet.read`, `tweet.write`, `users.read`
* **[UserToken](auth.md#UserToken)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`, `application/problem+json`

