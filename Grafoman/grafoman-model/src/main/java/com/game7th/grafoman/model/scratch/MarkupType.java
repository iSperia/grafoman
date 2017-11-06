package com.game7th.grafoman.model.scratch;

import com.squareup.moshi.Json;

public enum MarkupType {
    @Json(name="bold") Bold,
    @Json(name="italic") Italic,
    @Json(name="underline") Underline,
    @Json(name="h1") Header1,
    @Json(name="h2") Header2,
    @Json(name="h3") Header3
}
