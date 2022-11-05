

# Tweet

The class is defined in **[Tweet.java](../../src/main/java/example/micronaut/model/Tweet.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attachments** | [`TweetAttachments`](TweetAttachments.md) |  |  [optional property]
**authorId** | `String` | Unique identifier of this User. This is returned as a string in order to avoid complications with languages and tools that cannot handle large integers. |  [optional property]
**contextAnnotations** | [`List&lt;ContextAnnotation&gt;`](ContextAnnotation.md) |  |  [optional property]
**conversationId** | `String` | Unique identifier of this Tweet. This is returned as a string in order to avoid complications with languages and tools that cannot handle large integers. |  [optional property]
**createdAt** | `OffsetDateTime` | Creation time of the Tweet. |  [optional property]
**editControls** | [`TweetEditControls`](TweetEditControls.md) |  |  [optional property]
**editHistoryTweetIds** | `List&lt;String&gt;` | A list of Tweet Ids in this Tweet chain. | 
**entities** | [`FullTextEntities`](FullTextEntities.md) |  |  [optional property]
**geo** | [`TweetGeo`](TweetGeo.md) |  |  [optional property]
**id** | `String` | Unique identifier of this Tweet. This is returned as a string in order to avoid complications with languages and tools that cannot handle large integers. | 
**inReplyToUserId** | `String` | Unique identifier of this User. This is returned as a string in order to avoid complications with languages and tools that cannot handle large integers. |  [optional property]
**lang** | `String` | Language of the Tweet, if detected by Twitter. Returned as a BCP47 language tag. |  [optional property]
**nonPublicMetrics** | [`TweetNonPublicMetrics`](TweetNonPublicMetrics.md) |  |  [optional property]
**organicMetrics** | [`TweetOrganicMetrics`](TweetOrganicMetrics.md) |  |  [optional property]
**possiblySensitive** | `Boolean` | Indicates if this Tweet contains URLs marked as sensitive, for example content suitable for mature audiences. |  [optional property]
**promotedMetrics** | [`TweetPromotedMetrics`](TweetPromotedMetrics.md) |  |  [optional property]
**publicMetrics** | [`TweetPublicMetrics`](TweetPublicMetrics.md) |  |  [optional property]
**referencedTweets** | [`List&lt;TweetReferencedTweetsInner&gt;`](TweetReferencedTweetsInner.md) | A list of Tweets this Tweet refers to. For example, if the parent Tweet is a Retweet, a Quoted Tweet or a Reply, it will include the related Tweet referenced to by its parent. |  [optional property]
**replySettings** | `ReplySettings` |  |  [optional property]
**source** | `String` | The name of the app the user Tweeted from. |  [optional property]
**text** | `String` | The content of the Tweet. | 
**withheld** | [`TweetWithheld`](TweetWithheld.md) |  |  [optional property]
























