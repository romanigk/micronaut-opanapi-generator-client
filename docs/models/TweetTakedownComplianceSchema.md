

# TweetTakedownComplianceSchema

The class is defined in **[TweetTakedownComplianceSchema.java](../../src/main/java/example/micronaut/model/TweetTakedownComplianceSchema.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**eventAt** | `OffsetDateTime` | Event time. | 
**quoteTweetId** | `String` | Unique identifier of this Tweet. This is returned as a string in order to avoid complications with languages and tools that cannot handle large integers. |  [optional property]
**tweet** | [`TweetComplianceSchemaTweet`](TweetComplianceSchemaTweet.md) |  | 
**withheldInCountries** | `List&lt;String&gt;` |  | 






