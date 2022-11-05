

# ResourceNotFoundProblem

A problem that indicates that a given Tweet, User, etc. does not exist.

The class is defined in **[ResourceNotFoundProblem.java](../../src/main/java/example/micronaut/model/ResourceNotFoundProblem.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**parameter** | `String` |  | 
**resourceId** | `String` |  | 
**resourceType** | [**ResourceTypeEnum**](#ResourceTypeEnum) |  | 
**value** | `String` | Value will match the schema of the field. | 



## ResourceTypeEnum

Name | Value
---- | -----
USER | `"user"`
TWEET | `"tweet"`
MEDIA | `"media"`
LIST | `"list"`
SPACE | `"space"`



