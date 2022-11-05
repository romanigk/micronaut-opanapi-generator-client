

# TweetReferencedTweetsInner

The class is defined in **[TweetReferencedTweetsInner.java](../../src/main/java/example/micronaut/model/TweetReferencedTweetsInner.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | `String` | Unique identifier of this Tweet. This is returned as a string in order to avoid complications with languages and tools that cannot handle large integers. | 
**type** | [**TypeEnum**](#TypeEnum) |  | 


## TypeEnum

Name | Value
---- | -----
RETWEETED | `"retweeted"`
QUOTED | `"quoted"`
REPLIED_TO | `"replied_to"`


