package example.micronaut.api;

import example.micronaut.model.AddOrDeleteRulesRequest;
import example.micronaut.model.AddOrDeleteRulesResponse;
import example.micronaut.model.Error;
import example.micronaut.model.FilteredStreamingTweetResponse;
import example.micronaut.model.Get2ListsIdTweetsResponse;
import example.micronaut.model.Get2SpacesIdBuyersResponse;
import example.micronaut.model.Get2SpacesIdTweetsResponse;
import example.micronaut.model.Get2TweetsCountsAllResponse;
import example.micronaut.model.Get2TweetsCountsRecentResponse;
import example.micronaut.model.Get2TweetsIdQuoteTweetsResponse;
import example.micronaut.model.Get2TweetsIdResponse;
import example.micronaut.model.Get2TweetsResponse;
import example.micronaut.model.Get2TweetsSample10StreamResponse;
import example.micronaut.model.Get2TweetsSearchAllResponse;
import example.micronaut.model.Get2TweetsSearchRecentResponse;
import example.micronaut.model.Get2UsersIdLikedTweetsResponse;
import example.micronaut.model.Get2UsersIdMentionsResponse;
import example.micronaut.model.Get2UsersIdTimelinesReverseChronologicalResponse;
import example.micronaut.model.Get2UsersIdTweetsResponse;
import java.time.OffsetDateTime;
import example.micronaut.model.Problem;
import example.micronaut.model.RulesLookupResponse;
import java.util.Set;
import example.micronaut.model.StreamingTweetResponse;
import example.micronaut.model.TweetCreateRequest;
import example.micronaut.model.TweetCreateResponse;
import example.micronaut.model.TweetDeleteResponse;
import example.micronaut.model.TweetHideRequest;
import example.micronaut.model.TweetHideResponse;
import example.micronaut.model.UsersLikesCreateRequest;
import example.micronaut.model.UsersLikesCreateResponse;
import example.micronaut.model.UsersLikesDeleteResponse;
import example.micronaut.model.UsersRetweetsCreateRequest;
import example.micronaut.model.UsersRetweetsCreateResponse;
import example.micronaut.model.UsersRetweetsDeleteResponse;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import jakarta.inject.Inject;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.HashSet;


/**
 * API tests for TweetsApi
 */
@MicronautTest
public class TweetsApiTest {

