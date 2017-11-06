package com.game7th.grafoman.model.rating;

import com.squareup.moshi.Json;

public enum LikeStatus {
    @Json(name="liked") Liked,
    @Json(name="disliked") Disliked,
    @Json(name="neutral") Neutral
}
