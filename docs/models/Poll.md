

# Poll

Represent a Poll attached to a Tweet.

The class is defined in **[Poll.java](../../src/main/java/example/micronaut/model/Poll.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**durationMinutes** | `Integer` |  |  [optional property]
**endDatetime** | `OffsetDateTime` |  |  [optional property]
**id** | `String` | Unique identifier of this poll. | 
**options** | [`List&lt;PollOption&gt;`](PollOption.md) |  | 
**votingStatus** | [**VotingStatusEnum**](#VotingStatusEnum) |  |  [optional property]





## VotingStatusEnum

Name | Value
---- | -----
OPEN | `"open"`
CLOSED | `"closed"`


