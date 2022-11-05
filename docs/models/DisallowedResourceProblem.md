

# DisallowedResourceProblem

A problem that indicates that the resource requested violates the precepts of this API.

The class is defined in **[DisallowedResourceProblem.java](../../src/main/java/example/micronaut/model/DisallowedResourceProblem.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**resourceId** | `String` |  | 
**resourceType** | [**ResourceTypeEnum**](#ResourceTypeEnum) |  | 
**section** | [**SectionEnum**](#SectionEnum) |  | 


## ResourceTypeEnum

Name | Value
---- | -----
USER | `"user"`
TWEET | `"tweet"`
MEDIA | `"media"`
LIST | `"list"`
SPACE | `"space"`

## SectionEnum

Name | Value
---- | -----
DATA | `"data"`
INCLUDES | `"includes"`


