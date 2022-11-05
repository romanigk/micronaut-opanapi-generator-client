

# ResourceUnauthorizedProblem

A problem that indicates you are not allowed to see a particular Tweet, User, etc.

The class is defined in **[ResourceUnauthorizedProblem.java](../../src/main/java/example/micronaut/model/ResourceUnauthorizedProblem.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**parameter** | `String` |  | 
**resourceId** | `String` |  | 
**resourceType** | [**ResourceTypeEnum**](#ResourceTypeEnum) |  | 
**section** | [**SectionEnum**](#SectionEnum) |  | 
**value** | `String` |  | 



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



