

# TweetWithheld

Indicates withholding details for [withheld content](https://help.twitter.com/en/rules-and-policies/tweet-withheld-by-country).

The class is defined in **[TweetWithheld.java](../../src/main/java/example/micronaut/model/TweetWithheld.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**copyright** | `Boolean` | Indicates if the content is being withheld for on the basis of copyright infringement. | 
**countryCodes** | `Set&lt;String&gt;` | Provides a list of countries where this content is not available. | 
**scope** | [**ScopeEnum**](#ScopeEnum) | Indicates whether the content being withheld is the &#x60;tweet&#x60; or a &#x60;user&#x60;. |  [optional property]



## ScopeEnum

Name | Value
---- | -----
TWEET | `"tweet"`
USER | `"user"`


