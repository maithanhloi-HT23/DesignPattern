package BehavioralPatterns.IteratorPattern.social_networks;

import BehavioralPatterns.IteratorPattern.iterators.ProfileIterator;

public interface SocialNetwork {
    ProfileIterator createFriendsIterator(String profileEmail);

    ProfileIterator createCoworkersIterator(String profileEmail);
}
