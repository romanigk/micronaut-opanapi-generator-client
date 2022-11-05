

# TweetCreateRequestPoll

Poll options for a Tweet with a poll. This is mutually exclusive from Media, Quote Tweet Id, and Card URI.

The class is defined in **[TweetCreateRequestPoll.java](../../src/main/java/example/micronaut/model/TweetCreateRequestPoll.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**durationMinutes** | `Integer` | Duration of the poll in minutes. | 
**options** | `List&lt;String&gt;` |  | 
**replySettings** | [**ReplySettingsEnum**](#ReplySettingsEnum) | Settings to indicate who can reply to the Tweet. |  [optional property]



## ReplySettingsEnum

Name | Value
---- | -----
FOLLOWING | `"following"`
MENTIONEDUSERS | `"mentionedUsers"`


