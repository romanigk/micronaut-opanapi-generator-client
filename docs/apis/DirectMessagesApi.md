# DirectMessagesApi

All URIs are relative to *https://api.twitter.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**dmConversationByIdEventIdCreate**](DirectMessagesApi.md#dmConversationByIdEventIdCreate) | **POST** /2/dm_conversations/{dm_conversation_id}/messages | Send a new message to a DM Conversation |
| [**dmConversationIdCreate**](DirectMessagesApi.md#dmConversationIdCreate) | **POST** /2/dm_conversations | Create a new DM Conversation |
| [**dmConversationWithUserEventIdCreate**](DirectMessagesApi.md#dmConversationWithUserEventIdCreate) | **POST** /2/dm_conversations/with/{participant_id}/messages | Send a new message to a user |
| [**getDmConversationsIdDmEvents**](DirectMessagesApi.md#getDmConversationsIdDmEvents) | **GET** /2/dm_conversations/{id}/dm_events | Get DM Events for a DM Conversation |
| [**getDmConversationsWithParticipantIdDmEvents**](DirectMessagesApi.md#getDmConversationsWithParticipantIdDmEvents) | **GET** /2/dm_conversations/with/{participant_id}/dm_events | Get DM Events for a DM Conversation |
| [**getDmEvents**](DirectMessagesApi.md#getDmEvents) | **GET** /2/dm_events | Get recent DM Events |


## Creating DirectMessagesApi

To initiate an instance of `DirectMessagesApi`, you can use micronaut's `ApplicationContext`:
```java
/* imports
import io.micronaut.runtime.Micronaut;
import io.micronaut.context.ApplicationContext;
import example.micronaut.api.DirectMessagesApi;
*/

ApplicationContext context = Micronaut.run(/* ... */);
PetApi apiInstance = context.getBean(DirectMessagesApi.class);
```

Or the `@Inject` annotation:
```java
@Singleton
class MyClass {
    @Inject
    DirectMessagesApi directMessagesApi;

    /* ... use the injected variable */
}
```
Note that the class needs to be annotated with one of Micronaut's [scope annotations](https://docs.micronaut.io/latest/guide/#scopes) like `Singleton` in order to be processed.

More information can be found inside [Inversion of Control guide section](https://docs.micronaut.io/latest/guide/#ioc).

<a name="dmConversationByIdEventIdCreate"></a>
# **dmConversationByIdEventIdCreate**
```java
Mono<CreateDmEventResponse> DirectMessagesApi.dmConversationByIdEventIdCreate(dmConversationIdcreateMessageRequest)
```

Send a new message to a DM Conversation

Creates a new message for a DM Conversation specified by DM Conversation ID

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **dmConversationId** | `String`| The DM Conversation ID. | |
| **createMessageRequest** | [**CreateMessageRequest**](CreateMessageRequest.md)|  | [optional parameter] |


### Return type
[**CreateDmEventResponse**](CreateDmEventResponse.md)

### Authorization
* **[OAuth2UserToken](auth.md#OAuth2UserToken)**, scopes: `dm.write`, `tweet.read`, `users.read`
* **[UserToken](auth.md#UserToken)**

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`, `application/problem+json`

<a name="dmConversationIdCreate"></a>
# **dmConversationIdCreate**
```java
Mono<CreateDmEventResponse> DirectMessagesApi.dmConversationIdCreate(createDmConversationRequest)
```

Create a new DM Conversation

Creates a new DM Conversation.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createDmConversationRequest** | [**CreateDmConversationRequest**](CreateDmConversationRequest.md)|  | [optional parameter] |


### Return type
[**CreateDmEventResponse**](CreateDmEventResponse.md)

### Authorization
* **[OAuth2UserToken](auth.md#OAuth2UserToken)**, scopes: `dm.write`, `tweet.read`, `users.read`
* **[UserToken](auth.md#UserToken)**

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`, `application/problem+json`

<a name="dmConversationWithUserEventIdCreate"></a>
# **dmConversationWithUserEventIdCreate**
```java
Mono<CreateDmEventResponse> DirectMessagesApi.dmConversationWithUserEventIdCreate(participantIdcreateMessageRequest)
```

Send a new message to a user

Creates a new message for a DM Conversation with a participant user by ID

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **participantId** | `String`| The ID of the recipient user that will receive the DM. | |
| **createMessageRequest** | [**CreateMessageRequest**](CreateMessageRequest.md)|  | [optional parameter] |


### Return type
[**CreateDmEventResponse**](CreateDmEventResponse.md)

### Authorization
* **[OAuth2UserToken](auth.md#OAuth2UserToken)**, scopes: `dm.write`, `tweet.read`, `users.read`
* **[UserToken](auth.md#UserToken)**

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`, `application/problem+json`

<a name="getDmConversationsIdDmEvents"></a>
# **getDmConversationsIdDmEvents**
```java
Mono<Get2DmConversationsIdDmEventsResponse> DirectMessagesApi.getDmConversationsIdDmEvents(idmaxResultspaginationTokeneventTypesdmEventFieldsexpansionsmediaFieldsuserFieldstweetFields)
```

Get DM Events for a DM Conversation

Returns DM Events for a DM Conversation

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | `String`| The DM Conversation ID. | |
| **maxResults** | `Integer`| The maximum number of results. | [optional parameter] [default to `100`] |
| **paginationToken** | `String`| This parameter is used to get a specified &#39;page&#39; of results. | [optional parameter] |
| **eventTypes** | [**Set&lt;String&gt;**](String.md)| The set of event_types to include in the results. | [optional parameter] [default to `MessageCreate,ParticipantsLeave,ParticipantsJoin`] [enum: `MessageCreate`, `ParticipantsJoin`, `ParticipantsLeave`] |
| **dmEventFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of DmEvent fields to display. | [optional parameter] [enum: `attachments`, `created_at`, `dm_conversation_id`, `event_type`, `id`, `participant_ids`, `referenced_tweets`, `sender_id`, `text`] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional parameter] [enum: `attachments.media_keys`, `participant_ids`, `referenced_tweets.id`, `sender_id`] |
| **mediaFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Media fields to display. | [optional parameter] [enum: `alt_text`, `duration_ms`, `height`, `media_key`, `non_public_metrics`, `organic_metrics`, `preview_image_url`, `promoted_metrics`, `public_metrics`, `type`, `url`, `variants`, `width`] |
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional parameter] [enum: `created_at`, `description`, `entities`, `id`, `location`, `name`, `pinned_tweet_id`, `profile_image_url`, `protected`, `public_metrics`, `url`, `username`, `verified`, `withheld`] |
| **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional parameter] [enum: `attachments`, `author_id`, `context_annotations`, `conversation_id`, `created_at`, `edit_controls`, `edit_history_tweet_ids`, `entities`, `geo`, `id`, `in_reply_to_user_id`, `lang`, `non_public_metrics`, `organic_metrics`, `possibly_sensitive`, `promoted_metrics`, `public_metrics`, `referenced_tweets`, `reply_settings`, `source`, `text`, `withheld`] |


### Return type
[**Get2DmConversationsIdDmEventsResponse**](Get2DmConversationsIdDmEventsResponse.md)

### Authorization
* **[OAuth2UserToken](auth.md#OAuth2UserToken)**, scopes: `dm.read`, `tweet.read`, `users.read`
* **[UserToken](auth.md#UserToken)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`, `application/problem+json`

<a name="getDmConversationsWithParticipantIdDmEvents"></a>
# **getDmConversationsWithParticipantIdDmEvents**
```java
Mono<Get2DmConversationsWithParticipantIdDmEventsResponse> DirectMessagesApi.getDmConversationsWithParticipantIdDmEvents(participantIdmaxResultspaginationTokeneventTypesdmEventFieldsexpansionsmediaFieldsuserFieldstweetFields)
```

Get DM Events for a DM Conversation

Returns DM Events for a DM Conversation

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **participantId** | `String`| The ID of the participant user for the One to One DM conversation. | |
| **maxResults** | `Integer`| The maximum number of results. | [optional parameter] [default to `100`] |
| **paginationToken** | `String`| This parameter is used to get a specified &#39;page&#39; of results. | [optional parameter] |
| **eventTypes** | [**Set&lt;String&gt;**](String.md)| The set of event_types to include in the results. | [optional parameter] [default to `MessageCreate,ParticipantsLeave,ParticipantsJoin`] [enum: `MessageCreate`, `ParticipantsJoin`, `ParticipantsLeave`] |
| **dmEventFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of DmEvent fields to display. | [optional parameter] [enum: `attachments`, `created_at`, `dm_conversation_id`, `event_type`, `id`, `participant_ids`, `referenced_tweets`, `sender_id`, `text`] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional parameter] [enum: `attachments.media_keys`, `participant_ids`, `referenced_tweets.id`, `sender_id`] |
| **mediaFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Media fields to display. | [optional parameter] [enum: `alt_text`, `duration_ms`, `height`, `media_key`, `non_public_metrics`, `organic_metrics`, `preview_image_url`, `promoted_metrics`, `public_metrics`, `type`, `url`, `variants`, `width`] |
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional parameter] [enum: `created_at`, `description`, `entities`, `id`, `location`, `name`, `pinned_tweet_id`, `profile_image_url`, `protected`, `public_metrics`, `url`, `username`, `verified`, `withheld`] |
| **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional parameter] [enum: `attachments`, `author_id`, `context_annotations`, `conversation_id`, `created_at`, `edit_controls`, `edit_history_tweet_ids`, `entities`, `geo`, `id`, `in_reply_to_user_id`, `lang`, `non_public_metrics`, `organic_metrics`, `possibly_sensitive`, `promoted_metrics`, `public_metrics`, `referenced_tweets`, `reply_settings`, `source`, `text`, `withheld`] |


### Return type
[**Get2DmConversationsWithParticipantIdDmEventsResponse**](Get2DmConversationsWithParticipantIdDmEventsResponse.md)

### Authorization
* **[OAuth2UserToken](auth.md#OAuth2UserToken)**, scopes: `dm.read`, `tweet.read`, `users.read`
* **[UserToken](auth.md#UserToken)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`, `application/problem+json`

<a name="getDmEvents"></a>
# **getDmEvents**
```java
Mono<Get2DmEventsResponse> DirectMessagesApi.getDmEvents(maxResultspaginationTokeneventTypesdmEventFieldsexpansionsmediaFieldsuserFieldstweetFields)
```

Get recent DM Events

Returns recent DM Events across DM conversations

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **maxResults** | `Integer`| The maximum number of results. | [optional parameter] [default to `100`] |
| **paginationToken** | `String`| This parameter is used to get a specified &#39;page&#39; of results. | [optional parameter] |
| **eventTypes** | [**Set&lt;String&gt;**](String.md)| The set of event_types to include in the results. | [optional parameter] [default to `MessageCreate,ParticipantsLeave,ParticipantsJoin`] [enum: `MessageCreate`, `ParticipantsJoin`, `ParticipantsLeave`] |
| **dmEventFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of DmEvent fields to display. | [optional parameter] [enum: `attachments`, `created_at`, `dm_conversation_id`, `event_type`, `id`, `participant_ids`, `referenced_tweets`, `sender_id`, `text`] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional parameter] [enum: `attachments.media_keys`, `participant_ids`, `referenced_tweets.id`, `sender_id`] |
| **mediaFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Media fields to display. | [optional parameter] [enum: `alt_text`, `duration_ms`, `height`, `media_key`, `non_public_metrics`, `organic_metrics`, `preview_image_url`, `promoted_metrics`, `public_metrics`, `type`, `url`, `variants`, `width`] |
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional parameter] [enum: `created_at`, `description`, `entities`, `id`, `location`, `name`, `pinned_tweet_id`, `profile_image_url`, `protected`, `public_metrics`, `url`, `username`, `verified`, `withheld`] |
| **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional parameter] [enum: `attachments`, `author_id`, `context_annotations`, `conversation_id`, `created_at`, `edit_controls`, `edit_history_tweet_ids`, `entities`, `geo`, `id`, `in_reply_to_user_id`, `lang`, `non_public_metrics`, `organic_metrics`, `possibly_sensitive`, `promoted_metrics`, `public_metrics`, `referenced_tweets`, `reply_settings`, `source`, `text`, `withheld`] |


### Return type
[**Get2DmEventsResponse**](Get2DmEventsResponse.md)

### Authorization
* **[OAuth2UserToken](auth.md#OAuth2UserToken)**, scopes: `dm.read`, `tweet.read`, `users.read`
* **[UserToken](auth.md#UserToken)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`, `application/problem+json`

