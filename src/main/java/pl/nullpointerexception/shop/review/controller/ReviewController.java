package pl.nullpointerexception.shop.review.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pl.nullpointerexception.shop.common.model.Review;
import pl.nullpointerexception.shop.review.controller.dto.ReviewDto;
import pl.nullpointerexception.shop.review.service.ReviewService;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
public class ReviewController {

    private final ReviewService reviewService;

    @PostMapping("/reviews")
    public Review addReview(@RequestBody @Valid ReviewDto reviewDto) {
        return reviewService.addReview(Review.builder()
                .authorName(reviewDto.authorName())
                .content(reviewDto.content())
                .productId(reviewDto.productId())
                .build());
    }

//    private String cleanContent(String text) {
//        return Jsoup.clean(text, Safelist.none());
//    }
}
