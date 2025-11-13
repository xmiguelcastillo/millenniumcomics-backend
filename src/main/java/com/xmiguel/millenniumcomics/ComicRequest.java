package com.xmiguel.millenniumcomics;

import java.time.LocalDate;

public record ComicRequest(
        String title,
        String publisher,
        String character,
        String author,
        String seriesIssue,
        Integer issueYear,
        Integer seriesYearStart,
        Integer seriesYearEnd,
        Long totalIssues,
        String cover,
        String summary,
        double sale,
        LocalDate releaseDate
) {}