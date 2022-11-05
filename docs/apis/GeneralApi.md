# GeneralApi

All URIs are relative to *https://api.twitter.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getOpenApiSpec**](GeneralApi.md#getOpenApiSpec) | **GET** /2/openapi.json | Returns the OpenAPI Specification document. |


## Creating GeneralApi

To initiate an instance of `GeneralApi`, you can use micronaut's `ApplicationContext`:
```java
/* imports
import io.micronaut.runtime.Micronaut;
import io.micronaut.context.ApplicationContext;
import example.micronaut.api.GeneralApi;
*/

ApplicationContext context = Micronaut.run(/* ... */);
PetApi apiInstance = context.getBean(GeneralApi.class);
```

Or the `@Inject` annotation:
```java
@Singleton
class MyClass {
    @Inject
    GeneralApi generalApi;

    /* ... use the injected variable */
}
```
Note that the class needs to be annotated with one of Micronaut's [scope annotations](https://docs.micronaut.io/latest/guide/#scopes) like `Singleton` in order to be processed.

More information can be found inside [Inversion of Control guide section](https://docs.micronaut.io/latest/guide/#ioc).

<a name="getOpenApiSpec"></a>
# **getOpenApiSpec**
```java
Mono<Object> GeneralApi.getOpenApiSpec()
```

Returns the OpenAPI Specification document.

Full OpenAPI Specification in JSON format. (See https://github.com/OAI/OpenAPI-Specification/blob/master/README.md)



### Return type
`Object`



### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

