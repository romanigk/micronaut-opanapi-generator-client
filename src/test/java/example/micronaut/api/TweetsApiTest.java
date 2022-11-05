package example.micronaut.api;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import example.micronaut.model.Get2TweetsCountsRecentResponse;
import example.micronaut.model.Get2TweetsSearchRecentResponse;
import example.micronaut.model.SearchCount;
import example.micronaut.model.Tweet;
import example.micronaut.model.User;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;


/**
 * API tests for TweetsApi
 */
@MicronautTest
@EnabledIfEnvironmentVariable(named = "TWITTER_AUTH_CLIENT_ID", matches = ".+")
class TweetsApiTest {

  @Inject
  TweetsApi api;

  /**
   * Recent search counts
   */
  @Test
  void tweetCountsRecentSearchTest() {
    // WHEN
    String query = "Toronto";
    Get2TweetsCountsRecentResponse response = api.tweetCountsRecentSearch(
        query, null, null, null, null, null, null, null, null).block();

    // THEN
    assertNotNull(response);
    // Calculate total count
    assertNotNull(response.getData());
    Integer totalCount = response.getData().stream()
        .filter(Objects::nonNull)
        .map(SearchCount::getTweetCount)
        .reduce(0, Integer::sum);
    // There should be more than 100 tweets with such query in the last 7 days
    assertTrue(totalCount > 100);
  }

  /**
   * Recent search
   */
  @Test
  void tweetsRecentSearchTest() {
    // GIVEN
    String query = "nyc";
    OffsetDateTime startTime = null;
    OffsetDateTime endTime = null;
    String sinceId = null;
    String untilId = null;
    Integer maxResults = 10;
    String nextToken = null;
    String paginationToken = null;
    String sortOrder = null;
    Set<String> expansions = new HashSet<>(Collections.singletonList("author_id"));
    Set<String> tweetFields = new HashSet<>(Arrays.asList(
        "id", "author_id", "created_at", "attachments", "lang", "possibly_sensitive", "text",
        "source"
    ));
    Set<String> userFields = new HashSet<>(
        Arrays.asList("description", "created_at", "username", "name"));
    Set<String> mediaFields = null;
    Set<String> placeFields = null;
    Set<String> pollFields = null;

    // WHEN
    Get2TweetsSearchRecentResponse response = api.tweetsRecentSearch(
        query, startTime, endTime, sinceId, untilId, maxResults, nextToken, paginationToken,
        sortOrder, expansions, tweetFields,
        userFields, mediaFields, placeFields, pollFields).block();

    // THEN
    assertNotNull(response);

    // Tweets should be present
    List<Tweet> tweets = response.getData();
    assertNotNull(tweets);
    assertEquals(maxResults, tweets.size());

    Tweet tweet = tweets.get(0);
    assertNotNull(tweet);
    assertNotNull(tweet.getAuthorId());
    assertNotNull(tweet.getCreatedAt());
    assertNotNull(tweet.getLang());
    assertNotNull(tweet.getPossiblySensitive());
    assertNotNull(tweet.getText());

    // Users should be present
    assertNotNull(response.getIncludes());
    List<User> users = response.getIncludes().getUsers();
    assertNotNull(users);
    assertTrue(users.size() > 0);

    User user = users.get(0);
    assertNotNull(user);
    assertNotNull(user.getId());
    assertNotNull(user.getUsername());
  }
}