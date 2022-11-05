

# FilteredStreamingTweetResponse

A Tweet or error that can be returned by the streaming Tweet API. The values returned with a successful streamed Tweet includes the user provided rules that the Tweet matched.

The class is defined in **[FilteredStreamingTweetResponse.java](../../src/main/java/example/micronaut/model/FilteredStreamingTweetResponse.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data** | [`Tweet`](Tweet.md) |  |  [optional property]
**errors** | [`List&lt;Problem&gt;`](Problem.md) |  |  [optional property]
**includes** | [`Expansions`](Expansions.md) |  |  [optional property]
**matchingRules** | [`List&lt;FilteredStreamingTweetResponseMatchingRulesInner&gt;`](FilteredStreamingTweetResponseMatchingRulesInner.md) | The list of rules which matched the Tweet |  [optional property]






