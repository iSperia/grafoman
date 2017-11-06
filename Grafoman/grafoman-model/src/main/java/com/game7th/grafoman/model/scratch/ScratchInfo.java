package com.game7th.grafoman.model.scratch;

import com.game7th.grafoman.model.rating.RatingInfo;
import com.game7th.grafoman.model.user.UserInfo;
import com.squareup.moshi.Json;

import org.immutables.value.Value;

import java.util.List;

/**
 * Scratch info is in response of a single story scratch
 * TODO: in future, versioning will be supported and this should be refactored in some way
 */
@Value.Immutable
public interface ScratchInfo {

    @Json(name="id") String id();

    @Json(name="content") ContentInfo content();

    @Json(name="author") UserInfo authorInfo();

    @Json(name="ratingInfo") RatingInfo ratingInfo();

    @Json(name="children") List<ScratchInfo> children();
}
