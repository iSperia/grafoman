package com.game7th.grafoman.model.user;

import com.squareup.moshi.Json;

import org.immutables.value.Value;

/**
 * Representation of some user
 */
@Value.Immutable
public interface UserInfo {

    @Json(name="id") String userId();

    @Json(name="nickname") String nickname();
}
