# Authorization methods
<a name="name"></a>
# BearerToken
Authorization method is of **basic auth**.

It can be configured in the [application.yml](src/main/resources/application.yml) using Micronaut security features.
<a name="name"></a>
# OAuth2UserToken
Authorization method is **OAuth2** with `accessCode` flow.
The scopes are: 
    * `block.read`
    * `block.write`
    * `bookmark.read`
    * `bookmark.write`
    * `dm.read`
    * `dm.write`
    * `follows.read`
    * `follows.write`
    * `like.read`
    * `like.write`
    * `list.read`
    * `list.write`
    * `mute.read`
    * `mute.write`
    * `offline.access`
    * `space.read`
    * `tweet.moderate.write`
    * `tweet.read`
    * `tweet.write`
    * `users.read`

It can be configured in the [application.yml](src/main/resources/application.yml) using Micronaut security features.

More information on configuring can be found in [Micronaut Security Guide](https://micronaut-projects.github.io/micronaut-security/latest/guide/#oauth).
<a name="name"></a>
# UserToken
Authorization method is of **basic auth**.

It can be configured in the [application.yml](src/main/resources/application.yml) using Micronaut security features.
