

# ComplianceJob

The class is defined in **[ComplianceJob.java](../../src/main/java/example/micronaut/model/ComplianceJob.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createdAt** | `OffsetDateTime` | Creation time of the compliance job. | 
**downloadExpiresAt** | `OffsetDateTime` | Expiration time of the download URL. | 
**downloadUrl** | `URI` | URL from which the user will retrieve their compliance results. | 
**id** | `String` | Compliance Job ID. | 
**name** | `String` | User-provided name for a compliance job. |  [optional property]
**status** | `ComplianceJobStatus` |  | 
**type** | `ComplianceJobType` |  | 
**uploadExpiresAt** | `OffsetDateTime` | Expiration time of the upload URL. | 
**uploadUrl** | `URI` | URL to which the user will upload their Tweet or user IDs. | 