    @Inject
    TweetsApi api;

    
    /**
     * Add/Delete rules
     *
     * Add or delete rules from a User&#39;s active rule set. Users can provide unique, optionally tagged rules to add. Users can delete their entire rule set or a subset specified by rule ids or values.
     */
    @Test
    @Disabled("Not Implemented")
    public void addOrDeleteRulesTest() {
        // given
        AddOrDeleteRulesRequest addOrDeleteRulesRequest = new AddOrDeleteRulesRequest();
        Boolean dryRun = false;

        // when
        AddOrDeleteRulesResponse body = api.addOrDeleteRules(addOrDeleteRulesRequest, dryRun).block();

        // then
        // TODO implement the addOrDeleteRulesTest()
    }

    
    /**
     * Creation of a Tweet
     *
     * Causes the User to create a Tweet under the authorized account.
     */
    @Test
    @Disabled("Not Implemented")
    public void createTweetTest() {
        // given
        TweetCreateRequest tweetCreateRequest = new TweetCreateRequest();

        // when
        TweetCreateResponse body = api.createTweet(tweetCreateRequest).block();

        // then
        // TODO implement the createTweetTest()
    }

    
    /**
     * Tweet delete by Tweet ID
     *
     * Delete specified Tweet (in the path) by ID.
     */
    @Test
    @Disabled("Not Implemented")
    public void deleteTweetByIdTest() {
        // given
        String id = "example";

        // when
        TweetDeleteResponse body = api.deleteTweetById(id).block();

        // then
        // TODO implement the deleteTweetByIdTest()
    }

    
    /**
     * Tweet lookup by Tweet ID
     *
     * Returns a variety of information about the Tweet specified by the requested ID.
     */
    @Test
    @Disabled("Not Implemented")
    public void findTweetByIdTest() {
        // given
        String id = "example";
        Set<String> tweetFields = new HashSet<>();
        Set<String> expansions = new HashSet<>();
        Set<String> mediaFields = new HashSet<>();
        Set<String> pollFields = new HashSet<>();
        Set<String> userFields = new HashSet<>();
        Set<String> placeFields = new HashSet<>();

        // when
        Get2TweetsIdResponse body = api.findTweetById(id, tweetFields, expansions, mediaFields, pollFields, userFields, placeFields).block();

        // then
        // TODO implement the findTweetByIdTest()
    }

    
    /**
     * Tweet lookup by Tweet IDs
     *
     * Returns a variety of information about the Tweet specified by the requested ID.
     */
    @Test
    @Disabled("Not Implemented")
    public void findTweetsByIdTest() {
        // given
        List<String> ids = Arrays.asList("example");
        Set<String> tweetFields = new HashSet<>();
        Set<String> expansions = new HashSet<>();
        Set<String> mediaFields = new HashSet<>();
        Set<String> pollFields = new HashSet<>();
        Set<String> userFields = new HashSet<>();
        Set<String> placeFields = new HashSet<>();

        // when
        Get2TweetsResponse body = api.findTweetsById(ids, tweetFields, expansions, mediaFields, pollFields, userFields, placeFields).block();

        // then
        // TODO implement the findTweetsByIdTest()
    }

    
    /**
     * Retrieve Tweets that quote a Tweet.
     *
     * Returns a variety of information about each Tweet that quotes the Tweet specified by the requested ID.
     */
    @Test
    @Disabled("Not Implemented")
    public void findTweetsThatQuoteATweetTest() {
        // given
        String id = "example";
        Integer maxResults = 10;
        String paginationToken = "example";
        Set<String> exclude = new HashSet<>();
        Set<String> tweetFields = new HashSet<>();
        Set<String> expansions = new HashSet<>();
        Set<String> mediaFields = new HashSet<>();
        Set<String> pollFields = new HashSet<>();
        Set<String> userFields = new HashSet<>();
        Set<String> placeFields = new HashSet<>();

        // when
        Get2TweetsIdQuoteTweetsResponse body = api.findTweetsThatQuoteATweet(id, maxResults, paginationToken, exclude, tweetFields, expansions, mediaFields, pollFields, userFields, placeFields).block();

        // then
        // TODO implement the findTweetsThatQuoteATweetTest()
    }

    
    /**
     * Rules lookup
     *
     * Returns rules from a User&#39;s active rule set. Users can fetch all of their rules or a subset, specified by the provided rule ids.
     */
    @Test
    @Disabled("Not Implemented")
    public void getRulesTest() {
        // given
        List<String> ids = Arrays.asList("example");
        Integer maxResults = 1000;
        String paginationToken = "example";

        // when
        RulesLookupResponse body = api.getRules(ids, maxResults, paginationToken).block();

        // then
        // TODO implement the getRulesTest()
    }

    
    /**
     * Firehose stream
     *
     * Streams 100% of public Tweets.
     */
    @Test
    @Disabled("Not Implemented")
    public void getTweetsFirehoseStreamTest() {
        // given
        Integer partition = 56;
        Integer backfillMinutes = 56;
        OffsetDateTime startTime = OffsetDateTime.of(2001, 2, 3, 12, 0, 0, 0, java.time.ZoneOffset.of("+02:00"));
        OffsetDateTime endTime = OffsetDateTime.of(2001, 2, 3, 12, 0, 0, 0, java.time.ZoneOffset.of("+02:00"));
        Set<String> tweetFields = new HashSet<>();
        Set<String> expansions = new HashSet<>();
        Set<String> mediaFields = new HashSet<>();
        Set<String> pollFields = new HashSet<>();
        Set<String> userFields = new HashSet<>();
        Set<String> placeFields = new HashSet<>();

        // when
        StreamingTweetResponse body = api.getTweetsFirehoseStream(partition, backfillMinutes, startTime, endTime, tweetFields, expansions, mediaFields, pollFields, userFields, placeFields).block();

        // then
        // TODO implement the getTweetsFirehoseStreamTest()
    }

    
    /**
     * Sample 10% stream
     *
     * Streams a deterministic 10% of public Tweets.
     */
    @Test
    @Disabled("Not Implemented")
    public void getTweetsSample10StreamTest() {
        // given
        Integer partition = 56;
        Integer backfillMinutes = 56;
        OffsetDateTime startTime = OffsetDateTime.of(2001, 2, 3, 12, 0, 0, 0, java.time.ZoneOffset.of("+02:00"));
        OffsetDateTime endTime = OffsetDateTime.of(2001, 2, 3, 12, 0, 0, 0, java.time.ZoneOffset.of("+02:00"));
        Set<String> tweetFields = new HashSet<>();
        Set<String> expansions = new HashSet<>();
        Set<String> mediaFields = new HashSet<>();
        Set<String> pollFields = new HashSet<>();
        Set<String> userFields = new HashSet<>();
        Set<String> placeFields = new HashSet<>();

        // when
        Get2TweetsSample10StreamResponse body = api.getTweetsSample10Stream(partition, backfillMinutes, startTime, endTime, tweetFields, expansions, mediaFields, pollFields, userFields, placeFields).block();

        // then
        // TODO implement the getTweetsSample10StreamTest()
    }

    
    /**
     * Hide replies
     *
     * Hides or unhides a reply to an owned conversation.
     */
    @Test
    @Disabled("Not Implemented")
    public void hideReplyByIdTest() {
        // given
        String tweetId = "example";
        TweetHideRequest tweetHideRequest = new TweetHideRequest(false);

        // when
        TweetHideResponse body = api.hideReplyById(tweetId, tweetHideRequest).block();

        // then
        // TODO implement the hideReplyByIdTest()
    }

    
    /**
     * List Tweets timeline by List ID.
     *
     * Returns a list of Tweets associated with the provided List ID.
     */
    @Test
    @Disabled("Not Implemented")
    public void listsIdTweetsTest() {
        // given
        String id = "example";
        Integer maxResults = 100;
        String paginationToken = "example";
        Set<String> tweetFields = new HashSet<>();
        Set<String> expansions = new HashSet<>();
        Set<String> mediaFields = new HashSet<>();
        Set<String> pollFields = new HashSet<>();
        Set<String> userFields = new HashSet<>();
        Set<String> placeFields = new HashSet<>();

        // when
        Get2ListsIdTweetsResponse body = api.listsIdTweets(id, maxResults, paginationToken, tweetFields, expansions, mediaFields, pollFields, userFields, placeFields).block();

        // then
        // TODO implement the listsIdTweetsTest()
    }

    
    /**
     * Sample stream
     *
     * Streams a deterministic 1% of public Tweets.
     */
    @Test
    @Disabled("Not Implemented")
    public void sampleStreamTest() {
        // given
        Integer backfillMinutes = 56;
        Set<String> tweetFields = new HashSet<>();
        Set<String> expansions = new HashSet<>();
        Set<String> mediaFields = new HashSet<>();
        Set<String> pollFields = new HashSet<>();
        Set<String> userFields = new HashSet<>();
        Set<String> placeFields = new HashSet<>();

        // when
        StreamingTweetResponse body = api.sampleStream(backfillMinutes, tweetFields, expansions, mediaFields, pollFields, userFields, placeFields).block();

        // then
        // TODO implement the sampleStreamTest()
    }

    
    /**
     * Filtered stream
     *
     * Streams Tweets matching the stream&#39;s active rule set.
     */
    @Test
    @Disabled("Not Implemented")
    public void searchStreamTest() {
        // given
        Integer backfillMinutes = 56;
        OffsetDateTime startTime = OffsetDateTime.of(2001, 2, 3, 12, 0, 0, 0, java.time.ZoneOffset.of("+02:00"));
        OffsetDateTime endTime = OffsetDateTime.of(2001, 2, 3, 12, 0, 0, 0, java.time.ZoneOffset.of("+02:00"));
        Set<String> tweetFields = new HashSet<>();
        Set<String> expansions = new HashSet<>();
        Set<String> mediaFields = new HashSet<>();
        Set<String> pollFields = new HashSet<>();
        Set<String> userFields = new HashSet<>();
        Set<String> placeFields = new HashSet<>();

        // when
        FilteredStreamingTweetResponse body = api.searchStream(backfillMinutes, startTime, endTime, tweetFields, expansions, mediaFields, pollFields, userFields, placeFields).block();

        // then
        // TODO implement the searchStreamTest()
    }

    
    /**
     * Retrieve the list of Users who purchased a ticket to the given space
     *
     * Retrieves the list of Users who purchased a ticket to the given space
     */
    @Test
    @Disabled("Not Implemented")
    public void spaceBuyersTest() {
        // given
        String id = "1SLjjRYNejbKM";
        String paginationToken = "example";
        Integer maxResults = 100;
        Set<String> userFields = new HashSet<>();
        Set<String> expansions = new HashSet<>();
        Set<String> tweetFields = new HashSet<>();

        // when
        Get2SpacesIdBuyersResponse body = api.spaceBuyers(id, paginationToken, maxResults, userFields, expansions, tweetFields).block();

        // then
        // TODO implement the spaceBuyersTest()
    }

    
    /**
     * Retrieve Tweets from a Space.
     *
     * Retrieves Tweets shared in the specified Space.
     */
    @Test
    @Disabled("Not Implemented")
    public void spaceTweetsTest() {
        // given
        String id = "1SLjjRYNejbKM";
        Integer maxResults = 100;
        Set<String> tweetFields = new HashSet<>();
        Set<String> expansions = new HashSet<>();
        Set<String> mediaFields = new HashSet<>();
        Set<String> pollFields = new HashSet<>();
        Set<String> userFields = new HashSet<>();
        Set<String> placeFields = new HashSet<>();

        // when
        Get2SpacesIdTweetsResponse body = api.spaceTweets(id, maxResults, tweetFields, expansions, mediaFields, pollFields, userFields, placeFields).block();

        // then
        // TODO implement the spaceTweetsTest()
    }

    
    /**
     * Full archive search counts
     *
     * Returns Tweet Counts that match a search query.
     */
    @Test
    @Disabled("Not Implemented")
    public void tweetCountsFullArchiveSearchTest() {
        // given
        String query = "(from:TwitterDev OR from:TwitterAPI) has:media -is:retweet";
        OffsetDateTime startTime = OffsetDateTime.of(2001, 2, 3, 12, 0, 0, 0, java.time.ZoneOffset.of("+02:00"));
        OffsetDateTime endTime = OffsetDateTime.of(2001, 2, 3, 12, 0, 0, 0, java.time.ZoneOffset.of("+02:00"));
        String sinceId = "example";
        String untilId = "example";
        String nextToken = "example";
        String paginationToken = "example";
        String granularity = "hour";
        Set<String> searchCountFields = new HashSet<>();

        // when
        Get2TweetsCountsAllResponse body = api.tweetCountsFullArchiveSearch(query, startTime, endTime, sinceId, untilId, nextToken, paginationToken, granularity, searchCountFields).block();

        // then
        // TODO implement the tweetCountsFullArchiveSearchTest()
    }

    
    /**
     * Recent search counts
     *
     * Returns Tweet Counts from the last 7 days that match a search query.
     */
    @Test
    @Disabled("Not Implemented")
    public void tweetCountsRecentSearchTest() {
        // given
        String query = "(from:TwitterDev OR from:TwitterAPI) has:media -is:retweet";
        OffsetDateTime startTime = OffsetDateTime.of(2001, 2, 3, 12, 0, 0, 0, java.time.ZoneOffset.of("+02:00"));
        OffsetDateTime endTime = OffsetDateTime.of(2001, 2, 3, 12, 0, 0, 0, java.time.ZoneOffset.of("+02:00"));
        String sinceId = "example";
        String untilId = "example";
        String nextToken = "example";
        String paginationToken = "example";
        String granularity = "hour";
        Set<String> searchCountFields = new HashSet<>();

        // when
        Get2TweetsCountsRecentResponse body = api.tweetCountsRecentSearch(query, startTime, endTime, sinceId, untilId, nextToken, paginationToken, granularity, searchCountFields).block();

        // then
        // TODO implement the tweetCountsRecentSearchTest()
    }

    
    /**
     * Full-archive search
     *
     * Returns Tweets that match a search query.
     */
    @Test
    @Disabled("Not Implemented")
    public void tweetsFullarchiveSearchTest() {
        // given
        String query = "(from:TwitterDev OR from:TwitterAPI) has:media -is:retweet";
        OffsetDateTime startTime = OffsetDateTime.of(2001, 2, 3, 12, 0, 0, 0, java.time.ZoneOffset.of("+02:00"));
        OffsetDateTime endTime = OffsetDateTime.of(2001, 2, 3, 12, 0, 0, 0, java.time.ZoneOffset.of("+02:00"));
        String sinceId = "example";
        String untilId = "example";
        Integer maxResults = 10;
        String nextToken = "example";
        String paginationToken = "example";
        String sortOrder = "example";
        Set<String> tweetFields = new HashSet<>();
        Set<String> expansions = new HashSet<>();
        Set<String> mediaFields = new HashSet<>();
        Set<String> pollFields = new HashSet<>();
        Set<String> userFields = new HashSet<>();
        Set<String> placeFields = new HashSet<>();

        // when
        Get2TweetsSearchAllResponse body = api.tweetsFullarchiveSearch(query, startTime, endTime, sinceId, untilId, maxResults, nextToken, paginationToken, sortOrder, tweetFields, expansions, mediaFields, pollFields, userFields, placeFields).block();

        // then
        // TODO implement the tweetsFullarchiveSearchTest()
    }

    
    /**
     * Recent search
     *
     * Returns Tweets from the last 7 days that match a search query.
     */
    @Test
    @Disabled("Not Implemented")
    public void tweetsRecentSearchTest() {
        // given
        String query = "(from:TwitterDev OR from:TwitterAPI) has:media -is:retweet";
        OffsetDateTime startTime = OffsetDateTime.of(2001, 2, 3, 12, 0, 0, 0, java.time.ZoneOffset.of("+02:00"));
        OffsetDateTime endTime = OffsetDateTime.of(2001, 2, 3, 12, 0, 0, 0, java.time.ZoneOffset.of("+02:00"));
        String sinceId = "example";
        String untilId = "example";
        Integer maxResults = 10;
        String nextToken = "example";
        String paginationToken = "example";
        String sortOrder = "example";
        Set<String> tweetFields = new HashSet<>();
        Set<String> expansions = new HashSet<>();
        Set<String> mediaFields = new HashSet<>();
        Set<String> pollFields = new HashSet<>();
        Set<String> userFields = new HashSet<>();
        Set<String> placeFields = new HashSet<>();

        // when
        Get2TweetsSearchRecentResponse body = api.tweetsRecentSearch(query, startTime, endTime, sinceId, untilId, maxResults, nextToken, paginationToken, sortOrder, tweetFields, expansions, mediaFields, pollFields, userFields, placeFields).block();

        // then
        // TODO implement the tweetsRecentSearchTest()
    }

    
    /**
     * Causes the User (in the path) to like the specified Tweet
     *
     * Causes the User (in the path) to like the specified Tweet. The User in the path must match the User context authorizing the request.
     */
    @Test
    @Disabled("Not Implemented")
    public void usersIdLikeTest() {
        // given
        String id = "example";
        UsersLikesCreateRequest usersLikesCreateRequest = new UsersLikesCreateRequest("1346889436626259968");

        // when
        UsersLikesCreateResponse body = api.usersIdLike(id, usersLikesCreateRequest).block();

        // then
        // TODO implement the usersIdLikeTest()
    }

    
    /**
     * Returns Tweet objects liked by the provided User ID
     *
     * Returns a list of Tweets liked by the provided User ID
     */
    @Test
    @Disabled("Not Implemented")
    public void usersIdLikedTweetsTest() {
        // given
        String id = "2244994945";
        Integer maxResults = 56;
        String paginationToken = "example";
        Set<String> tweetFields = new HashSet<>();
        Set<String> expansions = new HashSet<>();
        Set<String> mediaFields = new HashSet<>();
        Set<String> pollFields = new HashSet<>();
        Set<String> userFields = new HashSet<>();
        Set<String> placeFields = new HashSet<>();

        // when
        Get2UsersIdLikedTweetsResponse body = api.usersIdLikedTweets(id, maxResults, paginationToken, tweetFields, expansions, mediaFields, pollFields, userFields, placeFields).block();

        // then
        // TODO implement the usersIdLikedTweetsTest()
    }

    
    /**
     * User mention timeline by User ID
     *
     * Returns Tweet objects that mention username associated to the provided User ID
     */
    @Test
    @Disabled("Not Implemented")
    public void usersIdMentionsTest() {
        // given
        String id = "2244994945";
        String sinceId = "example";
        String untilId = "1346889436626259968";
        Integer maxResults = 56;
        String paginationToken = "example";
        OffsetDateTime startTime = OffsetDateTime.of(2001, 2, 3, 12, 0, 0, 0, java.time.ZoneOffset.of("+02:00"));
        OffsetDateTime endTime = OffsetDateTime.of(2001, 2, 3, 12, 0, 0, 0, java.time.ZoneOffset.of("+02:00"));
        Set<String> tweetFields = new HashSet<>();
        Set<String> expansions = new HashSet<>();
        Set<String> mediaFields = new HashSet<>();
        Set<String> pollFields = new HashSet<>();
        Set<String> userFields = new HashSet<>();
        Set<String> placeFields = new HashSet<>();

        // when
        Get2UsersIdMentionsResponse body = api.usersIdMentions(id, sinceId, untilId, maxResults, paginationToken, startTime, endTime, tweetFields, expansions, mediaFields, pollFields, userFields, placeFields).block();

        // then
        // TODO implement the usersIdMentionsTest()
    }

    
    /**
     * Causes the User (in the path) to retweet the specified Tweet.
     *
     * Causes the User (in the path) to retweet the specified Tweet. The User in the path must match the User context authorizing the request.
     */
    @Test
    @Disabled("Not Implemented")
    public void usersIdRetweetsTest() {
        // given
        String id = "example";
        UsersRetweetsCreateRequest usersRetweetsCreateRequest = new UsersRetweetsCreateRequest("1346889436626259968");

        // when
        UsersRetweetsCreateResponse body = api.usersIdRetweets(id, usersRetweetsCreateRequest).block();

        // then
        // TODO implement the usersIdRetweetsTest()
    }

    
    /**
     * User home timeline by User ID
     *
     * Returns Tweet objects that appears in the provided User ID&#39;s home timeline
     */
    @Test
    @Disabled("Not Implemented")
    public void usersIdTimelineTest() {
        // given
        String id = "example";
        String sinceId = "791775337160081409";
        String untilId = "1346889436626259968";
        Integer maxResults = 56;
        String paginationToken = "example";
        Set<String> exclude = new HashSet<>();
        OffsetDateTime startTime = OffsetDateTime.of(2001, 2, 3, 12, 0, 0, 0, java.time.ZoneOffset.of("+02:00"));
        OffsetDateTime endTime = OffsetDateTime.of(2001, 2, 3, 12, 0, 0, 0, java.time.ZoneOffset.of("+02:00"));
        Set<String> tweetFields = new HashSet<>();
        Set<String> expansions = new HashSet<>();
        Set<String> mediaFields = new HashSet<>();
        Set<String> pollFields = new HashSet<>();
        Set<String> userFields = new HashSet<>();
        Set<String> placeFields = new HashSet<>();

        // when
        Get2UsersIdTimelinesReverseChronologicalResponse body = api.usersIdTimeline(id, sinceId, untilId, maxResults, paginationToken, exclude, startTime, endTime, tweetFields, expansions, mediaFields, pollFields, userFields, placeFields).block();

        // then
        // TODO implement the usersIdTimelineTest()
    }

    
    /**
     * User Tweets timeline by User ID
     *
     * Returns a list of Tweets authored by the provided User ID
     */
    @Test
    @Disabled("Not Implemented")
    public void usersIdTweetsTest() {
        // given
        String id = "2244994945";
        String sinceId = "791775337160081409";
        String untilId = "1346889436626259968";
        Integer maxResults = 56;
        String paginationToken = "example";
        Set<String> exclude = new HashSet<>();
        OffsetDateTime startTime = OffsetDateTime.of(2001, 2, 3, 12, 0, 0, 0, java.time.ZoneOffset.of("+02:00"));
        OffsetDateTime endTime = OffsetDateTime.of(2001, 2, 3, 12, 0, 0, 0, java.time.ZoneOffset.of("+02:00"));
        Set<String> tweetFields = new HashSet<>();
        Set<String> expansions = new HashSet<>();
        Set<String> mediaFields = new HashSet<>();
        Set<String> pollFields = new HashSet<>();
        Set<String> userFields = new HashSet<>();
        Set<String> placeFields = new HashSet<>();

        // when
        Get2UsersIdTweetsResponse body = api.usersIdTweets(id, sinceId, untilId, maxResults, paginationToken, exclude, startTime, endTime, tweetFields, expansions, mediaFields, pollFields, userFields, placeFields).block();

        // then
        // TODO implement the usersIdTweetsTest()
    }

    
    /**
     * Causes the User (in the path) to unlike the specified Tweet
     *
     * Causes the User (in the path) to unlike the specified Tweet. The User must match the User context authorizing the request
     */
    @Test
    @Disabled("Not Implemented")
    public void usersIdUnlikeTest() {
        // given
        String id = "example";
        String tweetId = "example";

        // when
        UsersLikesDeleteResponse body = api.usersIdUnlike(id, tweetId).block();

        // then
        // TODO implement the usersIdUnlikeTest()
    }

    
    /**
     * Causes the User (in the path) to unretweet the specified Tweet
     *
     * Causes the User (in the path) to unretweet the specified Tweet. The User must match the User context authorizing the request
     */
    @Test
    @Disabled("Not Implemented")
    public void usersIdUnretweetsTest() {
        // given
        String id = "example";
        String sourceTweetId = "example";

        // when
        UsersRetweetsDeleteResponse body = api.usersIdUnretweets(id, sourceTweetId).block();

        // then
        // TODO implement the usersIdUnretweetsTest()
    }

    
}
