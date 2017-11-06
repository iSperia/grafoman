package com.game7th.grafoman.model.repo;

import com.game7th.grafoman.model.rating.ImmutableRatingInfo;
import com.game7th.grafoman.model.rating.LikeStatus;
import com.game7th.grafoman.model.rating.RatingInfo;
import com.game7th.grafoman.model.scratch.ContentInfo;
import com.game7th.grafoman.model.scratch.ImmutableContentInfo;
import com.game7th.grafoman.model.scratch.ImmutableMarkupInfo;
import com.game7th.grafoman.model.scratch.ImmutableScratchInfo;
import com.game7th.grafoman.model.scratch.MarkupInfo;
import com.game7th.grafoman.model.scratch.MarkupType;
import com.game7th.grafoman.model.scratch.ScratchInfo;
import com.game7th.grafoman.model.user.ImmutableUserInfo;
import com.game7th.grafoman.model.user.UserInfo;

import io.reactivex.Single;

public class GrafomanRepo {

    private static ContentInfo simpleContent1 = ImmutableContentInfo.builder().body("Test markup 1").build();
    private static ContentInfo simpleContent2 = ImmutableContentInfo.builder().body("Bold text\nsimple text")
            .addMarkup(ImmutableMarkupInfo.builder().startPosition(0).endPosition(9).markupType(MarkupType.Bold).build()).build();

    private static final UserInfo isperiaUser = ImmutableUserInfo.builder().nickname("iSperia").userId("iSperia").build();
    private static final UserInfo feelgoodUser = ImmutableUserInfo.builder().nickname("feelgood").userId("feelgood").build();

    private static final RatingInfo goodRating = ImmutableRatingInfo.builder().likes(10).dislikes(1).likeStatus(LikeStatus.Neutral).build();
    private static final RatingInfo badRating = ImmutableRatingInfo.builder().likes(1).dislikes(17).likeStatus(LikeStatus.Neutral).build();

    public Single<? extends ScratchInfo> getScratchInfo(final String id) {
        if ("0".equals(id)) {
            return Single.just(ImmutableScratchInfo.builder()
                    .authorInfo(isperiaUser)
                    .content(simpleContent1)
                    .ratingInfo(goodRating)
                    .build());
        }
        return Single.just(null);
    }
}
