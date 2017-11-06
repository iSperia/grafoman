package com.game7th.grafoman.model.scratch;

import com.squareup.moshi.Json;

import org.immutables.value.Value;

/**
 * Info about a chunk of markup inside a single scratch
 */
@Value.Immutable
public interface MarkupInfo {

    @Json(name="type") MarkupType markupType();

    @Json(name="start") int startPosition();

    @Json(name="end") int endPosition();
}
