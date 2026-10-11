# Extension Validation Report

- Extension: tachiyomi-en.toonz-v1.6.2
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 27
- Lint: 1
- Warnings: 3
- Skipped: 5
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 225310046014902430
- Source name: Toonz
- Source language: en
- Selected manga input: popular offset 0: Top Rated Manga (`.../top-rated`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 31 | Top Rated (`.../top-rated`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 32 | Top Rated (`.../top-rated`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 31 | Top Rated (`.../top-rated`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 30 | Top Rated (`.../top-rated`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 8 | Top Rated (`.../top-rated`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Top Rated Manga (`.../top-rated`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 97 | Chapter 1: Vol.1 Chapter 1: The Steel Ball Run Press Conference (`.../1`) |  | 1-10s |
| pages | `getPageList(chapter)` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 404 | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | eu.kanade.tachiyomi.network.HttpException: HTTP error 404 | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular listing | PASS | 31 entries |  |  |  |
| latest listing | PASS | 31 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Top Rated, URL=`.../top-rated` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | UNUSUAL | Overlapping manga: title=Top Rated, URL=`.../top-rated` at page 1 offset 0 and page 2 offset 0, title=Most Popular, URL=`.../most-popular` at page 1 offset 1 and page 2 offset 1, title=Trending, URL=`.../trending` at page 1 offset 2 and page 2 offset 2, title=Most Favourited, URL=`.../most-favorited` at page 1 offset 3 and page 2 offset 3, title=Top Rated, URL=`.../top-rated` at page 1 offset 4 and page 2 offset 4, title=Most Popular, URL=`.../most-popular` at page 1 offset 5 and page 2 offset 5, title=Trending, URL=`.../trending` at page 1 offset 6 and page 2 offset 6, title=Most Favourited, URL=`.../most-favorited` at page 1 offset 7 and page 2 offset 7 |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=Top Rated, URL=`.../top-rated` at page 1 offset 0 and page 2 offset 0, title=Most Popular, URL=`.../most-popular` at page 1 offset 1 and page 2 offset 1, title=Trending, URL=`.../trending` at page 1 offset 2 and page 2 offset 2, title=Most Favourited, URL=`.../most-favorited` at page 1 offset 3 and page 2 offset 3, title=Top Rated, URL=`.../top-rated` at page 1 offset 4 and page 2 offset 4, title=Most Popular, URL=`.../most-popular` at page 1 offset 5 and page 2 offset 5, title=Trending, URL=`.../trending` at page 1 offset 6 and page 2 offset 6, title=Most Favourited, URL=`.../most-favorited` at page 1 offset 7 and page 2 offset 7 |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 132/132 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | UNUSUAL | 92/132 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | SKIP | No thumbnail URL to load |  |  |  |
| details identity | PASS | Details preserved selected URL `.../top-rated` |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Ranked by reader score, weighted against the site average so a title needs a real body of votes to reach the top — which is why the score shown sits a little below the raw rating beside it. The top rated manga on Toonz. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 97 chapters |  |  |  |
| chapter dates | PASS | 97 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | HTTP error 404 |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
