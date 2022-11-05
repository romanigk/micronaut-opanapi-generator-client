

# Space



The class is defined in **[Space.java](../../src/main/java/example/micronaut/model/Space.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createdAt** | `OffsetDateTime` | Creation time of the Space. |  [optional property]
**creatorId** | `String` | Unique identifier of this User. This is returned as a string in order to avoid complications with languages and tools that cannot handle large integers. |  [optional property]
**endedAt** | `OffsetDateTime` | End time of the Space. |  [optional property]
**hostIds** | `List&lt;String&gt;` | The user ids for the hosts of the Space. |  [optional property]
**id** | `String` | The unique identifier of this Space. | 
**invitedUserIds** | `List&lt;String&gt;` | An array of user ids for people who were invited to a Space. |  [optional property]
**isTicketed** | `Boolean` | Denotes if the Space is a ticketed Space. |  [optional property]
**lang** | `String` | The language of the Space. |  [optional property]
**participantCount** | `Integer` | The number of participants in a Space. |  [optional property]
**scheduledStart** | `OffsetDateTime` | A date time stamp for when a Space is scheduled to begin. |  [optional property]
**speakerIds** | `List&lt;String&gt;` | An array of user ids for people who were speakers in a Space. |  [optional property]
**startedAt** | `OffsetDateTime` | When the Space was started as a date string. |  [optional property]
**state** | [**StateEnum**](#StateEnum) | The current state of the Space. | 
**subscriberCount** | `Integer` | The number of people who have either purchased a ticket or set a reminder for this Space. |  [optional property]
**title** | `String` | The title of the Space. |  [optional property]
**topics** | [`List&lt;SpaceTopicsInner&gt;`](SpaceTopicsInner.md) | The topics of a Space, as selected by its creator. |  [optional property]
**updatedAt** | `OffsetDateTime` | When the Space was last updated. |  [optional property]













## StateEnum

Name | Value
---- | -----
LIVE | `"live"`
SCHEDULED | `"scheduled"`
ENDED | `"ended"`






