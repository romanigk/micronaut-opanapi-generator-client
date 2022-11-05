package example.micronaut.api;

import example.micronaut.model.Error;
import example.micronaut.model.Get2SpacesByCreatorIdsResponse;
import example.micronaut.model.Get2SpacesIdBuyersResponse;
import example.micronaut.model.Get2SpacesIdResponse;
import example.micronaut.model.Get2SpacesIdTweetsResponse;
import example.micronaut.model.Get2SpacesResponse;
import example.micronaut.model.Get2SpacesSearchResponse;
import example.micronaut.model.Problem;
import java.util.Set;
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
 * API tests for SpacesApi
 */
@MicronautTest
public class SpacesApiTest {

    @Inject
    SpacesApi api;

    
    /**
     * Space lookup by Space ID
     *
     * Returns a variety of information about the Space specified by the requested ID
     */
    @Test
    @Disabled("Not Implemented")
    public void findSpaceByIdTest() {
        // given
        String id = "1SLjjRYNejbKM";
        Set<String> spaceFields = new HashSet<>();
        Set<String> expansions = new HashSet<>();
        Set<String> userFields = new HashSet<>();
        Set<String> topicFields = new HashSet<>();

        // when
        Get2SpacesIdResponse body = api.findSpaceById(id, spaceFields, expansions, userFields, topicFields).block();

        // then
        // TODO implement the findSpaceByIdTest()
    }

    
    /**
     * Space lookup by their creators
     *
     * Returns a variety of information about the Spaces created by the provided User IDs
     */
    @Test
    @Disabled("Not Implemented")
    public void findSpacesByCreatorIdsTest() {
        // given
        List<String> userIds = Arrays.asList("example");
        Set<String> spaceFields = new HashSet<>();
        Set<String> expansions = new HashSet<>();
        Set<String> userFields = new HashSet<>();
        Set<String> topicFields = new HashSet<>();

        // when
        Get2SpacesByCreatorIdsResponse body = api.findSpacesByCreatorIds(userIds, spaceFields, expansions, userFields, topicFields).block();

        // then
        // TODO implement the findSpacesByCreatorIdsTest()
    }

    
    /**
     * Space lookup up Space IDs
     *
     * Returns a variety of information about the Spaces specified by the requested IDs
     */
    @Test
    @Disabled("Not Implemented")
    public void findSpacesByIdsTest() {
        // given
        List<String> ids = Arrays.asList("example");
        Set<String> spaceFields = new HashSet<>();
        Set<String> expansions = new HashSet<>();
        Set<String> userFields = new HashSet<>();
        Set<String> topicFields = new HashSet<>();

        // when
        Get2SpacesResponse body = api.findSpacesByIds(ids, spaceFields, expansions, userFields, topicFields).block();

        // then
        // TODO implement the findSpacesByIdsTest()
    }

    
    /**
     * Search for Spaces
     *
     * Returns Spaces that match the provided query.
     */
    @Test
    @Disabled("Not Implemented")
    public void searchSpacesTest() {
        // given
        String query = "crypto";
        String state = "all";
        Integer maxResults = 100;
        Set<String> spaceFields = new HashSet<>();
        Set<String> expansions = new HashSet<>();
        Set<String> userFields = new HashSet<>();
        Set<String> topicFields = new HashSet<>();

        // when
        Get2SpacesSearchResponse body = api.searchSpaces(query, state, maxResults, spaceFields, expansions, userFields, topicFields).block();

        // then
        // TODO implement the searchSpacesTest()
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

    
}
