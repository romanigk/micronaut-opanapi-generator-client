/*
 * Twitter API v2
 * Twitter API v2 available endpoints
 *
 * The version of the OpenAPI document: 2.55
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package example.micronaut.model;

import java.util.Objects;
import java.util.Arrays;
import example.micronaut.model.Media;
import example.micronaut.model.Place;
import example.micronaut.model.Poll;
import example.micronaut.model.Topic;
import example.micronaut.model.Tweet;
import example.micronaut.model.User;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * Expansions
 */
@JsonPropertyOrder({
  Expansions.JSON_PROPERTY_MEDIA,
  Expansions.JSON_PROPERTY_PLACES,
  Expansions.JSON_PROPERTY_POLLS,
  Expansions.JSON_PROPERTY_TOPICS,
  Expansions.JSON_PROPERTY_TWEETS,
  Expansions.JSON_PROPERTY_USERS
})
@JsonTypeName("Expansions")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2022-11-05T03:44:30.749524299+01:00[Europe/Berlin]")
@Introspected
public class Expansions {
    public static final String JSON_PROPERTY_MEDIA = "media";
    private List<Media> media = null;

    public static final String JSON_PROPERTY_PLACES = "places";
    private List<Place> places = null;

    public static final String JSON_PROPERTY_POLLS = "polls";
    private List<Poll> polls = null;

    public static final String JSON_PROPERTY_TOPICS = "topics";
    private List<Topic> topics = null;

    public static final String JSON_PROPERTY_TWEETS = "tweets";
    private List<Tweet> tweets = null;

    public static final String JSON_PROPERTY_USERS = "users";
    private List<User> users = null;

    public Expansions() {
    }

    public Expansions media(List<Media> media) {
        this.media = media;
        return this;
    }

    public Expansions addMediaItem(Media mediaItem) {
        if (this.media == null) {
            this.media = new ArrayList<>();
        }
        this.media.add(mediaItem);
        return this;
    }

    /**
     * Get media
     * @return media
     **/
    @Nullable
    @Size(min=1)
    @JsonProperty(JSON_PROPERTY_MEDIA)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<Media> getMedia() {
        return media;
    }

    @JsonProperty(JSON_PROPERTY_MEDIA)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setMedia(List<Media> media) {
        this.media = media;
    }

    public Expansions places(List<Place> places) {
        this.places = places;
        return this;
    }

    public Expansions addPlacesItem(Place placesItem) {
        if (this.places == null) {
            this.places = new ArrayList<>();
        }
        this.places.add(placesItem);
        return this;
    }

    /**
     * Get places
     * @return places
     **/
    @Nullable
    @Size(min=1)
    @JsonProperty(JSON_PROPERTY_PLACES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<Place> getPlaces() {
        return places;
    }

    @JsonProperty(JSON_PROPERTY_PLACES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPlaces(List<Place> places) {
        this.places = places;
    }

    public Expansions polls(List<Poll> polls) {
        this.polls = polls;
        return this;
    }

    public Expansions addPollsItem(Poll pollsItem) {
        if (this.polls == null) {
            this.polls = new ArrayList<>();
        }
        this.polls.add(pollsItem);
        return this;
    }

    /**
     * Get polls
     * @return polls
     **/
    @Nullable
    @Size(min=1)
    @JsonProperty(JSON_PROPERTY_POLLS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<Poll> getPolls() {
        return polls;
    }

    @JsonProperty(JSON_PROPERTY_POLLS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPolls(List<Poll> polls) {
        this.polls = polls;
    }

    public Expansions topics(List<Topic> topics) {
        this.topics = topics;
        return this;
    }

    public Expansions addTopicsItem(Topic topicsItem) {
        if (this.topics == null) {
            this.topics = new ArrayList<>();
        }
        this.topics.add(topicsItem);
        return this;
    }

    /**
     * Get topics
     * @return topics
     **/
    @Nullable
    @Size(min=1)
    @JsonProperty(JSON_PROPERTY_TOPICS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<Topic> getTopics() {
        return topics;
    }

    @JsonProperty(JSON_PROPERTY_TOPICS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setTopics(List<Topic> topics) {
        this.topics = topics;
    }

    public Expansions tweets(List<Tweet> tweets) {
        this.tweets = tweets;
        return this;
    }

    public Expansions addTweetsItem(Tweet tweetsItem) {
        if (this.tweets == null) {
            this.tweets = new ArrayList<>();
        }
        this.tweets.add(tweetsItem);
        return this;
    }

    /**
     * Get tweets
     * @return tweets
     **/
    @Nullable
    @Size(min=1)
    @JsonProperty(JSON_PROPERTY_TWEETS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<Tweet> getTweets() {
        return tweets;
    }

    @JsonProperty(JSON_PROPERTY_TWEETS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setTweets(List<Tweet> tweets) {
        this.tweets = tweets;
    }

    public Expansions users(List<User> users) {
        this.users = users;
        return this;
    }

    public Expansions addUsersItem(User usersItem) {
        if (this.users == null) {
            this.users = new ArrayList<>();
        }
        this.users.add(usersItem);
        return this;
    }

    /**
     * Get users
     * @return users
     **/
    @Nullable
    @Size(min=1)
    @JsonProperty(JSON_PROPERTY_USERS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<User> getUsers() {
        return users;
    }

    @JsonProperty(JSON_PROPERTY_USERS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setUsers(List<User> users) {
        this.users = users;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Expansions expansions = (Expansions) o;
        return Objects.equals(this.media, expansions.media) &&
            Objects.equals(this.places, expansions.places) &&
            Objects.equals(this.polls, expansions.polls) &&
            Objects.equals(this.topics, expansions.topics) &&
            Objects.equals(this.tweets, expansions.tweets) &&
            Objects.equals(this.users, expansions.users);
    }

    @Override
    public int hashCode() {
        return Objects.hash(media, places, polls, topics, tweets, users);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Expansions {\n");
        sb.append("    media: ").append(toIndentedString(media)).append("\n");
        sb.append("    places: ").append(toIndentedString(places)).append("\n");
        sb.append("    polls: ").append(toIndentedString(polls)).append("\n");
        sb.append("    topics: ").append(toIndentedString(topics)).append("\n");
        sb.append("    tweets: ").append(toIndentedString(tweets)).append("\n");
        sb.append("    users: ").append(toIndentedString(users)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
