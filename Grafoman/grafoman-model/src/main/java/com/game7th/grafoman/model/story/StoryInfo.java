package com.game7th.grafoman.model.story;

import com.game7th.grafoman.model.user.UserInfo;
import com.squareup.moshi.Json;

import org.immutables.value.Value;

@Value.Immutable
public interface StoryInfo {

    @Json(name="id") String id();

    @Json(name="title") String title();

    @Json(name="author") UserInfo author();

    @Json(name="rootId") String rootScratchId();
}
