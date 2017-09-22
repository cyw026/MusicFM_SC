package com.musicfm.cloud.MusicFM.utilities.comparators;

import com.musicfm.cloud.MusicFM.models.LocalTrack;

import java.util.Comparator;

/**
 * Created by Harjot on 18-Jan-17.
 */

public class LocalMusicComparator implements Comparator<LocalTrack> {

    @Override
    public int compare(LocalTrack lhs, LocalTrack rhs) {
        return lhs.getTitle().toString().compareTo(rhs.getTitle().toString());
    }
}
