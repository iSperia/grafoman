package com.game7th.grafoman.model.scratch;

import com.squareup.moshi.Json;

import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
public interface ContentInfo {

    @Json(name="body") String body();

    @Json(name="markup") List<MarkupInfo> markup();
}
