

# FieldUnauthorizedProblem

A problem that indicates that you are not allowed to see a particular field on a Tweet, User, etc.

The class is defined in **[FieldUnauthorizedProblem.java](../../src/main/java/example/micronaut/model/FieldUnauthorizedProblem.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**field** | `String` |  | 
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


