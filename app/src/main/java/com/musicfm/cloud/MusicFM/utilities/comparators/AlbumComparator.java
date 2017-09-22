package com.musicfm.cloud.MusicFM.utilities.comparators;

import com.musicfm.cloud.MusicFM.models.Album;

import java.util.Comparator;

/**
 * Created by Harjot on 18-Jan-17.
 */

public class AlbumComparator implements Comparator<Album> {

    @Override
    public int compare(Album lhs, Album rhs) {
        return lhs.getName().toString().compareTo(rhs.getName().toString());
    }
}
