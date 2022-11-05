

# CreateComplianceJobRequest

A request to create a new batch compliance job.

The class is defined in **[CreateComplianceJobRequest.java](../../src/main/java/example/micronaut/model/CreateComplianceJobRequest.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | `String` | User-provided name for a compliance job. |  [optional property]
**resumable** | `Boolean` | If true, this endpoint will return a pre-signed URL with resumable uploads enabled. |  [optional property]
**type** | [**TypeEnum**](#TypeEnum) | Type of compliance job to list. | 



## TypeEnum

Name | Value
---- | -----
TWEETS | `"tweets"`
USERS | `"users"`


