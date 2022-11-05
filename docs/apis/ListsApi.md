# ListsApi

All URIs are relative to *https://api.twitter.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getUserListMemberships**](ListsApi.md#getUserListMemberships) | **GET** /2/users/{id}/list_memberships | Get a User&#39;s List Memberships |
| [**listAddMember**](ListsApi.md#listAddMember) | **POST** /2/lists/{id}/members | Add a List member |
| [**listIdCreate**](ListsApi.md#listIdCreate) | **POST** /2/lists | Create List |
| [**listIdDelete**](ListsApi.md#listIdDelete) | **DELETE** /2/lists/{id} | Delete List |
| [**listIdGet**](ListsApi.md#listIdGet) | **GET** /2/lists/{id} | List lookup by List ID. |
| [**listIdUpdate**](ListsApi.md#listIdUpdate) | **PUT** /2/lists/{id} | Update List. |
| [**listRemoveMember**](ListsApi.md#listRemoveMember) | **DELETE** /2/lists/{id}/members/{user_id} | Remove a List member |
| [**listUserFollow**](ListsApi.md#listUserFollow) | **POST** /2/users/{id}/followed_lists | Follow a List |
| [**listUserOwnedLists**](ListsApi.md#listUserOwnedLists) | **GET** /2/users/{id}/owned_lists | Get a User&#39;s Owned Lists. |
| [**listUserPin**](ListsApi.md#listUserPin) | **POST** /2/users/{id}/pinned_lists | Pin a List |
| [**listUserPinnedLists**](ListsApi.md#listUserPinnedLists) | **GET** /2/users/{id}/pinned_lists | Get a User&#39;s Pinned Lists |
| [**listUserUnfollow**](ListsApi.md#listUserUnfollow) | **DELETE** /2/users/{id}/followed_lists/{list_id} | Unfollow a List |
| [**listUserUnpin**](ListsApi.md#listUserUnpin) | **DELETE** /2/users/{id}/pinned_lists/{list_id} | Unpin a List |
| [**userFollowedLists**](ListsApi.md#userFollowedLists) | **GET** /2/users/{id}/followed_lists | Get User&#39;s Followed Lists |


## Creating ListsApi

To initiate an instance of `ListsApi`, you can use micronaut's `ApplicationContext`:
```java
/* imports
import io.micronaut.runtime.Micronaut;
import io.micronaut.context.ApplicationContext;
import example.micronaut.api.ListsApi;
*/

ApplicationContext context = Micronaut.run(/* ... */);
PetApi apiInstance = context.getBean(ListsApi.class);
```

Or the `@Inject` annotation:
```java
@Singleton
class MyClass {
    @Inject
    ListsApi listsApi;

    /* ... use the injected variable */
}
```
Note that the class needs to be annotated with one of Micronaut's [scope annotations](https://docs.micronaut.io/latest/guide/#scopes) like `Singleton` in order to be processed.

More information can be found inside [Inversion of Control guide section](https://docs.micronaut.io/latest/guide/#ioc).

<a name="getUserListMemberships"></a>
# **getUserListMemberships**
```java
Mono<Get2UsersIdListMembershipsResponse> ListsApi.getUserListMemberships(idmaxResultspaginationTokenlistFieldsexpansionsuserFields)
```

Get a User&#39;s List Memberships

Get a User&#39;s List Memberships.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | `String`| The ID of the User to lookup. | |
| **maxResults** | `Integer`| The maximum number of results. | [optional parameter] [default to `100`] |
| **paginationToken** | `String`| This parameter is used to get a specified &#39;page&#39; of results. | [optional parameter] |
| **listFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of List fields to display. | [optional parameter] [enum: `created_at`, `description`, `follower_count`, `id`, `member_count`, `name`, `owner_id`, `private`] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional parameter] [enum: `owner_id`] |
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional parameter] [enum: `created_at`, `description`, `entities`, `id`, `location`, `name`, `pinned_tweet_id`, `profile_image_url`, `protected`, `public_metrics`, `url`, `username`, `verified`, `withheld`] |


### Return type
[**Get2UsersIdListMembershipsResponse**](Get2UsersIdListMembershipsResponse.md)

### Authorization
* **[BearerToken](auth.md#BearerToken)**
* **[OAuth2UserToken](auth.md#OAuth2UserToken)**, scopes: `list.read`, `tweet.read`, `users.read`
* **[UserToken](auth.md#UserToken)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`, `application/problem+json`

<a name="listAddMember"></a>
# **listAddMember**
```java
Mono<ListMutateResponse> ListsApi.listAddMember(idlistAddUserRequest)
```

Add a List member

Causes a User to become a member of a List.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | `String`| The ID of the List for which to add a member. | |
| **listAddUserRequest** | [**ListAddUserRequest**](ListAddUserRequest.md)|  | [optional parameter] |


### Return type
[**ListMutateResponse**](ListMutateResponse.md)

### Authorization
* **[OAuth2UserToken](auth.md#OAuth2UserToken)**, scopes: `list.write`, `tweet.read`, `users.read`
* **[UserToken](auth.md#UserToken)**

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`, `application/problem+json`

<a name="listIdCreate"></a>
# **listIdCreate**
```java
Mono<ListCreateResponse> ListsApi.listIdCreate(listCreateRequest)
```

Create List

Creates a new List.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **listCreateRequest** | [**ListCreateRequest**](ListCreateRequest.md)|  | [optional parameter] |


### Return type
[**ListCreateResponse**](ListCreateResponse.md)

### Authorization
* **[OAuth2UserToken](auth.md#OAuth2UserToken)**, scopes: `list.read`, `list.write`, `tweet.read`, `users.read`
* **[UserToken](auth.md#UserToken)**

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`, `application/problem+json`

<a name="listIdDelete"></a>
# **listIdDelete**
```java
Mono<ListDeleteResponse> ListsApi.listIdDelete(id)
```

Delete List

Delete a List that you own.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | `String`| The ID of the List to delete. | |


### Return type
[**ListDeleteResponse**](ListDeleteResponse.md)

### Authorization
* **[OAuth2UserToken](auth.md#OAuth2UserToken)**, scopes: `list.write`, `tweet.read`, `users.read`
* **[UserToken](auth.md#UserToken)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`, `application/problem+json`

<a name="listIdGet"></a>
# **listIdGet**
```java
Mono<Get2ListsIdResponse> ListsApi.listIdGet(idlistFieldsexpansionsuserFields)
```

List lookup by List ID.

Returns a List.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | `String`| The ID of the List. | |
| **listFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of List fields to display. | [optional parameter] [enum: `created_at`, `description`, `follower_count`, `id`, `member_count`, `name`, `owner_id`, `private`] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional parameter] [enum: `owner_id`] |
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional parameter] [enum: `created_at`, `description`, `entities`, `id`, `location`, `name`, `pinned_tweet_id`, `profile_image_url`, `protected`, `public_metrics`, `url`, `username`, `verified`, `withheld`] |


### Return type
[**Get2ListsIdResponse**](Get2ListsIdResponse.md)

### Authorization
* **[BearerToken](auth.md#BearerToken)**
* **[OAuth2UserToken](auth.md#OAuth2UserToken)**, scopes: `list.read`, `tweet.read`, `users.read`
* **[UserToken](auth.md#UserToken)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`, `application/problem+json`

<a name="listIdUpdate"></a>
# **listIdUpdate**
```java
Mono<ListUpdateResponse> ListsApi.listIdUpdate(idlistUpdateRequest)
```

Update List.

Update a List that you own.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | `String`| The ID of the List to modify. | |
| **listUpdateRequest** | [**ListUpdateRequest**](ListUpdateRequest.md)|  | [optional parameter] |


### Return type
[**ListUpdateResponse**](ListUpdateResponse.md)

### Authorization
* **[OAuth2UserToken](auth.md#OAuth2UserToken)**, scopes: `list.write`, `tweet.read`, `users.read`
* **[UserToken](auth.md#UserToken)**

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`, `application/problem+json`

<a name="listRemoveMember"></a>
# **listRemoveMember**
```java
Mono<ListMutateResponse> ListsApi.listRemoveMember(iduserId)
```

Remove a List member

Causes a User to be removed from the members of a List.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | `String`| The ID of the List to remove a member. | |
| **userId** | `String`| The ID of User that will be removed from the List. | |


### Return type
[**ListMutateResponse**](ListMutateResponse.md)

### Authorization
* **[OAuth2UserToken](auth.md#OAuth2UserToken)**, scopes: `list.write`, `tweet.read`, `users.read`
* **[UserToken](auth.md#UserToken)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`, `application/problem+json`

<a name="listUserFollow"></a>
# **listUserFollow**
```java
Mono<ListFollowedResponse> ListsApi.listUserFollow(idlistFollowedRequest)
```

Follow a List

Causes a User to follow a List.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | `String`| The ID of the authenticated source User that will follow the List. | |
| **listFollowedRequest** | [**ListFollowedRequest**](ListFollowedRequest.md)|  | [optional parameter] |


### Return type
[**ListFollowedResponse**](ListFollowedResponse.md)

### Authorization
* **[OAuth2UserToken](auth.md#OAuth2UserToken)**, scopes: `list.write`, `tweet.read`, `users.read`
* **[UserToken](auth.md#UserToken)**

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`, `application/problem+json`

<a name="listUserOwnedLists"></a>
# **listUserOwnedLists**
```java
Mono<Get2UsersIdOwnedListsResponse> ListsApi.listUserOwnedLists(idmaxResultspaginationTokenlistFieldsexpansionsuserFields)
```

Get a User&#39;s Owned Lists.

Get a User&#39;s Owned Lists.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | `String`| The ID of the User to lookup. | |
| **maxResults** | `Integer`| The maximum number of results. | [optional parameter] [default to `100`] |
| **paginationToken** | `String`| This parameter is used to get a specified &#39;page&#39; of results. | [optional parameter] |
| **listFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of List fields to display. | [optional parameter] [enum: `created_at`, `description`, `follower_count`, `id`, `member_count`, `name`, `owner_id`, `private`] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional parameter] [enum: `owner_id`] |
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional parameter] [enum: `created_at`, `description`, `entities`, `id`, `location`, `name`, `pinned_tweet_id`, `profile_image_url`, `protected`, `public_metrics`, `url`, `username`, `verified`, `withheld`] |


### Return type
[**Get2UsersIdOwnedListsResponse**](Get2UsersIdOwnedListsResponse.md)

### Authorization
* **[BearerToken](auth.md#BearerToken)**
* **[OAuth2UserToken](auth.md#OAuth2UserToken)**, scopes: `list.read`, `tweet.read`, `users.read`
* **[UserToken](auth.md#UserToken)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`, `application/problem+json`

<a name="listUserPin"></a>
# **listUserPin**
```java
Mono<ListPinnedResponse> ListsApi.listUserPin(idlistPinnedRequest)
```

Pin a List

Causes a User to pin a List.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | `String`| The ID of the authenticated source User that will pin the List. | |
| **listPinnedRequest** | [**ListPinnedRequest**](ListPinnedRequest.md)|  | |


### Return type
[**ListPinnedResponse**](ListPinnedResponse.md)

### Authorization
* **[OAuth2UserToken](auth.md#OAuth2UserToken)**, scopes: `list.write`, `tweet.read`, `users.read`
* **[UserToken](auth.md#UserToken)**

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`, `application/problem+json`

<a name="listUserPinnedLists"></a>
# **listUserPinnedLists**
```java
Mono<Get2UsersIdPinnedListsResponse> ListsApi.listUserPinnedLists(idlistFieldsexpansionsuserFields)
```

Get a User&#39;s Pinned Lists

Get a User&#39;s Pinned Lists.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | `String`| The ID of the authenticated source User for whom to return results. | |
| **listFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of List fields to display. | [optional parameter] [enum: `created_at`, `description`, `follower_count`, `id`, `member_count`, `name`, `owner_id`, `private`] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional parameter] [enum: `owner_id`] |
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional parameter] [enum: `created_at`, `description`, `entities`, `id`, `location`, `name`, `pinned_tweet_id`, `profile_image_url`, `protected`, `public_metrics`, `url`, `username`, `verified`, `withheld`] |


### Return type
[**Get2UsersIdPinnedListsResponse**](Get2UsersIdPinnedListsResponse.md)

### Authorization
* **[OAuth2UserToken](auth.md#OAuth2UserToken)**, scopes: `list.read`, `tweet.read`, `users.read`
* **[UserToken](auth.md#UserToken)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`, `application/problem+json`

<a name="listUserUnfollow"></a>
# **listUserUnfollow**
```java
Mono<ListFollowedResponse> ListsApi.listUserUnfollow(idlistId)
```

Unfollow a List

Causes a User to unfollow a List.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | `String`| The ID of the authenticated source User that will unfollow the List. | |
| **listId** | `String`| The ID of the List to unfollow. | |


### Return type
[**ListFollowedResponse**](ListFollowedResponse.md)

### Authorization
* **[OAuth2UserToken](auth.md#OAuth2UserToken)**, scopes: `list.write`, `tweet.read`, `users.read`
* **[UserToken](auth.md#UserToken)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`, `application/problem+json`

<a name="listUserUnpin"></a>
# **listUserUnpin**
```java
Mono<ListUnpinResponse> ListsApi.listUserUnpin(idlistId)
```

Unpin a List

Causes a User to remove a pinned List.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | `String`| The ID of the authenticated source User for whom to return results. | |
| **listId** | `String`| The ID of the List to unpin. | |


### Return type
[**ListUnpinResponse**](ListUnpinResponse.md)

### Authorization
* **[OAuth2UserToken](auth.md#OAuth2UserToken)**, scopes: `list.write`, `tweet.read`, `users.read`
* **[UserToken](auth.md#UserToken)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`, `application/problem+json`

<a name="userFollowedLists"></a>
# **userFollowedLists**
```java
Mono<Get2UsersIdFollowedListsResponse> ListsApi.userFollowedLists(idmaxResultspaginationTokenlistFieldsexpansionsuserFields)
```

Get User&#39;s Followed Lists

Returns a User&#39;s followed Lists.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | `String`| The ID of the User to lookup. | |
| **maxResults** | `Integer`| The maximum number of results. | [optional parameter] [default to `100`] |
| **paginationToken** | `String`| This parameter is used to get a specified &#39;page&#39; of results. | [optional parameter] |
| **listFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of List fields to display. | [optional parameter] [enum: `created_at`, `description`, `follower_count`, `id`, `member_count`, `name`, `owner_id`, `private`] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional parameter] [enum: `owner_id`] |
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional parameter] [enum: `created_at`, `description`, `entities`, `id`, `location`, `name`, `pinned_tweet_id`, `profile_image_url`, `protected`, `public_metrics`, `url`, `username`, `verified`, `withheld`] |


### Return type
[**Get2UsersIdFollowedListsResponse**](Get2UsersIdFollowedListsResponse.md)

### Authorization
* **[BearerToken](auth.md#BearerToken)**
* **[OAuth2UserToken](auth.md#OAuth2UserToken)**, scopes: `list.read`, `tweet.read`, `users.read`
* **[UserToken](auth.md#UserToken)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`, `application/problem+json`

