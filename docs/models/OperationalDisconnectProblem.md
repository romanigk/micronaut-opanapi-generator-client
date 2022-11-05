

# OperationalDisconnectProblem

You have been disconnected for operational reasons.

The class is defined in **[OperationalDisconnectProblem.java](../../src/main/java/example/micronaut/model/OperationalDisconnectProblem.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**disconnectType** | [**DisconnectTypeEnum**](#DisconnectTypeEnum) |  |  [optional property]

## DisconnectTypeEnum

Name | Value
---- | -----
OPERATIONALDISCONNECT | `"OperationalDisconnect"`
UPSTREAMOPERATIONALDISCONNECT | `"UpstreamOperationalDisconnect"`
FORCEDISCONNECT | `"ForceDisconnect"`
UPSTREAMUNCLEANDISCONNECT | `"UpstreamUncleanDisconnect"`
SLOWREADER | `"SlowReader"`
INTERNALERROR | `"InternalError"`
CLIENTAPPLICATIONSTATEDEGRADED | `"ClientApplicationStateDegraded"`
INVALIDRULES | `"InvalidRules"`


