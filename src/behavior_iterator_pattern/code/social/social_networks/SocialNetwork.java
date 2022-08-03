package behavior_iterator_pattern.code.social.social_networks;

import behavior_iterator_pattern.code.social.iterators.ProfileIterator;

public interface SocialNetwork {

    ProfileIterator createFriendsIterator(String profileEmail);

    ProfileIterator createCoworkersIterator(String profileEmail);

}
