

# User

The Twitter User object.

The class is defined in **[User.java](../../src/main/java/example/micronaut/model/User.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createdAt** | `OffsetDateTime` | Creation time of this User. |  [optional property]
**description** | `String` | The text of this User&#39;s profile description (also known as bio), if the User provided one. |  [optional property]
**entities** | [`UserEntities`](UserEntities.md) |  |  [optional property]
**id** | `String` | Unique identifier of this User. This is returned as a string in order to avoid complications with languages and tools that cannot handle large integers. | 
**location** | `String` | The location specified in the User&#39;s profile, if the User provided one. As this is a freeform value, it may not indicate a valid location, but it may be fuzzily evaluated when performing searches with location queries. |  [optional property]
**name** | `String` | The friendly name of this User, as shown on their profile. | 
**pinnedTweetId** | `String` | Unique identifier of this Tweet. This is returned as a string in order to avoid complications with languages and tools that cannot handle large integers. |  [optional property]
**profileImageUrl** | `URI` | The URL to the profile image for this User. |  [optional property]
**_protected** | `Boolean` | Indicates if this User has chosen to protect their Tweets (in other words, if this User&#39;s Tweets are private). |  [optional property]
**publicMetrics** | [`UserPublicMetrics`](UserPublicMetrics.md) |  |  [optional property]
**url** | `String` | The URL specified in the User&#39;s profile. |  [optional property]
**username** | `String` | The Twitter handle (screen name) of this user. | 
**verified** | `Boolean` | Indicate if this User is a verified Twitter User. |  [optional property]
**withheld** | [`UserWithheld`](UserWithheld.md) |  |  [optional property]
















