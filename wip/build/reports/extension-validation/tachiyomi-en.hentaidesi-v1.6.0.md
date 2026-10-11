# Extension Validation Report

- Extension: tachiyomi-en.hentaidesi-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 37
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangathemesia
- Source ID: 1428377199095994277
- Source name: Hentai Desi
- Source language: en
- Selected manga input: popular offset 0: Teach Me First! (Uncensored) (`.../teach-me-first-uncensored-86`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 40 | Teach Me First! (Uncensored) (`.../teach-me-first-uncensored-86`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 40 | Spring Break With Stepsister (Uncensored) (`.../spring-break-with-stepsister-uncensored`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 40 | Slave Code (`.../slave-code`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 40 | The Breeding Game has Become Reality (`.../the-breeding-game-has-become-reality`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | Show Me How (Uncensored) (`.../show-me-how-uncensored`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Teach Me First! (Uncensored) (`.../teach-me-first-uncensored-86`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 21 | Chapter 0 (`.../teach-me-first-uncensored-chapter-0`) |  | <1s |
| pages | `getPageList(chapter)` | success | 19 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 40 entries |  |  |  |
| latest listing | PASS | 40 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 1: title=Teach Me First! (Uncensored), URL=`.../teach-me-first-uncensored-86` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 162/162 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 162/162 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://hentaidesi.com/.../teach-me-first-uncensored-193x278.jpg` (image/jpeg, 12921 bytes, 193x278) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../teach-me-first-uncensored-86` |  |  |  |
| details thumbnail URL | PASS | `https://hentaidesi.com/.../teach-me-first-uncensored-193x278.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Adult, Comedy, Drama, Harem, Mature, Romance, Seinen, Slice of life, Uncensored, Manga |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Teach Me First! (Uncensored) The story revolves around the complex and tempting relationship between two step-siblings. When one of them plans to get married, their inherently close bond is tested by jealousy and forbidden desires. 👉 If you’re craving more uncensored stories, check out hentaidesi for an equally exciting experience! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 21 chapters |  |  |  |
| chapter dates | PASS | 21 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 19 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://img.hentai1.io/.../001.jpg` (image/jpeg, 377071 bytes, 720x5194) |  |  |  |
