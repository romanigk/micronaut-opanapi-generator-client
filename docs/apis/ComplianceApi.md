# ComplianceApi

All URIs are relative to *https://api.twitter.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createBatchComplianceJob**](ComplianceApi.md#createBatchComplianceJob) | **POST** /2/compliance/jobs | Create compliance job |
| [**getBatchComplianceJob**](ComplianceApi.md#getBatchComplianceJob) | **GET** /2/compliance/jobs/{id} | Get Compliance Job |
| [**getTweetsComplianceStream**](ComplianceApi.md#getTweetsComplianceStream) | **GET** /2/tweets/compliance/stream | Tweets Compliance stream |
| [**getTweetsLabelStream**](ComplianceApi.md#getTweetsLabelStream) | **GET** /2/tweets/label/stream | Tweets Label stream |
| [**getUsersComplianceStream**](ComplianceApi.md#getUsersComplianceStream) | **GET** /2/users/compliance/stream | Users Compliance stream |
| [**listBatchComplianceJobs**](ComplianceApi.md#listBatchComplianceJobs) | **GET** /2/compliance/jobs | List Compliance Jobs |


## Creating ComplianceApi

To initiate an instance of `ComplianceApi`, you can use micronaut's `ApplicationContext`:
```java
/* imports
import io.micronaut.runtime.Micronaut;
import io.micronaut.context.ApplicationContext;
import example.micronaut.api.ComplianceApi;
*/

ApplicationContext context = Micronaut.run(/* ... */);
PetApi apiInstance = context.getBean(ComplianceApi.class);
```

Or the `@Inject` annotation:
```java
@Singleton
class MyClass {
    @Inject
    ComplianceApi complianceApi;

    /* ... use the injected variable */
}
```
Note that the class needs to be annotated with one of Micronaut's [scope annotations](https://docs.micronaut.io/latest/guide/#scopes) like `Singleton` in order to be processed.

More information can be found inside [Inversion of Control guide section](https://docs.micronaut.io/latest/guide/#ioc).

<a name="createBatchComplianceJob"></a>
# **createBatchComplianceJob**
```java
Mono<CreateComplianceJobResponse> ComplianceApi.createBatchComplianceJob(createComplianceJobRequest)
```

Create compliance job

Creates a compliance for the given job type

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createComplianceJobRequest** | [**CreateComplianceJobRequest**](CreateComplianceJobRequest.md)|  | |


### Return type
[**CreateComplianceJobResponse**](CreateComplianceJobResponse.md)

### Authorization
* **[BearerToken](auth.md#BearerToken)**

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`, `application/problem+json`

<a name="getBatchComplianceJob"></a>
# **getBatchComplianceJob**
```java
Mono<Get2ComplianceJobsIdResponse> ComplianceApi.getBatchComplianceJob(idcomplianceJobFields)
```

Get Compliance Job

Returns a single Compliance Job by ID

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | `String`| The ID of the Compliance Job to retrieve. | |
| **complianceJobFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of ComplianceJob fields to display. | [optional parameter] [enum: `created_at`, `download_expires_at`, `download_url`, `id`, `name`, `resumable`, `status`, `type`, `upload_expires_at`, `upload_url`] |


### Return type
[**Get2ComplianceJobsIdResponse**](Get2ComplianceJobsIdResponse.md)

### Authorization
* **[BearerToken](auth.md#BearerToken)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`, `application/problem+json`

<a name="getTweetsComplianceStream"></a>
# **getTweetsComplianceStream**
```java
Mono<TweetComplianceStreamResponse> ComplianceApi.getTweetsComplianceStream(partitionbackfillMinutesstartTimeendTime)
```

Tweets Compliance stream

Streams 100% of compliance data for Tweets

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **partition** | `Integer`| The partition number. | |
| **backfillMinutes** | `Integer`| The number of minutes of backfill requested. | [optional parameter] |
| **startTime** | `OffsetDateTime`| YYYY-MM-DDTHH:mm:ssZ. The earliest UTC timestamp from which the Tweet Compliance events will be provided. | [optional parameter] |
| **endTime** | `OffsetDateTime`| YYYY-MM-DDTHH:mm:ssZ. The latest UTC timestamp to which the Tweet Compliance events will be provided. | [optional parameter] |


### Return type
[**TweetComplianceStreamResponse**](TweetComplianceStreamResponse.md)

### Authorization
* **[BearerToken](auth.md#BearerToken)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`, `application/problem+json`

<a name="getTweetsLabelStream"></a>
# **getTweetsLabelStream**
```java
Mono<TweetLabelStreamResponse> ComplianceApi.getTweetsLabelStream(backfillMinutesstartTimeendTime)
```

Tweets Label stream

Streams 100% of labeling events applied to Tweets

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **backfillMinutes** | `Integer`| The number of minutes of backfill requested. | [optional parameter] |
| **startTime** | `OffsetDateTime`| YYYY-MM-DDTHH:mm:ssZ. The earliest UTC timestamp from which the Tweet labels will be provided. | [optional parameter] |
| **endTime** | `OffsetDateTime`| YYYY-MM-DDTHH:mm:ssZ. The latest UTC timestamp from which the Tweet labels will be provided. | [optional parameter] |


### Return type
[**TweetLabelStreamResponse**](TweetLabelStreamResponse.md)

### Authorization
* **[BearerToken](auth.md#BearerToken)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`, `application/problem+json`

<a name="getUsersComplianceStream"></a>
# **getUsersComplianceStream**
```java
Mono<UserComplianceStreamResponse> ComplianceApi.getUsersComplianceStream(partitionbackfillMinutesstartTimeendTime)
```

Users Compliance stream

Streams 100% of compliance data for Users

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **partition** | `Integer`| The partition number. | |
| **backfillMinutes** | `Integer`| The number of minutes of backfill requested. | [optional parameter] |
| **startTime** | `OffsetDateTime`| YYYY-MM-DDTHH:mm:ssZ. The earliest UTC timestamp from which the User Compliance events will be provided. | [optional parameter] |
| **endTime** | `OffsetDateTime`| YYYY-MM-DDTHH:mm:ssZ. The latest UTC timestamp from which the User Compliance events will be provided. | [optional parameter] |


### Return type
[**UserComplianceStreamResponse**](UserComplianceStreamResponse.md)

### Authorization
* **[BearerToken](auth.md#BearerToken)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`, `application/problem+json`

<a name="listBatchComplianceJobs"></a>
# **listBatchComplianceJobs**
```java
Mono<Get2ComplianceJobsResponse> ComplianceApi.listBatchComplianceJobs(typestatuscomplianceJobFields)
```

List Compliance Jobs

Returns recent Compliance Jobs for a given job type and optional job status

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **type** | `String`| Type of Compliance Job to list. | [enum: `tweets`, `users`] |
| **status** | `String`| Status of Compliance Job to list. | [optional parameter] [enum: `created`, `in_progress`, `failed`, `complete`] |
| **complianceJobFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of ComplianceJob fields to display. | [optional parameter] [enum: `created_at`, `download_expires_at`, `download_url`, `id`, `name`, `resumable`, `status`, `type`, `upload_expires_at`, `upload_url`] |


### Return type
[**Get2ComplianceJobsResponse**](Get2ComplianceJobsResponse.md)

### Authorization
* **[BearerToken](auth.md#BearerToken)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`, `application/problem+json`

