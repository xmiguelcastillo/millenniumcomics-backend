package com.xmiguel.millenniumcomics;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ComicImpl implements ComicService {

    private final ComicRepository repo;

    // Spring automatically injects the repository here
    public ComicImpl(ComicRepository repo) {
        this.repo = repo;
    }

    @Override
    public Comic createComic(ComicRequest comicRequest) {
        Comic newComic = new Comic();
        newComic.setTitle(comicRequest.title());
        newComic.setPublisher(comicRequest.publisher());
        newComic.setCharacter(comicRequest.character());
        newComic.setAuthor(comicRequest.author());
        newComic.setSeriesIssue(comicRequest.seriesIssue());
        newComic.setIssueYear(comicRequest.issueYear());
        newComic.setSeriesYearStart(comicRequest.seriesYearStart());
        newComic.setSeriesYearEnd(comicRequest.seriesYearEnd());
        newComic.setTotalIssues(comicRequest.totalIssues());
        newComic.setCover(comicRequest.cover());
        newComic.setSummary(comicRequest.summary());
        newComic.setSale(comicRequest.sale());
        newComic.setReleaseDate(comicRequest.releaseDate());
        return repo.save(newComic);
    }

    @Override
    public List<Comic> getAllComics() {
        return repo.findAll();
    }
}