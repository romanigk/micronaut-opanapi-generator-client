

# UrlEntity

Represent the portion of text recognized as a URL, and its start and end position within the text.

The class is defined in **[UrlEntity.java](../../src/main/java/example/micronaut/model/UrlEntity.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**end** | `Integer` | Index (zero-based) at which position this entity ends.  The index is exclusive. | 
**start** | `Integer` | Index (zero-based) at which position this entity starts.  The index is inclusive. | 
**description** | `String` | Description of the URL landing page. |  [optional property]
**displayUrl** | `String` | The URL as displayed in the Twitter client. |  [optional property]
**expandedUrl** | `URI` | A validly formatted URL. |  [optional property]
**images** | [`List&lt;UrlImage&gt;`](UrlImage.md) |  |  [optional property]
**mediaKey** | `String` | The Media Key identifier for this attachment. |  [optional property]
**status** | `Integer` | HTTP Status Code. |  [optional property]
**title** | `String` | Title of the page the URL points to. |  [optional property]
**unwoundUrl** | `URI` | Fully resolved url. |  [optional property]
**url** | `URI` | A validly formatted URL. | 













