

# TweetCreateRequest

The class is defined in **[TweetCreateRequest.java](../../src/main/java/example/micronaut/model/TweetCreateRequest.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cardUri** | `String` | Card Uri Parameter. This is mutually exclusive from Quote Tweet Id, Poll, Media, and Direct Message Deep Link. |  [optional property]
**directMessageDeepLink** | `String` | Link to take the conversation from the public timeline to a private Direct Message. |  [optional property]
**forSuperFollowersOnly** | `Boolean` | Exclusive Tweet for super followers. |  [optional property]
**geo** | [`TweetCreateRequestGeo`](TweetCreateRequestGeo.md) |  |  [optional property]
**media** | [`TweetCreateRequestMedia`](TweetCreateRequestMedia.md) |  |  [optional property]
**nullcast** | `Boolean` | Nullcasted (promoted-only) Tweets do not appear in the public timeline and are not served to followers. |  [optional property]
**poll** | [`TweetCreateRequestPoll`](TweetCreateRequestPoll.md) |  |  [optional property]
**quoteTweetId** | `String` | Unique identifier of this Tweet. This is returned as a string in order to avoid complications with languages and tools that cannot handle large integers. |  [optional property]
**reply** | [`TweetCreateRequestReply`](TweetCreateRequestReply.md) |  |  [optional property]
**replySettings** | [**ReplySettingsEnum**](#ReplySettingsEnum) | Settings to indicate who can reply to the Tweet. |  [optional property]
**text** | `String` | The content of the Tweet. |  [optional property]










## ReplySettingsEnum

Name | Value
---- | -----
FOLLOWING | `"following"`
MENTIONEDUSERS | `"mentionedUsers"`



