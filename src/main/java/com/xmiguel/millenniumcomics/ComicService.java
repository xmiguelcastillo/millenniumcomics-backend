package com.xmiguel.millenniumcomics;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface ComicService {
    Comic createComic(ComicRequest comicRequest);
    List<Comic> getAllComics();
}
