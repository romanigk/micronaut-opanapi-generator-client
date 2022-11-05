

# UserWithheld

Indicates withholding details for [withheld content](https://help.twitter.com/en/rules-and-policies/tweet-withheld-by-country).

The class is defined in **[UserWithheld.java](../../src/main/java/example/micronaut/model/UserWithheld.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**countryCodes** | `Set&lt;String&gt;` | Provides a list of countries where this content is not available. | 
**scope** | [**ScopeEnum**](#ScopeEnum) | Indicates that the content being withheld is a &#x60;user&#x60;. |  [optional property]


## ScopeEnum

Name | Value
---- | -----
USER | `"user"`


