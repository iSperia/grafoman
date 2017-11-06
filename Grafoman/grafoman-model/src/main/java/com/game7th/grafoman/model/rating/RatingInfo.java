package com.game7th.grafoman.model.rating;

import com.squareup.moshi.Json;

import org.immutables.value.Value;

@Value.Immutable
public interface RatingInfo {

    @Json(name="likes") int likes();

    @Json(name="dislikes") int dislikes();

    @Json(name="likeStatus") LikeStatus likeStatus();
}
